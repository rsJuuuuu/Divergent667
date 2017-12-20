package com.rs.cache.loaders;

import com.rs.cache.Cache;
import com.rs.io.InputStream;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public final class ConfigDefinitions {

	private static final ConcurrentHashMap<Integer, ConfigDefinitions> configDefs = new ConcurrentHashMap<>();

	public int configId;
	public int anInt2021;
	public int anInt2024;

	public static void main(String[] args) throws IOException {
		Cache.init();
		int SEARCHING_FILE_FOR_CONFIG = 1438;
		for (int i = 0; i < 10000; i++) {
			ConfigDefinitions cd = getConfigDefinitions(i);
			if (cd.configId == SEARCHING_FILE_FOR_CONFIG)
				System.out.println("file: " + i + ", " + cd.anInt2021 + ", "
						+ cd.anInt2024);
		}
	}

	public static ConfigDefinitions getConfigDefinitions(int id) {
		ConfigDefinitions script = configDefs.get(id);
		if (script != null)
			return script;
		byte[] data = Cache.STORE.getIndexes()[22].getFile(id >>> 1416501898,
				id & 0x3ff);
		script = new ConfigDefinitions();
		if (data != null)
			script.readValueLoop(new InputStream(data));
		configDefs.put(id, script);
		return script;

	}

	private void readValueLoop(InputStream stream) {
		for (;;) {
			int opcode = stream.readUnsignedByte();
			if (opcode == 0)
				break;
			readValues(stream, opcode);
		}
	}

	private void readValues(InputStream stream, int opcode) {
		if (opcode == 1) {
			configId = stream.readUnsignedShort();
			anInt2024 = stream.readUnsignedByte();
			anInt2021 = stream.readUnsignedByte();
		}
	}

	private ConfigDefinitions() {

	}
}
