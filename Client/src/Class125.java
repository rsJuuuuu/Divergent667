/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125 {
    static int anInt1608;
    static Class61 aClass61_1609 = new Class61(4);
    static int anInt1610;

    static void method1527(int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt1610++;
        int i_5_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, i_3_);
        int i_6_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, i_4_);
        int i_7_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_0_);
        int i_8_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_1_);
        for (int i_9_ = i_5_; i_6_ >= i_9_; i_9_++)
            Class369.method4086(i_8_, i_2_, i_7_, Class169_Sub4.anIntArrayArray8826[i_9_], 0);
    }

    public static void method1528() {
        aClass61_1609 = null;
    }

    static boolean method1529(int i_11_) {
        anInt1608++;
        return (i_11_ & 0x800) != 0;
    }

    /**
     * quicksort algorithm that sorts the array "ints" and array "longs" based on comparison with "longs"
     **/
    static void quicksort(int[] ints, long[] longs, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int midpoint = (lo + hi) / 2;
        int i = lo;
        long pivotValue = longs[midpoint];
        longs[midpoint] = longs[hi];
        longs[hi] = pivotValue;
        int pivotIndex = ints[midpoint];
        ints[midpoint] = ints[hi];
        ints[hi] = pivotIndex;
        // for values that aren't the max value, ever other value gets a +1 to comparison
        // some sort of balancing of partitions?
        int isNotLongMax = pivotValue != Long.MAX_VALUE ? 1 : 0;
        for (int j = lo; hi > j; j++) {
            if (longs[j] < pivotValue + (long) (isNotLongMax & j)) {
                long next = longs[j];
                longs[j] = longs[i];
                longs[i] = next;
                int nextIndex = ints[j];
                ints[j] = ints[i];
                ints[i++] = nextIndex;
            }
        }
        longs[hi] = longs[i];
        longs[i] = pivotValue;
        ints[hi] = ints[i];
        ints[i] = pivotIndex;

        quicksort(ints, longs, lo, -1 + i);
        quicksort(ints, longs, i + 1, hi);
    }

}
