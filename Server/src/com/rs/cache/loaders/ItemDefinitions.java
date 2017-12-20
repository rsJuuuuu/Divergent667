package com.rs.cache.loaders;

import com.alex.utils.Constants;
import com.rs.cache.Cache;
import com.rs.game.player.Equipment;
import com.rs.game.player.Skills;
import com.rs.io.InputStream;

import java.util.Arrays;
import java.util.HashMap;

public final class ItemDefinitions {

    private static final ItemDefinitions[] itemsDefinitions;

    static {
        itemsDefinitions = new ItemDefinitions[getItemDefinitionsSize()];
    }

    public int id;

    private int modelId;
    private String name;

    // model size information
    private int modelZoom;
    private int modelRotation1;
    private int modelRotation2;
    private int modelOffset1;
    private int modelOffset2;

    // extra information
    private int stackable;
    private int value;
    private boolean membersOnly;

    // wearing model information
    private int maleEquip1;
    private int femaleEquip1;
    private int maleEquip2;
    private int femaleEquip2;

    // options
    private String[] groundOptions;
    private String[] inventoryOptions;

    // model information
    public int[] originalModelColors;
    private int[] modifiedModelColors;
    private short[] originalTextureColors;
    private short[] modifiedTextureColors;
    private byte[] unknownArray1;
    private int[] unknownArray2;
    // extra information, not used for newer items
    private boolean unnoted;

    private int maleEquipModelId3;
    private int femaleEquipModelId3;
    private int unknownInt1;
    private int unknownInt2;
    private int unknownInt3;
    private int unknownInt4;
    private int unknownInt5;
    private int unknownInt6;
    private int certId;
    private int certTemplateId;
    private int[] stackIds;
    private int[] stackAmounts;
    private int unknownInt7;
    private int unknownInt8;
    private int unknownInt9;
    private int unknownInt10;
    private int unknownInt11;
    private int teamId;
    private int lendId;
    private int lendTemplateId;
    private int unknownInt12;
    private int unknownInt13;
    private int unknownInt14;
    private int unknownInt15;
    private int unknownInt16;
    private int unknownInt17;
    private int unknownInt18;
    private int unknownInt19;
    private int unknownInt20;
    private int unknownInt21;
    private int unknownInt22;
    private int unknownInt23;

    // extra added
    private boolean noted;
    private boolean loaned;

    private HashMap<Integer, Object> clientScriptData;
    private HashMap<Integer, Integer> itemRequirements;

    public static ItemDefinitions getItemDefinitions(int itemId) {
        if (itemId < 0 || itemId >= itemsDefinitions.length) itemId = 0;
        ItemDefinitions def = itemsDefinitions[itemId];
        if (def == null) itemsDefinitions[itemId] = def = new ItemDefinitions(itemId);
        return def;
    }

    public static void clearItemsDefinitions() {
        for (int i = 0; i < itemsDefinitions.length; i++)
            itemsDefinitions[i] = null;
    }

    public ItemDefinitions(int id) {
        this.id = id;
        setDefaultsVariableValues();
        setDefaultOptions();
        loadItemDefinitions();
    }

    private void loadItemDefinitions() {
        byte[] data = Cache.STORE.getIndexes()[Constants.ITEM_DEFINITIONS_INDEX].getFile(getArchiveId(), getFileId());
        if (data == null) return;
        readOpcodeValues(new InputStream(data));
        if (certTemplateId != -1) toNote();
        if (lendTemplateId != -1) toLend();
        if (unknownValue1 != -1) toLendBind();
    }

    private void toNote() {
        ItemDefinitions realItem = getItemDefinitions(certId);
        membersOnly = realItem.membersOnly;
        value = realItem.value;
        name = realItem.name;
        stackable = 1;
        noted = true;
    }

    private void toLendBind() {
        ItemDefinitions realItem = getItemDefinitions(unknownValue2);
        originalModelColors = realItem.originalModelColors;
        maleEquipModelId3 = realItem.maleEquipModelId3;
        femaleEquipModelId3 = realItem.femaleEquipModelId3;
        teamId = realItem.teamId;
        value = 0;
        membersOnly = realItem.membersOnly;
        name = realItem.name;
        inventoryOptions = new String[5];
        groundOptions = realItem.groundOptions;
        if (realItem.inventoryOptions != null) System.arraycopy(realItem.inventoryOptions, 0, inventoryOptions, 0, 4);
        inventoryOptions[4] = "Discard";
        maleEquip1 = realItem.maleEquip1;
        maleEquip2 = realItem.maleEquip2;
        femaleEquip1 = realItem.femaleEquip1;
        femaleEquip2 = realItem.femaleEquip2;
        clientScriptData = realItem.clientScriptData;
        loaned = true;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private void toLend() {
        ItemDefinitions realItem = getItemDefinitions(lendId);
        originalModelColors = realItem.originalModelColors;
        maleEquipModelId3 = realItem.maleEquipModelId3;
        femaleEquipModelId3 = realItem.femaleEquipModelId3;
        teamId = realItem.teamId;
        value = 0;
        membersOnly = realItem.membersOnly;
        name = realItem.name;
        inventoryOptions = new String[5];
        groundOptions = realItem.groundOptions;
        if (realItem.inventoryOptions != null) System.arraycopy(realItem.inventoryOptions, 0, inventoryOptions, 0, 4);
        inventoryOptions[4] = "Discard";
        maleEquip1 = realItem.maleEquip1;
        maleEquip2 = realItem.maleEquip2;
        femaleEquip1 = realItem.femaleEquip1;
        femaleEquip2 = realItem.femaleEquip2;
        clientScriptData = realItem.clientScriptData;
        loaned = true;
    }

    private int getArchiveId() {
        return id >>> 8;
    }

    private int getFileId() {
        return 0xff & id;
    }

    public boolean isDestroyItem() {
        if (inventoryOptions == null) return false;
        for (String option : inventoryOptions) {
            if (option == null) continue;
            if (option.equalsIgnoreCase("destroy")) return true;
        }
        return false;
    }

    public boolean isWearItem(boolean male) {
        if (inventoryOptions == null) return false;
        if (Equipment.getItemSlot(id) != Equipment.SLOT_RING && Equipment.getItemSlot(id) != Equipment.SLOT_ARROWS
            && Equipment.getItemSlot(id) != Equipment.SLOT_AURA && (male ? getMaleWornModelId1() == -1 :
                                                                            getFemaleWornModelId1() == -1))
            return false;
        for (String option : inventoryOptions) {
            if (option == null) continue;
            if (option.equalsIgnoreCase("wield") || option.equalsIgnoreCase("wear") || option.equalsIgnoreCase("equip")
                || option.equalsIgnoreCase("ride")) return true;
        }
        return false;
    }

    public boolean hasSpecialBar() {
        if (clientScriptData == null) return false;
        Object specialBar = clientScriptData.get(686);
        return specialBar != null && specialBar instanceof Integer && (Integer) specialBar == 1;
    }

    public int getRenderAnimId() {
        if (clientScriptData == null) return 1426;
        Object animId = clientScriptData.get(644);
        if (animId != null && animId instanceof Integer) return (Integer) animId;
        return 1426;
    }

    public int getQuestId() {
        if (clientScriptData == null) return -1;
        Object questId = clientScriptData.get(861);
        if (questId != null && questId instanceof Integer) return (Integer) questId;
        return -1;
    }

    public HashMap<Integer, Integer> getCreateItemRequirements() {
        if (clientScriptData == null) return null;
        HashMap<Integer, Integer> items = new HashMap<>();
        int requiredId = -1;
        int requiredAmount = -1;
        for (int key : clientScriptData.keySet()) {
            Object value = clientScriptData.get(key);
            if (value instanceof String) continue;
            if (key >= 538 && key <= 770) {
                if (key % 2 == 0) requiredId = (Integer) value;
                else requiredAmount = (Integer) value;
                if (requiredId != -1 && requiredAmount != -1) {
                    items.put(requiredAmount, requiredId);
                    requiredId = -1;
                    requiredAmount = -1;
                }
            }
        }
        return items;
    }

    public HashMap<Integer, Integer> getWearingSkillRequirements() {
        if (clientScriptData == null) return null;
        if (itemRequirements == null) {
            HashMap<Integer, Integer> skills = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                Integer skill = (Integer) clientScriptData.get(749 + (i * 2));
                if (skill != null) {
                    Integer level = (Integer) clientScriptData.get(750 + (i * 2));
                    if (level != null) skills.put(skill, level);
                }
            }
            Integer maxedSkill = (Integer) clientScriptData.get(277);
            if (maxedSkill != null) skills.put(maxedSkill, id == 19709 ? 120 : 99);
            itemRequirements = skills;
            if (id == 7462) itemRequirements.put(Skills.DEFENCE, 40);
            else if (name.equals("Dragon defender")) {
                itemRequirements.put(Skills.ATTACK, 60);
                itemRequirements.put(Skills.DEFENCE, 60);
            }
            if (name.equals("Completionist hood")) {
                itemRequirements.put(Skills.DEFENCE, 99);
                itemRequirements.put(Skills.ATTACK, 99);
                itemRequirements.put(Skills.STRENGTH, 99);
                itemRequirements.put(Skills.CRAFTING, 99);
                itemRequirements.put(Skills.HERBLORE, 99);
                itemRequirements.put(Skills.THIEVING, 99);
                itemRequirements.put(Skills.HITPOINTS, 99);
                itemRequirements.put(Skills.RANGE, 99);
                itemRequirements.put(Skills.PRAYER, 99);
                itemRequirements.put(Skills.MAGIC, 99);
                itemRequirements.put(Skills.COOKING, 99);
                itemRequirements.put(Skills.WOODCUTTING, 99);
                itemRequirements.put(Skills.FLETCHING, 99);
                itemRequirements.put(Skills.FIREMAKING, 99);
                itemRequirements.put(Skills.SMITHING, 99);
                itemRequirements.put(Skills.MINING, 99);
                itemRequirements.put(Skills.AGILITY, 99);
                itemRequirements.put(Skills.RUNECRAFTING, 99);
                itemRequirements.put(Skills.FARMING, 99);
                itemRequirements.put(Skills.HUNTER, 99);
                itemRequirements.put(Skills.CONSTRUCTION, 99);
                itemRequirements.put(Skills.SUMMONING, 99);
            }
            if (name.equals("Completionist cape")) {
                itemRequirements.put(Skills.DEFENCE, 99);
                itemRequirements.put(Skills.ATTACK, 99);
                itemRequirements.put(Skills.STRENGTH, 99);
                itemRequirements.put(Skills.CRAFTING, 99);
                itemRequirements.put(Skills.HERBLORE, 99);
                itemRequirements.put(Skills.THIEVING, 99);
                itemRequirements.put(Skills.HITPOINTS, 99);
                itemRequirements.put(Skills.RANGE, 99);
                itemRequirements.put(Skills.PRAYER, 99);
                itemRequirements.put(Skills.MAGIC, 99);
                itemRequirements.put(Skills.COOKING, 99);
                itemRequirements.put(Skills.WOODCUTTING, 99);
                itemRequirements.put(Skills.FLETCHING, 99);
                itemRequirements.put(Skills.FIREMAKING, 99);
                itemRequirements.put(Skills.SMITHING, 99);
                itemRequirements.put(Skills.MINING, 99);
                itemRequirements.put(Skills.AGILITY, 99);
                itemRequirements.put(Skills.RUNECRAFTING, 99);
                itemRequirements.put(Skills.FARMING, 99);
                itemRequirements.put(Skills.HUNTER, 99);
                itemRequirements.put(Skills.CONSTRUCTION, 99);
                itemRequirements.put(Skills.SUMMONING, 99);
            }
            if (name.equals("Chaotic rapier")) {
                itemRequirements.put(Skills.DUNGEONEERING, 80);
            }
            if (name.equals("Chaotic maul")) {
                itemRequirements.put(Skills.DUNGEONEERING, 80);
            }
            if (name.equals("Chaotic longsword")) {
                itemRequirements.put(Skills.DUNGEONEERING, 80);
            }
            if (name.equals("Chaotic crossbow")) {
                itemRequirements.put(Skills.DUNGEONEERING, 80);
            }
            if (name.equals("Chaotic staff")) {
                itemRequirements.put(Skills.DUNGEONEERING, 80);
            }
        }

        return itemRequirements;
    }

    private void setDefaultOptions() {
        groundOptions = new String[]{null, null, "take", null, null};
        inventoryOptions = new String[]{null, null, null, null, "drop"};
    }

    private void setDefaultsVariableValues() {
        name = "null";
        maleEquip1 = -1;
        maleEquip2 = -1;
        femaleEquip1 = -1;
        femaleEquip2 = -1;
        modelZoom = 2000;
        lendId = -1;
        lendTemplateId = -1;
        certId = -1;
        certTemplateId = -1;
        unknownInt9 = 128;
        value = 1;
        maleEquipModelId3 = -1;
        femaleEquipModelId3 = -1;
        unknownValue1 = -1;
        unknownValue2 = -1;

    }

    int opcode18;

    private void readValues(InputStream stream, int opcode) {
        if (opcode == 1) modelId = stream.readBigSmart();
        else if (opcode == 2) name = stream.readString();
        else if (opcode == 4) modelZoom = stream.readUnsignedShort();
        else if (opcode == 5) modelRotation1 = stream.readUnsignedShort();
        else if (opcode == 6) modelRotation2 = stream.readUnsignedShort();
        else if (opcode == 7) {
            modelOffset1 = stream.readUnsignedShort();
            if (modelOffset1 > 32767) modelOffset1 -= 65536;
            modelOffset1 <<= 0;
        } else if (opcode == 8) {
            modelOffset2 = stream.readUnsignedShort();
            if (modelOffset2 > 32767) modelOffset2 -= 65536;
            modelOffset2 <<= 0;
        } else if (opcode == 11) stackable = 1;
        else if (opcode == 12) value = stream.readInt();
        else if (opcode == 117) opcode117 = stream.readUnsignedByte();
        else if (opcode == 82) opcode82 = stream.readUnsignedByte();
        else if (opcode == 13) {
            opcode13 = stream.readUnsignedByte();
        } else if (opcode == 14) opcode14 = stream.readUnsignedByte();
        else if (opcode == 9) opcode9 = stream.readUnsignedByte();
        else if (opcode == 27) opcode27 = stream.readUnsignedByte();
        else if (opcode == 66) opcode66 = stream.readUnsignedByte();
        else if (opcode == 116) opcode116 = stream.readUnsignedByte();
        else if (opcode == 157) opcode157 = stream.readUnsignedByte();
        else if (opcode == 244) opcode244 = stream.readUnsignedByte();
        else if (opcode == 170) opcode170 = stream.readUnsignedByte();
        else if (opcode == 151) opcode151 = stream.readUnsignedByte();//		14 66 116 157 244 170 151 9 27
        else if (opcode == 16) membersOnly = true;
        else if (opcode == 18) // added
            opcode18 = stream.readUnsignedShort();
        else if (opcode == 23) maleEquip1 = stream.readBigSmart();
        else if (opcode == 24) maleEquip2 = stream.readBigSmart();
        else if (opcode == 25) femaleEquip1 = stream.readBigSmart();
        else if (opcode == 26) femaleEquip2 = stream.readBigSmart();
        else if (opcode >= 30 && opcode < 35) groundOptions[opcode - 30] = stream.readString();
        else if (opcode >= 35 && opcode < 40) inventoryOptions[opcode - 35] = stream.readString();
        else if (opcode == 40) {
            int length = stream.readUnsignedByte();
            originalModelColors = new int[length];
            modifiedModelColors = new int[length];
            for (int index = 0; index < length; index++) {
                originalModelColors[index] = stream.readUnsignedShort();
                modifiedModelColors[index] = stream.readUnsignedShort();
            }
        } else if (opcode == 41) {
            int length = stream.readUnsignedByte();
            originalTextureColors = new short[length];
            modifiedTextureColors = new short[length];
            for (int index = 0; index < length; index++) {
                originalTextureColors[index] = (short) stream.readUnsignedShort();
                modifiedTextureColors[index] = (short) stream.readUnsignedShort();
            }
        } else if (opcode == 42) {
            int length = stream.readUnsignedByte();
            unknownArray1 = new byte[length];
            for (int index = 0; index < length; index++)
                unknownArray1[index] = (byte) stream.readByte();
        } else if (opcode == 65) unnoted = true;
        else if (opcode == 78) maleEquipModelId3 = stream.readBigSmart();
        else if (opcode == 79) femaleEquipModelId3 = stream.readBigSmart();
        else if (opcode == 90) unknownInt1 = stream.readBigSmart();
        else if (opcode == 91) unknownInt2 = stream.readBigSmart();
        else if (opcode == 92) unknownInt3 = stream.readBigSmart();
        else if (opcode == 93) unknownInt4 = stream.readBigSmart();
        else if (opcode == 95) unknownInt5 = stream.readUnsignedShort();
        else if (opcode == 96) unknownInt6 = stream.readUnsignedByte();
        else if (opcode == 97) certId = stream.readUnsignedShort();
        else if (opcode == 98) certTemplateId = stream.readUnsignedShort();
        else if (opcode >= 100 && opcode < 110) {
            if (stackIds == null) {
                stackIds = new int[10];
                stackAmounts = new int[10];
            }
            stackIds[opcode - 100] = stream.readUnsignedShort();
            stackAmounts[opcode - 100] = stream.readUnsignedShort();
        } else if (opcode == 110) unknownInt7 = stream.readUnsignedShort();
        else if (opcode == 111) unknownInt8 = stream.readUnsignedShort();
        else if (opcode == 112) unknownInt9 = stream.readUnsignedShort();
        else if (opcode == 113) unknownInt10 = stream.readByte();
        else if (opcode == 114) unknownInt11 = stream.readByte() * 5;
        else if (opcode == 115) teamId = stream.readUnsignedByte();
        else if (opcode == 121) lendId = stream.readUnsignedShort();
        else if (opcode == 122) lendTemplateId = stream.readUnsignedShort();
        else if (opcode == 125) {
            unknownInt12 = stream.readByte();
            unknownInt13 = stream.readByte();
            unknownInt14 = stream.readByte();
        } else if (opcode == 126) {
            unknownInt15 = stream.readByte();
            unknownInt16 = stream.readByte();
            unknownInt17 = stream.readByte();
        } else if (opcode == 127) {
            unknownInt18 = stream.readUnsignedByte();
            unknownInt19 = stream.readUnsignedShort();
        } else if (opcode == 128) {
            unknownInt20 = stream.readUnsignedByte();
            unknownInt21 = stream.readUnsignedShort();
        } else if (opcode == 129) {
            unknownInt20 = stream.readUnsignedByte();
            unknownInt21 = stream.readUnsignedShort();
        } else if (opcode == 130) {
            unknownInt22 = stream.readUnsignedByte();
            unknownInt23 = stream.readUnsignedShort();
        } else if (opcode == 132) {
            int length = stream.readUnsignedByte();
            unknownArray2 = new int[length];
            for (int index = 0; index < length; index++)
                unknownArray2[index] = stream.readUnsignedShort();
        } else if (opcode == 134) {
            unknownValue = stream.readUnsignedByte();
        } else if (opcode == 139) {
            unknownValue2 = stream.readUnsignedShort();
        } else if (opcode == 140) {
            unknownValue1 = stream.readUnsignedShort();
        } else if (opcode == 249) {
            int length = stream.readUnsignedByte();
            if (clientScriptData == null) clientScriptData = new HashMap<>(length);
            for (int index = 0; index < length; index++) {
                boolean stringInstance = stream.readUnsignedByte() == 1;
                int key = stream.read24BitInt();
                Object value = stringInstance ? stream.readString() : stream.readInt();
                clientScriptData.put(key, value);
            }
        } else throw new RuntimeException("MISSING OPCODE " + opcode + " FOR ITEM " + id);
    }
/*
    key,Object - Example

0,Integer - Stab attack bonus
1,Integer - Slash attack bonus
2,Integer - Crush attack bonus
3,Integer - Magic attack bonus
4,Integer - Range attack bonus
5,Integer - Stab defense bonus
6,Integer - Slash defense bonus
7,Integer - Crush defense bonus
8,Integer - Magic defense bonus
9,Integer - Range defense bonus

11,Integer - Prayer bonus

14,Integer - Attack speed

23,Integer - Ranged level requirement ? ( 20<- /40)

            277,Integer - Maxed skill requirement

417,Integer - Summoning defense bonus

528,String - Equipment tab Option (ActionButtons2)
529,String - Equipment tab Option (ActionButtons3)
530,String - Equipment tab Option (ActionButtons4)
531,String - Equipment tab Option (ActionButtons5)

641,Integer - Melee Strength bonus
642,Integer - Magic Strength bonus
643,Integer - Ranged Strength bonus
644,Integer - Render Animation Id

685,Integer - Magic damage
686,Integer - Attack Styles Tab
687,Integer - Special bar (1)

749,Integer - Skill Id Requirment
750,Integer - Skill Level Requirment
751,Integer - Skill Id Requirment
752,Integer - Skill Level Requirment
753,Integer - Skill Id Requirment
754,Integer - Skill Level Requirment
755,Integer - Skill Id Requirment
756,Integer - Skill Level Requirment
757,Integer - Skill Id Requirment
758,Integer - Skill Level Requirment

861,Integer - Quest Id Requirement

967,Integer - Absorve melee bonus
968,Integer - Absorve range bonus
969,Integer - Absorve magic bonus*/

    private int unknownValue;
    private int opcode13;
    private int opcode82;
    private int opcode117;
    private int opcode66;
    private int opcode116;
    private int opcode157;
    private int opcode244;
    private int opcode170;
    private int opcode151;
    private int opcode14;
    private int opcode27;
    private int opcode9;
    private int unknownValue1;
    private int unknownValue2;

    private final void readOpcodeValues(InputStream stream) {
        while (true) {
            int opcode = stream.readUnsignedByte();
            if (opcode == 0) break;
            readValues(stream, opcode);
        }
    }

    public String getName() {
        return name;
    }

    public int getFemaleWornModelId1() {
        return femaleEquip1;
    }

    public int getFemaleWornModelId2() {
        return femaleEquip2;
    }

    public int getMaleWornModelId1() {
        return maleEquip1;
    }

    public int getMaleWornModelId2() {
        return maleEquip2;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public boolean isStackable() {
        return stackable == 1;
    }

    public boolean isNoted() {
        return noted;
    }

    public int getLendId() {
        return lendId;
    }

    public int getCertId() {
        return certId;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ItemDefinitions{" + "id=" + id + ", modelId=" + modelId + ", name='" + name + '\'' + ", modelZoom="
               + modelZoom + ", modelRotation1=" + modelRotation1 + ", modelRotation2=" + modelRotation2
               + ", modelOffset1=" + modelOffset1 + ", modelOffset2=" + modelOffset2 + ", stackable=" + stackable
               + ", value=" + value + ", membersOnly=" + membersOnly + ", maleEquip1=" + maleEquip1 + ", femaleEquip1="
               + femaleEquip1 + ", maleEquip2=" + maleEquip2 + ", femaleEquip2=" + femaleEquip2 + ", groundOptions="
               + Arrays.toString(groundOptions) + ", inventoryOptions=" + Arrays.toString(inventoryOptions)
               + ", originalModelColors=" + Arrays.toString(originalModelColors) + ", modifiedModelColors="
               + Arrays.toString(modifiedModelColors) + ", originalTextureColors="
               + Arrays.toString(originalTextureColors) + ", modifiedTextureColors="
               + Arrays.toString(modifiedTextureColors) + ", unknownArray1=" + Arrays.toString(unknownArray1)
               + ", unknownArray2=" + Arrays.toString(unknownArray2) + ", unnoted=" + unnoted + ", maleEquipModelId3="
               + maleEquipModelId3 + ", femaleEquipModelId3=" + femaleEquipModelId3 + ", unknownInt1=" + unknownInt1
               + ", unknownInt2=" + unknownInt2 + ", unknownInt3=" + unknownInt3 + ", unknownInt4=" + unknownInt4
               + ", unknownInt5=" + unknownInt5 + ", unknownInt6=" + unknownInt6 + ", certId=" + certId
               + ", certTemplateId=" + certTemplateId + ", stackIds=" + Arrays.toString(stackIds) + ", stackAmounts="
               + Arrays.toString(stackAmounts) + ", unknownInt7=" + unknownInt7 + ", unknownInt8=" + unknownInt8
               + ", unknownInt9=" + unknownInt9 + ", unknownInt10=" + unknownInt10 + ", unknownInt11=" + unknownInt11
               + ", teamId=" + teamId + ", lendId=" + lendId + ", lendTemplateId=" + lendTemplateId + ", unknownInt12="
               + unknownInt12 + ", unknownInt13=" + unknownInt13 + ", unknownInt14=" + unknownInt14 + ", unknownInt15="
               + unknownInt15 + ", unknownInt16=" + unknownInt16 + ", unknownInt17=" + unknownInt17 + ", unknownInt18="
               + unknownInt18 + ", unknownInt19=" + unknownInt19 + ", unknownInt20=" + unknownInt20 + ", unknownInt21="
               + unknownInt21 + ", unknownInt22=" + unknownInt22 + ", unknownInt23=" + unknownInt23 + ", noted=" + noted
               + ", loaned=" + loaned + ", clientScriptData=" + clientScriptData + ", itemRequirements="
               + itemRequirements + ", opcode18=" + opcode18 + ", unknownValue=" + unknownValue + ", opcode13="
               + opcode13 + ", opcode82=" + opcode82 + ", opcode117=" + opcode117 + ", opcode66=" + opcode66
               + ", opcode116=" + opcode116 + ", opcode157=" + opcode157 + ", opcode244=" + opcode244 + ", opcode170="
               + opcode170 + ", opcode151=" + opcode151 + ", opcode14=" + opcode14 + ", opcode27=" + opcode27
               + ", opcode9=" + opcode9 + ", unknownValue1=" + unknownValue1 + ", unknownValue2=" + unknownValue2 + '}';
    }

    public static int getItemDefinitionsSize() {
        int lastArchiveId = Cache.STORE.getIndexes()[19].getLastArchiveId();
        return lastArchiveId * 256 + Cache.STORE.getIndexes()[19].getValidFilesCount(lastArchiveId);
    }

}