package com.rs.game.player.dialogues;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.player.Player;
import com.sun.istack.internal.Nullable;

import java.security.InvalidParameterException;
import java.util.LinkedList;

/**
 * @author Peng
 */
public abstract class Dialogue {

    protected Player player;
    protected byte stage = -1;

    public Dialogue() {

    }

    private LinkedList<Runnable> actionQueue = new LinkedList<>();

    public Object[] parameters;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public abstract void start();

    public abstract void run(int interfaceId, int componentId);

    public abstract void finish();

    protected final void end() {
        player.getDialogueManager().finishDialogue();
    }

    private static final short OPTIONS_START = 236;
    private static final short TEXT_INFO_START = 210;
    private static final short TEXT_CHAT_START = 241;

    protected static final String DEFAULT_OPTIONS_TITLE = "Select an Option";
    protected static final byte NO_EMOTE = -1;

    protected static final int OPTION_1 = 1, OPTION_2 = 2, OPTION_3 = 3, OPTION_4 = 4, OPTION_5 = 5;

    private static final short OPTIONS_2 = 236;
    private static final short OPTIONS_4 = 237;
    private static final short OPTIONS_5 = 238;
    private static final short LARGE_OPTIONS_3 = 231;
    private static final byte NOTHING = -1;
    private static final byte PLAYER = 0;
    private static final byte NPC = 1;
    private static final byte ITEM = 2;

    private short getInterfaceId(int numberComponents, int startIndex) {
        if (startIndex == OPTIONS_START) return (getOptionsInterfaceId(numberComponents));
        else return (short) (startIndex + numberComponents - 1);

    }

    private short getOptionsInterfaceId(int paramLength) {
        switch (paramLength) {
            case 6:
                return OPTIONS_5;
            case 5:
                return OPTIONS_4;
            case 4:
                return LARGE_OPTIONS_3;
            case 3:
                return OPTIONS_2;
            default:
                return OPTIONS_5;
        }
    }

    /**
     * Get the start index of the components to enter data into
     *
     * @param interStartId interface groups starting index
     * @return start index
     */
    private static int getComponentStartIndex(short interStartId, int interfaceId) {
        switch (interStartId) {
            case TEXT_CHAT_START:
                return 3;
            case TEXT_INFO_START:
                return 1;
            default:
                if (interfaceId == LARGE_OPTIONS_3) return 1;
                return 0;
        }
    }

    /**
     * Send some text to an interface
     *
     * @param interfaceId    interfaceId
     * @param componentStart the start index of the components to put text in
     * @param hasTitle       does this interface have a title
     * @param title          title of the interface
     * @param values         the lines
     */
    private void sendDialogueText(int interfaceId, int componentStart, boolean hasTitle, @Nullable String title,
                                  String... values) {
        int compId = 0;
        if (hasTitle) {
            player.getPackets().sendIComponentText(interfaceId, componentStart + compId, title == null ? "" : title);
        }
        for (compId = 0; compId < values.length - (hasTitle ? 1 : 0); compId++) {
            if (values[compId] == null) continue;
            player.getPackets().sendIComponentText(interfaceId,
                    componentStart + compId + (hasTitle ? 1 : 0), values[compId]);
        }
    }

    public int getFixedComponentId(int interfaceId, int componentId) {
        if (interfaceId == LARGE_OPTIONS_3) return componentId - 1;
        else return componentId;
    }

    /**
     * Get the text as lines as per the max line length
     *
     * @param message       message to be wrapped
     * @param maxLineLength max length of a single line in chars
     * @return wrapped text
     */
    private String[] wrapText(String message, int maxLineLength) {
        String[] lines = new String[5];
        String temp;
        for (int i = 0; i < lines.length; i++) {
            if (message.length() < maxLineLength) {
                lines[i] = message;
                break;
            }
            temp = message.substring(0, maxLineLength);
            int lastIndex = temp.lastIndexOf(" ");

            lines[i] = temp.substring(0, lastIndex == 0 ? maxLineLength : lastIndex);
            message = message.substring(lines[i].length(), message.length());
        }
        return lines;
    }

    /**
     * Send a dialogue with title and message
     *
     * @param title   the title
     * @param message the message
     */
    protected void sendChatDialogue(String title, String message) {
        String[] lines = wrapText(message, 45);
        int length = getActualArrayLength(lines);
        short interfaceId = getInterfaceId(length, TEXT_CHAT_START);
        sendDialogueText(interfaceId, getComponentStartIndex(TEXT_CHAT_START, interfaceId), true, title, lines);
    }

    /**
     * Send an options dialogue with automatic options size
     *
     * @param params [title, options...]
     */
    protected boolean sendOptions(String... params) {
        if (params.length > 6) throw new InvalidParameterException("Max options is 5");
        short interfaceId = getOptionsInterfaceId(params.length);
        int componentStart = getComponentStartIndex(OPTIONS_START, interfaceId);
        player.getInterfaceManager().sendChatBoxInterface(interfaceId);
        for (int childOptionId = 0; childOptionId < params.length; childOptionId++) {
            player.getPackets().sendIComponentText(interfaceId, componentStart + childOptionId, params[childOptionId]);
        }
        return true;
    }

    /**
     * Send a dialogue with just text
     *
     * @param message the text
     */
    protected void sendText(String message) {
        sendEntityDialogue(NOTHING, null, message, -1, -1);
    }

    /**
     * Send a npc dialogue
     *
     * @param title       title
     * @param message     message
     * @param entityId    entityId
     * @param animationId chathead anim id
     */
    protected void sendNpcDialogue(String title, String message, int entityId, int animationId) {
        sendEntityDialogue(NPC, title, message, entityId, animationId);
    }

    /**
     * Send npc dialogue with npc name as title
     */
    protected void sendNpcDialogue(String message, int entityId, int animationId) {
        sendEntityDialogue(NPC, NPCDefinitions.getNPCDefinitions(entityId).getName(), message, entityId, animationId);
    }

    /**
     * Send a npc dialogue
     *
     * @param title       title
     * @param message     message
     * @param entityId    entityId
     * @param animationId chathead anim id
     */
    protected void sendItemDialogue(String title, String message, int entityId, int animationId) {
        sendEntityDialogue(ITEM, title, message, entityId, animationId);
    }

    /**
     * Send a player dialogue
     *
     * @param title       title
     * @param message     message
     * @param playerId    the players id in the world
     * @param animationId chathead anim id
     */
    protected void sendPlayerDialogue(String title, String message, int playerId, int animationId) {
        sendEntityDialogue(PLAYER, title, message, playerId, animationId);
    }

    /**
     * Send player dialogue with player name as title
     */
    protected void sendPlayerDialogue(String message, int animationId) {
        sendEntityDialogue(PLAYER, player.getDisplayName(), message, player.getIndex(), animationId);
    }

    /**
     * Send entity dialogue with automatic line wrapping
     *
     * @param type        dialogue type
     * @param title       title
     * @param entityId    entity id if entity dialogue
     * @param animationId animation id if present
     * @param message     the message
     */
    private void sendEntityDialogue(int type, String title, String message, int entityId, int animationId) {
        String[] lines = wrapText(message, 45);
        int length = getActualArrayLength(lines);
        short interId = getInterfaceId(length, type == NOTHING ? TEXT_INFO_START : TEXT_CHAT_START);
        player.getInterfaceManager().sendChatBoxInterface(interId);
        sendDialogueText(interId, getComponentStartIndex(type == NOTHING ? TEXT_INFO_START : TEXT_CHAT_START, interId),
                type != NOTHING, title, lines);
        if (type == PLAYER || type == NPC) {
            player.getPackets().sendEntityOnIComponent(type == PLAYER, entityId, interId, 2);
            if (animationId != -1) player.getPackets().sendIComponentAnimation(animationId, interId, 2);
        } else if (type == ITEM) player.getPackets().sendItemOnIComponent(interId, 2, entityId, animationId);
    }

    /**
     * Get the not null length of the array
     *
     * @param array array being checked
     * @return the length
     */
    private int getActualArrayLength(String[] array) {
        int index = 0;
        while (index < array.length && array[index] != null) index++;
        return index;
    }

    public boolean processQueue() {
        if (actionQueue.isEmpty()) return false;
        actionQueue.getFirst().run();
        actionQueue.removeFirst();
        return true;
    }

    /**
     * Add this action to que
     */
    protected void queueMessage(Runnable event) {
        actionQueue.add(event);
    }
}
