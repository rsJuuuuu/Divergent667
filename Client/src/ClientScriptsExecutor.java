/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Objects;

public class ClientScriptsExecutor {
    private static long[] aLongArray3837 = new long[1000];
    static int anInt3838;
    private static String[] aStringArray3839;
    private static int[] anIntArray3840 = new int[1000];
    private static int anInt3841;
    private static Class113[] aClass113Array3842;
    static int anInt3844;
    private static int[] anIntArray3845;
    private static int anInt3846;
    private static int[] anIntArray3847;
    static int anInt3848;
    private static IComponentDefinitions aWidget3849;
    static int anInt3850;
    private static long[] aLongArray3851;
    static int anInt3852;
    static int anInt3853;
    static int anInt3854;
    private static String[] aStringArray3855;
    private static Class16 aClass16_3856;
    private static Node_Sub43 aNode_Sub43_3857;
    static int anInt3858;
    private static int[][] anIntArrayArray3859;
    private static ClanChat aClanChat3860;
    static int anInt3861;
    static int anInt3862;
    static int anInt3863;
    private static int anInt3864;
    private static IComponentDefinitions aWidget3865;
    private static int[] anIntArray3866;
    static Class61 aClass61_3867;
    static boolean aBoolean3868;
    private static int anInt3869;
    static String aString3870;

    private static int method3547(int i) {
        Class314 class314 = Class291_Sub1.aClass13_8198.method207(i);
        Integer integer = aClanChat3860.method506(Class209.aClass353_2483.anInt4344 << 16 | class314.anInt4021, class314.anInt4023, class314.anInt4018);
        if (integer == null) {
            return 0;
        }
        return integer;
    }

    private static int method3548(int i) {
        Class314 class314 = Class291_Sub1.aClass13_8198.method207(i);
        Integer integer = aClanChat3860.method501(Class209.aClass353_2483.anInt4344 << 16 | i);
        if (integer == null) {
            if (class314.aChar4022 == 'i' || class314.aChar4022 == '1') {
                return 0;
            }
            return -1;
        }
        return integer;
    }

    private static long method3549(int i) {
        Long var_long = aClanChat3860.method489(Class209.aClass353_2483.anInt4344 << 16 | i);
        if (var_long == null) {
            return -1L;
        }
        return var_long;
    }

    static void parseIComponentScript(int i) {
        if (i != -1 && CacheNode_Sub15.method2379(i)) {
            IComponentDefinitions[] widgets = Class134_Sub3.aWidgetArrayArray9035[i];
            for (IComponentDefinitions widget : widgets) {
                if (widget.anObjectArray4758 != null) {
                    Node_Sub37 node_sub37 = new Node_Sub37();
                    node_sub37.aWidget7437 = widget;
                    node_sub37.parameters = widget.anObjectArray4758;
                    executeScript(node_sub37, 2000000);
                }
            }
        }
    }

    private static void method3551(IComponentDefinitions widget) {
        if (widget != null) {
            if (widget.anInt4687 == -1) {
                int i = widget.ihash >>> 16;
                IComponentDefinitions[] widgets = Class79.aWidgetArrayArray1082[i];
                if (widgets == null) {
                    IComponentDefinitions[] widgets_2_ = Class134_Sub3.aWidgetArrayArray9035[i];
                    int i_3_ = widgets_2_.length;
                    widgets = Class79.aWidgetArrayArray1082[i] = new IComponentDefinitions[i_3_];
                    Class311.method3605(widgets_2_, 0, widgets, 0, widgets_2_.length);
                }
                int i_4_;
                for (i_4_ = 0; i_4_ < widgets.length; i_4_++) {
                    if (widgets[i_4_] == widget) {
                        break;
                    }
                }
                if (i_4_ < widgets.length) {
                    Class311.method3605(widgets, i_4_ + 1, widgets, i_4_, widgets.length - i_4_ - 1);
                    widgets[widgets.length - 1] = widget;
                }
            } else {
                IComponentDefinitions widget_1_ = Class76.method771(widget.parentId);
                if (widget_1_ != null) {
                    if (widget_1_.aWidgetArray4793 == widget_1_.aWidgetArray4804) {
                        widget_1_.aWidgetArray4793 = new IComponentDefinitions[widget_1_.aWidgetArray4804.length];
                        widget_1_.aWidgetArray4793[widget_1_.aWidgetArray4793.length - 1] = widget;
                        Class311.method3605(widget_1_.aWidgetArray4804, 0, widget_1_.aWidgetArray4793, 0, widget.anInt4687);
                        Class311.method3605(widget_1_.aWidgetArray4804, widget.anInt4687 + 1, widget_1_.aWidgetArray4793, widget.anInt4687, widget_1_.aWidgetArray4804.length - widget.anInt4687 - 1);
                    } else {
                        int i = 0;
                        IComponentDefinitions[] widgets;
                        for (widgets = widget_1_.aWidgetArray4793; i < widgets.length; i++) {
                            if (widgets[i] == widget) {
                                break;
                            }
                        }
                        if (i < widgets.length) {
                            Class311.method3605(widgets, i + 1, widgets, i, widgets.length - i - 1);
                            widgets[widget_1_.aWidgetArray4793.length - 1] = widget;
                        }
                    }
                }
            }
        }
    }

    private static void method3552(int i, boolean bool) {
        if (i < 300) {
            if (i == 150) {
                anInt3846 -= 3;
                int i_5_ = anIntArray3840[anInt3846];
                int i_6_ = anIntArray3840[anInt3846 + 1];
                int i_7_ = anIntArray3840[anInt3846 + 2];
                if (i_6_ == 0) {
                    throw new RuntimeException();
                }
                IComponentDefinitions widget = Class76.method771(i_5_);
                if (Objects.requireNonNull(widget).aWidgetArray4804 == null) {
                    widget.aWidgetArray4804 = new IComponentDefinitions[i_7_ + 1];
                    widget.aWidgetArray4793 = widget.aWidgetArray4804;
                }
                if (widget.aWidgetArray4804.length <= i_7_) {
                    if (widget.aWidgetArray4804 == widget.aWidgetArray4793) {
                        IComponentDefinitions[] widgets = new IComponentDefinitions[i_7_ + 1];
                        System.arraycopy(widget.aWidgetArray4804, 0, widgets, 0, widget.aWidgetArray4804.length);
                        widget.aWidgetArray4804 = widget.aWidgetArray4793 = widgets;
                    } else {
                        IComponentDefinitions[] widgets = new IComponentDefinitions[i_7_ + 1];
                        IComponentDefinitions[] widgets_9_ = new IComponentDefinitions[i_7_ + 1];
                        for (int i_10_ = 0; i_10_ < widget.aWidgetArray4804.length; i_10_++) {
                            widgets[i_10_] = widget.aWidgetArray4804[i_10_];
                            widgets_9_[i_10_] = widget.aWidgetArray4793[i_10_];
                        }
                        widget.aWidgetArray4804 = widgets;
                        widget.aWidgetArray4793 = widgets_9_;
                    }
                }
                if (i_7_ > 0 && widget.aWidgetArray4804[i_7_ - 1] == null) {
                    throw new RuntimeException("Gap at:" + (i_7_ - 1));
                }
                IComponentDefinitions widget_11_ = new IComponentDefinitions();
                widget_11_.type = i_6_;
                widget_11_.parentId = widget_11_.ihash = widget.ihash;
                widget_11_.anInt4687 = i_7_;
                widget.aWidgetArray4804[i_7_] = widget_11_;
                if (widget.aWidgetArray4793 != widget.aWidgetArray4804) {
                    widget.aWidgetArray4793[i_7_] = widget_11_;
                }
                if (bool) {
                    aWidget3865 = widget_11_;
                } else {
                    aWidget3849 = widget_11_;
                }
                ClientScript.method2321(widget);
                return;
            }
            if (i == 151) {
                IComponentDefinitions widget = bool ? aWidget3865 : aWidget3849;
                if (widget.anInt4687 == -1) {
                    if (bool) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                IComponentDefinitions widget_12_ = Class76.method771(widget.ihash);
                Objects.requireNonNull(widget_12_).aWidgetArray4804[widget.anInt4687] = null;
                ClientScript.method2321(widget_12_);
                return;
            }
            if (i == 152) {
                IComponentDefinitions widget = Class76.method771(anIntArray3840[--anInt3846]);
                Objects.requireNonNull(widget).aWidgetArray4804 = null;
                widget.aWidgetArray4793 = null;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 200) {
                anInt3846 -= 2;
                int i_13_ = anIntArray3840[anInt3846];
                int i_14_ = anIntArray3840[anInt3846 + 1];
                IComponentDefinitions widget = Node_Sub3.method2169(i_14_, i_13_);
                if (widget == null || i_14_ == -1) {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                } else {
                    anIntArray3840[anInt3846++] = 1;
                    if (bool) {
                        aWidget3865 = widget;
                    } else {
                        aWidget3849 = widget;
                    }
                }
                return;
            }
            if (i == 201) {
                int i_15_ = anIntArray3840[--anInt3846];
                IComponentDefinitions widget = Class76.method771(i_15_);
                if (widget == null) {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                } else {
                    anIntArray3840[anInt3846++] = 1;
                    if (bool) {
                        aWidget3865 = widget;
                    } else {
                        aWidget3849 = widget;
                    }
                }
                return;
            }
            if (i == 202 || i == 204) {
                IComponentDefinitions widget;
                if (i == 202) {
                    int i_16_ = anIntArray3840[--anInt3846];
                    widget = Class76.method771(i_16_);
                } else {
                    widget = bool ? aWidget3865 : aWidget3849;
                }
                method3551(widget);
                return;
            }
            if (i == 203 || i == 205) {
                IComponentDefinitions widget;
                if (i == 203) {
                    int i_17_ = anIntArray3840[--anInt3846];
                    widget = Class76.method771(i_17_);
                } else {
                    widget = bool ? aWidget3865 : aWidget3849;
                }
                method3553(widget);
                return;
            }
        } else if (i < 500) {
            if (i == 403) {
                anInt3846 -= 2;
                int i_18_ = anIntArray3840[anInt3846];
                int i_19_ = anIntArray3840[anInt3846 + 1];
                if (Class295.myPlayer.aPlayerDefinition11137 != null) {
                    for (int i_20_ = 0; i_20_ < Class370.anIntArray4567.length; i_20_++) {
                        if (Class370.anIntArray4567[i_20_] == i_18_) {
                            Class295.myPlayer.aPlayerDefinition11137.method3281(i_19_, (byte) 97, Class42.aClass181_643, i_20_);
                            return;
                        }
                    }
                    for (int i_21_ = 0; i_21_ < r.anIntArray9580.length; i_21_++) {
                        if (r.anIntArray9580[i_21_] == i_18_) {
                            Class295.myPlayer.aPlayerDefinition11137.method3281(i_19_, (byte) 96, Class42.aClass181_643, i_21_);
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (i == 404) {
                anInt3846 -= 2;
                int i_22_ = anIntArray3840[anInt3846];
                int i_23_ = anIntArray3840[anInt3846 + 1];
                if (Class295.myPlayer.aPlayerDefinition11137 != null) {
                    Class295.myPlayer.aPlayerDefinition11137.method3282(i_22_, i_23_);
                    return;
                }
                return;
            }
            if (i == 410) {
                boolean bool_24_ = anIntArray3840[--anInt3846] != 0;
                if (Class295.myPlayer.aPlayerDefinition11137 != null) {
                    Class295.myPlayer.aPlayerDefinition11137.method3280(bool_24_);
                    return;
                }
                return;
            }
            if (i == 411) {
                anInt3846 -= 2;
                int i_25_ = anIntArray3840[anInt3846];
                int i_26_ = anIntArray3840[anInt3846 + 1];
                if (Class295.myPlayer.aPlayerDefinition11137 != null) {
                    Class295.myPlayer.aPlayerDefinition11137.method3284(i_26_, i_25_, EntityNode_Sub3_Sub1.aClass86_9166);
                    return;
                }
                return;
            }
        } else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
            IComponentDefinitions widget;
            if (i >= 2000) {
                i -= 1000;
                widget = Class76.method771(anIntArray3840[--anInt3846]);
            } else {
                widget = bool ? aWidget3865 : aWidget3849;
            }
            if (i == 1000) {
                anInt3846 -= 4;
                Objects.requireNonNull(widget).anInt4850 = anIntArray3840[anInt3846];
                widget.anInt4816 = anIntArray3840[anInt3846 + 1];
                int i_27_ = anIntArray3840[anInt3846 + 2];
                if (i_27_ < 0) {
                    i_27_ = 0;
                } else if (i_27_ > 5) {
                    i_27_ = 5;
                }
                int i_28_ = anIntArray3840[anInt3846 + 3];
                if (i_28_ < 0) {
                    i_28_ = 0;
                } else if (i_28_ > 5) {
                    i_28_ = 5;
                }
                widget.aByte4720 = (byte) i_27_;
                widget.aByte4851 = (byte) i_28_;
                ClientScript.method2321(widget);
                Class28.method332(widget);
                if (widget.anInt4687 == -1) {
                    Class224.method2105(widget.ihash);
                }
                return;
            }
            if (i == 1001) {
                anInt3846 -= 4;
                Objects.requireNonNull(widget).anInt4693 = anIntArray3840[anInt3846];
                widget.anInt4722 = anIntArray3840[anInt3846 + 1];
                widget.anInt4800 = 0;
                widget.anInt4849 = 0;
                int i_29_ = anIntArray3840[anInt3846 + 2];
                if (i_29_ < 0) {
                    i_29_ = 0;
                } else if (i_29_ > 4) {
                    i_29_ = 4;
                }
                int i_30_ = anIntArray3840[anInt3846 + 3];
                if (i_30_ < 0) {
                    i_30_ = 0;
                } else if (i_30_ > 4) {
                    i_30_ = 4;
                }
                widget.aByte4750 = (byte) i_29_;
                widget.aByte4741 = (byte) i_30_;
                ClientScript.method2321(widget);
                Class28.method332(widget);
                if (widget.type == 0) {
                    Class270_Sub1.method3300(widget, false);
                }
                return;
            }
            if (i == 1003) {
                boolean bool_31_ = anIntArray3840[--anInt3846] == 1;
                if (Objects.requireNonNull(widget).hidden != bool_31_) {
                    widget.hidden = bool_31_;
                    ClientScript.method2321(widget);
                }
                if (widget.anInt4687 == -1) {
                    EntityNode_Sub7.method978(widget.ihash);
                }
                return;
            }
            if (i == 1004) {
                anInt3846 -= 2;
                Objects.requireNonNull(widget).anInt4792 = anIntArray3840[anInt3846];
                widget.anInt4700 = anIntArray3840[anInt3846 + 1];
                ClientScript.method2321(widget);
                Class28.method332(widget);
                if (widget.type == 0) {
                    Class270_Sub1.method3300(widget, false);
                }
                return;
            }
            if (i == 1005) {
                Objects.requireNonNull(widget).aBoolean4858 = anIntArray3840[--anInt3846] == 1;
                return;
            }
        } else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
            IComponentDefinitions widget;
            if (i >= 2000) {
                i -= 1000;
                widget = Class76.method771(anIntArray3840[--anInt3846]);
            } else {
                widget = bool ? aWidget3865 : aWidget3849;
            }
            if (i == 1100) {
                anInt3846 -= 2;
                Objects.requireNonNull(widget).anInt4817 = anIntArray3840[anInt3846];
                if (widget.anInt4817 > widget.anInt4735 - widget.anInt4809) {
                    widget.anInt4817 = widget.anInt4735 - widget.anInt4809;
                }
                if (widget.anInt4817 < 0) {
                    widget.anInt4817 = 0;
                }
                widget.anInt4734 = anIntArray3840[anInt3846 + 1];
                if (widget.anInt4734 > widget.anInt4691 - widget.anInt4695) {
                    widget.anInt4734 = widget.anInt4691 - widget.anInt4695;
                }
                if (widget.anInt4734 < 0) {
                    widget.anInt4734 = 0;
                }
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Node_Sub33.method2733(widget.ihash);
                }
                return;
            }
            if (i == 1101) {
                Objects.requireNonNull(widget).anInt4754 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Class339.method3916(widget.ihash);
                }
                return;
            }
            if (i == 1102) {
                Objects.requireNonNull(widget).aBoolean4769 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1103) {
                Objects.requireNonNull(widget).anInt4757 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1104) {
                Objects.requireNonNull(widget).anInt4752 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1105) {
                int i_32_ = anIntArray3840[--anInt3846];
                if (Objects.requireNonNull(widget).anInt4820 != i_32_) {
                    widget.anInt4820 = i_32_;
                    ClientScript.method2321(widget);
                }
                if (widget.anInt4687 == -1) {
                    Class194_Sub3_Sub1.method1979(widget.ihash);
                }
                return;
            }
            if (i == 1106) {
                Objects.requireNonNull(widget).anInt4728 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1107) {
                Objects.requireNonNull(widget).aBoolean4861 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1108) {
                Objects.requireNonNull(widget).modelType = 1;
                widget.anInt4864 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Class52.method528(widget.ihash);
                }
                return;
            }
            if (i == 1109) {
                anInt3846 -= 6;
                Objects.requireNonNull(widget).anInt4681 = anIntArray3840[anInt3846];
                widget.anInt4811 = anIntArray3840[anInt3846 + 1];
                widget.anInt4815 = anIntArray3840[anInt3846 + 2];
                widget.anInt4821 = anIntArray3840[anInt3846 + 3];
                widget.anInt4682 = anIntArray3840[anInt3846 + 4];
                widget.anInt4787 = anIntArray3840[anInt3846 + 5];
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Class46.method468(widget.ihash);
                    Node_Sub36_Sub4.method2766(widget.ihash, 122);
                }
                return;
            }
            if (i == 1110) {
                int i_33_ = anIntArray3840[--anInt3846];
                if (i_33_ != Objects.requireNonNull(widget).anInt4773) {
                    if (i_33_ == -1) {
                        widget.anAnimator4755 = null;
                    } else {
                        if (widget.anAnimator4755 == null) {
                            widget.anAnimator4755 = new FixedAnimator();
                        }
                        widget.anAnimator4755.method249(true, i_33_);
                    }
                    widget.anInt4773 = i_33_;
                    ClientScript.method2321(widget);
                }
                if (widget.anInt4687 == -1) {
                    Player.method892(widget.ihash);
                }
                return;
            }
            if (i == 1111) {
                Objects.requireNonNull(widget).aBoolean4707 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1112) {
                String string = aStringArray3855[--anInt3841];
                if (!string.equals(Objects.requireNonNull(widget).aString4790)) {
                    widget.aString4790 = string;
                    ClientScript.method2321(widget);
                }
                if (widget.anInt4687 == -1) {
                    Class339_Sub8.method3944(12000, widget.ihash);
                }
                return;
            }
            if (i == 1113) {
                Objects.requireNonNull(widget).anInt4759 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Node_Sub25_Sub1.method2657(widget.ihash);
                }
                return;
            }
            if (i == 1114) {
                anInt3846 -= 3;
                Objects.requireNonNull(widget).anInt4835 = anIntArray3840[anInt3846];
                widget.anInt4825 = anIntArray3840[anInt3846 + 1];
                widget.anInt4697 = anIntArray3840[anInt3846 + 2];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1115) {
                Objects.requireNonNull(widget).aBoolean4710 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1116) {
                Objects.requireNonNull(widget).anInt4744 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1117) {
                Objects.requireNonNull(widget).anInt4796 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1118) {
                Objects.requireNonNull(widget).aBoolean4732 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1119) {
                Objects.requireNonNull(widget).aBoolean4743 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1120) {
                anInt3846 -= 2;
                Objects.requireNonNull(widget).anInt4735 = anIntArray3840[anInt3846];
                widget.anInt4691 = anIntArray3840[anInt3846 + 1];
                ClientScript.method2321(widget);
                if (widget.type == 0) {
                    Class270_Sub1.method3300(widget, false);
                }
                return;
            }
            if (i == 1122) {
                Objects.requireNonNull(widget).aBoolean4738 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1123) {
                Objects.requireNonNull(widget).anInt4787 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Class46.method468(widget.ihash);
                }
                return;
            }
            if (i == 1124) {
                int i_34_ = anIntArray3840[--anInt3846];
                Objects.requireNonNull(widget).aBoolean4721 = i_34_ == 1;
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1125) {
                anInt3846 -= 2;
                Objects.requireNonNull(widget).anInt4709 = anIntArray3840[anInt3846];
                widget.anInt4797 = anIntArray3840[anInt3846 + 1];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1126) {
                Objects.requireNonNull(widget).anInt4767 = anIntArray3840[--anInt3846];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1127) {
                anInt3846 -= 2;
                int i_35_ = anIntArray3840[anInt3846];
                int i_36_ = anIntArray3840[anInt3846 + 1];
                Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_35_, -101);
                if (i_36_ == class267.anInt3443) {
                    Objects.requireNonNull(widget).method4154(i_35_);
                    return;
                } else {
                    Objects.requireNonNull(widget).method4137(i_35_, i_36_);
                }
                return;
            }
            if (i == 1128) {
                int i_37_ = anIntArray3840[--anInt3846];
                String string = aStringArray3855[--anInt3841];
                Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_37_, -122);
                if (class267.aString3450.equals(string)) {
                    Objects.requireNonNull(widget).method4154(i_37_);
                    return;
                } else {
                    Objects.requireNonNull(widget).method4148(string, i_37_);
                }
                return;
            }
            if (i == 1129 || i == 1130) {
                int i_38_ = anIntArray3840[--anInt3846];
                if ((Objects.requireNonNull(widget).type == 5 || i != 1129) && (widget.type == 4 || i != 1130)) {
                    if (widget.anInt4694 != i_38_) {
                        widget.anInt4694 = i_38_;
                        ClientScript.method2321(widget);
                    }
                    if (widget.anInt4687 == -1) {
                        Class47.method475(widget.ihash);
                    }
                    return;
                }
                return;
            }
            if (i == 1131) {
                anInt3846 -= 3;
                int i_39_ = anIntArray3840[anInt3846];
                short s = (short) anIntArray3840[anInt3846 + 1];
                short s_40_ = (short) anIntArray3840[anInt3846 + 2];
                if (i_39_ >= 0 && i_39_ < 5) {
                    Objects.requireNonNull(widget).method4158(s_40_, i_39_, s);
                    ClientScript.method2321(widget);
                    if (widget.anInt4687 == -1) {
                        Node_Sub23_Sub1.method2637(widget.ihash, i_39_, false);
                    }
                    return;
                }
                return;
            }
            if (i == 1132) {
                anInt3846 -= 3;
                int i_41_ = anIntArray3840[anInt3846];
                short s = (short) anIntArray3840[anInt3846 + 1];
                short s_42_ = (short) anIntArray3840[anInt3846 + 2];
                if (i_41_ >= 0 && i_41_ < 5) {
                    Objects.requireNonNull(widget).method4140(s, -43, i_41_, s_42_);
                    ClientScript.method2321(widget);
                    if (widget.anInt4687 == -1) {
                        Class368.method4081(widget.ihash, i_41_);
                    }
                    return;
                }
                return;
            }
            if (i == 1133) {
                Objects.requireNonNull(widget).aBoolean4832 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Class362.method4052(widget.ihash);
                }
                return;
            }
            if (i == 1134) {
                anInt3846 -= 2;
                int i_43_ = anIntArray3840[anInt3846];
                int i_44_ = anIntArray3840[anInt3846 + 1];
                Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_43_, -113);
                if (i_44_ == class267.anInt3443) {
                    Objects.requireNonNull(widget).method4154(i_43_);
                    return;
                } else {
                    Objects.requireNonNull(widget).method4137(i_43_, i_44_);
                }
                return;
            }
            if (i == 1135) {
                Objects.requireNonNull(widget).aBoolean4782 = anIntArray3840[--anInt3846] == 1;
                ClientScript.method2321(widget);
                if (widget.anInt4687 == -1) {
                    Node_Sub6.method2417(widget.ihash);
                }
                return;
            }
        } else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
            IComponentDefinitions widget;
            if (i >= 2000) {
                i -= 1000;
                widget = Class76.method771(anIntArray3840[--anInt3846]);
            } else {
                widget = bool ? aWidget3865 : aWidget3849;
            }
            ClientScript.method2321(Objects.requireNonNull(widget));
            if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
                anInt3846 -= 2;
                int i_45_ = anIntArray3840[anInt3846];
                int i_46_ = anIntArray3840[anInt3846 + 1];
                if (widget.anInt4687 == -1) {
                    GameStub.method83(widget.ihash);
                    Class46.method468(widget.ihash);
                    Node_Sub36_Sub4.method2766(widget.ihash, -41);
                }
                if (i_45_ == -1) {
                    widget.modelType = 1;
                    widget.anInt4864 = -1;
                    widget.anInt4718 = -1;
                } else {
                    widget.anInt4718 = i_45_;
                    widget.anInt4831 = i_46_;
                    widget.aBoolean4723 = i == 1208 || i == 1209;
                    ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_45_);
                    widget.anInt4815 = itemdefinition.anInt1884;
                    widget.anInt4821 = itemdefinition.anInt1869;
                    widget.anInt4682 = itemdefinition.anInt1866;
                    widget.anInt4681 = itemdefinition.anInt1905;
                    widget.anInt4811 = itemdefinition.anInt1875;
                    widget.anInt4787 = itemdefinition.anInt1874;
                    if (i == 1205 || i == 1209) {
                        widget.anInt4714 = 0;
                    } else if (i == 1212 || i == 1213) {
                        widget.anInt4714 = 1;
                    } else {
                        widget.anInt4714 = 2;
                    }
                    if (widget.anInt4800 > 0) {
                        widget.anInt4787 = widget.anInt4787 * 32 / widget.anInt4800;
                    } else {
                        if (widget.anInt4693 > 0) {
                            widget.anInt4787 = widget.anInt4787 * 32 / widget.anInt4693;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1201) {
                widget.modelType = 2;
                widget.anInt4864 = anIntArray3840[--anInt3846];
                if (widget.anInt4687 == -1) {
                    Class52.method528(widget.ihash);
                }
                return;
            }
            if (i == 1202) {
                widget.modelType = 3;
                widget.anInt4864 = -1;
                if (widget.anInt4687 == -1) {
                    Class52.method528(widget.ihash);
                }
                return;
            }
            if (i == 1203) {
                widget.modelType = 6;
                widget.anInt4864 = anIntArray3840[--anInt3846];
                if (widget.anInt4687 == -1) {
                    Class52.method528(widget.ihash);
                }
                return;
            }
            if (i == 1204) {
                widget.modelType = 5;
                widget.anInt4864 = anIntArray3840[--anInt3846];
                if (widget.anInt4687 == -1) {
                    Class52.method528(widget.ihash);
                }
                return;
            }
            if (i == 1206) {
                anInt3846 -= 4;
                widget.anInt4848 = anIntArray3840[anInt3846];
                widget.anInt4724 = anIntArray3840[anInt3846 + 1];
                widget.anInt4794 = anIntArray3840[anInt3846 + 2];
                widget.anInt4760 = anIntArray3840[anInt3846 + 3];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1207) {
                anInt3846 -= 2;
                widget.anInt4826 = anIntArray3840[anInt3846];
                widget.anInt4764 = anIntArray3840[anInt3846 + 1];
                ClientScript.method2321(widget);
                return;
            }
            if (i == 1210) {
                anInt3846 -= 4;
                widget.anInt4864 = anIntArray3840[anInt3846];
                widget.anInt4683 = anIntArray3840[anInt3846 + 1];
                if (anIntArray3840[anInt3846 + 2] == 1) {
                    widget.modelType = 9;
                } else {
                    widget.modelType = 8;
                }
                widget.aBoolean4723 = anIntArray3840[anInt3846 + 3] == 1;
                if (widget.anInt4687 == -1) {
                    Class52.method528(widget.ihash);
                }
                return;
            }
            if (i == 1211) {
                widget.modelType = 5;
                widget.anInt4864 = Class166.myPlayerIndex;
                widget.anInt4683 = 0;
                if (widget.anInt4687 == -1) {
                    Class52.method528(widget.ihash);
                }
                return;
            }
        } else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
            IComponentDefinitions widget;
            if (i >= 2000) {
                i -= 1000;
                widget = Class76.method771(anIntArray3840[--anInt3846]);
            } else {
                widget = bool ? aWidget3865 : aWidget3849;
            }
            if (i == 1300) {
                int i_47_ = anIntArray3840[--anInt3846] - 1;
                if (i_47_ >= 0 && i_47_ <= 9) {
                    Objects.requireNonNull(widget).method4143(aStringArray3855[--anInt3841], i_47_);
                    return;
                } else {
                    anInt3841--;
                }
                return;
            }
            if (i == 1301) {
                anInt3846 -= 2;
                int i_48_ = anIntArray3840[anInt3846];
                int i_49_ = anIntArray3840[anInt3846 + 1];
                if (i_48_ == -1 && i_49_ == -1) {
                    Objects.requireNonNull(widget).aWidget4836 = null;
                } else {
                    Objects.requireNonNull(widget).aWidget4836 = Node_Sub3.method2169(i_49_, i_48_);
                    return;
                }
                return;
            }
            if (i == 1302) {
                int i_50_ = anIntArray3840[--anInt3846];
                if (i_50_ == Class339_Sub4.anInt8679 || i_50_ == Class71.anInt966 || i_50_ == Class188_Sub1.anInt6864) {
                    Objects.requireNonNull(widget).anInt4860 = i_50_;
                    return;
                }
                return;
            }
            if (i == 1303) {
                Objects.requireNonNull(widget).anInt4708 = anIntArray3840[--anInt3846];
                return;
            }
            if (i == 1304) {
                Objects.requireNonNull(widget).anInt4795 = anIntArray3840[--anInt3846];
                return;
            }
            if (i == 1305) {
                Objects.requireNonNull(widget).aString4779 = aStringArray3855[--anInt3841];
                return;
            }
            if (i == 1306) {
                Objects.requireNonNull(widget).aString4786 = aStringArray3855[--anInt3841];
                return;
            }
            if (i == 1307) {
                Objects.requireNonNull(widget).aStringArray4686 = null;
                return;
            }
            if (i == 1308) {
                Objects.requireNonNull(widget).anInt4839 = anIntArray3840[--anInt3846];
                widget.anInt4698 = anIntArray3840[--anInt3846];
                return;
            }
            if (i == 1309) {
                int i_51_ = anIntArray3840[--anInt3846];
                int i_52_ = anIntArray3840[--anInt3846];
                if (i_52_ >= 1 && i_52_ <= 10) {
                    Objects.requireNonNull(widget).method4149(i_52_ - 1, i_51_);
                }
                return;
            }
            if (i == 1310) {
                Objects.requireNonNull(widget).aString4784 = aStringArray3855[--anInt3841];
                return;
            }
            if (i == 1311) {
                Objects.requireNonNull(widget).anInt4748 = anIntArray3840[--anInt3846];
                return;
            }
            if (i == 1312 || i == 1313) {
                int i_53_;
                int i_54_;
                int i_55_;
                if (i == 1312) {
                    anInt3846 -= 3;
                    i_53_ = anIntArray3840[anInt3846] - 1;
                    i_54_ = anIntArray3840[anInt3846 + 1];
                    i_55_ = anIntArray3840[anInt3846 + 2];
                    if (i_53_ < 0 || i_53_ > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    anInt3846 -= 2;
                    i_53_ = 10;
                    i_54_ = anIntArray3840[anInt3846];
                    i_55_ = anIntArray3840[anInt3846 + 1];
                }
                if (Objects.requireNonNull(widget).aByteArray4806 == null) {
                    if (i_54_ == 0) {
                        return;
                    } else {
                        widget.aByteArray4806 = new byte[11];
                        widget.aByteArray4733 = new byte[11];
                        widget.anIntArray4705 = new int[11];
                    }
                }
                widget.aByteArray4806[i_53_] = (byte) i_54_;
                if (i_54_ == 0) {
                    widget.aBoolean4802 = false;
                    for (int i_56_ = 0; i_56_ < widget.aByteArray4806.length; i_56_++) {
                        if (widget.aByteArray4806[i_56_] != 0) {
                            widget.aBoolean4802 = true;
                            break;
                        }
                    }
                } else {
                    widget.aBoolean4802 = true;
                }
                widget.aByteArray4733[i_53_] = (byte) i_55_;
                return;
            }
            if (i == 1314) {
                Objects.requireNonNull(widget).anInt4761 = anIntArray3840[--anInt3846];
                return;
            }
        } else {
            if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
                IComponentDefinitions widget;
                if (i >= 2000) {
                    i -= 1000;
                    widget = Class76.method771(anIntArray3840[--anInt3846]);
                } else {
                    widget = bool ? aWidget3865 : aWidget3849;
                }
                if (i == 1499) {
                    Objects.requireNonNull(widget).method4151();
                } else {
                    String string = aStringArray3855[--anInt3841];
                    int[] is = null;
                    if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
                        int i_57_ = anIntArray3840[--anInt3846];
                        if (i_57_ > 0) {
                            is = new int[i_57_];
                            while (i_57_-- > 0)
                                is[i_57_] = anIntArray3840[--anInt3846];
                        }
                        string = string.substring(0, string.length() - 1);
                    }
                    Object[] objects = new Object[string.length() + 1];
                    for (int i_58_ = objects.length - 1; i_58_ >= 1; i_58_--) {
                        if (string.charAt(i_58_ - 1) == 's') {
                            objects[i_58_] = aStringArray3855[--anInt3841];
                        } else if (string.charAt(i_58_ - 1) == '\u00a7') {
                            objects[i_58_] = aLongArray3837[--anInt3864];
                        } else {
                            objects[i_58_] = anIntArray3840[--anInt3846];
                        }
                    }
                    int i_59_ = anIntArray3840[--anInt3846];
                    if (i_59_ == -1) {
                        objects = null;
                    } else {
                        objects[0] = i_59_;
                    }
                    if (i == 1400) {
                        Objects.requireNonNull(widget).anObjectArray4774 = objects;
                    } else if (i == 1401) {
                        Objects.requireNonNull(widget).anObjectArray4856 = objects;
                    } else if (i == 1402) {
                        Objects.requireNonNull(widget).anObjectArray4680 = objects;
                    } else if (i == 1403) {
                        Objects.requireNonNull(widget).anObjectArray4706 = objects;
                    } else if (i == 1404) {
                        Objects.requireNonNull(widget).anObjectArray4818 = objects;
                    } else if (i == 1405) {
                        Objects.requireNonNull(widget).anObjectArray4852 = objects;
                    } else if (i == 1406) {
                        Objects.requireNonNull(widget).anObjectArray4771 = objects;
                    } else if (i == 1407) {
                        Objects.requireNonNull(widget).anObjectArray4807 = objects;
                        widget.anIntArray4838 = is;
                    } else if (i == 1408) {
                        Objects.requireNonNull(widget).anObjectArray4701 = objects;
                    } else if (i == 1409) {
                        Objects.requireNonNull(widget).anObjectArray4770 = objects;
                    } else if (i == 1410) {
                        Objects.requireNonNull(widget).anObjectArray4711 = objects;
                    } else if (i == 1411) {
                        Objects.requireNonNull(widget).anObjectArray4803 = objects;
                    } else if (i == 1412) {
                        Objects.requireNonNull(widget).anObjectArray4834 = objects;
                    } else if (i == 1414) {
                        Objects.requireNonNull(widget).anObjectArray4742 = objects;
                        widget.anIntArray4833 = is;
                    } else if (i == 1415) {
                        Objects.requireNonNull(widget).anObjectArray4788 = objects;
                        widget.anIntArray4789 = is;
                    } else if (i == 1416) {
                        Objects.requireNonNull(widget).anObjectArray4768 = objects;
                    } else if (i == 1417) {
                        Objects.requireNonNull(widget).anObjectArray4753 = objects;
                    } else if (i == 1418) {
                        Objects.requireNonNull(widget).anObjectArray4740 = objects;
                    } else if (i == 1419) {
                        Objects.requireNonNull(widget).anObjectArray4798 = objects;
                    } else if (i == 1420) {
                        Objects.requireNonNull(widget).anObjectArray4846 = objects;
                    } else if (i == 1421) {
                        Objects.requireNonNull(widget).anObjectArray4828 = objects;
                    } else if (i == 1422) {
                        Objects.requireNonNull(widget).anObjectArray4862 = objects;
                    } else if (i == 1423) {
                        Objects.requireNonNull(widget).anObjectArray4778 = objects;
                    } else if (i == 1424) {
                        Objects.requireNonNull(widget).anObjectArray4712 = objects;
                    } else if (i == 1425) {
                        Objects.requireNonNull(widget).anObjectArray4745 = objects;
                    } else if (i == 1426) {
                        Objects.requireNonNull(widget).anObjectArray4854 = objects;
                    } else if (i == 1427) {
                        Objects.requireNonNull(widget).anObjectArray4777 = objects;
                    } else if (i == 1428) {
                        Objects.requireNonNull(widget).anObjectArray4688 = objects;
                        widget.anIntArray4829 = is;
                    } else if (i == 1429) {
                        Objects.requireNonNull(widget).anObjectArray4775 = objects;
                        widget.anIntArray4805 = is;
                    } else if (i == 1430) {
                        Objects.requireNonNull(widget).anObjectArray4751 = objects;
                    } else if (i == 1431) {
                        Objects.requireNonNull(widget).anObjectArray4799 = objects;
                    } else if (i == 1432) {
                        Objects.requireNonNull(widget).anObjectArray4756 = objects;
                    } else if (i == 1433) {
                        Objects.requireNonNull(widget).anObjectArray4857 = objects;
                    }
                    Objects.requireNonNull(widget).hasScripts = true;
                    return;
                }
                return;
            }
            if (i < 1600) {
                IComponentDefinitions widget = bool ? aWidget3865 : aWidget3849;
                if (i == 1500) {
                    anIntArray3840[anInt3846++] = widget.anInt4679;
                    return;
                }
                if (i == 1501) {
                    anIntArray3840[anInt3846++] = widget.anInt4762;
                    return;
                }
                if (i == 1502) {
                    anIntArray3840[anInt3846++] = widget.anInt4809;
                    return;
                }
                if (i == 1503) {
                    anIntArray3840[anInt3846++] = widget.anInt4695;
                    return;
                }
                if (i == 1504) {
                    anIntArray3840[anInt3846++] = widget.hidden ? 1 : 0;
                    return;
                }
                if (i == 1505) {
                    anIntArray3840[anInt3846++] = widget.parentId;
                    return;
                }
                if (i == 1506) {
                    IComponentDefinitions widget_60_ = Class295.method3468((byte) -104, widget);
                    anIntArray3840[anInt3846++] = widget_60_ == null ? -1 : widget_60_.ihash;
                    return;
                }
                if (i == 1507) {
                    anIntArray3840[anInt3846++] = widget.anInt4754;
                    return;
                }
            } else if (i < 1700) {
                IComponentDefinitions widget = bool ? aWidget3865 : aWidget3849;
                if (i == 1600) {
                    anIntArray3840[anInt3846++] = widget.anInt4817;
                    return;
                }
                if (i == 1601) {
                    anIntArray3840[anInt3846++] = widget.anInt4734;
                    return;
                }
                if (i == 1602) {
                    aStringArray3855[anInt3841++] = widget.aString4790;
                    return;
                }
                if (i == 1603) {
                    anIntArray3840[anInt3846++] = widget.anInt4735;
                    return;
                }
                if (i == 1604) {
                    anIntArray3840[anInt3846++] = widget.anInt4691;
                    return;
                }
                if (i == 1605) {
                    anIntArray3840[anInt3846++] = widget.anInt4787;
                    return;
                }
                if (i == 1606) {
                    anIntArray3840[anInt3846++] = widget.anInt4815;
                    return;
                }
                if (i == 1607) {
                    anIntArray3840[anInt3846++] = widget.anInt4682;
                    return;
                }
                if (i == 1608) {
                    anIntArray3840[anInt3846++] = widget.anInt4821;
                    return;
                }
                if (i == 1609) {
                    anIntArray3840[anInt3846++] = widget.anInt4757;
                    return;
                }
                if (i == 1610) {
                    anIntArray3840[anInt3846++] = widget.anInt4681;
                    return;
                }
                if (i == 1611) {
                    anIntArray3840[anInt3846++] = widget.anInt4811;
                    return;
                }
                if (i == 1612) {
                    anIntArray3840[anInt3846++] = widget.anInt4820;
                    return;
                }
                if (i == 1613) {
                    int i_61_ = anIntArray3840[--anInt3846];
                    Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_61_, -79);
                    if (class267.method3287()) {
                        aStringArray3855[anInt3841++] = widget.method4141(class267.aString3450, i_61_);
                    } else {
                        anIntArray3840[anInt3846++] = widget.method4156(class267.anInt3443, i_61_);
                        return;
                    }
                    return;
                }
                if (i == 1614) {
                    anIntArray3840[anInt3846++] = widget.anInt4728;
                    return;
                }
                if (i == 1618) {
                    anIntArray3840[anInt3846++] = widget.anInt4759;
                    return;
                }
            } else if (i < 1800) {
                IComponentDefinitions widget = bool ? aWidget3865 : aWidget3849;
                if (i == 1700) {
                    anIntArray3840[anInt3846++] = widget.anInt4718;
                    return;
                }
                if (i == 1701) {
                    if (widget.anInt4718 == -1) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = widget.anInt4831;
                    }
                    return;
                }
                if (i == 1702) {
                    anIntArray3840[anInt3846++] = widget.anInt4687;
                    return;
                }
            } else if (i < 1900) {
                IComponentDefinitions widget = bool ? aWidget3865 : aWidget3849;
                if (i == 1800) {
                    anIntArray3840[anInt3846++] = Client.method113(widget).method2743(-59);
                    return;
                }
                if (i == 1801) {
                    int i_62_ = anIntArray3840[--anInt3846];
                    i_62_--;
                    if (widget.aStringArray4686 == null || i_62_ >= widget.aStringArray4686.length || widget.aStringArray4686[i_62_] == null) {
                        aStringArray3855[anInt3841++] = "";
                    } else {
                        aStringArray3855[anInt3841++] = widget.aStringArray4686[i_62_];
                        return;
                    }
                    return;
                }
                if (i == 1802) {
                    if (widget.aString4779 == null) {
                        aStringArray3855[anInt3841++] = "";
                    } else {
                        aStringArray3855[anInt3841++] = widget.aString4779;
                        return;
                    }
                    return;
                }
            } else if (i < 2000 || i >= 2900 && i < 3000) {
                IComponentDefinitions widget;
                if (i >= 2000) {
                    widget = Class76.method771(anIntArray3840[--anInt3846]);
                    i -= 1000;
                } else {
                    widget = bool ? aWidget3865 : aWidget3849;
                }
                if (anInt3869 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (i == 1927) {
                    if (Objects.requireNonNull(widget).anObjectArray4777 != null) {
                        Node_Sub37 node_sub37 = new Node_Sub37();
                        node_sub37.aWidget7437 = widget;
                        node_sub37.parameters = widget.anObjectArray4777;
                        node_sub37.anInt7442 = anInt3869 + 1;
                        Class275.aClass312_5419.method3625(node_sub37);
                        return;
                    }
                    return;
                }
            } else if (i < 2600) {
                IComponentDefinitions widget = Class76.method771(anIntArray3840[--anInt3846]);
                if (i == 2500) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4679;
                    return;
                }
                if (i == 2501) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4762;
                    return;
                }
                if (i == 2502) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4809;
                    return;
                }
                if (i == 2503) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4695;
                    return;
                }
                if (i == 2504) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).hidden ? 1 : 0;
                    return;
                }
                if (i == 2505) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).parentId;
                    return;
                }
                if (i == 2506) {
                    IComponentDefinitions widget_63_ = Class295.method3468((byte) -93, Objects.requireNonNull(widget));
                    anIntArray3840[anInt3846++] = widget_63_ == null ? -1 : widget_63_.ihash;
                    return;
                }
                if (i == 2507) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4754;
                    return;
                }
            } else if (i < 2700) {
                IComponentDefinitions widget = Class76.method771(anIntArray3840[--anInt3846]);
                if (i == 2600) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4817;
                    return;
                }
                if (i == 2601) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4734;
                    return;
                }
                if (i == 2602) {
                    aStringArray3855[anInt3841++] = Objects.requireNonNull(widget).aString4790;
                    return;
                }
                if (i == 2603) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4735;
                    return;
                }
                if (i == 2604) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4691;
                    return;
                }
                if (i == 2605) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4787;
                    return;
                }
                if (i == 2606) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4815;
                    return;
                }
                if (i == 2607) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4682;
                    return;
                }
                if (i == 2608) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4821;
                    return;
                }
                if (i == 2609) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4757;
                    return;
                }
                if (i == 2610) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4681;
                    return;
                }
                if (i == 2611) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4811;
                    return;
                }
                if (i == 2612) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4820;
                    return;
                }
                if (i == 2613) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4728;
                    return;
                }
                if (i == 2614) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).modelType == 1 ? widget.anInt4864 : -1;
                    return;
                }
                if (i == 2617) {
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4759;
                    return;
                }
            } else if (i < 2800) {
                if (i == 2700) {
                    IComponentDefinitions widget = Class76.method771(anIntArray3840[--anInt3846]);
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(widget).anInt4718;
                    return;
                }
                if (i == 2701) {
                    IComponentDefinitions widget = Class76.method771(anIntArray3840[--anInt3846]);
                    if (Objects.requireNonNull(widget).anInt4718 == -1) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = widget.anInt4831;
                    }
                    return;
                }
                if (i == 2702) {
                    int i_64_ = anIntArray3840[--anInt3846];
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, i_64_);
                    if (node_sub2 == null) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = 1;
                    }
                    return;
                }
                if (i == 2703) {
                    IComponentDefinitions widget = Class76.method771(anIntArray3840[--anInt3846]);
                    if (Objects.requireNonNull(widget).aWidgetArray4804 == null) {
                        anIntArray3840[anInt3846++] = 0;
                    } else {
                        int i_65_ = widget.aWidgetArray4804.length;
                        for (int i_66_ = 0; i_66_ < widget.aWidgetArray4804.length; i_66_++) {
                            if (widget.aWidgetArray4804[i_66_] == null) {
                                i_65_ = i_66_;
                                break;
                            }
                        }
                        anIntArray3840[anInt3846++] = i_65_;
                        return;
                    }
                    return;
                }
                if (i == 2704 || i == 2705) {
                    anInt3846 -= 2;
                    int i_67_ = anIntArray3840[anInt3846];
                    int i_68_ = anIntArray3840[anInt3846 + 1];
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, i_67_);
                    if (node_sub2 != null && node_sub2.interfaceId == i_68_) {
                        anIntArray3840[anInt3846++] = 1;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
            } else if (i < 2900) {
                IComponentDefinitions widget = Class76.method771(anIntArray3840[--anInt3846]);
                if (i == 2800) {
                    anIntArray3840[anInt3846++] = Client.method113(Objects.requireNonNull(widget)).method2743(-36);
                    return;
                }
                if (i == 2801) {
                    int i_69_ = anIntArray3840[--anInt3846];
                    i_69_--;
                    if (Objects.requireNonNull(widget).aStringArray4686 == null || i_69_ >= widget.aStringArray4686.length || widget.aStringArray4686[i_69_] == null) {
                        aStringArray3855[anInt3841++] = "";
                    } else {
                        aStringArray3855[anInt3841++] = widget.aStringArray4686[i_69_];
                        return;
                    }
                    return;
                }
                if (i == 2802) {
                    if (Objects.requireNonNull(widget).aString4779 == null) {
                        aStringArray3855[anInt3841++] = "";
                    } else {
                        aStringArray3855[anInt3841++] = widget.aString4779;
                        return;
                    }
                    return;
                }
            } else if (i < 3200) {
                if (i == 3100) {
                    String string = aStringArray3855[--anInt3841];
                    CacheNode_Sub20.method2406(string);
                    return;
                }
                if (i == 3101) {
                    anInt3846 -= 2;
                    EntityNode_Sub7.method973(Class295.myPlayer, anIntArray3840[anInt3846 + 1], anIntArray3840[anInt3846]);
                    return;
                }
                if (i == 3103) {
                    Class46.method467();
                    return;
                }
                if (i == 3104) {
                    String string = aStringArray3855[--anInt3841];
                    int i_70_ = 0;
                    if (Class290_Sub7.method3441(string)) {
                        i_70_ = Class350.method3998(string, -1);
                    }
                    anInt3858++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class262_Sub12.aClass318_7788, Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeInt(i_70_);
                    Class218.aClass123_2566.sendPacket(node_sub13);
                    return;
                }
                if (i == 3105) {
                    String string = aStringArray3855[--anInt3841];
                    anInt3850++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class194_Sub2.aClass318_6897, Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeByte(string.length() + 1);
                    node_sub13.aPacket7113.writeString(string);
                    Class218.aClass123_2566.sendPacket(node_sub13);
                    return;
                }
                if (i == 3106) {
                    String string = aStringArray3855[--anInt3841];
                    anInt3848++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class71.aClass318_964, Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeByte(string.length() + 1);
                    node_sub13.aPacket7113.writeString(string);
                    Class218.aClass123_2566.sendPacket(node_sub13);
                    return;
                }
                if (i == 3107) {
                    int i_71_ = anIntArray3840[--anInt3846];
                    String string = aStringArray3855[--anInt3841];
                    Class132.method1565(string, i_71_);
                    return;
                }
                if (i == 3108) {
                    anInt3846 -= 3;
                    int i_72_ = anIntArray3840[anInt3846];
                    int i_73_ = anIntArray3840[anInt3846 + 1];
                    int i_74_ = anIntArray3840[anInt3846 + 2];
                    IComponentDefinitions widget = Class76.method771(i_74_);
                    Class317.method3665(i_73_, widget, i_72_);
                    return;
                }
                if (i == 3109) {
                    anInt3846 -= 2;
                    int i_75_ = anIntArray3840[anInt3846];
                    int i_76_ = anIntArray3840[anInt3846 + 1];
                    IComponentDefinitions widget = bool ? aWidget3865 : aWidget3849;
                    Class317.method3665(i_76_, widget, i_75_);
                    return;
                }
                if (i == 3110) {
                    int i_77_ = anIntArray3840[--anInt3846];
                    anInt3854++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class116.aClass318_5073, Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeShort(i_77_);
                    Class218.aClass123_2566.sendPacket(node_sub13);
                    return;
                }
                if (i == 3111) {
                    anInt3846 -= 2;
                    int i_78_ = anIntArray3840[anInt3846];
                    int i_79_ = anIntArray3840[anInt3846 + 1];
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, i_78_);
                    if (node_sub2 != null) {
                        Class243.method3060(true, node_sub2.interfaceId != i_79_, node_sub2);
                    }
                    Class93.method1047(3, i_79_, i_78_, true);
                    return;
                }
                if (i == 3112) {
                    anInt3846--;
                    int i_80_ = anIntArray3840[anInt3846];
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, i_80_);
                    if (node_sub2 != null && node_sub2.cliped == 3) {
                        Class243.method3060(true, true, node_sub2);
                    }
                    return;
                }
                if (i == 3113) {
                    Class39.method414(aStringArray3855[--anInt3841]);
                    return;
                }
                if (i == 3114) {
                    anInt3846 -= 2;
                    int i_81_ = anIntArray3840[anInt3846];
                    int i_82_ = anIntArray3840[anInt3846 + 1];
                    String string = aStringArray3855[--anInt3841];
                    Class28.method331(string, "", i_82_, "", "", i_81_);
                    return;
                }
                if (i == 3115) {
                    anInt3846 -= 11;
                    Class379[] class379s = Class23.method302();
                    Class77[] class77s = PlayerDefinition.method3277(12247);
                    Class262_Sub2.method3153(anIntArray3840[anInt3846 + 7], anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846 + 9], anIntArray3840[anInt3846 + 4], Objects.requireNonNull(class77s)[anIntArray3840[anInt3846 + 1]], anIntArray3840[anInt3846 + 5], anIntArray3840[anInt3846 + 8], anIntArray3840[anInt3846 + 6], anIntArray3840[anInt3846 + 3], class379s[anIntArray3840[anInt3846]], anIntArray3840[anInt3846 + 10]);
                    return;
                }
                if (i == 3116) {
                    int i_83_ = anIntArray3840[--anInt3846];
                    anInt3858++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class235.aClass318_5119, Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeShort(i_83_);
                    Class218.aClass123_2566.sendPacket(node_sub13);
                    return;
                }
                if (i == 3117) {
                    String string = aStringArray3855[--anInt3841];
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class188.aClass318_2279, Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeByte(string.length() + 1);
                    node_sub13.aPacket7113.writeString(string);
                    Class218.aClass123_2566.sendPacket(node_sub13);
                    return;
                }
            } else if (i < 3300) {
                if (i == 3200) {
                    anInt3846 -= 3;
                    Class91.method1033(256, anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], 255);
                    return;
                }
                if (i == 3201) {
                    Class40.method432(255, anIntArray3840[--anInt3846], 50);
                    return;
                }
                if (i == 3202) {
                    anInt3846 -= 2;
                    Class259.method3132(255, anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], (byte) 110);
                    return;
                }
                if (i == 3203) {
                    anInt3846 -= 4;
                    Class91.method1033(256, anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], anIntArray3840[anInt3846 + 3]);
                    return;
                }
                if (i == 3204) {
                    anInt3846 -= 3;
                    Class40.method432(anIntArray3840[anInt3846 + 1], anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 2]);
                    return;
                }
                if (i == 3205) {
                    anInt3846 -= 3;
                    Class259.method3132(anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], (byte) 110);
                    return;
                }
                if (i == 3206) {
                    anInt3846 -= 4;
                    Class105.method1116(anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], 256, anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846 + 3], false);
                    return;
                }
                if (i == 3207) {
                    anInt3846 -= 4;
                    Class105.method1116(anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], 256, anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846 + 3], true);
                    return;
                }
                if (i == 3208) {
                    anInt3846 -= 5;
                    Class91.method1033(anIntArray3840[anInt3846 + 4], anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], anIntArray3840[anInt3846 + 3]);
                    return;
                }
                if (i == 3209) {
                    anInt3846 -= 5;
                    Class105.method1116(anIntArray3840[anInt3846], anIntArray3840[anInt3846 + 1], anIntArray3840[anInt3846 + 4], anIntArray3840[anInt3846 + 2], anIntArray3840[anInt3846 + 3], false);
                    return;
                }
            } else if (i < 3400) {
                if (i == 3300) {
                    anIntArray3840[anInt3846++] = Class174.clientCycle;
                    return;
                }
                if (i == 3301) {
                    anInt3846 -= 2;
                    int i_84_ = anIntArray3840[anInt3846];
                    int i_85_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Class317.method3663(i_84_, i_85_, false);
                    return;
                }
                if (i == 3302) {
                    anInt3846 -= 2;
                    int i_86_ = anIntArray3840[anInt3846];
                    int i_87_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Class283.method3389(i_87_, false, (byte) 63, i_86_);
                    return;
                }
                if (i == 3303) {
                    anInt3846 -= 2;
                    int i_88_ = anIntArray3840[anInt3846];
                    int i_89_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Class41.method437(i_89_, i_88_, false, (byte) 66);
                    return;
                }
                if (i == 3304) {
                    int i_90_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class269.aClass308_3469.method3584(i_90_).anInt9479;
                    return;
                }
                if (i == 3305) {
                    int i_91_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class307.SKILL_LEVEL[i_91_];
                    return;
                }
                if (i == 3306) {
                    int i_92_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class34_Sub1.SKILL_REAL_LEVEL[i_92_];
                    return;
                }
                if (i == 3307) {
                    int i_93_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class188_Sub1.SKILL_XP[i_93_];
                    return;
                }
                if (i == 3308) {
                    int i_94_ = Class295.myPlayer.plane;
                    int i_95_ = (Class295.myPlayer.anInt5934 >> 9) + Node_Sub53.gameSceneBaseX;
                    int i_96_ = (Class295.myPlayer.anInt5940 >> 9) + Class320_Sub4.gameSceneBaseY;
                    anIntArray3840[anInt3846++] = (i_94_ << 28) + (i_95_ << 14) + i_96_;
                    return;
                }
                if (i == 3309) {
                    int i_97_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = i_97_ >> 14 & 0x3fff;
                    return;
                }
                if (i == 3310) {
                    int i_98_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = i_98_ >> 28;
                    return;
                }
                if (i == 3311) {
                    int i_99_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = i_99_ & 0x3fff;
                    return;
                }
                if (i == 3312) {
                    anIntArray3840[anInt3846++] = Class101.aBoolean1313 ? 1 : 0;
                    return;
                }
                if (i == 3313) {
                    anInt3846 -= 2;
                    int i_100_ = anIntArray3840[anInt3846];
                    int i_101_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Class317.method3663(i_100_, i_101_, true);
                    return;
                }
                if (i == 3314) {
                    anInt3846 -= 2;
                    int i_102_ = anIntArray3840[anInt3846];
                    int i_103_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Class283.method3389(i_103_, true, (byte) 86, i_102_);
                    return;
                }
                if (i == 3315) {
                    anInt3846 -= 2;
                    int i_104_ = anIntArray3840[anInt3846];
                    int i_105_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Class41.method437(i_105_, i_104_, true, (byte) 111);
                    return;
                }
                if (i == 3316) {
                    if (Class339_Sub7.rights >= 2) {
                        anIntArray3840[anInt3846++] = Class339_Sub7.rights;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3317) {
                    anIntArray3840[anInt3846++] = Node_Sub19.anInt7163;
                    return;
                }
                if (i == 3318) {
                    anIntArray3840[anInt3846++] = Class181.aClass197_2155.id;
                    return;
                }
                if (i == 3321) {
                    anIntArray3840[anInt3846++] = Class373.RUN_ENERGY;
                    return;
                }
                if (i == 3322) {
                    anIntArray3840[anInt3846++] = Mobile_Sub4.anInt10981;
                    return;
                }
                if (i == 3323) {
                    if (Class25.anInt452 >= 5 && Class25.anInt452 <= 9) {
                        anIntArray3840[anInt3846++] = 1;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3324) {
                    if (Class25.anInt452 >= 5 && Class25.anInt452 <= 9) {
                        anIntArray3840[anInt3846++] = Class25.anInt452;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3325) {
                    anIntArray3840[anInt3846++] = Class64.aBoolean5046 ? 1 : 0;
                    return;
                }
                if (i == 3326) {
                    anIntArray3840[anInt3846++] = Class295.myPlayer.combatLevel;
                    return;
                }
                if (i == 3327) {
                    anIntArray3840[anInt3846++] = Class295.myPlayer.aPlayerDefinition11137 != null && Class295.myPlayer.aPlayerDefinition11137.aBoolean3434 ? 1 : 0;
                    return;
                }
                if (i == 3329) {
                    anIntArray3840[anInt3846++] = Class290_Sub11.aBoolean8175 ? 1 : 0;
                    return;
                }
                if (i == 3330) {
                    int i_106_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class30.method341(i_106_);
                    return;
                }
                if (i == 3331) {
                    anInt3846 -= 2;
                    int i_107_ = anIntArray3840[anInt3846];
                    int i_108_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Node_Sub25_Sub3.method2673(88, false, i_108_, i_107_);
                    return;
                }
                if (i == 3332) {
                    anInt3846 -= 2;
                    int i_109_ = anIntArray3840[anInt3846];
                    int i_110_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Node_Sub25_Sub3.method2673(63, true, i_110_, i_109_);
                    return;
                }
                if (i == 3333) {
                    anIntArray3840[anInt3846++] = Class369.method4083();
                    return;
                }
                if (i == 3335) {
                    anIntArray3840[anInt3846++] = Class35.language;
                    return;
                }
                if (i == 3336) {
                    anInt3846 -= 4;
                    int i_111_ = anIntArray3840[anInt3846];
                    int i_112_ = anIntArray3840[anInt3846 + 1];
                    int i_113_ = anIntArray3840[anInt3846 + 2];
                    int i_114_ = anIntArray3840[anInt3846 + 3];
                    i_111_ += i_112_ << 14;
                    i_111_ += i_113_ << 28;
                    i_111_ += i_114_;
                    anIntArray3840[anInt3846++] = i_111_;
                    return;
                }
                if (i == 3337) {
                    anIntArray3840[anInt3846++] = Class170.anInt2056;
                    return;
                }
                if (i == 3338) {
                    anIntArray3840[anInt3846++] = CacheNode_Sub4.method2302();
                    return;
                }
                if (i == 3339) {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                }
                if (i == 3340) {
                    anIntArray3840[anInt3846++] = Class51.aBoolean5331 ? 1 : 0;
                    return;
                }
                if (i == 3341) {
                    anIntArray3840[anInt3846++] = Mobile_Sub1.aBoolean10961 ? 1 : 0;
                    return;
                }
                if (i == 3342) {
                    anIntArray3840[anInt3846++] = Class106.aClass93_1356.method1050();
                    return;
                }
                if (i == 3343) {
                    anIntArray3840[anInt3846++] = Class106.aClass93_1356.method1051();
                    return;
                }
                if (i == 3344) {
                    aStringArray3855[anInt3841++] = Class67.method731();
                    return;
                }
                if (i == 3345) {
                    aStringArray3855[anInt3841++] = Class366.method4073();
                    return;
                }
                if (i == 3346) {
                    anIntArray3840[anInt3846++] = Class178.method1812();
                    return;
                }
                if (i == 3347) {
                    anIntArray3840[anInt3846++] = Node_Sub38_Sub23.anInt10346;
                    return;
                }
                if (i == 3349) {
                    anIntArray3840[anInt3846++] = Class295.myPlayer.aClass99_10893.method1086(16383) >> 3;
                    return;
                }
                if (i == 3350) {
                    String string = aStringArray3855[--anInt3841];
                    if (Node_Sub32.aString7378 != null && Node_Sub32.aString7378.equalsIgnoreCase(string)) {
                        anIntArray3840[anInt3846++] = 1;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3351) {
                    anIntArray3840[anInt3846++] = Class106.aClass93_1356.method1039(-106) ? 1 : 0;
                    anIntArray3840[anInt3846++] = Class106.aClass93_1356.method1044(39) ? 1 : 0;
                    anIntArray3840[anInt3846++] = Class106.aClass93_1356.method1040(-92) ? 1 : 0;
                    return;
                }
            } else if (i < 3500) {
                if (i == 3400) {
                    anInt3846 -= 2;
                    int i_115_ = anIntArray3840[anInt3846];
                    int i_116_ = anIntArray3840[anInt3846 + 1];
                    Class39 class39 = Class328.aClass362_4112.method4051(i_115_);
                    aStringArray3855[anInt3841++] = class39.method412(-3470, i_116_);
                    return;
                }
                if (i == 3408) {
                    anInt3846 -= 4;
                    int i_118_ = anIntArray3840[anInt3846 + 1];
                    int i_119_ = anIntArray3840[anInt3846 + 2];
                    int i_120_ = anIntArray3840[anInt3846 + 3];
                    Class39 class39 = Class328.aClass362_4112.method4051(i_119_);
                    //throw new RuntimeException("C3408-1 " + i_119_ + "-" + i_120_);
                    if (i_118_ == 115) {
                        aStringArray3855[anInt3841++] = class39.method412(-3470, i_120_);
                    } else {
                        anIntArray3840[anInt3846++] = class39.method410(i_120_);
                        return;
                    }
                    return;
                }
                if (i == 3409) {
                    anInt3846 -= 3;
                    int i_122_ = anIntArray3840[anInt3846 + 1];
                    int i_123_ = anIntArray3840[anInt3846 + 2];
                    //throw new RuntimeException("C3409-2");
                    Class39 class39 = Class328.aClass362_4112.method4051(i_122_);
                    //throw new RuntimeException("C3409-1");
                    anIntArray3840[anInt3846++] = class39.method416(i_123_) ? 1 : 0;
                    return;
                }
                if (i == 3410) {
                    int i_124_ = anIntArray3840[--anInt3846];
                    String string = aStringArray3855[--anInt3841];
                    //throw new RuntimeException("C3410-2");
                    Class39 class39 = Class328.aClass362_4112.method4051(i_124_);
                    //throw new RuntimeException("C3410-1");
                    anIntArray3840[anInt3846++] = class39.method404(string) ? 1 : 0;
                    return;
                }
                if (i == 3411) {
                    int i_125_ = anIntArray3840[--anInt3846];
                    Class39 class39 = Class328.aClass362_4112.method4051(i_125_);
                    anIntArray3840[anInt3846++] = class39.method411();
                    return;
                }
                if (i == 3412) {
                    anInt3846 -= 3;
                    int i_127_ = anIntArray3840[anInt3846 + 1];
                    int i_128_ = anIntArray3840[anInt3846 + 2];
                    if (i_127_ == -1) {
                        throw new RuntimeException();
                    }
                    Class39 class39 = Class328.aClass362_4112.method4051(i_127_);
                    //	throw new RuntimeException();
                    Node_Sub34 node_sub34 = class39.method406(i_128_);
                    int i_129_ = 0;
                    if (node_sub34 != null) {
                        i_129_ = node_sub34.anIntArray7411.length;
                    }
                    anIntArray3840[anInt3846++] = i_129_;
                    return;
                }
                if (i == 3413) {
                    int i_130_ = anIntArray3840[--anInt3846];
                    String string = aStringArray3855[--anInt3841];
                    if (i_130_ == -1) {
                        throw new RuntimeException();
                    }
                    Class39 class39 = Class328.aClass362_4112.method4051(i_130_);
                    //		throw new RuntimeException();
                    Node_Sub20 node_sub20 = class39.method420(string);
                    int i_131_ = 0;
                    if (node_sub20 != null) {
                        i_131_ = node_sub20.anIntArray7177.length;
                    }
                    anIntArray3840[anInt3846++] = i_131_;
                    return;
                }
                if (i == 3414) {
                    anInt3846 -= 5;
                    int i_134_ = anIntArray3840[anInt3846 + 2];
                    int i_135_ = anIntArray3840[anInt3846 + 3];
                    int i_136_ = anIntArray3840[anInt3846 + 4];
                    if (i_134_ == -1) {
                        throw new RuntimeException();
                    }
                    Class39 class39 = Class328.aClass362_4112.method4051(i_134_);
                    //throw new RuntimeException();
                    //throw new RuntimeException();
                    Node_Sub34 node_sub34 = class39.method406(i_135_);
                    if (i_136_ < 0 || node_sub34 == null || node_sub34.anIntArray7411.length <= i_136_) {
                        throw new RuntimeException();
                    }
                    anIntArray3840[anInt3846++] = node_sub34.anIntArray7411[i_136_];
                    return;
                }
                if (i == 3415) {
                    anInt3846 -= 3;
                    int i_138_ = anIntArray3840[anInt3846 + 1];
                    int i_139_ = anIntArray3840[anInt3846 + 2];
                    String string = aStringArray3855[--anInt3841];
                    if (i_138_ == -1) {
                        throw new RuntimeException();
                    }
                    Class39 class39 = Class328.aClass362_4112.method4051(i_138_);
                    //throw new RuntimeException();
                    //throw new RuntimeException();
                    Node_Sub20 node_sub20 = class39.method420(string);
                    if (i_139_ < 0 || node_sub20 == null || node_sub20.anIntArray7177.length <= i_139_) {
                        throw new RuntimeException();
                    }
                    anIntArray3840[anInt3846++] = node_sub20.anIntArray7177[i_139_];
                    return;
                }
            } else if (i < 3700) {
                if (i == 3600) {
                    if (Class138.anInt1724 == 0) {
                        anIntArray3840[anInt3846++] = -2;
                    } else {
                        if (Class138.anInt1724 == 1) {
                            anIntArray3840[anInt3846++] = -1;
                        } else {
                            anIntArray3840[anInt3846++] = Node_Sub38_Sub14.anInt10242;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 3601) {
                    int i_140_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 == 2 && i_140_ < Node_Sub38_Sub14.anInt10242) {
                        aStringArray3855[anInt3841++] = Class262_Sub12.aStringArray7793[i_140_];
                        if (Plane.aStringArray3403[i_140_] == null) {
                            aStringArray3855[anInt3841++] = "";
                        } else {
                            aStringArray3855[anInt3841++] = Plane.aStringArray3403[i_140_];
                        }
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3602) {
                    int i_141_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 == 2 && i_141_ < Node_Sub38_Sub14.anInt10242) {
                        anIntArray3840[anInt3846++] = Class202.anIntArray2448[i_141_];
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3603) {
                    int i_142_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 == 2 && i_142_ < Node_Sub38_Sub14.anInt10242) {
                        anIntArray3840[anInt3846++] = Class380.anIntArray4887[i_142_];
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3604) {
                    String string = aStringArray3855[--anInt3841];
                    int i_143_ = anIntArray3840[--anInt3846];
                    Class188_Sub1_Sub2.method1901(string, i_143_);
                    return;
                }
                if (i == 3605) {
                    String string = aStringArray3855[--anInt3841];
                    Node_Sub38_Sub37.method2912(string);
                    return;
                }
                if (i == 3606) {
                    String string = aStringArray3855[--anInt3841];
                    Node_Sub38_Sub8_Sub1.method2818(string);
                    return;
                }
                if (i == 3607) {
                    String string = aStringArray3855[--anInt3841];
                    Class126.method1539(false, string);
                    return;
                }
                if (i == 3608) {
                    String string = aStringArray3855[--anInt3841];
                    za.method2991(string, true);
                    return;
                }
                if (i == 3609) {
                    String string = aStringArray3855[--anInt3841];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
                        string = string.substring(7);
                    }
                    anIntArray3840[anInt3846++] = Class193.method1955(string) ? 1 : 0;
                    return;
                }
                if (i == 3610) {
                    int i_144_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 == 2 && i_144_ < Node_Sub38_Sub14.anInt10242) {
                        aStringArray3855[anInt3841++] = EntityNode_Sub3_Sub1.aStringArray9157[i_144_];
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3611) {
                    if (Class169_Sub4.aString8830 == null) {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    } else {
                        aStringArray3855[anInt3841++] = Class362.method4049(Class169_Sub4.aString8830);
                    }
                    return;
                }
                if (i == 3612) {
                    if (Class169_Sub4.aString8830 == null) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = Node_Sub38_Sub37.anInt10473;
                    }
                    return;
                }
                if (i == 3613) {
                    int i_145_ = anIntArray3840[--anInt3846];
                    if (Class169_Sub4.aString8830 != null && i_145_ < Node_Sub38_Sub37.anInt10473) {
                        aStringArray3855[anInt3841++] = Class50.aClass211Array782[i_145_].aString2507;
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3614) {
                    int i_146_ = anIntArray3840[--anInt3846];
                    if (Class169_Sub4.aString8830 != null && i_146_ < Node_Sub38_Sub37.anInt10473) {
                        anIntArray3840[anInt3846++] = Class50.aClass211Array782[i_146_].anInt2505;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3615) {
                    int i_147_ = anIntArray3840[--anInt3846];
                    if (Class169_Sub4.aString8830 != null && i_147_ < Node_Sub38_Sub37.anInt10473) {
                        anIntArray3840[anInt3846++] = Class50.aClass211Array782[i_147_].aByte2503;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3616) {
                    anIntArray3840[anInt3846++] = Node_Sub38_Sub34.aByte10445;
                    return;
                }
                if (i == 3617) {
                    String string = aStringArray3855[--anInt3841];
                    Class66.method722(string);
                    return;
                }
                if (i == 3618) {
                    anIntArray3840[anInt3846++] = Class362.aByte4500;
                    return;
                }
                if (i == 3619) {
                    String string = aStringArray3855[--anInt3841];
                    Class370.method4091(string);
                    return;
                }
                if (i == 3620) {
                    Node_Sub31.method2726();
                    return;
                }
                if (i == 3621) {
                    if (Class138.anInt1724 == 0) {
                        anIntArray3840[anInt3846++] = -1;
                    } else {
                        anIntArray3840[anInt3846++] = Class235.anInt5122;
                        return;
                    }
                    return;
                }
                if (i == 3622) {
                    int i_148_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 != 0 && i_148_ < Class235.anInt5122) {
                        aStringArray3855[anInt3841++] = Class338.aStringArray4197[i_148_];
                        if (Class7.aStringArray164[i_148_] == null) {
                            aStringArray3855[anInt3841++] = "";
                        } else {
                            aStringArray3855[anInt3841++] = Class7.aStringArray164[i_148_];
                        }
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3623) {
                    String string = aStringArray3855[--anInt3841];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
                        string = string.substring(7);
                    }
                    anIntArray3840[anInt3846++] = Node_Sub6.method2418(string) ? 1 : 0;
                    return;
                }
                if (i == 3624) {
                    int i_149_ = anIntArray3840[--anInt3846];
                    if (Class50.aClass211Array782 != null && i_149_ < Node_Sub38_Sub37.anInt10473 && Class50.aClass211Array782[i_149_].aString2506.equalsIgnoreCase(Class295.myPlayer.username)) {
                        anIntArray3840[anInt3846++] = 1;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3625) {
                    if (Class88.aString5274 == null) {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    } else {
                        aStringArray3855[anInt3841++] = Class88.aString5274;
                    }
                    return;
                }
                if (i == 3626) {
                    int i_150_ = anIntArray3840[--anInt3846];
                    if (Class169_Sub4.aString8830 != null && i_150_ < Node_Sub38_Sub37.anInt10473) {
                        aStringArray3855[anInt3841++] = Class50.aClass211Array782[i_150_].aString2504;
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3627) {
                    int i_151_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 == 2 && i_151_ >= 0 && i_151_ < Node_Sub38_Sub14.anInt10242) {
                        anIntArray3840[anInt3846++] = Class330.aBooleanArray4127[i_151_] ? 1 : 0;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3628) {
                    String string = aStringArray3855[--anInt3841];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
                        string = string.substring(7);
                    }
                    anIntArray3840[anInt3846++] = Class355.method4020(string);
                    return;
                }
                if (i == 3629) {
                    anIntArray3840[anInt3846++] = Class320_Sub27.anInt8460;
                    return;
                }
                if (i == 3630) {
                    String string = aStringArray3855[--anInt3841];
                    Class126.method1539(true, string);
                    return;
                }
                if (i == 3631) {
                    int i_152_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = CacheNode_Sub4.aBooleanArray9454[i_152_] ? 1 : 0;
                    return;
                }
                if (i == 3632) {
                    int i_153_ = anIntArray3840[--anInt3846];
                    if (Class169_Sub4.aString8830 != null && i_153_ < Node_Sub38_Sub37.anInt10473) {
                        aStringArray3855[anInt3841++] = Class50.aClass211Array782[i_153_].aString2506;
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3633) {
                    int i_154_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 != 0 && i_154_ < Class235.anInt5122) {
                        aStringArray3855[anInt3841++] = Class240.aStringArray2949[i_154_];
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3634) {
                    int i_155_ = anIntArray3840[--anInt3846];
                    if (Class138.anInt1724 == 2 && i_155_ < Node_Sub38_Sub14.anInt10242) {
                        anIntArray3840[anInt3846++] = Class232.aBooleanArray2781[i_155_] ? 1 : 0;
                    } else {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    }
                    return;
                }
            } else if (i < 3800) {
                if (i == 3700) {
                    if (Class51.aClanChat5345 == null) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = 1;
                        aClanChat3860 = Class51.aClanChat5345;
                    }
                    return;
                }
                if (i == 3701) {
                    if (Class66.aClanChat5176 == null) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = 1;
                        aClanChat3860 = Class66.aClanChat5176;
                    }
                    return;
                }
                if (i == 3702) {
                    aStringArray3855[anInt3841++] = aClanChat3860.aString763;
                    return;
                }
                if (i == 3703) {
                    anIntArray3840[anInt3846++] = aClanChat3860.aBoolean750 ? 1 : 0;
                    return;
                }
                if (i == 3704) {
                    anIntArray3840[anInt3846++] = aClanChat3860.aByte751;
                    return;
                }
                if (i == 3705) {
                    anIntArray3840[anInt3846++] = aClanChat3860.aByte748;
                    return;
                }
                if (i == 3706) {
                    anIntArray3840[anInt3846++] = aClanChat3860.aByte738;
                    return;
                }
                if (i == 3707) {
                    anIntArray3840[anInt3846++] = aClanChat3860.aByte724;
                    return;
                }
                if (i == 3709) {
                    anIntArray3840[anInt3846++] = aClanChat3860.anInt734;
                    return;
                }
                if (i == 3710) {
                    int i_156_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = aClanChat3860.aStringArray740[i_156_];
                    return;
                }
                if (i == 3711) {
                    int i_157_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = aClanChat3860.aByteArray770[i_157_];
                    return;
                }
                if (i == 3712) {
                    anIntArray3840[anInt3846++] = aClanChat3860.anInt739;
                    return;
                }
                if (i == 3713) {
                    int i_158_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = aClanChat3860.aStringArray769[i_158_];
                    return;
                }
                if (i == 3714) {
                    anInt3846 -= 3;
                    int i_159_ = anIntArray3840[anInt3846];
                    int i_160_ = anIntArray3840[anInt3846 + 1];
                    int i_161_ = anIntArray3840[anInt3846 + 2];
                    anIntArray3840[anInt3846++] = aClanChat3860.method508(i_160_, i_161_, i_159_);
                    return;
                }
                if (i == 3715) {
                    anIntArray3840[anInt3846++] = aClanChat3860.anInt765;
                    return;
                }
                if (i == 3716) {
                    anIntArray3840[anInt3846++] = aClanChat3860.anInt749;
                    return;
                }
                if (i == 3717) {
                    anIntArray3840[anInt3846++] = aClanChat3860.method490(aStringArray3855[--anInt3841]);
                    return;
                }
                if (i == 3718) {
                    anIntArray3840[anInt3846 - 1] = aClanChat3860.method498()[anIntArray3840[anInt3846 - 1]];
                    return;
                }
                if (i == 3719) {
                    Class262_Sub4.method3159(anIntArray3840[--anInt3846]);
                    return;
                }
                if (i == 3720) {
                    int i_162_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = aClanChat3860.anIntArray737[i_162_];
                    return;
                }
                if (i == 3750) {
                    if (ItemDefinitions.aNode_Sub43_1925 == null) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = 1;
                        aNode_Sub43_3857 = ItemDefinitions.aNode_Sub43_1925;
                    }
                    return;
                }
                if (i == 3751) {
                    if (Class29.aNode_Sub43_477 == null) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = 1;
                        aNode_Sub43_3857 = Class29.aNode_Sub43_477;
                    }
                    return;
                }
                if (i == 3752) {
                    aStringArray3855[anInt3841++] = aNode_Sub43_3857.aString7544;
                    return;
                }
                if (i == 3753) {
                    anIntArray3840[anInt3846++] = aNode_Sub43_3857.aByte7532;
                    return;
                }
                if (i == 3754) {
                    anIntArray3840[anInt3846++] = aNode_Sub43_3857.aByte7540;
                    return;
                }
                if (i == 3755) {
                    anIntArray3840[anInt3846++] = aNode_Sub43_3857.anInt7531;
                    return;
                }
                if (i == 3756) {
                    int i_163_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = aNode_Sub43_3857.aClass24Array7533[i_163_].aString437;
                    return;
                }
                if (i == 3757) {
                    int i_164_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = aNode_Sub43_3857.aClass24Array7533[i_164_].aByte438;
                    return;
                }
                if (i == 3758) {
                    int i_165_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = aNode_Sub43_3857.aClass24Array7533[i_165_].anInt441;
                    return;
                }
                if (i == 3759) {
                    int i_166_ = anIntArray3840[--anInt3846];
                    Class277.method3344(aNode_Sub43_3857 == Class29.aNode_Sub43_477, i_166_);
                    return;
                }
                if (i == 3760) {
                    anIntArray3840[anInt3846++] = aNode_Sub43_3857.method2943(aStringArray3855[--anInt3841]);
                    return;
                }
                if (i == 3761) {
                    anIntArray3840[anInt3846 - 1] = aNode_Sub43_3857.method2937()[anIntArray3840[anInt3846 - 1]];
                    return;
                }
                if (i == 3790) {
                    anIntArray3840[anInt3846++] = Class147.anObjectArray1821 != null ? 1 : 0;
                    return;
                }
            } else if (i < 4000) {
                if (i == 3903) {
                    int i_167_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Node_Sub15_Sub2.aClass138Array9784[i_167_].method1601();
                    return;
                }
                if (i == 3904) {
                    int i_168_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Node_Sub15_Sub2.aClass138Array9784[i_168_].anInt1721;
                    return;
                }
                if (i == 3905) {
                    int i_169_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Node_Sub15_Sub2.aClass138Array9784[i_169_].anInt1729;
                    return;
                }
                if (i == 3906) {
                    int i_170_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Node_Sub15_Sub2.aClass138Array9784[i_170_].anInt1722;
                    return;
                }
                if (i == 3907) {
                    int i_171_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Node_Sub15_Sub2.aClass138Array9784[i_171_].anInt1723;
                    return;
                }
                if (i == 3908) {
                    int i_172_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Node_Sub15_Sub2.aClass138Array9784[i_172_].anInt1720;
                    return;
                }
                if (i == 3910) {
                    int i_173_ = anIntArray3840[--anInt3846];
                    int i_174_ = Node_Sub15_Sub2.aClass138Array9784[i_173_].method1602();
                    anIntArray3840[anInt3846++] = i_174_ == 0 ? 1 : 0;
                    return;
                }
                if (i == 3911) {
                    int i_175_ = anIntArray3840[--anInt3846];
                    int i_176_ = Node_Sub15_Sub2.aClass138Array9784[i_175_].method1602();
                    anIntArray3840[anInt3846++] = i_176_ == 2 ? 1 : 0;
                    return;
                }
                if (i == 3912) {
                    int i_177_ = anIntArray3840[--anInt3846];
                    int i_178_ = Node_Sub15_Sub2.aClass138Array9784[i_177_].method1602();
                    anIntArray3840[anInt3846++] = i_178_ == 5 ? 1 : 0;
                    return;
                }
                if (i == 3913) {
                    int i_179_ = anIntArray3840[--anInt3846];
                    int i_180_ = Node_Sub15_Sub2.aClass138Array9784[i_179_].method1602();
                    anIntArray3840[anInt3846++] = i_180_ == 1 ? 1 : 0;
                    return;
                }
            } else if (i < 4100) {
                if (i == 4000) {
                    anInt3846 -= 2;
                    int i_181_ = anIntArray3840[anInt3846];
                    int i_182_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_181_ + i_182_;
                    return;
                }
                if (i == 4001) {
                    anInt3846 -= 2;
                    int i_183_ = anIntArray3840[anInt3846];
                    int i_184_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_183_ - i_184_;
                    return;
                }
                if (i == 4002) {
                    anInt3846 -= 2;
                    int i_185_ = anIntArray3840[anInt3846];
                    int i_186_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_185_ * i_186_;
                    return;
                }
                if (i == 4003) {
                    anInt3846 -= 2;
                    int i_187_ = anIntArray3840[anInt3846];
                    int i_188_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_187_ / i_188_;
                    return;
                }
                if (i == 4004) {
                    int i_189_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = (int) (Math.random() * (double) i_189_);
                    return;
                }
                if (i == 4005) {
                    int i_190_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = (int) (Math.random() * (double) (i_190_ + 1));
                    return;
                }
                if (i == 4006) {
                    anInt3846 -= 5;
                    int i_191_ = anIntArray3840[anInt3846];
                    int i_192_ = anIntArray3840[anInt3846 + 1];
                    int i_193_ = anIntArray3840[anInt3846 + 2];
                    int i_194_ = anIntArray3840[anInt3846 + 3];
                    int i_195_ = anIntArray3840[anInt3846 + 4];
                    anIntArray3840[anInt3846++] = i_191_ + (i_192_ - i_191_) * (i_195_ - i_193_) / (i_194_ - i_193_);
                    return;
                }
                if (i == 4007) {
                    anInt3846 -= 2;
                    long l = anIntArray3840[anInt3846];
                    long l_196_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = (int) (l + l * l_196_ / 100L);
                    return;
                }
                if (i == 4008) {
                    anInt3846 -= 2;
                    int i_197_ = anIntArray3840[anInt3846];
                    int i_198_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_197_ | 1 << i_198_;
                    return;
                }
                if (i == 4009) {
                    anInt3846 -= 2;
                    int i_199_ = anIntArray3840[anInt3846];
                    int i_200_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_199_ & -1 - (1 << i_200_);
                    return;
                }
                if (i == 4010) {
                    anInt3846 -= 2;
                    int i_201_ = anIntArray3840[anInt3846];
                    int i_202_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = (i_201_ & 1 << i_202_) != 0 ? 1 : 0;
                    return;
                }
                if (i == 4011) {
                    anInt3846 -= 2;
                    int i_203_ = anIntArray3840[anInt3846];
                    int i_204_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_203_ % i_204_;
                    return;
                }
                if (i == 4012) {
                    anInt3846 -= 2;
                    int i_205_ = anIntArray3840[anInt3846];
                    int i_206_ = anIntArray3840[anInt3846 + 1];
                    if (i_205_ == 0) {
                        anIntArray3840[anInt3846++] = 0;
                    } else {
                        anIntArray3840[anInt3846++] = (int) Math.pow(i_205_, i_206_);
                        return;
                    }
                    return;
                }
                if (i == 4013) {
                    anInt3846 -= 2;
                    int i_207_ = anIntArray3840[anInt3846];
                    int i_208_ = anIntArray3840[anInt3846 + 1];
                    if (i_207_ == 0) {
                        anIntArray3840[anInt3846++] = 0;
                    } else {
                        if (i_208_ == 0) {
                            anIntArray3840[anInt3846++] = 2147483647;
                        } else {
                            anIntArray3840[anInt3846++] = (int) Math.pow(i_207_, 1.0 / (double) i_208_);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4014) {
                    anInt3846 -= 2;
                    int i_209_ = anIntArray3840[anInt3846];
                    int i_210_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_209_ & i_210_;
                    return;
                }
                if (i == 4015) {
                    anInt3846 -= 2;
                    int i_211_ = anIntArray3840[anInt3846];
                    int i_212_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = i_211_ | i_212_;
                    return;
                }
                if (i == 4016) {
                    anInt3846 -= 2;
                    int i_213_ = anIntArray3840[anInt3846];
                    int i_214_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Math.min(i_213_, i_214_);
                    return;
                }
                if (i == 4017) {
                    anInt3846 -= 2;
                    int i_215_ = anIntArray3840[anInt3846];
                    int i_216_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = Math.max(i_215_, i_216_);
                    return;
                }
                if (i == 4018) {
                    anInt3846 -= 3;
                    long l = anIntArray3840[anInt3846];
                    long l_217_ = anIntArray3840[anInt3846 + 1];
                    long l_218_ = anIntArray3840[anInt3846 + 2];
                    anIntArray3840[anInt3846++] = (int) (l * l_218_ / l_217_);
                    return;
                }
                if (i == 4019) {
                    anInt3846 -= 2;
                    int i_219_ = anIntArray3840[anInt3846];
                    int i_220_ = anIntArray3840[anInt3846 + 1];
                    if (i_219_ > 700 || i_220_ > 700) {
                        anIntArray3840[anInt3846++] = 256;
                    }
                    double d = (Math.random() * (double) (i_220_ + i_219_) - (double) i_219_ + 800.0) / 100.0;
                    anIntArray3840[anInt3846++] = (int) (Math.pow(2.0, d) + 0.5);
                    return;
                }
                if (i == 4020) {
                    int i_221_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class170.anIntArray2054[Node_Sub15_Sub2.method2560(i_221_) & 0xffff];
                    return;
                }
            } else if (i < 4200) {
                if (i == 4100) {
                    String string = aStringArray3855[--anInt3841];
                    int i_222_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = string + i_222_;
                    return;
                }
                if (i == 4101) {
                    anInt3841 -= 2;
                    String string = aStringArray3855[anInt3841];
                    String string_223_ = aStringArray3855[anInt3841 + 1];
                    aStringArray3855[anInt3841++] = string + string_223_;
                    return;
                }
                if (i == 4102) {
                    String string = aStringArray3855[--anInt3841];
                    int i_224_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = string + Node_Sub29_Sub2.method2715(true, i_224_);
                    return;
                }
                if (i == 4103) {
                    String string = aStringArray3855[--anInt3841];
                    aStringArray3855[anInt3841++] = string.toLowerCase();
                    return;
                }
                if (i == 4104) {
                    aStringArray3855[anInt3841++] = GLToolkit.method1437(Class35.language, Class25.method308(anIntArray3840[--anInt3846]));
                    return;
                }
                if (i == 4105) {
                    anInt3841 -= 2;
                    String string = aStringArray3855[anInt3841];
                    String string_225_ = aStringArray3855[anInt3841 + 1];
                    if (Class295.myPlayer.aPlayerDefinition11137 != null && Class295.myPlayer.aPlayerDefinition11137.aBoolean3434) {
                        aStringArray3855[anInt3841++] = string_225_;
                    } else {
                        aStringArray3855[anInt3841++] = string;
                        return;
                    }
                    return;
                }
                if (i == 4106) {
                    int i_226_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = Integer.toString(i_226_);
                    return;
                }
                if (i == 4107) {
                    anInt3841 -= 2;
                    anIntArray3840[anInt3846++] = r.method2359(aStringArray3855[anInt3841 + 1], Class35.language, aStringArray3855[anInt3841]);
                    return;
                }
                if (i == 4108) {
                    String string = aStringArray3855[--anInt3841];
                    anInt3846 -= 2;
                    int i_227_ = anIntArray3840[anInt3846];
                    int i_228_ = anIntArray3840[anInt3846 + 1];
                    Class357 class357 = Class44.method461(i_228_, AnimableAnimator_Sub1.aClass302_9091);
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(class357).method4028(string, Node_Sub52.aGLSpriteArray7655, i_227_);
                    return;
                }
                if (i == 4109) {
                    String string = aStringArray3855[--anInt3841];
                    anInt3846 -= 2;
                    int i_229_ = anIntArray3840[anInt3846];
                    int i_230_ = anIntArray3840[anInt3846 + 1];
                    Class357 class357 = Class44.method461(i_230_, AnimableAnimator_Sub1.aClass302_9091);
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(class357).method4030(Node_Sub52.aGLSpriteArray7655, string, i_229_);
                    return;
                }
                if (i == 4110) {
                    anInt3841 -= 2;
                    String string = aStringArray3855[anInt3841];
                    String string_231_ = aStringArray3855[anInt3841 + 1];
                    if (anIntArray3840[--anInt3846] == 1) {
                        aStringArray3855[anInt3841++] = string;
                    } else {
                        aStringArray3855[anInt3841++] = string_231_;
                        return;
                    }
                    return;
                }
                if (i == 4111) {
                    String string = aStringArray3855[--anInt3841];
                    aStringArray3855[anInt3841++] = Class67.method730(string);
                    return;
                }
                if (i == 4112) {
                    String string = aStringArray3855[--anInt3841];
                    int i_232_ = anIntArray3840[--anInt3846];
                    if (i_232_ == -1) {
                        throw new RuntimeException("null char");
                    }
                    aStringArray3855[anInt3841++] = string + (char) i_232_;
                    return;
                }
                if (i == 4113) {
                    int i_233_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = method3559((char) i_233_);
                    return;
                }
                if (i == 4114) {
                    int i_234_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class316.isAlphanumeric((char) i_234_) ? 1 : 0;
                    return;
                }
                if (i == 4115) {
                    int i_235_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class134.method1567((char) i_235_) ? 1 : 0;
                    return;
                }
                if (i == 4116) {
                    int i_236_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Animable_Sub4_Sub1.method930((char) i_236_) ? 1 : 0;
                    return;
                }
                if (i == 4117) {
                    String string = aStringArray3855[--anInt3841];
                    if (string == null) {
                        anIntArray3840[anInt3846++] = 0;
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = string.length();
                    }
                    return;
                }
                if (i == 4118) {
                    String string = aStringArray3855[--anInt3841];
                    anInt3846 -= 2;
                    int i_237_ = anIntArray3840[anInt3846];
                    int i_238_ = anIntArray3840[anInt3846 + 1];
                    aStringArray3855[anInt3841++] = string.substring(i_237_, i_238_);
                    return;
                }
                if (i == 4119) {
                    String string = aStringArray3855[--anInt3841];
                    StringBuilder stringbuffer = new StringBuilder(string.length());
                    boolean bool_239_ = false;
                    for (int i_240_ = 0; i_240_ < string.length(); i_240_++) {
                        char c = string.charAt(i_240_);
                        if (c == '<') {
                            bool_239_ = true;
                        } else if (c == '>') {
                            bool_239_ = false;
                        } else if (!bool_239_) {
                            stringbuffer.append(c);
                        }
                    }
                    aStringArray3855[anInt3841++] = stringbuffer.toString();
                    return;
                }
                if (i == 4120) {
                    String string = aStringArray3855[--anInt3841];
                    anInt3846 -= 2;
                    int i_241_ = anIntArray3840[anInt3846];
                    int i_242_ = anIntArray3840[anInt3846 + 1];
                    anIntArray3840[anInt3846++] = string.indexOf(i_241_, i_242_);
                    return;
                }
                if (i == 4121) {
                    anInt3841 -= 2;
                    String string = aStringArray3855[anInt3841];
                    String string_243_ = aStringArray3855[anInt3841 + 1];
                    int i_244_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = string.indexOf(string_243_, i_244_);
                    return;
                }
                if (i == 4122) {
                    int i_245_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Character.toLowerCase((char) i_245_);
                    return;
                }
                if (i == 4123) {
                    int i_246_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Character.toUpperCase((char) i_246_);
                    return;
                }
                if (i == 4124) {
                    boolean bool_247_ = anIntArray3840[--anInt3846] != 0;
                    int i_248_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = Class301.method3503(Class35.language, bool_247_, i_248_, 0, true);
                    return;
                }
                if (i == 4125) {
                    String string = aStringArray3855[--anInt3841];
                    int i_249_ = anIntArray3840[--anInt3846];
                    Class357 class357 = Class44.method461(i_249_, AnimableAnimator_Sub1.aClass302_9091);
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(class357).method4031(104, Node_Sub52.aGLSpriteArray7655, string);
                    return;
                }
                if (i == 4126) {
                    aStringArray3855[anInt3841++] = Class350.method3999((long) anIntArray3840[--anInt3846] * 60000L, true, Class35.language, 1) + " UTC";
                    return;
                }
                if (i == 4127) {
                    long l = aLongArray3837[--anInt3864];
                    aStringArray3855[anInt3841++] = l == -1L ? "" : Long.toString(l, 36).toUpperCase();
                    return;
                }
            } else if (i < 4300) {
                if (i == 4200) {
                    int i_250_ = anIntArray3840[--anInt3846];
                    aStringArray3855[anInt3841++] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_250_).aString1860;
                    return;
                }
                if (i == 4201) {
                    anInt3846 -= 2;
                    int i_251_ = anIntArray3840[anInt3846];
                    int i_252_ = anIntArray3840[anInt3846 + 1];
                    ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_251_);
                    if (i_252_ >= 1 && i_252_ <= 5 && itemdefinition.aStringArray1920[i_252_ - 1] != null) {
                        aStringArray3855[anInt3841++] = itemdefinition.aStringArray1920[i_252_ - 1];
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4202) {
                    anInt3846 -= 2;
                    int i_253_ = anIntArray3840[anInt3846];
                    int i_254_ = anIntArray3840[anInt3846 + 1];
                    ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_253_);
                    if (i_254_ >= 1 && i_254_ <= 5 && itemdefinition.aStringArray1901[i_254_ - 1] != null) {
                        aStringArray3855[anInt3841++] = itemdefinition.aStringArray1901[i_254_ - 1];
                    } else {
                        aStringArray3855[anInt3841++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4203) {
                    int i_255_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_255_).anInt1924;
                    return;
                }
                if (i == 4204) {
                    int i_256_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_256_).anInt1892 == 1 ? 1 : 0;
                    return;
                }
                if (i == 4205) {
                    int i_257_ = anIntArray3840[--anInt3846];
                    ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_257_);
                    if (itemdefinition.anInt1857 == -1 && itemdefinition.anInt1887 >= 0) {
                        anIntArray3840[anInt3846++] = itemdefinition.anInt1887;
                    } else {
                        anIntArray3840[anInt3846++] = i_257_;
                        return;
                    }
                    return;
                }
                if (i == 4206) {
                    int i_258_ = anIntArray3840[--anInt3846];
                    ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_258_);
                    if (itemdefinition.anInt1857 >= 0 && itemdefinition.anInt1887 >= 0) {
                        anIntArray3840[anInt3846++] = itemdefinition.anInt1887;
                    } else {
                        anIntArray3840[anInt3846++] = i_258_;
                        return;
                    }
                    return;
                }
                if (i == 4207) {
                    int i_259_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_259_).aBoolean1871 ? 1 : 0;
                    return;
                }
                if (i == 4208) {
                    anInt3846 -= 2;
                    int i_260_ = anIntArray3840[anInt3846];
                    int i_261_ = anIntArray3840[anInt3846 + 1];
                    Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_261_, -82);
                    if (class267.method3287()) {
                        aStringArray3855[anInt3841++] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_260_).method1684(class267.aString3450, -32525, i_261_);
                    } else {
                        anIntArray3840[anInt3846++] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_260_).method1678(i_261_, class267.anInt3443);
                        return;
                    }
                    return;
                }
                if (i == 4209) {
                    anInt3846 -= 2;
                    int i_262_ = anIntArray3840[anInt3846];
                    int i_263_ = anIntArray3840[anInt3846 + 1] - 1;
                    ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_262_);
                    if (itemdefinition.anInt1900 == i_263_) {
                        anIntArray3840[anInt3846++] = itemdefinition.anInt1859;
                    } else {
                        if (itemdefinition.anInt1864 == i_263_) {
                            anIntArray3840[anInt3846++] = itemdefinition.anInt1862;
                        } else {
                            anIntArray3840[anInt3846++] = -1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4210) {
                    String string = aStringArray3855[--anInt3841];
                    int i_264_ = anIntArray3840[--anInt3846];
                    Class173.method1799(i_264_ == 1, string);
                    anIntArray3840[anInt3846++] = Class365_Sub1.anInt8759;
                    return;
                }
                if (i == 4211) {
                    if (Node_Sub20.aShortArray7175 == null || Animable_Sub1.anInt9096 >= Class365_Sub1.anInt8759) {
                        anIntArray3840[anInt3846++] = -1;
                    } else {
                        anIntArray3840[anInt3846++] = Node_Sub20.aShortArray7175[Animable_Sub1.anInt9096++] & 0xffff;
                        return;
                    }
                    return;
                }
                if (i == 4212) {
                    Animable_Sub1.anInt9096 = 0;
                    return;
                }
                if (i == 4213) {
                    int i_265_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_265_).anInt1879;
                    return;
                }
                if (i == 4214) {
                    String string = aStringArray3855[--anInt3841];
                    anInt3846 -= 3;
                    int i_266_ = anIntArray3840[anInt3846];
                    int i_267_ = anIntArray3840[anInt3846 + 1];
                    int i_268_ = anIntArray3840[anInt3846 + 2];
                    Class142.method1620(i_266_ == 1, i_268_, i_267_, string);
                    anIntArray3840[anInt3846++] = Class365_Sub1.anInt8759;
                    return;
                }
                if (i == 4215) {
                    anInt3841 -= 2;
                    anInt3846 -= 2;
                    String string = aStringArray3855[anInt3841];
                    int i_269_ = anIntArray3840[anInt3846];
                    int i_270_ = anIntArray3840[anInt3846 + 1];
                    String string_271_ = aStringArray3855[anInt3841 + 1];
                    Class380.method4170(string, i_270_, string_271_, 8, i_269_ == 1);
                    anIntArray3840[anInt3846++] = Class365_Sub1.anInt8759;
                    return;
                }
            } else if (i < 4400) {
                if (i == 4300) {
                    anInt3846 -= 2;
                    int i_272_ = anIntArray3840[anInt3846];
                    int i_273_ = anIntArray3840[anInt3846 + 1];
                    Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_273_, -121);
                    if (class267.method3287()) {
                        aStringArray3855[anInt3841++] = Class366.aClass279_4526.getNPCDefinitions(i_272_).method3005(class267.aString3450, i_273_);
                    } else {
                        anIntArray3840[anInt3846++] = Class366.aClass279_4526.getNPCDefinitions(i_272_).method3009(66, i_273_, class267.anInt3443);
                        return;
                    }
                    return;
                }
            } else if (i < 4500) {
                if (i == 4400) {
                    anInt3846 -= 2;
                    int i_274_ = anIntArray3840[anInt3846];
                    int i_275_ = anIntArray3840[anInt3846 + 1];
                    Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_275_, -89);
                    if (class267.method3287()) {
                        aStringArray3855[anInt3841++] = Objects.requireNonNull(Class186.aClass112_2256.method1145(i_274_, 46)).method3034(class267.aString3450, i_275_, false);
                    } else {
                        anIntArray3840[anInt3846++] = Objects.requireNonNull(Class186.aClass112_2256.method1145(i_274_, 59)).method3053(class267.anInt3443, 53, i_275_);
                        return;
                    }
                    return;
                }
            } else if (i < 4600) {
                if (i == 4500) {
                    anInt3846 -= 2;
                    int i_276_ = anIntArray3840[anInt3846];
                    int i_277_ = anIntArray3840[anInt3846 + 1];
                    Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_277_, -121);
                    if (class267.method3287()) {
                        aStringArray3855[anInt3841++] = Node_Sub9_Sub4.aClass180_9727.method1821(i_276_).method2284(i_277_, class267.aString3450);
                    } else {
                        anIntArray3840[anInt3846++] = Node_Sub9_Sub4.aClass180_9727.method1821(i_276_).method2282(class267.anInt3443, i_277_);
                        return;
                    }
                    return;
                }
            } else if (i < 4700) {
                if (i == 4600) {
                    int i_278_ = anIntArray3840[--anInt3846];
                    Class259 class259 = InputStream_Sub2.aClass281_83.method3383((byte) 114, i_278_);
                    if (Objects.requireNonNull(class259).anIntArray3294 != null && class259.anIntArray3294.length > 0) {
                        int i_279_ = 0;
                        int i_280_ = class259.anIntArray3302[0];
                        for (int i_281_ = 1; i_281_ < class259.anIntArray3294.length; i_281_++) {
                            if (class259.anIntArray3302[i_281_] > i_280_) {
                                i_279_ = i_281_;
                                i_280_ = class259.anIntArray3302[i_281_];
                            }
                        }
                        anIntArray3840[anInt3846++] = class259.anIntArray3294[i_279_];
                    } else {
                        anIntArray3840[anInt3846++] = class259.anInt3259;
                        return;
                    }
                    return;
                }
            } else if (i < 4800) {
                if (i == 4700) {
                    anIntArray3840[anInt3846++] = Class312.aBoolean3960 ? 1 : 0;
                    return;
                }
                if (i == 4701) {
                    String string = aStringArray3855[--anInt3841];
                    if (Class151.anInt1843 != 7 || Class132.method1561()) {
                        Class144_Sub3.aByte6822 = (byte) -5;
                    } else {
                        if (string.length() > 20) {
                            Class144_Sub3.aByte6822 = (byte) -4;
                        } else {
                            Class144_Sub3.aByte6822 = (byte) -1;
                            Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class232.aClass318_2772, Class218.aClass123_2560.anIsaacCipher1571);
                            Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
                            int i_282_ = node_sub13.aPacket7113.offset;
                            node_sub13.aPacket7113.writeString(string);
                            node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.offset - i_282_);
                            Class218.aClass123_2560.sendPacket(node_sub13);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4702) {
                    anIntArray3840[anInt3846++] = Class144_Sub3.aByte6822;
                    if (Class144_Sub3.aByte6822 != -1) {
                        Class144_Sub3.aByte6822 = (byte) -6;
                    }
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    private static void method3553(IComponentDefinitions widget) {
        if (widget != null) {
            if (widget.anInt4687 == -1) {
                int i = widget.ihash >>> 16;
                IComponentDefinitions[] widgets = Class79.aWidgetArrayArray1082[i];
                if (widgets == null) {
                    IComponentDefinitions[] widgets_284_ = Class134_Sub3.aWidgetArrayArray9035[i];
                    int i_285_ = widgets_284_.length;
                    widgets = Class79.aWidgetArrayArray1082[i] = new IComponentDefinitions[i_285_];
                    Class311.method3605(widgets_284_, 0, widgets, 0, widgets_284_.length);
                }
                int i_286_;
                for (i_286_ = 0; i_286_ < widgets.length; i_286_++) {
                    if (widgets[i_286_] == widget) {
                        break;
                    }
                }
                if (i_286_ < widgets.length) {
                    Class311.method3605(widgets, 0, widgets, 1, i_286_);
                    widgets[0] = widget;
                }
            } else {
                IComponentDefinitions widget_283_ = Class76.method771(widget.parentId);
                if (widget_283_ != null) {
                    if (widget_283_.aWidgetArray4793 == widget_283_.aWidgetArray4804) {
                        widget_283_.aWidgetArray4793 = new IComponentDefinitions[widget_283_.aWidgetArray4804.length];
                        widget_283_.aWidgetArray4793[0] = widget;
                        Class311.method3605(widget_283_.aWidgetArray4804, 0, widget_283_.aWidgetArray4793, 1, widget.anInt4687);
                        Class311.method3605(widget_283_.aWidgetArray4804, widget.anInt4687 + 1, widget_283_.aWidgetArray4793, 1 + widget.anInt4687, widget_283_.aWidgetArray4804.length - widget.anInt4687 - 1);
                    } else {
                        int i = 0;
                        IComponentDefinitions[] widgets;
                        for (widgets = widget_283_.aWidgetArray4793; i < widgets.length; i++) {
                            if (widgets[i] == widget) {
                                break;
                            }
                        }
                        if (i < widgets.length) {
                            Class311.method3605(widgets, 0, widgets, 1, i);
                            widgets[0] = widget;
                        }
                    }
                }
            }
        }
    }

    private static void method3555(ClientScript cachenode_sub9, int maxSteps) {
        anInt3846 = 0;
        anInt3841 = 0;
        int valueIndex = -1;
        int[] opcodes = cachenode_sub9.opcodes;
        int[] integerPassValues = cachenode_sub9.intValues;
        int command = -1;
        int anInt3843 = 0;
        try {
            int stepsCount = 0;
            for (; ; ) {
                if (++stepsCount > maxSteps) {
                    throw new RuntimeException("slow");
                }
                command = opcodes[++valueIndex];
                //System.out.println(cachenode_sub9.name + ": " + command);
                if (command < 150) {
                    if (command == 0) {
                        anIntArray3840[anInt3846++] = integerPassValues[valueIndex];
                    } else if (command == 1) {
                        int configId = integerPassValues[valueIndex];
                        anIntArray3840[anInt3846++] = Class24.aClass275_442.CONFIG_VALUES[configId];
                    } else if (command == 2) {
                        int i_292_ = integerPassValues[valueIndex];
                        Class24.aClass275_442.method3328(-35, i_292_, anIntArray3840[--anInt3846]);
                    } else if (command == 3) {
                        aStringArray3855[anInt3841++] = cachenode_sub9.stringValues[valueIndex];
                    } else if (command == 6) {
                        valueIndex += integerPassValues[valueIndex];
                    } else if (command == 7) {
                        anInt3846 -= 2;
                        if (anIntArray3840[anInt3846] != anIntArray3840[anInt3846 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 8) {
                        anInt3846 -= 2;
                        if (anIntArray3840[anInt3846] == anIntArray3840[anInt3846 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 9) {
                        anInt3846 -= 2;
                        if (anIntArray3840[anInt3846] < anIntArray3840[anInt3846 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 10) {
                        anInt3846 -= 2;
                        if (anIntArray3840[anInt3846] > anIntArray3840[anInt3846 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 21) {
                        if (anInt3843 == 0) {
                            return;
                        }
                        Class113 class113 = aClass113Array3842[--anInt3843];
                        cachenode_sub9 = class113.aCacheNode_Sub9_1449;
                        opcodes = cachenode_sub9.opcodes;
                        integerPassValues = cachenode_sub9.intValues;
                        valueIndex = class113.anInt1441;
                        anIntArray3847 = class113.anIntArray1448;
                        aStringArray3839 = class113.aStringArray1444;
                        aLongArray3851 = class113.aLongArray1443;
                    } else if (command == 25) {
                        int i_293_ = integerPassValues[valueIndex];
                        anIntArray3840[anInt3846++] = Class24.aClass275_442.method64(i_293_);
                    } else if (command == 27) {
                        int i_294_ = integerPassValues[valueIndex];
                        Class24.aClass275_442.method3330(anIntArray3840[--anInt3846], i_294_);
                    } else if (command == 31) {
                        anInt3846 -= 2;
                        if (anIntArray3840[anInt3846] <= anIntArray3840[anInt3846 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 32) {
                        anInt3846 -= 2;
                        if (anIntArray3840[anInt3846] >= anIntArray3840[anInt3846 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 33) {
                        anIntArray3840[anInt3846++] = anIntArray3847[integerPassValues[valueIndex]];
                    } else if (command == 34) {
                        anIntArray3847[integerPassValues[valueIndex]] = anIntArray3840[--anInt3846];
                    } else if (command == 35) {
                        aStringArray3855[anInt3841++] = aStringArray3839[integerPassValues[valueIndex]];
                    } else if (command == 36) {
                        aStringArray3839[integerPassValues[valueIndex]] = aStringArray3855[--anInt3841];
                    } else if (command == 37) {
                        int i_295_ = integerPassValues[valueIndex];
                        anInt3841 -= i_295_;
                        String string = Class75.method765(i_295_, anInt3841, aStringArray3855);
                        aStringArray3855[anInt3841++] = string;
                    } else if (command == 38) {
                        anInt3846--;
                    } else if (command == 39) {
                        anInt3841--;
                    } else if (command == 40) {
                        int i_296_ = integerPassValues[valueIndex];
                        ClientScript cachenode_sub9_297_ = Class260.getClientScript(i_296_, -109);
                        if (cachenode_sub9_297_ == null) {
                            throw new RuntimeException();
                        }
                        int[] is_298_ = new int[cachenode_sub9_297_.anInt9499];
                        String[] strings = new String[cachenode_sub9_297_.anInt9506];
                        long[] ls = new long[cachenode_sub9_297_.anInt9502];
                        if (cachenode_sub9_297_.anInt9507 >= 0)
                            System.arraycopy(anIntArray3840, anInt3846 - cachenode_sub9_297_.anInt9507, is_298_, 0, cachenode_sub9_297_.anInt9507);
                        if (cachenode_sub9_297_.anInt9511 >= 0)
                            System.arraycopy(aStringArray3855, anInt3841 - cachenode_sub9_297_.anInt9511, strings, 0, cachenode_sub9_297_.anInt9511);
                        if (cachenode_sub9_297_.anInt9512 >= 0)
                            System.arraycopy(aLongArray3837, anInt3864 - cachenode_sub9_297_.anInt9512, ls, 0, cachenode_sub9_297_.anInt9512);
                        anInt3846 -= cachenode_sub9_297_.anInt9507;
                        anInt3841 -= cachenode_sub9_297_.anInt9511;
                        anInt3864 -= cachenode_sub9_297_.anInt9512;
                        Class113 class113 = new Class113();
                        class113.aCacheNode_Sub9_1449 = cachenode_sub9;
                        class113.anInt1441 = valueIndex;
                        class113.anIntArray1448 = anIntArray3847;
                        class113.aStringArray1444 = aStringArray3839;
                        class113.aLongArray1443 = aLongArray3851;
                        if (anInt3843 >= aClass113Array3842.length) {
                            throw new RuntimeException();
                        }
                        aClass113Array3842[anInt3843++] = class113;
                        cachenode_sub9 = cachenode_sub9_297_;
                        opcodes = cachenode_sub9.opcodes;
                        integerPassValues = cachenode_sub9.intValues;
                        valueIndex = -1;
                        anIntArray3847 = is_298_;
                        aStringArray3839 = strings;
                        aLongArray3851 = ls;
                    } else if (command == 42) {
                        anIntArray3840[anInt3846++] = Class320_Sub22.anIntArray8417[integerPassValues[valueIndex]];
                    } else if (command == 43) {
                        int i_302_ = integerPassValues[valueIndex];
                        Class320_Sub22.anIntArray8417[i_302_] = anIntArray3840[--anInt3846];
                        Node_Sub38_Sub8.method2815(i_302_);
                        Class331.aBoolean4129 |= FileOnDisk.aBooleanArray1332[i_302_];
                    } else if (command == 44) {
                        int i_303_ = integerPassValues[valueIndex] >> 16;
                        int i_304_ = integerPassValues[valueIndex] & 0xffff;
                        int i_305_ = anIntArray3840[--anInt3846];
                        if (i_305_ < 0 || i_305_ > 5000) {
                            throw new RuntimeException();
                        }
                        anIntArray3866[i_303_] = i_305_;
                        int i_306_ = -1;
                        if (i_304_ == 105) {
                            i_306_ = 0;
                        }
                        for (int i_307_ = 0; i_307_ < i_305_; i_307_++)
                            anIntArrayArray3859[i_303_][i_307_] = i_306_;
                    } else if (command == 45) {
                        int i_308_ = integerPassValues[valueIndex];
                        int i_309_ = anIntArray3840[--anInt3846];
                        if (i_309_ < 0 || i_309_ >= anIntArray3866[i_308_]) {
                            throw new RuntimeException();
                        }
                        anIntArray3840[anInt3846++] = anIntArrayArray3859[i_308_][i_309_];
                    } else if (command == 46) {
                        int i_310_ = integerPassValues[valueIndex];
                        anInt3846 -= 2;
                        int i_311_ = anIntArray3840[anInt3846];
                        if (i_311_ < 0 || i_311_ >= anIntArray3866[i_310_]) {
                            throw new RuntimeException();
                        }
                        anIntArrayArray3859[i_310_][i_311_] = anIntArray3840[anInt3846 + 1];
                    } else if (command == 47) {
                        String string = Node_Sub38_Sub3.aStringArray10105[integerPassValues[valueIndex]];
                        if (string == null) {
                            string = "null";
                        }
                        aStringArray3855[anInt3841++] = string;
                    } else if (command == 48) {
                        int i_312_ = integerPassValues[valueIndex];
                        Node_Sub38_Sub3.aStringArray10105[i_312_] = aStringArray3855[--anInt3841];
                        CacheNode.method2277(i_312_);
                    } else if (command == 51) {
                        HashTable hashtable = cachenode_sub9.aHashTableArray9503[integerPassValues[valueIndex]];
                        Node_Sub32 node_sub32 = (Node_Sub32) hashtable.method1518(3512, anIntArray3840[--anInt3846]);
                        if (node_sub32 != null) {
                            valueIndex += node_sub32.anInt7381;
                        }
                    } else if (command == 54) {
                        aLongArray3837[anInt3864++] = cachenode_sub9.longValues[valueIndex];
                    } else if (command == 55) {
                        anInt3864--;
                    } else if (command == 66) {
                        aLongArray3837[anInt3864++] = aLongArray3851[integerPassValues[valueIndex]];
                    } else if (command == 67) {
                        aLongArray3851[integerPassValues[valueIndex]] = aLongArray3837[--anInt3864];
                    } else if (command == 68) {
                        anInt3864 -= 2;
                        if (aLongArray3837[anInt3864] != aLongArray3837[anInt3864 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 69) {
                        anInt3864 -= 2;
                        if (aLongArray3837[anInt3864] == aLongArray3837[anInt3864 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 70) {
                        anInt3864 -= 2;
                        if (aLongArray3837[anInt3864] < aLongArray3837[anInt3864 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 71) {
                        anInt3864 -= 2;
                        if (aLongArray3837[anInt3864] > aLongArray3837[anInt3864 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 72) {
                        anInt3864 -= 2;
                        if (aLongArray3837[anInt3864] <= aLongArray3837[anInt3864 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 73) {
                        anInt3864 -= 2;
                        if (aLongArray3837[anInt3864] >= aLongArray3837[anInt3864 + 1]) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 86) {
                        if (anIntArray3840[--anInt3846] == 1) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 87) {
                        if (anIntArray3840[--anInt3846] == 0) {
                            valueIndex += integerPassValues[valueIndex];
                        }
                    } else if (command == 106) {
                        int i_313_ = integerPassValues[valueIndex];
                        Integer integer = (Integer) Class147.anObjectArray1821[i_313_];
                        if (integer == null) {
                            Class95 class95 = Class336.aClass315_4173.method3658(i_313_, 117);
                            if (class95.aChar1252 == 'i' || class95.aChar1252 == '1') {
                                anIntArray3840[anInt3846++] = 0;
                            } else {
                                anIntArray3840[anInt3846++] = -1;
                            }
                        } else {
                            anIntArray3840[anInt3846++] = integer;
                        }
                    } else if (command == 107) {
                        int i_314_ = integerPassValues[valueIndex];
                        Class95 class95 = Class336.aClass315_4173.method3658(i_314_, 85);
                        if (class95.aChar1252 != '\001') {
                            anIntArray3840[anInt3846++] = 0;
                        }
                        Integer integer = (Integer) Class147.anObjectArray1821[class95.anInt1258];
                        if (integer == null) {
                            anIntArray3840[anInt3846++] = 0;
                        } else {
                            int i_315_ = class95.anInt1259 == 31 ? -1 : (1 << class95.anInt1259 + 1) - 1;
                            anIntArray3840[anInt3846++] = (integer & i_315_) >>> class95.anInt1254;
                        }
                    } else if (command == 108) {
                        int i_316_ = integerPassValues[valueIndex];
                        Long var_long = (Long) Class147.anObjectArray1821[i_316_];
                        if (var_long == null) {
                            aLongArray3837[anInt3864++] = -1L;
                        } else {
                            aLongArray3837[anInt3864++] = var_long;
                        }
                    } else if (command == 109) {
                        int i_317_ = integerPassValues[valueIndex];
                        String string = (String) Class147.anObjectArray1821[i_317_];
                        if (string == null) {
                            aStringArray3855[anInt3841++] = "";
                        } else {
                            aStringArray3855[anInt3841++] = string;
                        }
                    } else if (command == 112) {
                        anIntArray3840[anInt3846++] = method3548(integerPassValues[valueIndex]);
                    } else if (command == 113) {
                        anIntArray3840[anInt3846++] = method3547(integerPassValues[valueIndex]);
                    } else if (command == 114) {
                        aLongArray3837[anInt3864++] = method3549(integerPassValues[valueIndex]);
                    } else if (command == 115) {
                        aStringArray3855[anInt3841++] = method3561(integerPassValues[valueIndex]);
                    }
                } else {
                    boolean bool;
                    bool = integerPassValues[valueIndex] == 1;
                    if (command < 5000) {
                        method3552(command, bool);
                    } else {
                        if (command >= 10000) {
                            break;
                        }
                        method3557(command);
                    }
                }
            }
            throw new IllegalStateException("Command: " + command);
        } catch (Exception exception) {
            StringBuilder stringbuffer = new StringBuilder(30);
            stringbuffer.append("CS2: ").append(cachenode_sub9.aLong2797).append(" ");
            for (int i_318_ = anInt3843 - 1; i_318_ >= 0; i_318_--)
                stringbuffer.append("v: ").append(aClass113Array3842[i_318_].aCacheNode_Sub9_1449.aLong2797).append(" ");
            stringbuffer.append("op: ").append(command);
            ClanChat.method507(exception, stringbuffer.toString(), -119);
        }
    }

    static void method3556(Node_Sub37 node_sub37) {
        executeScript(node_sub37, 200000);
    }

    private static void method3557(int i) {
        if (i < 5100) {
            if (i == 5000) {
                anIntArray3840[anInt3846++] = Class69.anInt943;
                return;
            }
            if (i == 5001) {
                anInt3846 -= 3;
                Class69.anInt943 = anIntArray3840[anInt3846];
                za.aClass251_7694 = Class106.method1123(anIntArray3840[anInt3846 + 1]);
                if (za.aClass251_7694 == null) {
                    za.aClass251_7694 = Class71.aClass251_965;
                }
                Class50.anInt774 = anIntArray3840[anInt3846 + 2];
                anInt3862++;
                Class123 class123 = Class262_Sub23.method3213((byte) -120);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Animable_Sub2_Sub1.aClass318_10644, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(Class69.anInt943);
                node_sub13.aPacket7113.writeByte(za.aClass251_7694.anInt3182);
                node_sub13.aPacket7113.writeByte(Class50.anInt774);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5002) {
                anInt3841 -= 2;
                String string = aStringArray3855[anInt3841];
                String string_319_ = aStringArray3855[anInt3841 + 1];
                anInt3846 -= 2;
                int i_320_ = anIntArray3840[anInt3846];
                int i_321_ = anIntArray3840[anInt3846 + 1];
                if (string_319_ == null) {
                    string_319_ = "";
                }
                if (string_319_.length() > 80) {
                    string_319_ = string_319_.substring(0, 80);
                }
                anInt3853++;
                Class123 class123 = Class262_Sub23.method3213((byte) -103);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class134.aClass318_5301, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(Class126.method1536(string) + 2 + Class126.method1536(string_319_));
                node_sub13.aPacket7113.writeString(string);
                node_sub13.aPacket7113.writeByte(i_320_ - 1);
                node_sub13.aPacket7113.writeByte(i_321_);
                node_sub13.aPacket7113.writeString(string_319_);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5003) {
                int i_322_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_322_);
                String string = "";
                if (class253 != null && class253.aString3195 != null) {
                    string = class253.aString3195;
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5004) {
                int i_323_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_323_);
                int i_324_ = -1;
                if (class253 != null) {
                    i_324_ = class253.anInt3199;
                }
                anIntArray3840[anInt3846++] = i_324_;
                return;
            }
            if (i == 5005) {
                if (za.aClass251_7694 == null) {
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = za.aClass251_7694.anInt3182;
                    return;
                }
                return;
            }
            if (i == 5006) {
                int i_325_ = anIntArray3840[--anInt3846];
                Class123 class123 = Class262_Sub23.method3213((byte) -64);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class187.aClass318_2277, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(i_325_);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5008) {
                String string = aStringArray3855[--anInt3841];
                method3562(string);
                return;
            }
            if (i == 5009) {
                anInt3841 -= 2;
                String string = aStringArray3855[anInt3841];
                String string_326_ = aStringArray3855[anInt3841 + 1];
                if (Class339_Sub7.rights != 0 || (!Node_Sub38_Sub18.aBoolean10282 || Class24.aBoolean436) && !Class290_Sub11.aBoolean8175) {
                    anInt3838++;
                    Class123 class123 = Class262_Sub23.method3213((byte) -78);
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class133.aClass318_1687, Objects.requireNonNull(class123).anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeShort(0);
                    int i_327_ = node_sub13.aPacket7113.offset;
                    node_sub13.aPacket7113.writeString(string);
                    Class194_Sub3.method1975(node_sub13.aPacket7113, string_326_);
                    node_sub13.aPacket7113.method2194(node_sub13.aPacket7113.offset - i_327_);
                    class123.sendPacket(node_sub13);
                    return;
                }
                return;
            }
            if (i == 5010) {
                int i_328_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_328_);
                String string = "";
                if (class253 != null && class253.aString3205 != null) {
                    string = class253.aString3205;
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5011) {
                int i_329_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_329_);
                String string = "";
                if (class253 != null && class253.aString3197 != null) {
                    string = class253.aString3197;
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5012) {
                int i_330_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_330_);
                int i_331_ = -1;
                if (class253 != null) {
                    i_331_ = class253.anInt3200;
                }
                anIntArray3840[anInt3846++] = i_331_;
                return;
            }
            if (i == 5015) {
                String string;
                if (Class295.myPlayer == null || Class295.myPlayer.displayName == null) {
                    string = "";
                } else {
                    string = Class295.myPlayer.method893(false);
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5016) {
                anIntArray3840[anInt3846++] = Class50.anInt774;
                return;
            }
            if (i == 5017) {
                anIntArray3840[anInt3846++] = Class215.method2063();
                return;
            }
            if (i == 5018) {
                int i_332_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_332_);
                int i_333_ = 0;
                if (class253 != null) {
                    i_333_ = class253.anInt3204;
                }
                anIntArray3840[anInt3846++] = i_333_;
                return;
            }
            if (i == 5019) {
                int i_334_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_334_);
                String string = "";
                if (class253 != null && class253.aString3198 != null) {
                    string = class253.aString3198;
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5020) {
                String string;
                if (Class295.myPlayer == null || Class295.myPlayer.displayName == null) {
                    string = "";
                } else {
                    string = Class295.myPlayer.method891();
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5023) {
                int i_335_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_335_);
                int i_336_ = -1;
                if (class253 != null) {
                    i_336_ = class253.anInt3192;
                }
                anIntArray3840[anInt3846++] = i_336_;
                return;
            }
            if (i == 5024) {
                int i_337_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_337_);
                int i_338_ = -1;
                if (class253 != null) {
                    i_338_ = class253.anInt3194;
                }
                anIntArray3840[anInt3846++] = i_338_;
                return;
            }
            if (i == 5025) {
                int i_339_ = anIntArray3840[--anInt3846];
                Class253 class253 = EntityNode_Sub1.method805(i_339_);
                String string = "";
                if (class253 != null && class253.aString3191 != null) {
                    string = class253.aString3191;
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5050) {
                int i_340_ = anIntArray3840[--anInt3846];
                aStringArray3855[anInt3841++] = Class42.aClass122_631.method1508(i_340_).aString9443;
                return;
            }
            if (i == 5051) {
                int i_341_ = anIntArray3840[--anInt3846];
                CacheNode_Sub3 cachenode_sub3 = Class42.aClass122_631.method1508(i_341_);
                if (cachenode_sub3.anIntArray9445 == null) {
                    anIntArray3840[anInt3846++] = 0;
                } else {
                    anIntArray3840[anInt3846++] = cachenode_sub3.anIntArray9445.length;
                    return;
                }
                return;
            }
            if (i == 5052) {
                anInt3846 -= 2;
                int i_342_ = anIntArray3840[anInt3846];
                int i_343_ = anIntArray3840[anInt3846 + 1];
                CacheNode_Sub3 cachenode_sub3 = Class42.aClass122_631.method1508(i_342_);
                int i_344_ = cachenode_sub3.anIntArray9445[i_343_];
                anIntArray3840[anInt3846++] = i_344_;
                return;
            }
            if (i == 5053) {
                int i_345_ = anIntArray3840[--anInt3846];
                CacheNode_Sub3 cachenode_sub3 = Class42.aClass122_631.method1508(i_345_);
                if (cachenode_sub3.anIntArray9448 == null) {
                    anIntArray3840[anInt3846++] = 0;
                } else {
                    anIntArray3840[anInt3846++] = cachenode_sub3.anIntArray9448.length;
                    return;
                }
                return;
            }
            if (i == 5054) {
                anInt3846 -= 2;
                int i_346_ = anIntArray3840[anInt3846];
                int i_347_ = anIntArray3840[anInt3846 + 1];
                anIntArray3840[anInt3846++] = Class42.aClass122_631.method1508(i_346_).anIntArray9448[i_347_];
                return;
            }
            if (i == 5055) {
                int i_348_ = anIntArray3840[--anInt3846];
                aStringArray3855[anInt3841++] = Node_Sub36_Sub1.aClass109_10035.method1128(i_348_).method2332();
                return;
            }
            if (i == 5056) {
                int i_349_ = anIntArray3840[--anInt3846];
                CacheNode_Sub10 cachenode_sub10 = Node_Sub36_Sub1.aClass109_10035.method1128(i_349_);
                if (cachenode_sub10.anIntArray9522 == null) {
                    anIntArray3840[anInt3846++] = 0;
                } else {
                    anIntArray3840[anInt3846++] = cachenode_sub10.anIntArray9522.length;
                    return;
                }
                return;
            }
            if (i == 5057) {
                anInt3846 -= 2;
                int i_350_ = anIntArray3840[anInt3846];
                int i_351_ = anIntArray3840[anInt3846 + 1];
                anIntArray3840[anInt3846++] = Node_Sub36_Sub1.aClass109_10035.method1128(i_350_).anIntArray9522[i_351_];
                return;
            }
            if (i == 5058) {
                aClass16_3856 = new Class16();
                aClass16_3856.anInt231 = anIntArray3840[--anInt3846];
                aClass16_3856.aCacheNode_Sub10_229 = Node_Sub36_Sub1.aClass109_10035.method1128(aClass16_3856.anInt231);
                aClass16_3856.anIntArray230 = new int[aClass16_3856.aCacheNode_Sub10_229.method2327()];
                return;
            }
            if (i == 5059) {
                anInt3861++;
                Class123 class123 = Class262_Sub23.method3213((byte) -77);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class245.aClass318_3101, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
                int i_352_ = node_sub13.aPacket7113.offset;
                node_sub13.aPacket7113.writeByte(0);
                node_sub13.aPacket7113.writeShort(aClass16_3856.anInt231);
                aClass16_3856.aCacheNode_Sub10_229.method2330(node_sub13.aPacket7113, aClass16_3856.anIntArray230, 121);
                node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.offset - i_352_);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5060) {
                String string = aStringArray3855[--anInt3841];
                anInt3844++;
                Class123 class123 = Class262_Sub23.method3213((byte) -127);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class235_Sub1.aClass318_8979, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
                int i_353_ = node_sub13.aPacket7113.offset;
                node_sub13.aPacket7113.writeString(string);
                node_sub13.aPacket7113.writeShort(aClass16_3856.anInt231);
                aClass16_3856.aCacheNode_Sub10_229.method2330(node_sub13.aPacket7113, aClass16_3856.anIntArray230, 126);
                node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.offset - i_353_);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5061) {
                anInt3861++;
                Class123 class123 = Class262_Sub23.method3213((byte) -75);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class245.aClass318_3101, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
                int i_354_ = node_sub13.aPacket7113.offset;
                node_sub13.aPacket7113.writeByte(1);
                node_sub13.aPacket7113.writeShort(aClass16_3856.anInt231);
                aClass16_3856.aCacheNode_Sub10_229.method2330(node_sub13.aPacket7113, aClass16_3856.anIntArray230, 125);
                node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.offset - i_354_);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5062) {
                anInt3846 -= 2;
                int i_355_ = anIntArray3840[anInt3846];
                int i_356_ = anIntArray3840[anInt3846 + 1];
                anIntArray3840[anInt3846++] = Class42.aClass122_631.method1508(i_355_).aCharArray9444[i_356_];
                return;
            }
            if (i == 5063) {
                anInt3846 -= 2;
                int i_357_ = anIntArray3840[anInt3846];
                int i_358_ = anIntArray3840[anInt3846 + 1];
                anIntArray3840[anInt3846++] = Class42.aClass122_631.method1508(i_357_).aCharArray9452[i_358_];
                return;
            }
            if (i == 5064) {
                anInt3846 -= 2;
                int i_359_ = anIntArray3840[anInt3846];
                int i_360_ = anIntArray3840[anInt3846 + 1];
                if (i_360_ == -1) {
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = Class42.aClass122_631.method1508(i_359_).method2298((char) i_360_);
                    return;
                }
                return;
            }
            if (i == 5065) {
                anInt3846 -= 2;
                int i_361_ = anIntArray3840[anInt3846];
                int i_362_ = anIntArray3840[anInt3846 + 1];
                if (i_362_ == -1) {
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = Class42.aClass122_631.method1508(i_361_).method2297((char) i_362_);
                    return;
                }
                return;
            }
            if (i == 5066) {
                int i_363_ = anIntArray3840[--anInt3846];
                anIntArray3840[anInt3846++] = Node_Sub36_Sub1.aClass109_10035.method1128(i_363_).method2327();
                return;
            }
            if (i == 5067) {
                anInt3846 -= 2;
                int i_364_ = anIntArray3840[anInt3846];
                int i_365_ = anIntArray3840[anInt3846 + 1];
                int i_366_ = Objects.requireNonNull(Node_Sub36_Sub1.aClass109_10035.method1128(i_364_).method2324(i_365_)).anInt1844;
                anIntArray3840[anInt3846++] = i_366_;
                return;
            }
            if (i == 5068) {
                anInt3846 -= 2;
                int i_367_ = anIntArray3840[anInt3846];
                int i_368_ = anIntArray3840[anInt3846 + 1];
                aClass16_3856.anIntArray230[i_367_] = i_368_;
                return;
            }
            if (i == 5069) {
                anInt3846 -= 2;
                int i_369_ = anIntArray3840[anInt3846];
                int i_370_ = anIntArray3840[anInt3846 + 1];
                aClass16_3856.anIntArray230[i_369_] = i_370_;
                return;
            }
            if (i == 5070) {
                anInt3846 -= 3;
                int i_371_ = anIntArray3840[anInt3846];
                int i_372_ = anIntArray3840[anInt3846 + 1];
                int i_373_ = anIntArray3840[anInt3846 + 2];
                CacheNode_Sub10 cachenode_sub10 = Node_Sub36_Sub1.aClass109_10035.method1128(i_371_);
                if (Objects.requireNonNull(cachenode_sub10.method2324(i_372_)).anInt1844 != 0) {
                    throw new RuntimeException("bad command");
                }
                anIntArray3840[anInt3846++] = cachenode_sub10.method2326(i_372_, i_373_);
                return;
            }
            if (i == 5071) {
                String string = aStringArray3855[--anInt3841];
                boolean bool_374_ = anIntArray3840[--anInt3846] == 1;
                Mobile_Sub4.method913(string, bool_374_);
                anIntArray3840[anInt3846++] = Class365_Sub1.anInt8759;
                return;
            }
            if (i == 5072) {
                if (Node_Sub20.aShortArray7175 == null || Animable_Sub1.anInt9096 >= Class365_Sub1.anInt8759) {
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = Node_Sub20.aShortArray7175[Animable_Sub1.anInt9096++] & 0xffff;
                    return;
                }
                return;
            }
            if (i == 5073) {
                Animable_Sub1.anInt9096 = 0;
                return;
            }
            if (i == 5074) {
                Class123 class123 = Class262_Sub23.method3213((byte) -66);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class245.aClass318_3101, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
                int i_375_ = node_sub13.aPacket7113.offset;
                node_sub13.aPacket7113.writeByte(2);
                node_sub13.aPacket7113.writeShort(aClass16_3856.anInt231);
                aClass16_3856.aCacheNode_Sub10_229.method2330(node_sub13.aPacket7113, aClass16_3856.anIntArray230, 126);
                node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.offset - i_375_);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5075) {
                Class123 class123 = Class262_Sub23.method3213((byte) -122);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class245.aClass318_3101, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
                int i_376_ = node_sub13.aPacket7113.offset;
                node_sub13.aPacket7113.writeByte(3);
                node_sub13.aPacket7113.writeShort(aClass16_3856.anInt231);
                aClass16_3856.aCacheNode_Sub10_229.method2330(node_sub13.aPacket7113, aClass16_3856.anIntArray230, 125);
                node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.offset - i_376_);
                class123.sendPacket(node_sub13);
                return;
            }
        } else if (i < 5200) {
            if (i == 5100) {
                if (Class175.aClass291_2100.method3450(86)) {
                    anIntArray3840[anInt3846++] = 1;
                } else {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                }
                return;
            }
            if (i == 5101) {
                if (Class175.aClass291_2100.method3450(82)) {
                    anIntArray3840[anInt3846++] = 1;
                } else {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                }
                return;
            }
            if (i == 5102) {
                if (Class175.aClass291_2100.method3450(81)) {
                    anIntArray3840[anInt3846++] = 1;
                } else {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                }
                return;
            }
        } else if (i < 5300) {
            if (i == 5200) {
                Node_Sub38_Sub1.method2791(anIntArray3840[--anInt3846]);
                return;
            }
            if (i == 5201) {
                anIntArray3840[anInt3846++] = Class251.method3098();
                return;
            }
            if (i == 5205) {
                Node_Sub38_Sub5.method2802(anIntArray3840[--anInt3846], false, -1, -1);
                return;
            }
            if (i == 5206) {
                int i_377_ = anIntArray3840[--anInt3846];
                CacheNode_Sub11 cachenode_sub11 = Class20.method288(i_377_ >> 14 & 0x3fff, i_377_ & 0x3fff);
                if (cachenode_sub11 == null) {
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = cachenode_sub11.anInt9546;
                    return;
                }
                return;
            }
            if (i == 5207) {
                CacheNode_Sub11 cachenode_sub11 = Class20.method269(anIntArray3840[--anInt3846]);
                if (cachenode_sub11 == null || cachenode_sub11.aString9543 == null) {
                    aStringArray3855[anInt3841++] = "";
                } else {
                    aStringArray3855[anInt3841++] = cachenode_sub11.aString9543;
                    return;
                }
                return;
            }
            if (i == 5208) {
                anIntArray3840[anInt3846++] = GameStub.anInt46;
                anIntArray3840[anInt3846++] = Class313.anInt4011;
                return;
            }
            if (i == 5209) {
                anIntArray3840[anInt3846++] = Class94.anInt1250 + Class20.anInt354;
                anIntArray3840[anInt3846++] = Class327.anInt5360 + Class20.anInt343;
                return;
            }
            if (i == 5210) {
                int i_378_ = anIntArray3840[--anInt3846];
                CacheNode_Sub11 cachenode_sub11 = Class20.method269(i_378_);
                if (cachenode_sub11 == null) {
                    anIntArray3840[anInt3846++] = 0;
                    anIntArray3840[anInt3846++] = 0;
                } else {
                    anIntArray3840[anInt3846++] = cachenode_sub11.anInt9535 >> 14 & 0x3fff;
                    anIntArray3840[anInt3846++] = cachenode_sub11.anInt9535 & 0x3fff;
                    return;
                }
                return;
            }
            if (i == 5211) {
                int i_379_ = anIntArray3840[--anInt3846];
                CacheNode_Sub11 cachenode_sub11 = Class20.method269(i_379_);
                if (cachenode_sub11 == null) {
                    anIntArray3840[anInt3846++] = 0;
                    anIntArray3840[anInt3846++] = 0;
                } else {
                    anIntArray3840[anInt3846++] = cachenode_sub11.anInt9531 - cachenode_sub11.anInt9541;
                    anIntArray3840[anInt3846++] = cachenode_sub11.anInt9545 - cachenode_sub11.anInt9540;
                    return;
                }
                return;
            }
            if (i == 5212) {
                Node_Sub14 node_sub14 = Node_Sub11.method2542((byte) -36);
                if (node_sub14 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = node_sub14.anInt7128;
                    anIntArray3840[anInt3846++] = node_sub14.anInt7125 + Class20.anInt354 << 14 | node_sub14.anInt7120 + Class20.anInt343;
                    return;
                }
                return;
            }
            if (i == 5213) {
                Node_Sub14 node_sub14 = Class195.method1985();
                if (node_sub14 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = node_sub14.anInt7128;
                    int i_381_ = node_sub14.anInt7125 + Class20.anInt354 << 14 | node_sub14.anInt7120 + Class20.anInt343;
                    anIntArray3840[anInt3846++] = i_381_;
                    return;
                }
                return;
            }
            if (i == 5214) {
                int i_382_ = anIntArray3840[--anInt3846];
                CacheNode_Sub11 cachenode_sub11 = Class105.method1117(107);
                if (cachenode_sub11 != null) {
                    boolean bool_383_ = cachenode_sub11.method2337(anIntArray3845, i_382_ & 0x3fff, i_382_ >> 28 & 0x3, i_382_ >> 14 & 0x3fff);
                    if (bool_383_) {
                        Class56.method565(anIntArray3845[1], anIntArray3845[2]);
                    }
                }
                return;
            }
            if (i == 5215) {
                anInt3846 -= 2;
                int i_384_ = anIntArray3840[anInt3846];
                int i_385_ = anIntArray3840[anInt3846 + 1];
                Class158 class158 = Class20.method286(i_384_ >> 14 & 0x3fff, i_384_ & 0x3fff);
                boolean bool_386_ = false;
                for (CacheNode_Sub11 cachenode_sub11 = (CacheNode_Sub11) class158.method1723(); cachenode_sub11 != null; cachenode_sub11 = (CacheNode_Sub11) class158.method1721()) {
                    if (cachenode_sub11.anInt9546 == i_385_) {
                        bool_386_ = true;
                        break;
                    }
                }
                if (bool_386_) {
                    anIntArray3840[anInt3846++] = 1;
                } else {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                }
                return;
            }
            if (i == 5218) {
                int i_387_ = anIntArray3840[--anInt3846];
                CacheNode_Sub11 cachenode_sub11 = Class20.method269(i_387_);
                if (cachenode_sub11 == null) {
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = cachenode_sub11.anInt9547;
                    return;
                }
                return;
            }
            if (i == 5220) {
                anIntArray3840[anInt3846++] = Node_Sub25_Sub1.anInt9947 == 100 ? 1 : 0;
                return;
            }
            if (i == 5221) {
                int i_388_ = anIntArray3840[--anInt3846];
                Class56.method565(i_388_ >> 14 & 0x3fff, i_388_ & 0x3fff);
                return;
            }
            if (i == 5222) {
                CacheNode_Sub11 cachenode_sub11 = Class105.method1117(112);
                if (cachenode_sub11 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    anIntArray3840[anInt3846++] = -1;
                    return;
                } else {
                    boolean bool_389_ = cachenode_sub11.method2340(Class327.anInt5360 + Class20.anInt343, Class94.anInt1250 + Class20.anInt354, anIntArray3845);
                    if (bool_389_) {
                        anIntArray3840[anInt3846++] = anIntArray3845[1];
                        anIntArray3840[anInt3846++] = anIntArray3845[2];
                    } else {
                        anIntArray3840[anInt3846++] = -1;
                        anIntArray3840[anInt3846++] = -1;
                    }
                }
                return;
            }
            if (i == 5223) {
                anInt3846 -= 2;
                int i_390_ = anIntArray3840[anInt3846];
                int i_391_ = anIntArray3840[anInt3846 + 1];
                Node_Sub38_Sub5.method2802(i_390_, false, i_391_ & 0x3fff, i_391_ >> 14 & 0x3fff);
                return;
            }
            if (i == 5224) {
                int i_392_ = anIntArray3840[--anInt3846];
                CacheNode_Sub11 cachenode_sub11 = Class105.method1117(127);
                if (cachenode_sub11 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    anIntArray3840[anInt3846++] = -1;
                    return;
                } else {
                    boolean bool_393_ = cachenode_sub11.method2337(anIntArray3845, i_392_ & 0x3fff, i_392_ >> 28 & 0x3, i_392_ >> 14 & 0x3fff);
                    if (bool_393_) {
                        anIntArray3840[anInt3846++] = anIntArray3845[1];
                        anIntArray3840[anInt3846++] = anIntArray3845[2];
                    } else {
                        anIntArray3840[anInt3846++] = -1;
                        anIntArray3840[anInt3846++] = -1;
                    }
                }
                return;
            }
            if (i == 5225) {
                int i_394_ = anIntArray3840[--anInt3846];
                CacheNode_Sub11 cachenode_sub11 = Class105.method1117(119);
                if (cachenode_sub11 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    anIntArray3840[anInt3846++] = -1;
                    return;
                } else {
                    boolean bool_395_ = cachenode_sub11.method2340(i_394_ & 0x3fff, i_394_ >> 14 & 0x3fff, anIntArray3845);
                    if (bool_395_) {
                        anIntArray3840[anInt3846++] = anIntArray3845[1];
                        anIntArray3840[anInt3846++] = anIntArray3845[2];
                    } else {
                        anIntArray3840[anInt3846++] = -1;
                        anIntArray3840[anInt3846++] = -1;
                    }
                }
                return;
            }
            if (i == 5226) {
                CacheNode_Sub16_Sub2.method2392(anIntArray3840[--anInt3846]);
                return;
            }
            if (i == 5227) {
                anInt3846 -= 2;
                int i_396_ = anIntArray3840[anInt3846];
                int i_397_ = anIntArray3840[anInt3846 + 1];
                Node_Sub38_Sub5.method2802(i_396_, true, i_397_ & 0x3fff, i_397_ >> 14 & 0x3fff);
                return;
            }
            if (i == 5228) {
                ClientScript.aBoolean9510 = anIntArray3840[--anInt3846] == 1;
                return;
            }
            if (i == 5229) {
                anIntArray3840[anInt3846++] = ClientScript.aBoolean9510 ? 1 : 0;
                return;
            }
            if (i == 5230) {
                int i_398_ = anIntArray3840[--anInt3846];
                Class98.method1083(i_398_);
                return;
            }
            if (i == 5231) {
                anInt3846 -= 2;
                int i_399_ = anIntArray3840[anInt3846];
                boolean bool_400_ = anIntArray3840[anInt3846 + 1] == 1;
                if (IComponentDefinitions.aHashTable4827 != null) {
                    Node node = IComponentDefinitions.aHashTable4827.method1518(3512, i_399_);
                    if (node != null && !bool_400_) {
                        node.method2160();
                    } else if (node == null && bool_400_) {
                        node = new Node();
                        IComponentDefinitions.aHashTable4827.method1515(i_399_, node, -123);
                    }
                }
                return;
            }
            if (i == 5232) {
                int i_401_ = anIntArray3840[--anInt3846];
                if (IComponentDefinitions.aHashTable4827 == null) {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                } else {
                    Node node = IComponentDefinitions.aHashTable4827.method1518(3512, i_401_);
                    anIntArray3840[anInt3846++] = node != null ? 1 : 0;
                }
                return;
            }
            if (i == 5233) {
                anInt3846 -= 2;
                int i_402_ = anIntArray3840[anInt3846];
                boolean bool_403_ = anIntArray3840[anInt3846 + 1] == 1;
                if (CacheNode_Sub10.aHashTable9530 != null) {
                    Node node = CacheNode_Sub10.aHashTable9530.method1518(3512, i_402_);
                    if (node != null && !bool_403_) {
                        node.method2160();
                    } else if (node == null && bool_403_) {
                        node = new Node();
                        CacheNode_Sub10.aHashTable9530.method1515(i_402_, node, -123);
                    }
                }
                return;
            }
            if (i == 5234) {
                int i_404_ = anIntArray3840[--anInt3846];
                if (CacheNode_Sub10.aHashTable9530 == null) {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                } else {
                    Node node = CacheNode_Sub10.aHashTable9530.method1518(3512, i_404_);
                    anIntArray3840[anInt3846++] = node != null ? 1 : 0;
                }
                return;
            }
            if (i == 5235) {
                anIntArray3840[anInt3846++] = Class20.aCacheNode_Sub11_318 != null ? Class20.aCacheNode_Sub11_318.anInt9546 : -1;
                return;
            }
            if (i == 5236) {
                anInt3846 -= 2;
                int i_405_ = anIntArray3840[anInt3846];
                int i_406_ = anIntArray3840[anInt3846 + 1];
                int i_407_ = i_406_ >> 14 & 0x3fff;
                int i_408_ = i_406_ & 0x3fff;
                int i_409_ = Class270_Sub1_Sub1.method3301(i_405_, i_408_, i_407_);
                if (i_409_ < 0) {
                    anIntArray3840[anInt3846++] = -1;
                } else {
                    anIntArray3840[anInt3846++] = i_409_;
                    return;
                }
                return;
            }
            if (i == 5237) {
                Class169.method1760();
                return;
            }
        } else if (i < 5400) {
            if (i == 5300) {
                anInt3846 -= 2;
                int i_410_ = anIntArray3840[anInt3846];
                int i_411_ = anIntArray3840[anInt3846 + 1];
                Node_Sub38_Sub19.method2850(3, i_410_, i_411_);
                anIntArray3840[anInt3846++] = DrawableModel.aFrame907 != null ? 1 : 0;
                return;
            }
            if (i == 5301) {
                if (DrawableModel.aFrame907 != null) {
                    Node_Sub38_Sub19.method2850(Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678(), -1, -1);
                }
                return;
            }
            if (i == 5302) {
                Class244[] class244s = Class312.method3624(0);
                anIntArray3840[anInt3846++] = class244s.length;
                return;
            }
            if (i == 5303) {
                int i_412_ = anIntArray3840[--anInt3846];
                Class244[] class244s = Class312.method3624(0);
                anIntArray3840[anInt3846++] = class244s[i_412_].anInt3084;
                anIntArray3840[anInt3846++] = class244s[i_412_].anInt3078;
                return;
            }
            if (i == 5305) {
                int i_413_ = Node_Sub38_Sub15.anInt10263;
                int i_414_ = Node_Sub10.anInt7083;
                int i_415_ = -1;
                Class244[] class244s = Class312.method3624(0);
                for (int i_416_ = 0; i_416_ < class244s.length; i_416_++) {
                    Class244 class244 = class244s[i_416_];
                    if (class244.anInt3084 == i_413_ && class244.anInt3078 == i_414_) {
                        i_415_ = i_416_;
                        break;
                    }
                }
                anIntArray3840[anInt3846++] = i_415_;
                return;
            }
            if (i == 5306) {
                anIntArray3840[anInt3846++] = Class188_Sub2_Sub1.getDisplayMode(3);
                return;
            }
            if (i == 5307) {
                int i_417_ = anIntArray3840[--anInt3846];
                if (i_417_ >= 1 && i_417_ <= 2) {
                    Node_Sub38_Sub19.method2850(i_417_, -1, -1);
                    return;
                }
                return;
            }
            if (i == 5308) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678();
                return;
            }
            if (i == 5309) {
                int i_418_ = anIntArray3840[--anInt3846];
                if (i_418_ >= 1 && i_418_ <= 2) {
                    Class213.aNode_Sub27_2512.method2690(105, i_418_, Class213.aNode_Sub27_2512.aClass320_Sub1_7287);
                    Class213.aNode_Sub27_2512.method2690(82, i_418_, Class213.aNode_Sub27_2512.aClass320_Sub1_7313);
                    Node_Sub38_Sub31.method2893(1);
                    return;
                }
                return;
            }
        } else if (i < 5500) {
            if (i == 5400) {
                anInt3841 -= 2;
                String string = aStringArray3855[anInt3841];
                String string_419_ = aStringArray3855[anInt3841 + 1];
                int i_420_ = anIntArray3840[--anInt3846];
                anInt3863++;
                Class123 class123 = Class262_Sub23.method3213((byte) -108);
                Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class320_Sub26.aClass318_8459, Objects.requireNonNull(class123).anIsaacCipher1571);
                Objects.requireNonNull(node_sub13).aPacket7113.writeByte(Class126.method1536(string) + Class126.method1536(string_419_) + 1);
                node_sub13.aPacket7113.writeString(string);
                node_sub13.aPacket7113.writeString(string_419_);
                node_sub13.aPacket7113.writeByte(i_420_);
                class123.sendPacket(node_sub13);
                return;
            }
            if (i == 5401) {
                anInt3846 -= 2;
                Class343.aShortArray4255[anIntArray3840[anInt3846]] = (short) Class96.method1075(-43, anIntArray3840[anInt3846 + 1]);
                EntityNode_Sub3_Sub1.aClass86_9166.method1006(-1);
                EntityNode_Sub3_Sub1.aClass86_9166.method1008();
                Class366.aClass279_4526.method3375();
                Class320_Sub21.method3764(-103);
                return;
            }
            if (i == 5405) {
                anInt3846 -= 2;
                int i_421_ = anIntArray3840[anInt3846];
                int i_422_ = anIntArray3840[anInt3846 + 1];
                if (i_421_ >= 0 && i_421_ < 2) {
                    Class277_Sub1.anIntArrayArrayArray8042[i_421_] = new int[i_422_ << 1][4];
                }
                return;
            }
            if (i == 5406) {
                anInt3846 -= 7;
                int i_423_ = anIntArray3840[anInt3846];
                int i_424_ = anIntArray3840[anInt3846 + 1] << 1;
                int i_425_ = anIntArray3840[anInt3846 + 2];
                int i_426_ = anIntArray3840[anInt3846 + 3];
                int i_427_ = anIntArray3840[anInt3846 + 4];
                int i_428_ = anIntArray3840[anInt3846 + 5];
                int i_429_ = anIntArray3840[anInt3846 + 6];
                if (i_423_ >= 0 && i_423_ < 2 && Class277_Sub1.anIntArrayArrayArray8042[i_423_] != null && i_424_ >= 0 && i_424_ < Class277_Sub1.anIntArrayArrayArray8042[i_423_].length) {
                    Class277_Sub1.anIntArrayArrayArray8042[i_423_][i_424_] = new int[]{(i_425_ >> 14 & 0x3fff) << 9, i_426_ << 2, (i_425_ & 0x3fff) << 9, i_429_};
                    Class277_Sub1.anIntArrayArrayArray8042[i_423_][i_424_ + 1] = new int[]{(i_427_ >> 14 & 0x3fff) << 9, i_428_ << 2, (i_427_ & 0x3fff) << 9};
                }
                return;
            }
            if (i == 5407) {
                int i_430_ = Class277_Sub1.anIntArrayArrayArray8042[anIntArray3840[--anInt3846]].length >> 1;
                anIntArray3840[anInt3846++] = i_430_;
                return;
            }
            if (i == 5411) {
                if (DrawableModel.aFrame907 != null) {
                    Node_Sub38_Sub19.method2850(Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678(), -1, -1);
                }
                if (Node_Sub29.aFrame7344 == null) {
                    String string = Class191.aString2350 != null ? Class191.aString2350 : CacheNode_Sub17.method2394();
                    Class355.method4017(-53, Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 1, string, false, Class240.aSignLink2946);
                    return;
                } else {
                    Class144.method1631((byte) 125);
                    System.exit(0);
                }
                return;
            }
            if (i == 5419) {
                String string = "";
                if (Class237.aClass241_2904 != null) {
                    if (Class237.aClass241_2904.anObject2956 == null) {
                        string = EntityNode_Sub3_Sub1.method943((byte) -88, Class237.aClass241_2904.anInt2952);
                    } else {
                        string = (String) Class237.aClass241_2904.anObject2956;
                    }
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5420) {
                anIntArray3840[anInt3846++] = Class240.aSignLink2946.aBoolean4005 ? 0 : 1;
                return;
            }
            if (i == 5421) {
                if (DrawableModel.aFrame907 != null) {
                    Node_Sub38_Sub19.method2850(Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678(), -1, -1);
                }
                String string = aStringArray3855[--anInt3841];
                boolean bool_431_ = anIntArray3840[--anInt3846] == 1;
                String string_432_ = CacheNode_Sub17.method2394() + string;
                Class355.method4017(-117, Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 1, string_432_, bool_431_, Class240.aSignLink2946);
                return;
            }
            if (i == 5422) {
                anInt3841 -= 2;
                String string = aStringArray3855[anInt3841];
                String string_433_ = aStringArray3855[anInt3841 + 1];
                int i_434_ = anIntArray3840[--anInt3846];
                if (string.length() > 0) {
                    if (CacheNode_Sub19.aStringArray9622 == null) {
                        CacheNode_Sub19.aStringArray9622 = new String[Node_Sub25_Sub3.anIntArray9966[Class209.aClass353_2483.anInt4344]];
                    }
                    CacheNode_Sub19.aStringArray9622[i_434_] = string;
                }
                if (string_433_.length() > 0) {
                    if (Class320_Sub15.aStringArray8354 == null) {
                        Class320_Sub15.aStringArray8354 = new String[Node_Sub25_Sub3.anIntArray9966[Class209.aClass353_2483.anInt4344]];
                    }
                    Class320_Sub15.aStringArray8354[i_434_] = string_433_;
                }
                return;
            }
            if (i == 5423) {
                //System.out.println(aStringArray3855[--anInt3841]);
                return;
            }
            if (i == 5424) {
                anInt3846 -= 11;
                AnimableAnimator.anInt5501 = anIntArray3840[anInt3846];
                Node_Sub36_Sub3.anInt10056 = anIntArray3840[anInt3846 + 1];
                Class262_Sub5.anInt7737 = anIntArray3840[anInt3846 + 2];
                Class218.anInt2569 = anIntArray3840[anInt3846 + 3];
                Class40.anInt620 = anIntArray3840[anInt3846 + 4];
                Class150.anInt5085 = anIntArray3840[anInt3846 + 5];
                GLDrawableModel.anInt5710 = anIntArray3840[anInt3846 + 6];
                EntityNode_Sub3.anInt5965 = anIntArray3840[anInt3846 + 7];
                Class150.anInt5088 = anIntArray3840[anInt3846 + 8];
                Class320_Sub26.anInt8451 = anIntArray3840[anInt3846 + 9];
                Class340.anInt4209 = anIntArray3840[anInt3846 + 10];
                Node_Sub38_Sub39.aClass302_10500.method3510(Class40.anInt620);
                Node_Sub38_Sub39.aClass302_10500.method3510(Class150.anInt5085);
                Node_Sub38_Sub39.aClass302_10500.method3510(GLDrawableModel.anInt5710);
                Node_Sub38_Sub39.aClass302_10500.method3510(EntityNode_Sub3.anInt5965);
                Node_Sub38_Sub39.aClass302_10500.method3510(Class150.anInt5088);
                Exception_Sub1.aGLSprite98 = Class296.aGLSprite5437 = Class290_Sub1.aGLSprite8062 = null;
                Class247.aGLSprite3141 = aa.aGLSprite102 = Class339_Sub7.aGLSprite8718 = null;
                Class40.aGLSprite621 = Class286.aGLSprite3604 = null;
                Node_Sub38_Sub5.aBoolean10130 = true;
                return;
            }
            if (i == 5425) {
                GameStub.method101();
                Node_Sub38_Sub5.aBoolean10130 = false;
                return;
            }
            if (i == 5426) {
                anInt3846 -= 2;
                Animable_Sub4_Sub1.anInt10687 = anIntArray3840[anInt3846];
                Class230_Sub1.anInt9013 = anIntArray3840[anInt3846 + 1];
                return;
            }
            if (i == 5427) {
                anInt3846 -= 2;
                return;
            }
            if (i == 5428) {
                anInt3846 -= 2;
                int i_435_ = anIntArray3840[anInt3846];
                int i_436_ = anIntArray3840[anInt3846 + 1];
                anIntArray3840[anInt3846++] = Class138.method1603(i_435_, i_436_) ? 1 : 0;
                return;
            }
            if (i == 5429) {
                Class126.method1538(100, false, false, aStringArray3855[--anInt3841]);
                return;
            }
            if (i == 5430) {
                try {
                    Class2.method167("accountcreated", Class96.anApplet1270, (byte) -128);
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5431) {
                try {
                    Class2.method167("accountcreatestarted", Class96.anApplet1270, (byte) -112);
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5432) {
                String string = "";
                if (Class102.aClipboard1315 != null) {
                    Transferable transferable = Class102.aClipboard1315.getContents(null);
                    if (transferable != null) {
                        try {
                            string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                }
                aStringArray3855[anInt3841++] = string;
                return;
            }
            if (i == 5433) {
                Animable_Sub1.anInt9101 = anIntArray3840[--anInt3846];
                return;
            }
            if (i == 5435) {
                anIntArray3840[anInt3846++] = Animable_Sub2_Sub1.aBoolean10628 ? 1 : 0;
                return;
            }
            if (i == 5436) {
                if (Node_Sub23.aNode_Sub39_7201.anInt7474 < 6) {
                    anIntArray3840[anInt3846++] = 0;
                } else {
                    if (Node_Sub23.aNode_Sub39_7201.anInt7474 == 6 && Node_Sub23.aNode_Sub39_7201.anInt7480 < 10) {
                        anIntArray3840[anInt3846++] = 0;
                    } else {
                        anIntArray3840[anInt3846++] = 1;
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (i < 5600) {
            if (i == 5500) {
                anInt3846 -= 4;
                int i_437_ = anIntArray3840[anInt3846];
                int i_438_ = anIntArray3840[anInt3846 + 1];
                int i_439_ = anIntArray3840[anInt3846 + 2];
                int i_440_ = anIntArray3840[anInt3846 + 3];
                Class188_Sub1_Sub1.method1895((i_437_ >> 14 & 0x3fff) - Node_Sub53.gameSceneBaseX, false, i_439_, i_438_ << 2, (i_437_ & 0x3fff) - Class320_Sub4.gameSceneBaseY, i_440_);
                return;
            }
            if (i == 5501) {
                anInt3846 -= 4;
                int i_441_ = anIntArray3840[anInt3846];
                int i_442_ = anIntArray3840[anInt3846 + 1];
                int i_443_ = anIntArray3840[anInt3846 + 2];
                int i_444_ = anIntArray3840[anInt3846 + 3];
                Class262_Sub22.method3210(i_443_, (i_441_ & 0x3fff) - Class320_Sub4.gameSceneBaseY, (i_441_ >> 14 & 0x3fff) - Node_Sub53.gameSceneBaseX, i_442_ << 2, i_444_);
                return;
            }
            if (i == 5502) {
                anInt3846 -= 6;
                int i_445_ = anIntArray3840[anInt3846];
                if (i_445_ >= 2) {
                    throw new RuntimeException();
                }
                Class109.anInt1367 = i_445_;
                int i_446_ = anIntArray3840[anInt3846 + 1];
                if (i_446_ + 1 >= Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367].length >> 1) {
                    throw new RuntimeException();
                }
                Class290_Sub5.anInt8107 = i_446_;
                Class141.anInt1758 = 0;
                Node_Sub6.anInt7056 = anIntArray3840[anInt3846 + 2];
                Class221.anInt2633 = anIntArray3840[anInt3846 + 3];
                int i_447_ = anIntArray3840[anInt3846 + 4];
                if (i_447_ >= 2) {
                    throw new RuntimeException();
                }
                Class203.anInt2452 = i_447_;
                int i_448_ = anIntArray3840[anInt3846 + 5];
                if (i_448_ + 1 >= Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452].length >> 1) {
                    throw new RuntimeException();
                }
                Class66_Sub2_Sub1.anInt10582 = i_448_;
                Class320_Sub22.anInt8415 = 3;
                Class367.anInt4541 = Class368.anInt4551 = -1;
                return;
            }
            if (i == 5503) {
                Class368.method4080();
                return;
            }
            if (i == 5504) {
                anInt3846 -= 2;
                Node_Sub38_Sub24.method2868(anIntArray3840[anInt3846 + 1], anIntArray3840[anInt3846]);
                return;
            }
            if (i == 5505) {
                anIntArray3840[anInt3846++] = (int) Class257.aFloat3243 >> 3;
                return;
            }
            if (i == 5506) {
                anIntArray3840[anInt3846++] = (int) Node_Sub12.aFloat5450 >> 3;
                return;
            }
            if (i == 5507) {
                Class320_Sub28.method3784((byte) -7);
                return;
            }
            if (i == 5508) {
                Mobile_Sub4.method910();
                return;
            }
            if (i == 5509) {
                Class320_Sub11.method3725();
                return;
            }
            if (i == 5510) {
                Node_Sub38_Sub23.method2865();
                return;
            }
            if (i == 5511) {
                int i_449_ = anIntArray3840[--anInt3846];
                int i_450_ = i_449_ >> 14 & 0x3fff;
                int i_451_ = i_449_ & 0x3fff;
                i_450_ -= Node_Sub53.gameSceneBaseX;
                if (i_450_ < 0) {
                    i_450_ = 0;
                } else if (i_450_ >= Node_Sub54.GAME_SCENE_WDITH) {
                    i_450_ = Node_Sub54.GAME_SCENE_WDITH;
                }
                i_451_ -= Class320_Sub4.gameSceneBaseY;
                if (i_451_ < 0) {
                    i_451_ = 0;
                } else if (i_451_ >= Class377_Sub1.GAME_SCENE_HEIGHT) {
                    i_451_ = Class377_Sub1.GAME_SCENE_HEIGHT;
                }
                Class234.anInt2792 = (i_450_ << 9) + 256;
                Node_Sub19.anInt7173 = (i_451_ << 9) + 256;
                Class320_Sub22.anInt8415 = 4;
                Class367.anInt4541 = Class368.anInt4551 = -1;
                return;
            }
            if (i == 5512) {
                Class76.method768();
                return;
            }
            if (i == 5514) {
                Class308.anInt3916 = anIntArray3840[--anInt3846];
                return;
            }
            if (i == 5516) {
                anIntArray3840[anInt3846++] = Class308.anInt3916;
                return;
            }
            if (i == 5517) {
                int i_452_ = anIntArray3840[--anInt3846];
                if (i_452_ == -1) {
                    int i_453_ = i_452_ >> 14 & 0x3fff;
                    int i_454_ = i_452_ & 0x3fff;
                    i_453_ -= Node_Sub53.gameSceneBaseX;
                    if (i_453_ < 0) {
                        i_453_ = 0;
                    } else if (i_453_ >= Node_Sub54.GAME_SCENE_WDITH) {
                        i_453_ = Node_Sub54.GAME_SCENE_WDITH;
                    }
                    i_454_ -= Class320_Sub4.gameSceneBaseY;
                    if (i_454_ < 0) {
                        i_454_ = 0;
                    } else if (i_454_ >= Class377_Sub1.GAME_SCENE_HEIGHT) {
                        i_454_ = Class377_Sub1.GAME_SCENE_HEIGHT;
                    }
                    Class367.anInt4541 = (i_453_ << 9) + 256;
                    Class368.anInt4551 = (i_454_ << 9) + 256;
                } else {
                    Class367.anInt4541 = -1;
                    Class368.anInt4551 = -1;
                    return;
                }
                return;
            }
            if (i == 5547) {
                anIntArray3840[anInt3846++] = Class320_Sub22.anInt8415 == 1 ? 1 : 0;
                return;
            }
        } else if (i < 5700) {
            if (i == 5600) {
                anInt3841 -= 2;
                String string = aStringArray3855[anInt3841];
                String string_455_ = aStringArray3855[anInt3841 + 1];
                int i_456_ = anIntArray3840[--anInt3846];
                Class39.method415(i_456_, string_455_, string, -113);
                return;
            }
            if (i == 5601) {
                Class320_Sub1.method3681();
                return;
            }
            if (i == 5602) {
                if (!Class132.method1561()) {
                    Class375.method4115();
                }
                return;
            }
            if (i == 5604) {
                anInt3841--;
                if (Class151.anInt1843 == 3 && (!Class132.method1561() && Class4.anInt124 == 0)) {
                    Class55.method558(aStringArray3855[anInt3841]);
                    return;
                }
                return;
            }
            if (i == 5605) {
                anInt3841 -= 2;
                anInt3846 -= 2;
                if (Class151.anInt1843 == 3 && (!Class132.method1561() && Class4.anInt124 == 0)) {
                    Class48.method483(aStringArray3855[anInt3841], anIntArray3840[anInt3846], aStringArray3855[anInt3841 + 1], anIntArray3840[anInt3846 + 1] == 1);
                    return;
                }
                return;
            }
            if (i == 5606) {
                if (Class4.anInt124 == 0) {
                    Node_Sub36_Sub4.anInt10073 = -2;
                }
                return;
            }
            if (i == 5607) {
                anIntArray3840[anInt3846++] = Class339_Sub2.anInt8653;
                return;
            }
            if (i == 5608) {
                anIntArray3840[anInt3846++] = FileOnDisk.anInt1326;
                return;
            }
            if (i == 5609) {
                anIntArray3840[anInt3846++] = Node_Sub36_Sub4.anInt10073;
                return;
            }
            if (i == 5611) {
                anIntArray3840[anInt3846++] = GameStub.anInt45;
                return;
            }
            if (i == 5612) {
                int i_457_ = anIntArray3840[--anInt3846];
                ItemDefinitions.method1673(i_457_);
                return;
            }
            if (i == 5613) {
                anIntArray3840[anInt3846++] = Class339_Sub2.anInt8653;
                return;
            }
            if (i == 5615) {
                anInt3841 -= 2;
                String string = aStringArray3855[anInt3841];
                String string_458_ = aStringArray3855[anInt3841 + 1];
                Class120.method1229(string_458_, string);
                return;
            }
            if (i == 5616) {
                Class127.method1542(false);
                return;
            }
            if (i == 5617) {
                anIntArray3840[anInt3846++] = Class152.anInt1941;
                return;
            }
            if (i == 5618) {
                anInt3846--;
                return;
            }
            if (i == 5619) {
                anInt3846--;
                return;
            }
            if (i == 5620) {
                anIntArray3840[anInt3846++] = 0;
                return;
            }
            if (i == 5621) {
                anInt3841 -= 2;
                anInt3846 -= 2;
                return;
            }
            if (i == 5622) {
                return;
            }
            if (i == 5623) {
                if (Class143.aByteArray1773 == null) {
                    anIntArray3840[anInt3846++] = 0;
                    return;
                } else {
                    anIntArray3840[anInt3846++] = 1;
                }
                return;
            }
            if (i == 5624) {
                anIntArray3840[anInt3846++] = (int) (Node_Sub32.aLong7385 >> 32);
                anIntArray3840[anInt3846++] = (int) (Node_Sub32.aLong7385);
                return;
            }
            if (i == 5625) {
                anIntArray3840[anInt3846++] = Class255.aBoolean3218 ? 1 : 0;
                return;
            }
            if (i == 5626) {
                Class255.aBoolean3218 = true;
                Class189.method1933();
                return;
            }
            if (i == 5627) {
                anIntArray3840[anInt3846++] = Class270_Sub2_Sub1.anInt10548;
                anIntArray3840[anInt3846++] = Class339_Sub5.anInt8684;
                anIntArray3840[anInt3846++] = Node_Sub38_Sub34.anInt10447;
                Class270_Sub2_Sub1.anInt10548 = -2;
                Class339_Sub5.anInt8684 = -1;
                Node_Sub38_Sub34.anInt10447 = -1;
                return;
            }
            if (i == 5628) {
                anIntArray3840[anInt3846++] = Class132.method1561() ? 1 : 0;
                return;
            }
            if (i == 5629) {
                anIntArray3840[anInt3846++] = Node_Sub15_Sub13.anInt9874;
                return;
            }
            if (i == 5630) {
                TemporaryItemDefinition.method403();
                return;
            }
            if (i == 5631) {
                anInt3846 -= 2;
                int i_459_ = anIntArray3840[anInt3846];
                int i_460_ = anIntArray3840[anInt3846 + 1];
                Animable.method822(i_459_, i_460_);
                return;
            }
            if (i == 5632) {
                int i_461_ = anIntArray3840[--anInt3846];
                Class290_Sub5.method3434(i_461_);
                return;
            }
            if (i == 5633) {
                anIntArray3840[anInt3846++] = Class187.anInt2276;
                return;
            }
        } else if (i < 6100) {
            if (i == 6001) {
                int i_462_ = anIntArray3840[--anInt3846];
                Class213.aNode_Sub27_2512.method2690(31, i_462_, Class213.aNode_Sub27_2512.aClass320_Sub22_7299);
                Class243.method3061(7);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6002) {
                boolean bool_463_ = anIntArray3840[--anInt3846] == 1;
                Class213.aNode_Sub27_2512.method2690(121, bool_463_ ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub19_7277);
                Class213.aNode_Sub27_2512.method2690(18, bool_463_ ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub19_7301);
                Class243.method3061(7);
                Class46.method471();
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6003) {
                boolean bool_464_ = anIntArray3840[--anInt3846] == 1;
                Class213.aNode_Sub27_2512.method2690(79, bool_464_ ? 2 : 1, Class213.aNode_Sub27_2512.aClass320_Sub4_7302);
                Class213.aNode_Sub27_2512.method2690(22, bool_464_ ? 2 : 1, Class213.aNode_Sub27_2512.aClass320_Sub4_7304);
                Class46.method471();
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6005) {
                Class213.aNode_Sub27_2512.method2690(122, anIntArray3840[--anInt3846] == 1 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
                Class243.method3061(7);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6007) {
                Class213.aNode_Sub27_2512.method2690(22, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub27_7266);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6008) {
                Class213.aNode_Sub27_2512.method2690(60, anIntArray3840[--anInt3846] == 1 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub8_7280);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6010) {
                Class213.aNode_Sub27_2512.method2690(31, anIntArray3840[--anInt3846] == 1 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub7_7308);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6011) {
                Class213.aNode_Sub27_2512.method2690(118, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub12_7282);
                Class243.method3061(7);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6012) {
                Class213.aNode_Sub27_2512.method2690(95, anIntArray3840[--anInt3846] == 1 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub24_7317);
                Class320_Sub12.method3728();
                Class120.method1228();
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6014) {
                Class213.aNode_Sub27_2512.method2690(81, anIntArray3840[--anInt3846] == 1 ? 2 : 0, Class213.aNode_Sub27_2512.aClass320_Sub26_7269);
                Class243.method3061(7);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6015) {
                Class213.aNode_Sub27_2512.method2690(17, anIntArray3840[--anInt3846] == 1 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub16_7316);
                Class243.method3061(7);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6016) {
                Class213.aNode_Sub27_2512.method2690(96, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub13_7283);
                Translation.method300(Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(), false);
                Node_Sub38_Sub31.method2893(1);
                return;
            }
            if (i == 6017) {
                Class213.aNode_Sub27_2512.method2690(50, anIntArray3840[--anInt3846] == 1 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub17_7311);
                Class83.method800();
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6018) {
                Class213.aNode_Sub27_2512.method2690(42, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub25_7295);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6019) {
                int i_465_ = anIntArray3840[--anInt3846];
                int i_466_ = Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776();
                if (i_465_ != i_466_) {
                    if (Class58.method577(Class151.anInt1843)) {
                        if (i_466_ == 0 && Class313.anInt4013 != -1) {
                            Class339_Sub8.method3946(Class313.anInt4013, 0, i_465_, SeekableFile.index6, false, 23732);
                            EntityNode_Sub7.method979();
                            Class377_Sub1.aBoolean8775 = false;
                        } else if (i_465_ == 0) {
                            Class320_Sub2.method3685(-86);
                            Class377_Sub1.aBoolean8775 = false;
                        } else {
                            Class64.method710(i_465_);
                        }
                    }
                    Class213.aNode_Sub27_2512.method2690(123, i_465_, Class213.aNode_Sub27_2512.aClass320_Sub25_7274);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                }
                return;
            }
            if (i == 6020) {
                Class213.aNode_Sub27_2512.method2690(23, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub25_7265);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6021) {
                int i_467_ = Class213.aNode_Sub27_2512.aClass320_Sub4_7302.method3694(false);
                Class213.aNode_Sub27_2512.method2690(69, anIntArray3840[--anInt3846] == 1 ? 0 : i_467_, Class213.aNode_Sub27_2512.aClass320_Sub4_7304);
                Class46.method471();
                return;
            }
            if (i == 6023) {
                int i_468_ = anIntArray3840[--anInt3846];
                Class213.aNode_Sub27_2512.method2690(111, i_468_, Class213.aNode_Sub27_2512.aClass320_Sub28_7305);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6024) {
                Class213.aNode_Sub27_2512.method2690(103, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub13_7284);
                Node_Sub38_Sub31.method2893(1);
                return;
            }
            if (i == 6025) {
                Class213.aNode_Sub27_2512.method2690(60, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub5_7297);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6027) {
                int i_469_ = anIntArray3840[--anInt3846];
                if (i_469_ < 0 || i_469_ > 1) {
                    i_469_ = 0;
                }
                Node_Sub19.method2610(i_469_ == 1);
                return;
            }
            if (i == 6028) {
                Class213.aNode_Sub27_2512.method2690(93, anIntArray3840[--anInt3846] != 0 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub14_7268);
                Node_Sub38_Sub31.method2893(1);
                return;
            }
            if (i == 6029) {
                Class213.aNode_Sub27_2512.method2690(45, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub27_7266);
                Node_Sub38_Sub31.method2893(1);
                return;
            }
            if (i == 6030) {
                Class213.aNode_Sub27_2512.method2690(48, anIntArray3840[--anInt3846] != 0 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub23_7290);
                Node_Sub38_Sub31.method2893(1);
                Class243.method3061(7);
                return;
            }
            if (i == 6031) {
                int i_470_ = anIntArray3840[--anInt3846];
                if (i_470_ < 0 || i_470_ > 5) {
                    i_470_ = 2;
                }
                Translation.method300(i_470_, false);
                return;
            }
            if (i == 6032) {
                anInt3846 -= 2;
                int i_471_ = anIntArray3840[anInt3846];
                boolean bool_472_ = anIntArray3840[anInt3846 + 1] == 1;
                Class213.aNode_Sub27_2512.method2690(46, i_471_, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                if (!bool_472_) {
                    Class213.aNode_Sub27_2512.method2690(112, 0, Class213.aNode_Sub27_2512.aClass320_Sub15_7273);
                }
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6033) {
                Class213.aNode_Sub27_2512.method2690(81, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub21_7293);
                Node_Sub38_Sub31.method2893(1);
                return;
            }
            if (i == 6034) {
                Class213.aNode_Sub27_2512.method2690(44, anIntArray3840[--anInt3846] == 1 ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub30_7275);
                Node_Sub38_Sub31.method2893(1);
                Class320_Sub12.method3728();
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6035) {
                int i_473_ = Class213.aNode_Sub27_2512.aClass320_Sub19_7277.method3751();
                Class213.aNode_Sub27_2512.method2690(92, anIntArray3840[--anInt3846] == 1 ? 1 : i_473_, Class213.aNode_Sub27_2512.aClass320_Sub19_7301);
                Class243.method3061(7);
                Class46.method471();
                return;
            }
            if (i == 6036) {
                Class213.aNode_Sub27_2512.method2690(69, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub18_7303);
                Node_Sub38_Sub31.method2893(1);
                Class152.aBoolean1942 = true;
                return;
            }
            if (i == 6037) {
                Class213.aNode_Sub27_2512.method2690(49, anIntArray3840[--anInt3846], Class213.aNode_Sub27_2512.aClass320_Sub25_7276);
                Node_Sub38_Sub31.method2893(1);
                Class269.aBoolean3472 = false;
                return;
            }
            if (i == 6038) {
                int i_474_ = anIntArray3840[--anInt3846];
                int i_475_ = Class213.aNode_Sub27_2512.aClass320_Sub25_7309.method3776();
                if (i_474_ != i_475_ && Class313.anInt4013 == Class317.anInt4038) {
                    if (!Class58.method577(Class151.anInt1843)) {
                        if (i_475_ == 0) {
                            Class339_Sub8.method3946(Class313.anInt4013, 0, i_474_, SeekableFile.index6, false, 23732);
                            EntityNode_Sub7.method979();
                            Class377_Sub1.aBoolean8775 = false;
                        } else if (i_474_ == 0) {
                            Class320_Sub2.method3685(-119);
                            Class377_Sub1.aBoolean8775 = false;
                        } else {
                            Class64.method710(i_474_);
                        }
                    }
                    Class213.aNode_Sub27_2512.method2690(126, i_474_, Class213.aNode_Sub27_2512.aClass320_Sub25_7309);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                }
                return;
            }
            if (i == 6039) {
                int i_476_ = anIntArray3840[--anInt3846];
                if (i_476_ > 255 || i_476_ < 0) {
                    i_476_ = 0;
                }
                if (i_476_ != Class213.aNode_Sub27_2512.aClass320_Sub11_7264.method3722()) {
                    Class213.aNode_Sub27_2512.method2690(32, i_476_, Class213.aNode_Sub27_2512.aClass320_Sub11_7264);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                }
                return;
            }
            if (i == 6040) {
                int i_477_ = anIntArray3840[--anInt3846];
                if (i_477_ != Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691()) {
                    Class213.aNode_Sub27_2512.method2690(89, i_477_, Class213.aNode_Sub27_2512.aClass320_Sub3_7298);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                    Class34_Sub1.method378();
                }
                return;
            }
            if (i == 6041) {
                int i_478_ = anIntArray3840[--anInt3846];
                if (i_478_ != Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686()) {
                    Class213.aNode_Sub27_2512.method2690(53, i_478_, Class213.aNode_Sub27_2512.aClass320_Sub2_7272);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                }
                return;
            }
        } else if (i < 6200) {
            if (i == 6101) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub22_7299.method3765();
                return;
            }
            if (i == 6102) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub19_7277.method3751() == 1 ? 1 : 0;
                return;
            }
            if (i == 6103) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub4_7302.method3694(false) == 2 ? 1 : 0;
                return;
            }
            if (i == 6105) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub6_7267.method3701() == 1 ? 1 : 0;
                return;
            }
            if (i == 6107) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub27_7266.method3783();
                return;
            }
            if (i == 6108) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub8_7280.method3712() == 1 ? 1 : 0;
                return;
            }
            if (i == 6110) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub7_7308.method3708() == 1 ? 1 : 0;
                return;
            }
            if (i == 6111) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730();
                return;
            }
            if (i == 6112) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub24_7317.method3773() == 1 ? 1 : 0;
                return;
            }
            if (i == 6114) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub26_7269.method3779() == 2 ? 1 : 0;
                return;
            }
            if (i == 6115) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub16_7316.method3744() == 1 ? 1 : 0;
                return;
            }
            if (i == 6116) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub13_7283.method3734();
                return;
            }
            if (i == 6117) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub17_7311.method3747() == 1 ? 1 : 0;
                return;
            }
            if (i == 6118) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub25_7295.method3776();
                return;
            }
            if (i == 6119) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776();
                return;
            }
            if (i == 6120) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub25_7265.method3776();
                return;
            }
            if (i == 6123) {
                anIntArray3840[anInt3846++] = Class235.method2156();
                return;
            }
            if (i == 6124) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub13_7284.method3734();
                return;
            }
            if (i == 6125) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub5_7297.method3697();
                return;
            }
            if (i == 6127) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub20_7306.method3758() == 1 ? 1 : 0;
                return;
            }
            if (i == 6128) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub14_7268.method3737() == 1 ? 1 : 0;
                return;
            }
            if (i == 6129) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub27_7266.method3783();
                return;
            }
            if (i == 6130) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub23_7290.method3770() == 1 ? 1 : 0;
                return;
            }
            if (i == 6131) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791();
                return;
            }
            if (i == 6132) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub29_7291.method3791();
                return;
            }
            if (i == 6133) {
                anIntArray3840[anInt3846++] = Class240.aSignLink2946.aBoolean4005 && !Class240.aSignLink2946.aBoolean3985 ? 1 : 0;
                return;
            }
            if (i == 6135) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub21_7293.method3762();
                return;
            }
            if (i == 6136) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3796(false) == 1 ? 1 : 0;
                return;
            }
            if (i == 6138) {
                anIntArray3840[anInt3846++] = Class194.method1961(200, Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791());
                return;
            }
            if (i == 6139) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub18_7303.method3749();
                return;
            }
            if (i == 6142) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub25_7276.method3776();
                return;
            }
            if (i == 6143) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub25_7309.method3776();
                return;
            }
            if (i == 6144) {
                anIntArray3840[anInt3846++] = CacheNode_Sub1.aBoolean9425 ? 1 : 0;
                return;
            }
            if (i == 6145) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub11_7264.method3722();
                return;
            }
            if (i == 6146) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691();
                return;
            }
            if (i == 6147) {
                anIntArray3840[anInt3846++] = Node_Sub23.aNode_Sub39_7201.anInt7484 < 512 || CacheNode_Sub1.aBoolean9425 || Node_Sub12.aBoolean5456 ? 1 : 0;
                return;
            }
            if (i == 6148) {
                anIntArray3840[anInt3846++] = Node_Sub32.aBoolean7377 ? 1 : 0;
                return;
            }
            if (i == 6149) {
                anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686();
                return;
            }
        } else if (i < 6300) {
            if (i == 6200) {
                anInt3846 -= 2;
                Node_Sub29_Sub3.aShort10027 = (short) anIntArray3840[anInt3846];
                if (Node_Sub29_Sub3.aShort10027 <= 0) {
                    Node_Sub29_Sub3.aShort10027 = (short) 256;
                }
                Node_Sub29_Sub3.aShort10026 = (short) anIntArray3840[anInt3846 + 1];
                if (Node_Sub29_Sub3.aShort10026 <= 0) {
                    Node_Sub29_Sub3.aShort10026 = (short) 205;
                }
                return;
            }
            if (i == 6201) {
                anInt3846 -= 2;
                Class144_Sub1.aShort6804 = (short) anIntArray3840[anInt3846];
                if (Class144_Sub1.aShort6804 <= 0) {
                    Class144_Sub1.aShort6804 = (short) 256;
                }
                Class268.aShort3455 = (short) anIntArray3840[anInt3846 + 1];
                if (Class268.aShort3455 <= 0) {
                    Class268.aShort3455 = (short) 320;
                }
                return;
            }
            if (i == 6202) {
                anInt3846 -= 4;
                Class18.aShort310 = (short) anIntArray3840[anInt3846];
                if (Class18.aShort310 <= 0) {
                    Class18.aShort310 = (short) 1;
                }
                OutcommingPacket.aShort4053 = (short) anIntArray3840[anInt3846 + 1];
                if (OutcommingPacket.aShort4053 <= 0) {
                    OutcommingPacket.aShort4053 = (short) 32767;
                } else if (OutcommingPacket.aShort4053 < Class18.aShort310) {
                    OutcommingPacket.aShort4053 = Class18.aShort310;
                }
                Class291.aShort3667 = (short) anIntArray3840[anInt3846 + 2];
                if (Class291.aShort3667 <= 0) {
                    Class291.aShort3667 = (short) 1;
                }
                Animable_Sub2_Sub2.aShort10750 = (short) anIntArray3840[anInt3846 + 3];
                if (Animable_Sub2_Sub2.aShort10750 <= 0) {
                    Animable_Sub2_Sub2.aShort10750 = (short) 32767;
                } else {
                    if (Animable_Sub2_Sub2.aShort10750 < Class291.aShort3667) {
                        Animable_Sub2_Sub2.aShort10750 = Class291.aShort3667;
                    }
                    return;
                }
                return;
            }
            if (i == 6203) {
                Class34_Sub1.method375(0, false, 0, Class324.aWidget4085.anInt4695, (byte) -98, Class324.aWidget4085.anInt4809);
                anIntArray3840[anInt3846++] = Class132.anInt1684;
                anIntArray3840[anInt3846++] = Class111.anInt1418;
                return;
            }
            if (i == 6204) {
                anIntArray3840[anInt3846++] = Class144_Sub1.aShort6804;
                anIntArray3840[anInt3846++] = Class268.aShort3455;
                return;
            }
            if (i == 6205) {
                anIntArray3840[anInt3846++] = Node_Sub29_Sub3.aShort10027;
                anIntArray3840[anInt3846++] = Node_Sub29_Sub3.aShort10026;
                return;
            }
        } else if (i < 6400) {
            if (i == 6300) {
                anIntArray3840[anInt3846++] = (int) (Class313.method3650() / 60000L);
                return;
            }
            if (i == 6301) {
                anIntArray3840[anInt3846++] = (int) (Class313.method3650() / 86400000L) - 11745;
                return;
            }
            if (i == 6302) {
                anInt3846 -= 3;
                int i_479_ = anIntArray3840[anInt3846];
                int i_480_ = anIntArray3840[anInt3846 + 1];
                int i_481_ = anIntArray3840[anInt3846 + 2];
                long l = TileMessage.method936(i_480_, i_481_, i_479_);
                int i_482_ = Class42.method444(l);
                if (i_481_ < 1970) {
                    i_482_--;
                }
                anIntArray3840[anInt3846++] = i_482_;
                return;
            }
            if (i == 6303) {
                anIntArray3840[anInt3846++] = Class326.method3817(Class313.method3650());
                return;
            }
            if (i == 6304) {
                int i_483_ = anIntArray3840[--anInt3846];
                boolean bool_484_ = true;
                if (i_483_ < 0) {
                    bool_484_ = (i_483_ + 1) % 4 == 0;
                } else if (i_483_ < 1582) {
                    bool_484_ = i_483_ % 4 == 0;
                } else if (i_483_ % 4 != 0) {
                    bool_484_ = false;
                } else if (i_483_ % 100 != 0) {
                } else if (i_483_ % 400 != 0) {
                    bool_484_ = false;
                }
                anIntArray3840[anInt3846++] = bool_484_ ? 1 : 0;
                return;
            }
            if (i == 6305) {
                int i_485_ = anIntArray3840[--anInt3846];
                int[] is = Node_Sub15_Sub4.method2566(i_485_);
                Class311.method3609(is, 0, anIntArray3840, anInt3846, 3);
                anInt3846 += 3;
                return;
            }
            if (i == 6306) {
                int i_486_ = anIntArray3840[--anInt3846];
                anIntArray3840[anInt3846++] = (int) (Class25.method308(i_486_) / 60000L);
                return;
            }
        } else if (i < 6500) {
            if (i == 6405) {
                anIntArray3840[anInt3846++] = AbstractToolkit.method1343() ? 1 : 0;
                return;
            }
            if (i == 6406) {
                anIntArray3840[anInt3846++] = GLSprite_Sub1.method1202() ? 1 : 0;
                return;
            }
        } else if (i < 6600) {
            if (i == 6500) {
                if (Class151.anInt1843 != 7 || Class132.method1561() || Class4.anInt124 != 0) {
                    anIntArray3840[anInt3846++] = 1;
                } else {
                    if (Class82.aBoolean1122) {
                        anIntArray3840[anInt3846++] = 0;
                    } else {
                        if (Class194.aLong2374 > Class313.method3650() - 1000L) {
                            anIntArray3840[anInt3846++] = 1;
                        } else {
                            Class82.aBoolean1122 = true;
                            Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class126.aClass318_1632, Class218.aClass123_2560.anIsaacCipher1571);
                            Objects.requireNonNull(node_sub13).aPacket7113.writeInt(Node_Sub38_Sub17.anInt10274);
                            Class218.aClass123_2560.sendPacket(node_sub13);
                            anIntArray3840[anInt3846++] = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 6501) {
                Class377_Sub1 class377_sub1 = Class384.method4202();
                if (class377_sub1 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    anIntArray3840[anInt3846++] = 0;
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    return;
                } else {
                    anIntArray3840[anInt3846++] = class377_sub1.anInt8777;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt4673;
                    aStringArray3855[anInt3841++] = class377_sub1.aString8780;
                    Class46 class46 = class377_sub1.method4131();
                    anIntArray3840[anInt3846++] = class46.anInt675;
                    aStringArray3855[anInt3841++] = class46.aString678;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt4671;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt8779;
                    aStringArray3855[anInt3841++] = class377_sub1.aString8773;
                }
                return;
            }
            if (i == 6502) {
                Class377_Sub1 class377_sub1 = CacheNode_Sub16_Sub1.method2389();
                if (class377_sub1 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    anIntArray3840[anInt3846++] = 0;
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    return;
                } else {
                    anIntArray3840[anInt3846++] = class377_sub1.anInt8777;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt4673;
                    aStringArray3855[anInt3841++] = class377_sub1.aString8780;
                    Class46 class46 = class377_sub1.method4131();
                    anIntArray3840[anInt3846++] = class46.anInt675;
                    aStringArray3855[anInt3841++] = class46.aString678;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt4671;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt8779;
                    aStringArray3855[anInt3841++] = class377_sub1.aString8773;
                }
                return;
            }
            if (i == 6503) {
                int i_487_ = anIntArray3840[--anInt3846];
                String string = aStringArray3855[--anInt3841];
                if (Class151.anInt1843 != 7 || Class132.method1561() || Class4.anInt124 != 0) {
                    anIntArray3840[anInt3846++] = 0;
                } else {
                    anIntArray3840[anInt3846++] = Class188_Sub1_Sub2.method1899(i_487_, string) ? 1 : 0;
                    return;
                }
                return;
            }
            if (i == 6506) {
                int i_488_ = anIntArray3840[--anInt3846];
                Class377_Sub1 class377_sub1 = Class327.method3823(i_488_);
                if (class377_sub1 == null) {
                    anIntArray3840[anInt3846++] = -1;
                    aStringArray3855[anInt3841++] = "";
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    anIntArray3840[anInt3846++] = 0;
                    anIntArray3840[anInt3846++] = 0;
                    aStringArray3855[anInt3841++] = "";
                    return;
                } else {
                    anIntArray3840[anInt3846++] = class377_sub1.anInt4673;
                    aStringArray3855[anInt3841++] = class377_sub1.aString8780;
                    Class46 class46 = class377_sub1.method4131();
                    anIntArray3840[anInt3846++] = class46.anInt675;
                    aStringArray3855[anInt3841++] = class46.aString678;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt4671;
                    anIntArray3840[anInt3846++] = class377_sub1.anInt8779;
                    aStringArray3855[anInt3841++] = class377_sub1.aString8773;
                }
                return;
            }
            if (i == 6507) {
                anInt3846 -= 4;
                int i_489_ = anIntArray3840[anInt3846];
                boolean bool_490_ = anIntArray3840[anInt3846 + 1] == 1;
                int i_491_ = anIntArray3840[anInt3846 + 2];
                boolean bool_492_ = anIntArray3840[anInt3846 + 3] == 1;
                Class66_Sub1.method723((byte) 57, bool_490_, i_491_, i_489_, bool_492_);
                return;
            }
            if (i == 6508) {
                EntityNode.method802(2126);
                return;
            }
            if (i == 6509) {
                if (Class151.anInt1843 == 7) {
                    Node_Sub38_Sub5.aBoolean10125 = anIntArray3840[--anInt3846] == 1;
                    return;
                }
                return;
            }
            if (i == 6510) {
                anIntArray3840[anInt3846++] = Class380.anInt4877;
                return;
            }
        } else if (i >= 6700) {
            if (i < 6800 && OutcommingPacket.aClass129_4051 == Class123.aClass129_1564) {
                if (i == 6700) {
                    int i_493_ = Class289.aHashTable3630.method1519();
                    if (Class320_Sub15.WINDOWS_PANE_ID != -1) {
                        i_493_++;
                    }
                    anIntArray3840[anInt3846++] = i_493_;
                    return;
                }
                if (i == 6701) {
                    int i_494_ = anIntArray3840[--anInt3846];
                    if (Class320_Sub15.WINDOWS_PANE_ID != -1) {
                        if (i_494_ == 0) {
                            anIntArray3840[anInt3846++] = Class320_Sub15.WINDOWS_PANE_ID;
                            return;
                        }
                        i_494_--;
                    }
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1516();
                    while (i_494_-- > 0)
                        node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1520(116);
                    anIntArray3840[anInt3846++] = Objects.requireNonNull(node_sub2).interfaceId;
                    return;
                }
                if (i == 6702) {
                    int i_495_ = anIntArray3840[--anInt3846];
                    if (Class134_Sub3.aWidgetArrayArray9035[i_495_] == null) {
                        aStringArray3855[anInt3841++] = "";
                    } else {
                        String string = Class134_Sub3.aWidgetArrayArray9035[i_495_][0].aString4765;
                        if (string == null) {
                            aStringArray3855[anInt3841++] = "";
                        } else {
                            aStringArray3855[anInt3841++] = string.substring(0, string.indexOf(':'));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6703) {
                    int i_496_ = anIntArray3840[--anInt3846];
                    if (Class134_Sub3.aWidgetArrayArray9035[i_496_] == null) {
                        anIntArray3840[anInt3846++] = 0;
                    } else {
                        anIntArray3840[anInt3846++] = Class134_Sub3.aWidgetArrayArray9035[i_496_].length;
                        return;
                    }
                    return;
                }
                if (i == 6704) {
                    anInt3846 -= 2;
                    int i_497_ = anIntArray3840[anInt3846];
                    int i_498_ = anIntArray3840[anInt3846 + 1];
                    if (Class134_Sub3.aWidgetArrayArray9035[i_497_] == null) {
                        aStringArray3855[anInt3841++] = "";
                    } else {
                        String string = Class134_Sub3.aWidgetArrayArray9035[i_497_][i_498_].aString4765;
                        if (string == null) {
                            aStringArray3855[anInt3841++] = "";
                        } else {
                            aStringArray3855[anInt3841++] = string;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6705) {
                    anInt3846 -= 2;
                    int i_499_ = anIntArray3840[anInt3846];
                    int i_500_ = anIntArray3840[anInt3846 + 1];
                    if (Class134_Sub3.aWidgetArrayArray9035[i_499_] == null) {
                        anIntArray3840[anInt3846++] = 0;
                    } else {
                        anIntArray3840[anInt3846++] = Class134_Sub3.aWidgetArrayArray9035[i_499_][i_500_].anInt4746;
                        return;
                    }
                    return;
                }
                if (i == 6706) {
                    return;
                }
                if (i == 6707) {
                    anInt3846 -= 3;
                    int i_501_ = anIntArray3840[anInt3846];
                    int i_502_ = anIntArray3840[anInt3846 + 1];
                    int i_503_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_501_ << 16 | i_502_, i_503_, "", 1);
                    return;
                }
                if (i == 6708) {
                    anInt3846 -= 3;
                    int i_504_ = anIntArray3840[anInt3846];
                    int i_505_ = anIntArray3840[anInt3846 + 1];
                    int i_506_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_504_ << 16 | i_505_, i_506_, "", 2);
                    return;
                }
                if (i == 6709) {
                    anInt3846 -= 3;
                    int i_507_ = anIntArray3840[anInt3846];
                    int i_508_ = anIntArray3840[anInt3846 + 1];
                    int i_509_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_507_ << 16 | i_508_, i_509_, "", 3);
                    return;
                }
                if (i == 6710) {
                    anInt3846 -= 3;
                    int i_510_ = anIntArray3840[anInt3846];
                    int i_511_ = anIntArray3840[anInt3846 + 1];
                    int i_512_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_510_ << 16 | i_511_, i_512_, "", 4);
                    return;
                }
                if (i == 6711) {
                    anInt3846 -= 3;
                    int i_513_ = anIntArray3840[anInt3846];
                    int i_514_ = anIntArray3840[anInt3846 + 1];
                    int i_515_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_513_ << 16 | i_514_, i_515_, "", 5);
                    return;
                }
                if (i == 6712) {
                    anInt3846 -= 3;
                    int i_516_ = anIntArray3840[anInt3846];
                    int i_517_ = anIntArray3840[anInt3846 + 1];
                    int i_518_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_516_ << 16 | i_517_, i_518_, "", 6);
                    return;
                }
                if (i == 6713) {
                    anInt3846 -= 3;
                    int i_519_ = anIntArray3840[anInt3846];
                    int i_520_ = anIntArray3840[anInt3846 + 1];
                    int i_521_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_519_ << 16 | i_520_, i_521_, "", 7);
                    return;
                }
                if (i == 6714) {
                    anInt3846 -= 3;
                    int i_522_ = anIntArray3840[anInt3846];
                    int i_523_ = anIntArray3840[anInt3846 + 1];
                    int i_524_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_522_ << 16 | i_523_, i_524_, "", 8);
                    return;
                }
                if (i == 6715) {
                    anInt3846 -= 3;
                    int i_525_ = anIntArray3840[anInt3846];
                    int i_526_ = anIntArray3840[anInt3846 + 1];
                    int i_527_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_525_ << 16 | i_526_, i_527_, "", 9);
                    return;
                }
                if (i == 6716) {
                    anInt3846 -= 3;
                    int i_528_ = anIntArray3840[anInt3846];
                    int i_529_ = anIntArray3840[anInt3846 + 1];
                    int i_530_ = anIntArray3840[anInt3846 + 2];
                    r_Sub1.method2364(i_528_ << 16 | i_529_, i_530_, "", 10);
                    return;
                }
                if (i == 6717) {
                    anInt3846 -= 3;
                    int i_531_ = anIntArray3840[anInt3846];
                    int i_532_ = anIntArray3840[anInt3846 + 1];
                    int i_533_ = anIntArray3840[anInt3846 + 2];
                    IComponentDefinitions widget = Node_Sub3.method2169(i_533_, i_531_ << 16 | i_532_);
                    Node_Sub38_Sub23.method2863();
                    InterfaceSettings node_sub35 = Client.method113(Objects.requireNonNull(widget));
                    Node_Sub38_Sub18.method2846(node_sub35.method2743(-79), (byte) -121, widget, node_sub35.anInt7413);
                    return;
                }
            } else if (i < 6900) {
                if (i == 6800) {
                    int i_534_ = anIntArray3840[--anInt3846];
                    Class79 class79 = Class304.aClass215_3834.method2069((byte) 110, i_534_);
                    if (class79.aString1085 == null) {
                        aStringArray3855[anInt3841++] = "";
                    } else {
                        aStringArray3855[anInt3841++] = class79.aString1085;
                        return;
                    }
                    return;
                }
                if (i == 6801) {
                    int i_535_ = anIntArray3840[--anInt3846];
                    Class79 class79 = Class304.aClass215_3834.method2069((byte) 103, i_535_);
                    anIntArray3840[anInt3846++] = class79.anInt1062;
                    return;
                }
                if (i == 6802) {
                    int i_536_ = anIntArray3840[--anInt3846];
                    Class79 class79 = Class304.aClass215_3834.method2069((byte) 110, i_536_);
                    anIntArray3840[anInt3846++] = class79.anInt1090;
                    return;
                }
                if (i == 6803) {
                    int i_537_ = anIntArray3840[--anInt3846];
                    Class79 class79 = Class304.aClass215_3834.method2069((byte) 100, i_537_);
                    anIntArray3840[anInt3846++] = class79.anInt1067;
                    return;
                }
                if (i == 6804) {
                    anInt3846 -= 2;
                    int i_538_ = anIntArray3840[anInt3846];
                    int i_539_ = anIntArray3840[anInt3846 + 1];
                    Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_539_, -86);
                    if (class267.method3287()) {
                        aStringArray3855[anInt3841++] = Class304.aClass215_3834.method2069((byte) 106, i_538_).method785(i_539_, class267.aString3450);
                    } else {
                        anIntArray3840[anInt3846++] = Class304.aClass215_3834.method2069((byte) 116, i_538_).method786(0, class267.anInt3443, i_539_);
                        return;
                    }
                    return;
                }
            } else if (i < 7000) {
                if (i == 6900) {
                    anIntArray3840[anInt3846++] = Node_Sub38_Sub18.aBoolean10282 && !Class24.aBoolean436 ? 1 : 0;
                    return;
                }
                if (i == 6901) {
                    anIntArray3840[anInt3846++] = (int) (Node_Sub32.aLong7382 / 60000L);
                    anIntArray3840[anInt3846++] = (int) ((Node_Sub32.aLong7382 - Class313.method3650() - Node_Sub8.aLong7068) / 60000L);
                    anIntArray3840[anInt3846++] = Class229.aBoolean2725 ? 1 : 0;
                    return;
                }
                if (i == 6902) {
                    anIntArray3840[anInt3846++] = Node_Sub38_Sub35.anInt10454;
                    return;
                }
                if (i == 6903) {
                    anIntArray3840[anInt3846++] = Class254.anInt3209;
                    return;
                }
                if (i == 6904) {
                    anIntArray3840[anInt3846++] = Class170.anInt2052;
                    return;
                }
                if (i == 6905) {
                    String string = "";
                    if (Class237.aClass241_2904 != null) {
                        if (Class237.aClass241_2904.anObject2956 == null) {
                            string = EntityNode_Sub3_Sub1.method943((byte) -113, Class237.aClass241_2904.anInt2952);
                        } else {
                            string = (String) Class237.aClass241_2904.anObject2956;
                        }
                    }
                    aStringArray3855[anInt3841++] = string;
                    return;
                }
                if (i == 6906) {
                    anIntArray3840[anInt3846++] = Class144_Sub2.anInt6812;
                    return;
                }
                if (i == 6907) {
                    anIntArray3840[anInt3846++] = Class333.anInt4149;
                    return;
                }
                if (i == 6908) {
                    anIntArray3840[anInt3846++] = Class342.anInt4234;
                    return;
                }
                if (i == 6909) {
                    anIntArray3840[anInt3846++] = Class225.aBoolean2676 ? 1 : 0;
                    return;
                }
                if (i == 6910) {
                    anIntArray3840[anInt3846++] = Class56.anInt837;
                    return;
                }
                if (i == 6911) {
                    anIntArray3840[anInt3846++] = Node_Sub38_Sub29.anInt10409;
                    return;
                }
                if (i == 6912) {
                    anIntArray3840[anInt3846++] = Class236.anInt2902;
                    return;
                }
                if (i == 6913) {
                    anIntArray3840[anInt3846++] = Node_Sub33.anInt7402;
                    return;
                }
                if (i == 6914) {
                    anIntArray3840[anInt3846++] = Class364.aBoolean4512 ? 1 : 0;
                    return;
                }
                if (i == 6915) {
                    anIntArray3840[anInt3846++] = Class270_Sub1.anInt8030;
                    return;
                }
            } else if (i < 7100) {
                if (i == 7000) {
                    int i_540_ = Node_Sub41.method2931((byte) 126);
                    anIntArray3840[anInt3846++] = Class95.anInt1251 = Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791();
                    anIntArray3840[anInt3846++] = i_540_;
                    Class243.method3061(7);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                    return;
                }
                if (i == 7001) {
                    Class262_Sub15.method3188();
                    Class243.method3061(7);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                    return;
                }
                if (i == 7002) {
                    Class69.method736();
                    Class243.method3061(7);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                    return;
                }
                if (i == 7003) {
                    Class194_Sub1.method1965();
                    Class243.method3061(7);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                    return;
                }
                if (i == 7004) {
                    Node_Sub36.method2752();
                    Class243.method3061(7);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                    return;
                }
                if (i == 7005) {
                    Class213.aNode_Sub27_2512.method2690(45, 0, Class213.aNode_Sub27_2512.aClass320_Sub15_7273);
                    Node_Sub38_Sub31.method2893(1);
                    Class269.aBoolean3472 = false;
                    return;
                }
                if (i == 7006) {
                    if (Class95.anInt1251 == 2) {
                        Class243.aBoolean3075 = true;
                    } else {
                        if (Class95.anInt1251 == 1) {
                            Class370.aBoolean4570 = true;
                        } else {
                            if (Class95.anInt1251 == 3) {
                                Class270_Sub2_Sub1.aBoolean10549 = true;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 7007) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub15_7273.method3738();
                    return;
                }
            } else if (i < 7200) {
                if (i == 7100) {
                    anInt3846 -= 2;
                    int i_541_ = anIntArray3840[anInt3846];
                    int i_542_ = anIntArray3840[anInt3846 + 1];
                    if (i_541_ != -1) {
                        if (i_542_ > 255) {
                            i_542_ = 255;
                        } else if (i_542_ < 0) {
                            i_542_ = 0;
                        }
                        Node_Sub40.method2927(false, i_541_, i_542_);
                    }
                    return;
                }
                if (i == 7101) {
                    int i_543_ = anIntArray3840[--anInt3846];
                    if (i_543_ != -1) {
                        Renderer.method3446(i_543_);
                    }
                    return;
                }
                if (i == 7102) {
                    int i_544_ = anIntArray3840[--anInt3846];
                    if (i_544_ != -1) {
                        CacheNode_Sub20.method2408(i_544_);
                    }
                    return;
                }
                if (i == 7103) {
                    anIntArray3840[anInt3846++] = Class262_Sub5.method3163() ? 1 : 0;
                    return;
                }
            } else if (i < 7300) {
                if (i == 7201) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub6_7267.method3702() ? 1 : 0;
                    return;
                }
                if (i == 7202) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub7_7308.method3709() ? 1 : 0;
                    return;
                }
                if (i == 7203) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3726() ? 1 : 0;
                    return;
                }
                if (i == 7204) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub26_7269.method3780() ? 1 : 0;
                    return;
                }
                if (i == 7205) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub13_7284.method3733() && Class93.aGraphicsToolkit1241.t() ? 1 : 0;
                    return;
                }
                if (i == 7206) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub28_7305.method3786() ? 1 : 0;
                    return;
                }
                if (i == 7207) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub5_7297.method3698() ? 1 : 0;
                    return;
                }
                if (i == 7208) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub20_7306.method3757() && Class93.aGraphicsToolkit1241.o() ? 1 : 0;
                    return;
                }
                if (i == 7209) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub23_7290.method3769() ? 1 : 0;
                    return;
                }
                if (i == 7210) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3795() ? 1 : 0;
                    return;
                }
                if (i == 7211) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub18_7303.method3750() ? 1 : 0;
                    return;
                }
                if (i == 7212) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub16_7316.method3741() ? 1 : 0;
                    return;
                }
                if (i == 7213) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3688() ? 1 : 0;
                    return;
                }
                if (i == 7214) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub29_7291.method3793((byte) 92) ? 1 : 0;
                    return;
                }
                if (i == 7215) {
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3682() ? 1 : 0;
                    return;
                }
            } else if (i < 7400) {
                if (i == 7301) {
                    int i_545_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub6_7267.method3675(i_545_, (byte) 54);
                    return;
                }
                if (i == 7302) {
                    int i_546_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub7_7308.method3675(i_546_, (byte) 54);
                    return;
                }
                if (i == 7303) {
                    int i_547_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3675(i_547_, (byte) 54);
                    return;
                }
                if (i == 7304) {
                    int i_548_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub26_7269.method3675(i_548_, (byte) 54);
                    return;
                }
                if (i == 7305) {
                    int i_549_ = anIntArray3840[--anInt3846];
                    if (Class93.aGraphicsToolkit1241.t()) {
                        anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub13_7284.method3675(i_549_, (byte) 54);
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = 3;
                    }
                    return;
                }
                if (i == 7306) {
                    int i_550_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub28_7305.method3675(i_550_, (byte) 54);
                    return;
                }
                if (i == 7307) {
                    int i_551_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub5_7297.method3675(i_551_, (byte) 54);
                    return;
                }
                if (i == 7308) {
                    int i_552_ = anIntArray3840[--anInt3846];
                    if (Class93.aGraphicsToolkit1241.o()) {
                        anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub20_7306.method3675(i_552_, (byte) 54);
                        return;
                    } else {
                        anIntArray3840[anInt3846++] = 3;
                    }
                    return;
                }
                if (i == 7309) {
                    int i_553_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub23_7290.method3675(i_553_, (byte) 54);
                    return;
                }
                if (i == 7310) {
                    int i_554_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3675(i_554_, (byte) 54);
                    return;
                }
                if (i == 7311) {
                    int i_555_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub18_7303.method3675(i_555_, (byte) 54);
                    return;
                }
                if (i == 7312) {
                    int i_556_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub16_7316.method3675(i_556_, (byte) 54);
                    return;
                }
                if (i == 7313) {
                    int i_557_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3675(i_557_, (byte) 54);
                    return;
                }
                if (i == 7314) {
                    int i_558_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub29_7291.method3675(i_558_, (byte) 54);
                    return;
                }
                if (i == 7315) {
                    int i_559_ = anIntArray3840[--anInt3846];
                    anIntArray3840[anInt3846++] = Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3675(i_559_, (byte) 54);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    private static void executeScript(Node_Sub37 node_sub37, int i) {
        Object[] parameters = node_sub37.parameters;
        int scriptId = (Integer) parameters[0];
        ClientScript script = Class260.getClientScript(scriptId, -125);
        if (script != null) {
            anIntArray3847 = new int[script.anInt9499];
            int i_561_ = 0;
            aStringArray3839 = new String[script.anInt9506];
            int i_562_ = 0;
            aLongArray3851 = new long[script.anInt9502];
            int i_563_ = 0;
            for (int index = 1; index < parameters.length; index++) {
                if (parameters[index] instanceof Integer) {
                    int integerParameter = (Integer) parameters[index];
                    if (integerParameter == -2147483647) {
                        integerParameter = node_sub37.anInt7439;
                    }
                    if (integerParameter == -2147483646) {
                        integerParameter = node_sub37.anInt7430;
                    }
                    if (integerParameter == -2147483645) {
                        integerParameter = node_sub37.aWidget7437 != null ? node_sub37.aWidget7437.ihash : -1;
                    }
                    if (integerParameter == -2147483644) {
                        integerParameter = node_sub37.anInt7441;
                    }
                    if (integerParameter == -2147483643) {
                        integerParameter = node_sub37.aWidget7437 != null ? node_sub37.aWidget7437.anInt4687 : -1;
                    }
                    if (integerParameter == -2147483642) {
                        integerParameter = node_sub37.aWidget7432 != null ? node_sub37.aWidget7432.ihash : -1;
                    }
                    if (integerParameter == -2147483641) {
                        integerParameter = node_sub37.aWidget7432 != null ? node_sub37.aWidget7432.anInt4687 : -1;
                    }
                    if (integerParameter == -2147483640) {
                        integerParameter = node_sub37.anInt7435;
                    }
                    if (integerParameter == -2147483639) {
                        integerParameter = node_sub37.anInt7444;
                    }
                    anIntArray3847[i_561_++] = integerParameter;
                } else if (parameters[index] instanceof String) {
                    String string = (String) parameters[index];
                    if (string.equals("event_opbase")) {
                        string = node_sub37.aString7440;
                    }
                    aStringArray3839[i_562_++] = string;
                } else if (parameters[index] instanceof Long) {
                    long longParameter = (Long) parameters[index];
                    aLongArray3851[i_563_++] = longParameter;
                }
            }
            anInt3869 = node_sub37.anInt7442;
            method3555(script, i);
        }
    }

    private static int method3559(char c) {
        if (Class321.method3801(c)) {
            return 1;
        }
        return 0;
    }

    public static void method3560() {
        anIntArray3847 = null;
        aStringArray3839 = null;
        aLongArray3851 = null;
        anIntArray3866 = null;
        anIntArrayArray3859 = null;
        anIntArray3840 = null;
        aStringArray3855 = null;
        aLongArray3837 = null;
        aClass113Array3842 = null;
        aWidget3849 = null;
        aWidget3865 = null;
        aClass16_3856 = null;
        aClanChat3860 = null;
        aNode_Sub43_3857 = null;
        anIntArray3845 = null;
        aClass61_3867 = null;
        aString3870 = null;
    }

    private static String method3561(int i) {
        String string = aClanChat3860.method495(Class209.aClass353_2483.anInt4344 << 16 | i);
        if (string == null) {
            return "";
        }
        return string;
    }

    private static void method3562(String string) {
        if (Class339_Sub7.rights != 0 || (!Node_Sub38_Sub18.aBoolean10282 || Class24.aBoolean436) && !Class290_Sub11.aBoolean8175) {
            String string_566_ = string.toLowerCase();
            int colorEffect = 0;
            if (string_566_.startsWith(Translation.aTranslation_410.getTranslatedString(0))) {
                string = string.substring(Translation.aTranslation_410.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_411.getTranslatedString(0))) {
                colorEffect = 1;
                string = string.substring(Translation.aTranslation_411.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_412.getTranslatedString(0))) {
                colorEffect = 2;
                string = string.substring(Translation.aTranslation_412.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_413.getTranslatedString(0))) {
                colorEffect = 3;
                string = string.substring(Translation.aTranslation_413.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_414.getTranslatedString(0))) {
                colorEffect = 4;
                string = string.substring(Translation.aTranslation_414.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_415.getTranslatedString(0))) {
                colorEffect = 5;
                string = string.substring(Translation.aTranslation_415.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_416.getTranslatedString(0))) {
                colorEffect = 6;
                string = string.substring(Translation.aTranslation_416.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_417.getTranslatedString(0))) {
                colorEffect = 7;
                string = string.substring(Translation.aTranslation_417.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_418.getTranslatedString(0))) {
                colorEffect = 8;
                string = string.substring(Translation.aTranslation_418.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_419.getTranslatedString(0))) {
                colorEffect = 9;
                string = string.substring(Translation.aTranslation_419.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_420.getTranslatedString(0))) {
                colorEffect = 10;
                string = string.substring(Translation.aTranslation_420.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_421.getTranslatedString(0))) {
                colorEffect = 11;
                string = string.substring(Translation.aTranslation_421.getTranslatedString(0).length());
            } else if (Class35.language != 0) {
                if (string_566_.startsWith(Translation.aTranslation_410.getTranslatedString(Class35.language))) {
                    string = string.substring(Translation.aTranslation_410.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_411.getTranslatedString(Class35.language))) {
                    colorEffect = 1;
                    string = string.substring(Translation.aTranslation_411.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_412.getTranslatedString(Class35.language))) {
                    colorEffect = 2;
                    string = string.substring(Translation.aTranslation_412.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_413.getTranslatedString(Class35.language))) {
                    colorEffect = 3;
                    string = string.substring(Translation.aTranslation_413.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_414.getTranslatedString(Class35.language))) {
                    colorEffect = 4;
                    string = string.substring(Translation.aTranslation_414.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_415.getTranslatedString(Class35.language))) {
                    colorEffect = 5;
                    string = string.substring(Translation.aTranslation_415.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_416.getTranslatedString(Class35.language))) {
                    colorEffect = 6;
                    string = string.substring(Translation.aTranslation_416.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_417.getTranslatedString(Class35.language))) {
                    colorEffect = 7;
                    string = string.substring(Translation.aTranslation_417.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_418.getTranslatedString(Class35.language))) {
                    colorEffect = 8;
                    string = string.substring(Translation.aTranslation_418.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_419.getTranslatedString(Class35.language))) {
                    colorEffect = 9;
                    string = string.substring(Translation.aTranslation_419.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_420.getTranslatedString(Class35.language))) {
                    colorEffect = 10;
                    string = string.substring(Translation.aTranslation_420.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_421.getTranslatedString(Class35.language))) {
                    colorEffect = 11;
                    string = string.substring(Translation.aTranslation_421.getTranslatedString(Class35.language).length());
                }
            }
            string_566_ = string.toLowerCase();
            int moveEffect = 0;
            if (string_566_.startsWith(Translation.aTranslation_422.getTranslatedString(0))) {
                moveEffect = 1;
                string = string.substring(Translation.aTranslation_422.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_423.getTranslatedString(0))) {
                moveEffect = 2;
                string = string.substring(Translation.aTranslation_423.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_424.getTranslatedString(0))) {
                moveEffect = 3;
                string = string.substring(Translation.aTranslation_424.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_425.getTranslatedString(0))) {
                moveEffect = 4;
                string = string.substring(Translation.aTranslation_425.getTranslatedString(0).length());
            } else if (string_566_.startsWith(Translation.aTranslation_426.getTranslatedString(0))) {
                moveEffect = 5;
                string = string.substring(Translation.aTranslation_426.getTranslatedString(0).length());
            } else if (Class35.language != 0) {
                if (string_566_.startsWith(Translation.aTranslation_422.getTranslatedString(Class35.language))) {
                    moveEffect = 1;
                    string = string.substring(Translation.aTranslation_422.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_423.getTranslatedString(Class35.language))) {
                    moveEffect = 2;
                    string = string.substring(Translation.aTranslation_423.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_424.getTranslatedString(Class35.language))) {
                    moveEffect = 3;
                    string = string.substring(Translation.aTranslation_424.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_425.getTranslatedString(Class35.language))) {
                    moveEffect = 4;
                    string = string.substring(Translation.aTranslation_425.getTranslatedString(Class35.language).length());
                } else if (string_566_.startsWith(Translation.aTranslation_426.getTranslatedString(Class35.language))) {
                    moveEffect = 5;
                    string = string.substring(Translation.aTranslation_426.getTranslatedString(Class35.language).length());
                }
            }
            anInt3852++;
            Class123 class123 = Class262_Sub23.method3213((byte) -110);
            Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub38_Sub11.aClass318_10221, Objects.requireNonNull(class123).anIsaacCipher1571);
            Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
            int i_569_ = node_sub13.aPacket7113.offset;
            node_sub13.aPacket7113.writeByte(colorEffect);
            node_sub13.aPacket7113.writeByte(moveEffect);
            Class194_Sub3.method1975(node_sub13.aPacket7113, string);
            node_sub13.aPacket7113.method2217(node_sub13.aPacket7113.offset - i_569_);
            class123.sendPacket(node_sub13);
        }
    }

    static void method3563(int i, String string, int i_570_) {
        ClientScript cachenode_sub9 = Node_Sub38_Sub25.method2871(Class262_Sub15_Sub1.aClass212_10519, i, -1, -37);
        if (cachenode_sub9 != null) {
            anIntArray3847 = new int[cachenode_sub9.anInt9499];
            aStringArray3839 = new String[cachenode_sub9.anInt9506];
            aStringArray3839[0] = string;
            anIntArray3847[0] = i_570_;
            method3555(cachenode_sub9, 200000);
        }
    }

    static void method3564() {
        /* empty */
    }

    static void method3565(Class212 class212, int i, int i_571_) {
        ClientScript cachenode_sub9 = Node_Sub38_Sub25.method2871(class212, i, i_571_, -67);
        if (cachenode_sub9 != null) {
            anIntArray3847 = new int[cachenode_sub9.anInt9499];
            aStringArray3839 = new String[cachenode_sub9.anInt9506];
            if (cachenode_sub9.aClass212_9505 == Class3.aClass212_5159 || cachenode_sub9.aClass212_9505 == Node_Sub38_Sub29.aClass212_10406 || cachenode_sub9.aClass212_9505 == CacheNode_Sub11.aClass212_9548) {
                int i_572_ = 0;
                int i_573_ = 0;
                if (Class66_Sub1.aWidget8983 != null) {
                    i_572_ = Class66_Sub1.aWidget8983.anInt4679;
                    i_573_ = Class66_Sub1.aWidget8983.anInt4762;
                }
                anIntArray3847[0] = Class106.aClass93_1356.method1050() - i_572_;
                anIntArray3847[1] = Class106.aClass93_1356.method1051() - i_573_;
            }
            method3555(cachenode_sub9, 200000);
        }
    }

    static {
        anInt3841 = 0;
        anIntArray3845 = new int[3];
        aClass113Array3842 = new Class113[50];
        anInt3846 = 0;
        anIntArrayArray3859 = new int[5][5000];
        anInt3864 = 0;
        aStringArray3855 = new String[1000];
        anIntArray3866 = new int[5];
        aClass61_3867 = new Class61(4);
        aBoolean3868 = false;
        anInt3869 = 0;
        aString3870 = null;
    }
}
