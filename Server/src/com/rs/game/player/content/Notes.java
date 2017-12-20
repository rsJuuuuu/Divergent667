package com.rs.game.player.content;

import com.rs.game.player.Player;

import java.util.LinkedList;
import java.util.List;

public class Notes {

	public static class Note {

		private StringBuilder builder;
		private int value;

		public Note(StringBuilder builder, int color) {
			this.builder = builder;
			this.value = color;
		}

		public StringBuilder getBuilder() {
			return builder;
		}

		public int getValue() {
			return value;
		}
	}

	private static List<Note> notes = new LinkedList<>();

	public Notes() {
	}

	public static void addNote(Player player, StringBuilder note) {
		if (note.toString().length() > 50) {
			player.getPackets().sendGameMessage(
					"You can only enter notes up to 50 characters!", true);
			return;
		} else if (notes.size() <= 30) {
			notes.add(new Note(note, 1));
		} else {
			player.getPackets().sendGameMessage("You may only have 30 notes",
					true);
			return;
		}
		int noteId = notes.size() - 1;
		player.getPackets().sendConfig(1439, noteId);
        player.getTemporaryAttributes().put("selectedNote", noteId);

	}

	public static int intColorValue(int color, int noteId) {
		return (int) (Math.pow(4, noteId) * color);
	}

	public static int getPrimaryColor() {
		int color = 0;
		for (int i = 0; i < 15; i++) {
			if (notes.size() > (i))
				color += intColorValue(notes.get(i).getValue(), i);
		}
		return color;
	}

	public static int getSecondaryColor() {
		int color = 0;
		for (int i = 0; i < 15; i++) {
			if (notes.size() > (i + 16))
				color += intColorValue(notes.get(i + 16).getValue(), i);
		}
		return color;
	}

	public static void refresh(Player player, boolean sendStartConfigs) {
		for (int i = 0; i < 30; i++) {
			player.getPackets().sendGlobalString(
					149 + i,
					i < notes.size() ? notes.get(i).getBuilder().toString()
							: "");
		}
		if (sendStartConfigs) {
			for (int i = 1430; i < 1450; i++)
				player.getPackets().sendConfig(i, i);
		}
		player.getPackets().sendConfig(1440, getPrimaryColor());
		player.getPackets().sendConfig(1441, getSecondaryColor());
	}

	public static void sendUnlockNotes(Player player) {
		player.getPackets().sendIComponentSettings(34, 9, 0, 30, 2621470);
		for (int i = 10; i < 16; i++)
			player.getPackets().sendHideIComponent(34, i, true);
		player.getPackets().sendHideIComponent(34, 3, true);
		player.getPackets().sendHideIComponent(34, 44, false);
		player.getPackets().sendConfig(1439, -1);
		refresh(player, true);
	}

}
