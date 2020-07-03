package com.rs.cache.loaders;

public class IComponentSettings {
	public int settings;
	public int anInt4602;

	public boolean method1879(boolean arg0) {
        return (~((0x2eaa42 & settings) >> 21)) != -1;
    }

	public boolean unlockedSlot(int slot, byte arg1) {
        return (~(settings >> 1 + slot & 0x1)) != -1;
    }

	public boolean method1881(int arg0) {
        return (~((0x55f65fb5 & settings) >> 30)) != -1;
    }

	public boolean method1882(int arg0) {
        return (~((settings & 0x1fa3c81f) >> 28)) != -1;
    }

	public boolean method1883(byte arg0) {
        return (~(0x1 & settings >> 31)) != -1;
    }

	public boolean method1884(int arg0) {
        return (~(0x1 & settings)) != -1;
    }

	public boolean method1885(byte arg0) {
        return (~(0x1 & settings >> 22)) != -1;
    }

	public int method1887(int arg0) {
        return (settings & 0x1f873d) >> 18;
    }

	public int method1888(byte arg0) {
        return 0x7f & settings >> 11;
    }

	public IComponentSettings(int arg0, int arg1) {
		settings = arg0;
		anInt4602 = arg1;
	}
}
