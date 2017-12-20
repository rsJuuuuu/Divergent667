package com.rs.game.player;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.ItemEquipIds;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.info.RanksManager;
import com.rs.game.world.World;
import com.rs.io.OutputStream;
import com.rs.utils.security.Encryption;

import java.io.Serializable;
import java.util.Arrays;

public class Appearance implements Serializable {

    private static final long serialVersionUID = 7655608569741626586L;

    private transient int renderEmote;
    private int title;
    private int[] look;
    private byte[] colour;
    private boolean male;
    private transient boolean glowRed;
    private transient byte[] appearanceData;
    private transient byte[] md5AppearanceDataHash;
    private transient short transformedNpcId;
    private transient boolean hidePlayer;

    private transient Player player;

    Appearance() {
        male = true;
        renderEmote = -1;
        title = -1;
        resetAppearance();
    }

    public void setGlowRed(boolean glowRed) {
        this.glowRed = glowRed;
        generateAppearanceData();
    }

    public void setPlayer(Player player) {
        this.player = player;
        transformedNpcId = -1;
        renderEmote = -1;
    }

    public void transformIntoNPC(int id) {
        transformedNpcId = (short) id;
        generateAppearanceData();
    }

    public void switchHidden() {
        hidePlayer = !hidePlayer;
        generateAppearanceData();
    }

    public boolean isHidden() {
        return hidePlayer;
    }

    public void generateAppearanceData() {
        OutputStream stream = new OutputStream();
        int flag = 0;
        if (!male) flag |= 0x1;
        if (transformedNpcId >= 0 && NPCDefinitions.getNPCDefinitions(transformedNpcId).aBoolean3190) flag |= 0x2;
        // (byte) ((0xf2 & hash) >> 6);
        // flag |= 0x4; //the way combat lvl sent
        // flag |= value << 3 & 0x7; //dunno
        // flag |= (1 & 0xeb) << 6; //dunno
        stream.writeByte(flag);
        stream.writeByte(title); // mob arms titles
        stream.writeString(RanksManager.getChatPrefix(player));
        stream.writeByte(player.hasSkull() ? player.getSkullId() : -1); // pk
        // icon
        stream.writeByte(player.getPrayer().getOverheadValue()); // prayer icon
        stream.writeByte(hidePlayer ? 1 : 0);
        // npc
        if (transformedNpcId >= 0) {
            stream.writeShort(-1); // 65535 tells it a npc
            stream.writeShort(transformedNpcId);
            stream.writeByte(0);
        } else {
            for (int index = 0; index < 4; index++) {
                Item item = player.getEquipment().getItems().get(index);
                if (glowRed) {
                    if (index == 0) {
                        stream.writeShort(32768 + ItemEquipIds.getEquipId(2910));
                        continue;
                    }
                    if (index == 1) {
                        stream.writeShort(32768 + ItemEquipIds.getEquipId(14641));
                        continue;
                    }
                }
                if (item == null) stream.writeByte(0);
                else stream.writeShort(32768 + item.getEquipId());
            }
            Item item = player.getEquipment().getItems().get(Equipment.SLOT_CHEST);
            stream.writeShort(glowRed ?
                    32768 + ItemEquipIds.getEquipId(2906) : item == null ? 0x100 + look[2] : 32768 + item.getEquipId());
            item = player.getEquipment().getItems().get(Equipment.SLOT_SHIELD);
            if (item == null) stream.writeByte(0);
            else stream.writeShort(32768 + item.getEquipId());
            item = player.getEquipment().getItems().get(Equipment.SLOT_CHEST);
            if (!glowRed && (item == null || !Equipment.isFullBody(item))) stream.writeShort(0x100 + look[3]);
            else stream.writeByte(0);
            item = player.getEquipment().getItems().get(Equipment.SLOT_LEGS);
            stream.writeShort(glowRed ?
                    32768 + ItemEquipIds.getEquipId(2908) : item == null ? 0x100 + look[5] : 32768 + item.getEquipId());
            item = player.getEquipment().getItems().get(Equipment.SLOT_HAT);
            if (!glowRed && (item == null || (!Equipment.isFullMask(item) && !Equipment.isFullHat(item))))
                stream.writeShort(0x100 + look[0]);
            else stream.writeByte(0);
            item = player.getEquipment().getItems().get(Equipment.SLOT_HANDS);
            stream.writeShort(glowRed ?
                    32768 + ItemEquipIds.getEquipId(2912) : item == null ? 0x100 + look[4] : 32768 + item.getEquipId());
            item = player.getEquipment().getItems().get(Equipment.SLOT_FEET);
            stream.writeShort(glowRed ?
                    32768 + ItemEquipIds.getEquipId(2904) : item == null ? 0x100 + look[6] : 32768 + item.getEquipId());
            item = player.getEquipment().getItems().get(Equipment.SLOT_HAT);
            if (item == null || !Equipment.isFullMask(item)) stream.writeShort(0x100 + look[1]);
            else stream.writeByte(0);
            item = player.getEquipment().getItems().get(Equipment.SLOT_AURA);
            if (item == null) stream.writeByte(0);
            else stream.writeShort(32768 + item.getEquipId());

            int pos = stream.getOffset();
            stream.writeShort(0);
            int hash = 0;
            int slotFlag = -1;
            for (int slotId = 0; slotId < player.getEquipment().getItems().getSize(); slotId++) {
                if (Equipment.DISABLED_SLOTS[slotId] != 0) continue;
                slotFlag++;
                if (slotId == Equipment.SLOT_CAPE) {
                    int capeId = player.getEquipment().getCapeId();
                    if (capeId == 20767 || capeId == 20769 || capeId == 20771) {
                        ItemDefinitions defs = ItemDefinitions.getItemDefinitions(capeId);
                        if ((capeId == 20767 && Arrays.equals(player.getMaxedCapeCustomized(), defs.originalModelColors)
                             || ((capeId == 20769 || capeId == 20771)
                                 && Arrays.equals(player.getCompletionistCapeCustomized(), defs.originalModelColors))))
                            continue;
                        hash |= 1 << slotFlag;
                        stream.writeByte(0x4); // modify 4 model colors
                        int[] cape = capeId
                                     == 20767 ? player.getMaxedCapeCustomized() : player
                                .getCompletionistCapeCustomized();
                        int slots = 0 | 1 << 4 | 2 << 8 | 3 << 12;
                        stream.writeShort(slots);
                        for (int i = 0; i < 4; i++)
                            stream.writeShort(cape[i]);
                    }
                } else if (slotId == Equipment.SLOT_AURA) {
                    int auraId = player.getEquipment().getAuraId();
                    if (auraId == -1 || !player.getAuraManager().isActivated()) continue;
                    hash |= 1 << slotFlag;
                    stream.writeByte(0x1); // modify model ids
                    int modelId = player.getAuraManager().getAuraModelId();
                    stream.writeBigSmart(modelId); // male modelid1
                    stream.writeBigSmart(modelId); // female modelid1
                } else if (slotId == Equipment.SLOT_HAT) {
                    int hatId = player.getEquipment().getHatId();
                    if (hatId == 20768 || hatId == 20770 || hatId == 20772) {
                        ItemDefinitions defs = ItemDefinitions.getItemDefinitions(hatId - 1);
                        if ((hatId == 20768 && Arrays.equals(player.getMaxedCapeCustomized(), defs.originalModelColors)
                             || ((hatId == 20770 || hatId == 20772)
                                 && Arrays.equals(player.getCompletionistCapeCustomized(), defs.originalModelColors))))
                            continue;
                        hash |= 1 << slotFlag;
                        stream.writeByte(0x4); // modify 4 model colors
                        int[] hat = hatId
                                    == 20768 ? player.getMaxedCapeCustomized() : player
                                .getCompletionistCapeCustomized();
                        int slots = 0 | 1 << 4 | 2 << 8 | 3 << 12;
                        stream.writeShort(slots);
                        for (int i = 0; i < 4; i++)
                            stream.writeShort(hat[i]);
                    }
                }
            }
            int pos2 = stream.getOffset();
            stream.setOffset(pos);
            stream.writeShort(hash);
            stream.setOffset(pos2);
        }

        for (byte aColour : colour) stream.writeByte(aColour);
        stream.writeShort(getRenderEmote());
        stream.writeString(player.getDisplayName());
        boolean pvpArea = World.isPvpArea(player);
        stream.writeByte(pvpArea ? player.getSkills().getCombatLevel() : player.getSkills()
                .getCombatLevelWithSummoning());
        stream.writeByte(pvpArea ? player.getSkills().getCombatLevelWithSummoning() : 0);
        stream.writeByte(-1); // higher level acc name appears in front :P
        stream.writeByte(transformedNpcId >= 0 ? 1 : 0); // to end here else id
        // need to send more
        // data
        if (transformedNpcId >= 0) {
            NPCDefinitions defs = NPCDefinitions.getNPCDefinitions(transformedNpcId);
            stream.writeShort(defs.anInt876);
            stream.writeShort(defs.anInt842);
            stream.writeShort(defs.anInt884);
            stream.writeShort(defs.anInt875);
            stream.writeByte(defs.anInt875);
        }

        // done separated for safe because of synchronization
        byte[] appearanceData = new byte[stream.getOffset()];
        System.arraycopy(stream.getBuffer(), 0, appearanceData, 0, appearanceData.length);
        byte[] md5Hash = Encryption.encryptUsingMD5(appearanceData);
        this.appearanceData = appearanceData;
        md5AppearanceDataHash = md5Hash;
    }

    public int getSize() {
        if (transformedNpcId >= 0) return NPCDefinitions.getNPCDefinitions(transformedNpcId).size;
        return 1;
    }

    public void setRenderEmote(int id) {
        this.renderEmote = id;
        generateAppearanceData();
    }

    public int getRenderEmote() {
        if (renderEmote >= 0) return renderEmote;
        if (transformedNpcId >= 0) return NPCDefinitions.getNPCDefinitions(transformedNpcId).renderEmote;
        return player.getEquipment().getWeaponRenderEmote();
    }

    public void resetAppearance() {
        look = new int[7];
        colour = new byte[10];
        male();
    }

    public void male() {
        look[0] = 3; // Hair
        look[1] = 14; // Beard
        look[2] = 18; // Torso
        look[3] = 26; // Arms
        look[4] = 34; // Bracelets
        look[5] = 38; // Legs
        look[6] = 42; // Shoes~

        colour[2] = 16;
        colour[1] = 16;
        colour[0] = 3;
        male = true;
    }

    public void female() {
        look[0] = 48; // Hair
        look[1] = 57; // Beard
        look[2] = 57; // Torso
        look[3] = 65; // Arms
        look[4] = 68; // Bracelets
        look[5] = 77; // Legs
        look[6] = 80; // Shoes

        colour[2] = 16;
        colour[1] = 16;
        colour[0] = 3;
        male = false;
    }

    public byte[] getAppearanceData() {
        return appearanceData;
    }

    public byte[] getMD5AppearanceDataHash() {
        return md5AppearanceDataHash;
    }

    public boolean isMale() {
        return male;
    }

    public void setLook(int i, int i2) {
        look[i] = i2;
    }

    public void setColor(int i, int i2) {
        colour[i] = (byte) i2;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setHairStyle(int i) {
        look[0] = i;
    }

    public int getHairStyle() {
        return look[0];
    }

    public void setBeardStyle(int i) {
        look[1] = i;
    }

    public int getBeardStyle() {
        return look[1];
    }

    public void setFacialHair(int i) {
        look[1] = i;
    }

    public int getFacialHair() {
        return look[1];
    }

    public void setTopStyle(int i) {
        look[2] = i;
    }

    public int getTopStyle() {
        return look[2];
    }

    public void setTopColor(int color) {
        colour[1] = (byte) color;
    }

    public void setLegsColor(int color) {
        colour[2] = (byte) color;
    }

    public void setArmsStyle(int i) {
        look[3] = i;
    }

    public void setWristsStyle(int i) {

        look[4] = i;
    }

    public void setLegsStyle(int i) {
        look[5] = i;
    }

    public void setSkinColor(int color) {
        colour[4] = (byte) color;
    }

    public int getSkinColor() {
        return colour[4];
    }

    public void setHairColor(int color) {
        colour[0] = (byte) color;
    }

    public int getHairColor() {
        return colour[0];
    }

    public void setTitle(int title) {
        this.title = title;
        generateAppearanceData();
    }
}
