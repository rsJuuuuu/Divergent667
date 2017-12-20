/* Node_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub9_Sub3 extends Node_Sub9
{
	private Class312 aClass312_9721 = new Class312();
	private Class312 aClass312_9722 = new Class312();
	private int anInt9723 = 0;
	private int anInt9724 = -1;
	
	final int method2428() {
		return 0;
	}
	
	final synchronized void method2427(int[] is, int i, int i_0_) {
		do {
			if (anInt9724 < 0) {
				method2516(is, i, i_0_);
				break;
			}
			if (anInt9723 + i_0_ < anInt9724) {
				anInt9723 += i_0_;
				method2516(is, i, i_0_);
				break;
			}
			int i_1_ = anInt9724 - anInt9723;
			method2516(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			anInt9723 += i_1_;
			method2518();
			Node_Sub1 node_sub1 = (Node_Sub1) aClass312_9722.method3613(65280);
			synchronized (node_sub1) {
				int i_2_ = node_sub1.method2166(this);
				if (i_2_ < 0) {
					node_sub1.anInt6931 = 0;
					method2519(node_sub1);
				} else {
					node_sub1.anInt6931 = i_2_;
					method2517(node_sub1.aNode2800, node_sub1);
				}
			}
		} while (i_0_ != 0);
	}
	
	final synchronized int method2512() {
		return aClass312_9721.method3615(-128);
	}
	
	final synchronized void method2513(Node_Sub9 node_sub9) {
		aClass312_9721.method3611(node_sub9, -91);
	}
	
	final synchronized void method2514(Node_Sub9 node_sub9) {
		node_sub9.method2160((byte) 50);
	}
	
	private final void method2515(int i) {
		for (Node_Sub9 node_sub9 = (Node_Sub9) aClass312_9721.method3613(65280); node_sub9 != null; node_sub9 = (Node_Sub9) aClass312_9721.method3620(16776960))
			node_sub9.method2426(i);
	}
	
	private final void method2516(int[] is, int i, int i_3_) {
		for (Node_Sub9 node_sub9 = (Node_Sub9) aClass312_9721.method3613(65280); node_sub9 != null; node_sub9 = (Node_Sub9) aClass312_9721.method3620(16776960))
			node_sub9.method2430(is, i, i_3_);
	}
	
	final Node_Sub9 method2431() {
		return (Node_Sub9) aClass312_9721.method3620(16776960);
	}
	
	private final void method2517(Node node, Node_Sub1 node_sub1) {
		for (/**/; node != aClass312_9722.aNode3958 && ((Node_Sub1) node).anInt6931 <= node_sub1.anInt6931; node = node.aNode2800) {
			/* empty */
		}
		BufferedStream.method2205(-59, node, node_sub1);
		anInt9724 = ((Node_Sub1) aClass312_9722.aNode3958.aNode2800).anInt6931;
	}
	
	final Node_Sub9 method2429() {
		return (Node_Sub9) aClass312_9721.method3613(65280);
	}
	
	final synchronized void method2426(int i) {
		do {
			if (anInt9724 < 0) {
				method2515(i);
				break;
			}
			if (anInt9723 + i < anInt9724) {
				anInt9723 += i;
				method2515(i);
				break;
			}
			int i_4_ = anInt9724 - anInt9723;
			method2515(i_4_);
			i -= i_4_;
			anInt9723 += i_4_;
			method2518();
			Node_Sub1 node_sub1 = (Node_Sub1) aClass312_9722.method3613(65280);
			synchronized (node_sub1) {
				int i_5_ = node_sub1.method2166(this);
				if (i_5_ < 0) {
					node_sub1.anInt6931 = 0;
					method2519(node_sub1);
				} else {
					node_sub1.anInt6931 = i_5_;
					method2517(node_sub1.aNode2800, node_sub1);
				}
			}
		} while (i != 0);
	}
	
	private final void method2518() {
		if (anInt9723 > 0) {
			for (Node_Sub1 node_sub1 = (Node_Sub1) aClass312_9722.method3613(65280); node_sub1 != null; node_sub1 = (Node_Sub1) aClass312_9722.method3620(16776960))
				node_sub1.anInt6931 -= anInt9723;
			anInt9724 -= anInt9723;
			anInt9723 = 0;
		}
	}
	
	private final void method2519(Node_Sub1 node_sub1) {
		node_sub1.method2160((byte) 90);
		node_sub1.method2165();
		Node node = aClass312_9722.aNode3958.aNode2800;
		if (node == aClass312_9722.aNode3958) {
			anInt9724 = -1;
		} else {
			anInt9724 = ((Node_Sub1) node).anInt6931;
		}
	}
}
