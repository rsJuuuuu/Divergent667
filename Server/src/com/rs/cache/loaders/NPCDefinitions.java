package com.rs.cache.loaders;

import com.rs.cache.Cache;
import com.rs.io.InputStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("unused")
public final class NPCDefinitions {

    private static final ConcurrentHashMap<Integer, NPCDefinitions> npcDefinitions = new ConcurrentHashMap<>();

    public int id;
    public HashMap<Integer, Object> aClass180_832;
    public int anInt833;
    public int anInt836;
    public int anInt837;
    public byte respawnDirection;
    public int size = 1;
    public int[][] anIntArrayArray840;
    public boolean aBoolean841;
    public int anInt842;
    public int anInt844;
    public int[] anIntArray845;
    public int anInt846;
    public int renderEmote;
    public boolean aBoolean849 = false;
    public int anInt850;
    public byte aByte851;
    public boolean aBoolean852;
    public int anInt853;
    public byte aByte854;
    public boolean aBoolean856;
    public boolean aBoolean857;
    public short[] aShortArray859;
    public int combatLevel;
    public byte[] aByteArray861;
    public short aShort862;
    public boolean aBoolean863;
    public int anInt864;
    public String name;
    public short[] aShortArray866;
    public byte walkMask;
    public int[] modelIds;
    public int anInt869;
    public int anInt870;
    public int anInt871;
    public int anInt872;
    public int anInt874;
    public int anInt875;
    public int anInt876;
    public int headIcons;
    public int anInt879;
    public short[] aShortArray880;
    public int[][] anIntArrayArray882;
    public int anInt884;
    public int[] anIntArray885;
    public int anInt888;
    public int anInt889;
    public boolean isVisibleOnMap;
    public int[] anIntArray892;
    public short aShort894;
    public String[] options;
    public short[] aShortArray896;
    public int anInt897;
    public int anInt899;
    public int npcId;
    public int anInt901;

    public static NPCDefinitions getNPCDefinitions(int id) {
        NPCDefinitions def = npcDefinitions.get(id);
        if (def == null) {
            def = new NPCDefinitions(id);
            def.method694();
            byte[] data = Cache.STORE.getIndexes()[18].getFile(id >>> 7, id & 0x7f);
            if (data == null) System.out.println("Failed loading Npc " + id + ".");
            else def.readValueLoop(new InputStream(data));
            npcDefinitions.put(id, def);
        }
        return def;
    }

    public void method694() {
        if (modelIds == null) modelIds = new int[0];
    }

    private void readValueLoop(InputStream stream) {
        while (true) {
            int opcode = stream.readUnsignedByte();
            if (opcode == 0) break;
            readValues(stream, opcode);
        }
    }

    public boolean aBoolean3190;

    private void readValues(InputStream stream, int opcode) {
        if (opcode != 1) {
            if (opcode == 2) name = stream.readString();
            else if ((~opcode) != -13) {
                if (opcode >= 30 && (~opcode) > -36) {
                    options[opcode - 30] = stream.readString();
                    if (options[-30 + opcode].equalsIgnoreCase("Hidden")) options[-30 + opcode] = null;
                } else if ((~opcode) != -41) {
                    if (opcode == 41) {
                        int i = stream.readUnsignedByte();
                        aShortArray880 = new short[i];
                        aShortArray866 = new short[i];
                        for (int i_54_ = 0; (~i_54_) > (~i); i_54_++) {
                            aShortArray880[i_54_] = (short) stream.readUnsignedShort();
                            aShortArray866[i_54_] = (short) stream.readUnsignedShort();
                        }
                    } else if ((~opcode) == -43) {
                        int i = stream.readUnsignedByte();
                        aByteArray861 = new byte[i];
                        for (int i_55_ = 0; i > i_55_; i_55_++)
                            aByteArray861[i_55_] = (byte) stream.readByte();
                    } else if ((~opcode) != -61) {
                        if (opcode == 93) isVisibleOnMap = false;
                        else if ((~opcode) == -96) combatLevel = stream.readUnsignedShort();
                        else if (opcode != 97) {
                            if ((~opcode) == -99) anInt899 = stream.readUnsignedShort();
                            else if ((~opcode) == -100) aBoolean863 = true;
                            else if (opcode == 100) anInt869 = stream.readByte();
                            else if ((~opcode) == -102) anInt897 = stream.readByte() * 5;
                            else if ((~opcode) == -103) headIcons = stream.readUnsignedShort();
                            else if (opcode != 103) {
                                if (opcode == 106 || opcode == 118) {
                                    anInt844 = stream.readUnsignedShort();
                                    if (anInt844 == 65535) anInt844 = -1;
                                    anInt888 = stream.readUnsignedShort();
                                    if (anInt888 == 65535) anInt888 = -1;
                                    int i = -1;
                                    if ((~opcode) == -119) {
                                        i = stream.readUnsignedShort();
                                        if ((~i) == -65536) i = -1;
                                    }
                                    int i_56_ = stream.readUnsignedByte();
                                    anIntArray845 = new int[2 + i_56_];
                                    for (int i_57_ = 0; i_56_ >= i_57_; i_57_++) {
                                        anIntArray845[i_57_] = stream.readUnsignedShort();
                                        if (anIntArray845[i_57_] == 65535) anIntArray845[i_57_] = -1;
                                    }
                                    anIntArray845[i_56_ - -1] = i;
                                } else if ((~opcode) != -108) {
                                    if ((~opcode) == -110) aBoolean852 = false;
                                    else if ((~opcode) != -112) {
                                        if (opcode != 113) {
                                            if (opcode == 114) {
                                                aByte851 = (byte) (stream.readByte());
                                                aByte854 = (byte) (stream.readByte());
                                            } else if (opcode == 115) {
                                                stream.readUnsignedByte();
                                                stream.readUnsignedByte();
                                            } else if ((~opcode) != -120) {
                                                if (opcode != 121) {
                                                    if ((~opcode) != -123) {
                                                        if (opcode == 123) anInt846 = (stream.readUnsignedShort());
                                                        else if (opcode != 125) {
                                                            if (opcode == 127)
                                                                renderEmote = (stream.readUnsignedShort());
                                                            else if ((~opcode) == -129)
                                                                stream.readUnsignedByte();
                                                            else if (opcode != 134) {
                                                                if (opcode == 135) {
                                                                    anInt833 = stream.readUnsignedByte();
                                                                    anInt874 = stream.readUnsignedShort();
                                                                } else if (opcode != 136) {
                                                                    if (opcode != 137) {
                                                                        if (opcode != 138) {
                                                                            if ((~opcode) != -140) {
                                                                                if (opcode == 140)
                                                                                    anInt850 = stream
                                                                                            .readUnsignedByte();
                                                                                else if (opcode == 141)
                                                                                    aBoolean849 = true;
                                                                                else if ((~opcode) !=
                                                                                        -143) {
                                                                                    if (opcode == 143)
                                                                                        aBoolean856 = true;
                                                                                    else if ((~opcode) <=
                                                                                            -151 && opcode < 155) {
                                                                                        options[opcode - 150] =
                                                                                                stream.readString();
                                                                                        if (options[opcode - 150]
                                                                                                .equalsIgnoreCase
                                                                                                        ("Hidden"))
                                                                                            options[opcode + -150] =
                                                                                                    null;
                                                                                    } else if ((~opcode)
                                                                                            == -161) {
                                                                                        int i = stream
                                                                                                .readUnsignedByte();
                                                                                        anIntArray885 = new int[i];
                                                                                        for (int i_58_ = 0; i >
                                                                                                i_58_; i_58_++)
                                                                                            anIntArray885[i_58_] =
                                                                                                    stream.readUnsignedShort();

                                                                                    } else if (opcode == 155) {
                                                                                        int aByte821 = stream
                                                                                                .readByte();
                                                                                        int aByte824 = stream
                                                                                                .readByte();
                                                                                        int aByte843 = stream
                                                                                                .readByte();
                                                                                        int aByte855 = stream
                                                                                                .readByte();
                                                                                    } else if (opcode == 158) {
                                                                                        byte aByte833 = (byte) 1;
                                                                                    } else if (opcode == 159) {
                                                                                        byte aByte833 = (byte) 0;
                                                                                    } else if (opcode == 162) { // added
                                                                                        // opcode
                                                                                        aBoolean3190 = true;
                                                                                    } else if (opcode == 163) { // added
                                                                                        // opcode
                                                                                        int anInt864 = stream
                                                                                                .readUnsignedByte();
                                                                                    } else if (opcode == 164) {
                                                                                        int anInt848 = stream
                                                                                                .readUnsignedShort();
                                                                                        int anInt837 = stream
                                                                                                .readUnsignedShort();
                                                                                    } else if (opcode == 165) {
                                                                                        int anInt847 = stream
                                                                                                .readUnsignedByte();
                                                                                    } else if (opcode == 168) {
                                                                                        int anInt828 = stream
                                                                                                .readUnsignedByte();
                                                                                    } else if (opcode == 249) {
                                                                                        int i = stream
                                                                                                .readUnsignedByte();
                                                                                        if (aClass180_832 == null) {
                                                                                            aClass180_832 = new
                                                                                                    HashMap<>(i);
                                                                                        }
                                                                                        for (int i_60_ = 0; i >
                                                                                                i_60_; i_60_++) {
                                                                                            boolean bool = stream
                                                                                                    .readUnsignedByte
                                                                                                            () == 1;
                                                                                            int key = stream
                                                                                                    .read24BitInt();
                                                                                            Object value;
                                                                                            if (bool)
                                                                                                value = stream
                                                                                                        .readString();
                                                                                            else
                                                                                                value = stream
                                                                                                        .readInt();
                                                                                            aClass180_832.put(key,
                                                                                                    value);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    anInt870 = stream
                                                                                            .readUnsignedShort();
                                                                            } else anInt879 = stream.readBigSmart();
                                                                        } else anInt901 = stream.readBigSmart();
                                                                    } else anInt872 = stream.readUnsignedShort();
                                                                } else {
                                                                    anInt837 = stream.readUnsignedByte();
                                                                    anInt889 = stream.readUnsignedShort();
                                                                }
                                                            } else {
                                                                anInt876 = (stream.readUnsignedShort());
                                                                if (anInt876 == 65535) anInt876 = -1;
                                                                anInt842 = (stream.readUnsignedShort());
                                                                if (anInt842 == 65535) anInt842 = -1;
                                                                anInt884 = (stream.readUnsignedShort());
                                                                if ((~anInt884) == -65536) anInt884 = -1;
                                                                anInt871 = (stream.readUnsignedShort());
                                                                if ((~anInt871) == -65536) anInt871 = -1;
                                                                anInt875 = (stream.readUnsignedByte());
                                                            }
                                                        } else respawnDirection = (byte) (stream.readByte());
                                                    } else anInt836 = (stream.readBigSmart());
                                                } else {
                                                    anIntArrayArray840 = (new int[modelIds.length][]);
                                                    int i = (stream.readUnsignedByte());
                                                    for (int i_62_ = 0; ((~i_62_) > (~i));
                                                         i_62_++) {
                                                        int i_63_ = (stream.readUnsignedByte());
                                                        int[] is = (anIntArrayArray840[i_63_] = (new int[3]));
                                                        is[0] = (stream.readByte());
                                                        is[1] = (stream.readByte());
                                                        is[2] = (stream.readByte());
                                                    }
                                                }
                                            } else walkMask = (byte) (stream.readByte());
                                        } else {
                                            aShort862 = (short) (stream.readUnsignedShort());
                                            aShort894 = (short) (stream.readUnsignedShort());
                                        }
                                    } else aBoolean857 = false;
                                } else aBoolean841 = false;
                            } else anInt853 = stream.readUnsignedShort();
                        } else anInt864 = stream.readUnsignedShort();
                    } else {
                        int i = stream.readUnsignedByte();
                        anIntArray892 = new int[i];
                        for (int i_64_ = 0; (~i_64_) > (~i); i_64_++)
                            anIntArray892[i_64_] = stream.readBigSmart();
                    }
                } else {
                    int i = stream.readUnsignedByte();
                    aShortArray859 = new short[i];
                    aShortArray896 = new short[i];
                    for (int i_65_ = 0; (~i) < (~i_65_); i_65_++) {
                        aShortArray896[i_65_] = (short) stream.readUnsignedShort();
                        aShortArray859[i_65_] = (short) stream.readUnsignedShort();
                    }
                }
            } else size = stream.readUnsignedByte();
        } else {
            int i = stream.readUnsignedByte();
            modelIds = new int[i];
            for (int i_66_ = 0; i_66_ < i; i_66_++) {
                modelIds[i_66_] = stream.readBigSmart();
                if ((~modelIds[i_66_]) == -65536) modelIds[i_66_] = -1;
            }
        }
    }

    /**
     * Check whether this npc is undead
     * <p>
     * This should be done properly, atm just a simple check
     *
     * @return undead
     */
    public boolean isUndead() {
        return name.toLowerCase().contains("skeleton");
    }

    public boolean hasPickupOption() {
        String[] as;
        int j = (as = options).length;
        for (int i = 0; i < j; i++) {
            String option = as[i];
            if (option != null && option.equalsIgnoreCase("pick-up")) return true;
        }

        return false;
    }

    public boolean hasTakeOption() {
        String[] as;
        int j = (as = options).length;
        for (int i = 0; i < j; i++) {
            String option = as[i];
            if (option != null && option.equalsIgnoreCase("take")) return true;
        }

        return false;
    }

    public static void clearNPCDefinitions() {
        npcDefinitions.clear();
    }

    public NPCDefinitions(int id) {
        this.id = id;
        anInt842 = -1;
        anInt844 = -1;
        anInt837 = -1;
        anInt846 = -1;
        anInt853 = 32;
        combatLevel = -1;
        anInt836 = -1;
        name = "null";
        anInt869 = 0;
        walkMask = (byte) 0;
        anInt850 = 255;
        anInt871 = -1;
        aBoolean852 = true;
        aShort862 = (short) 0;
        anInt876 = -1;
        aByte851 = (byte) -96;
        anInt875 = 0;
        anInt872 = -1;
        renderEmote = -1;
        respawnDirection = (byte) 7;
        aBoolean857 = true;
        anInt870 = -1;
        anInt874 = -1;
        anInt833 = -1;
        anInt864 = 128;
        headIcons = -1;
        aBoolean856 = false;
        anInt888 = -1;
        aByte854 = (byte) -16;
        aBoolean863 = false;
        isVisibleOnMap = true;
        anInt889 = -1;
        anInt884 = -1;
        aBoolean841 = true;
        anInt879 = -1;
        anInt899 = 128;
        aShort894 = (short) 0;
        options = new String[5];
        anInt897 = 0;
        anInt901 = -1;
    }

    public boolean hasMarkOption() {
        for (String option : options) {
            if (option != null && option.equalsIgnoreCase("mark")) return true;
        }
        return false;
    }

    public boolean hasOption(String op) {
        for (String option : options) {
            if (option != null && option.equalsIgnoreCase(op)) return true;
        }
        return false;
    }

    public boolean hasAttackOption() {
        for (String option : options) {
            if (option != null && option.equalsIgnoreCase("attack")) return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public static int getNPCDefinitionsSize() {
        int lastArchiveId = Cache.STORE.getIndexes()[18].getLastArchiveId();
        return lastArchiveId * 128 + Cache.STORE.getIndexes()[18].getValidFilesCount(lastArchiveId);
    }

    @Override
    public String toString() {
        return "NPCDefinitions{" + "id=" + id + ", aClass180_832=" + aClass180_832 + ", anInt833=" + anInt833
                + ", anInt836=" + anInt836 + ", anInt837=" + anInt837 + ", respawnDirection=" + respawnDirection
                + ", size=" + size + ", anIntArrayArray840=" + Arrays.toString(anIntArrayArray840) + ", aBoolean841="
                + aBoolean841 + ", anInt842=" + anInt842 + ", anInt844=" + anInt844 + ", anIntArray845="
                + Arrays.toString(anIntArray845) + ", anInt846=" + anInt846 + ", renderEmote=" + renderEmote
                + ", aBoolean849=" + aBoolean849 + ", anInt850=" + anInt850 + ", aByte851=" + aByte851 + ", aBoolean852="
                + aBoolean852 + ", anInt853=" + anInt853 + ", aByte854=" + aByte854 + ", aBoolean856=" + aBoolean856
                + ", aBoolean857=" + aBoolean857 + ", aShortArray859=" + Arrays.toString(aShortArray859)
                + ", combatLevel=" + combatLevel + ", aByteArray861=" + Arrays.toString(aByteArray861) + ", aShort862="
                + aShort862 + ", aBoolean863=" + aBoolean863 + ", anInt864=" + anInt864 + ", name='" + name + '\''
                + ", aShortArray866=" + Arrays.toString(aShortArray866) + ", walkMask=" + walkMask + ", modelIds="
                + Arrays.toString(modelIds) + ", anInt869=" + anInt869 + ", anInt870=" + anInt870 + ", anInt871="
                + anInt871 + ", anInt872=" + anInt872 + ", anInt874=" + anInt874 + ", anInt875=" + anInt875
                + ", anInt876=" + anInt876 + ", headIcons=" + headIcons + ", anInt879=" + anInt879 + ", aShortArray880="
                + Arrays.toString(aShortArray880) + ", anIntArrayArray882=" + Arrays.toString(anIntArrayArray882)
                + ", anInt884=" + anInt884 + ", anIntArray885=" + Arrays.toString(anIntArray885) + ", anInt888="
                + anInt888 + ", anInt889=" + anInt889 + ", isVisibleOnMap=" + isVisibleOnMap + ", anIntArray892="
                + Arrays.toString(anIntArray892) + ", aShort894=" + aShort894 + ", options=" + Arrays.toString(options)
                + ", aShortArray896=" + Arrays.toString(aShortArray896) + ", anInt897=" + anInt897 + ", anInt899="
                + anInt899 + ", npcId=" + npcId + ", anInt901=" + anInt901 + ", aBoolean3190=" + aBoolean3190 + '}';
    }
}