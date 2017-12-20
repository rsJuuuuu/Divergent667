/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TemporaryItemDefinition
{
	protected int[] maleWornModelIds;
	static long aLong562 = -1L;
	protected short[] modifiedTextureColors;
	protected int[] anIntArray564;
	static d aD565;
	protected int[] femaleWornModelIds;
	protected short[] modifiedModelColors;
	protected int[] anIntArray568 = new int[2];
	static int anInt569;
	
	public static void method402(int i) {
		aD565 = null;
		if (i != 0) {
			aLong562 = 8L;
		}
	}
	
	static final void method403(int i) {
		anInt569++;
		if (Node_Sub38_Sub8.anInt10163 != i) {
			Class320_Sub23.aClass123_8432.method1513(i ^ ~0x6e0f);
			Class375.method4115((byte) -97);
			Class297.method3479((byte) -119);
		}
	}
	
	TemporaryItemDefinition(ItemDefinitions itemdefinition) {
		anIntArray564 = new int[2];
		maleWornModelIds = new int[3];
		femaleWornModelIds = new int[3];
		maleWornModelIds[0] = itemdefinition.maleWornModelId1;
		maleWornModelIds[1] = itemdefinition.maleWornModelId2;
		maleWornModelIds[2] = itemdefinition.maleWornModelId3;
		femaleWornModelIds[0] = itemdefinition.femaleWornModelId1;
		femaleWornModelIds[1] = itemdefinition.femaleWornModelId2;
		femaleWornModelIds[2] = itemdefinition.femaleWornModelId3;
		anIntArray564[0] = itemdefinition.anInt1913;
		anIntArray564[1] = itemdefinition.anInt1888;
		anIntArray568[0] = itemdefinition.anInt1863;
		anIntArray568[1] = itemdefinition.anInt1897;
		if (itemdefinition.aShortArray1865 != null) {
			modifiedModelColors = new short[itemdefinition.aShortArray1865.length];
			Class311.method3606(itemdefinition.aShortArray1865, 0, modifiedModelColors, 0, modifiedModelColors.length);
		}
		if (itemdefinition.modifiedTextureColors != null) {
			modifiedTextureColors = new short[itemdefinition.modifiedTextureColors.length];
			Class311.method3606(itemdefinition.modifiedTextureColors, 0, modifiedTextureColors, 0, modifiedTextureColors.length);
		}
	}
}
