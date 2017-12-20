/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class22 {
    static Class22 aClass22_359 = new Class22("This is the " + Settings.SERVER_NAME
                                              + " developer console. To close, press the `, \u00b2 or \u00a7 keys on "
                                              + "your keyboard.",
            "Das ist die Entwicklerkonsole. Zum Schlie\u00dfen, " + "die Tasten `, \u00b2 or \u00a7 dr\u00fccken.",
            "Ceci est la console de d\u00e9veloppement. Pour la fermer, appuyez sur les touches `, \u00b2 ou "
            + "\u00a7.",
            "Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione `, \u00b2 ou " + "\u00a7.");
    static int anInt360;
    static int anInt361;
    static int anInt362;
    private String[] aStringArray363;
    static int anInt364;
    static Class22 aClass22_365 = new Class22("There was an error executing the command.",
            "Es gab einen Fehler beim " + "Ausf\u00fchren des " + "Befehls.",
            "Une erreur " + "s'est " + "produite " + "lors de "
            + "l'ex\u00e9cution de la commande.", "Houve um erro quando o comando foi executado.");
    static Class22 aClass22_366 = new Class22("Unknown developer command: ", "Unbekannter Befehl: ",
            "Commande " + "inconnue : ", "Comando desconhecido: ");
    static Class22 aClass22_367 = new Class22("Cancel", "Abbrechen", "Annuler", "Cancelar");
    static Class22 aClass22_368;
    static Class22 aClass22_369;
    static Class22 aClass22_370;
    static Class22 aClass22_371;
    static Class22 aClass22_372;
    static Class22 aClass22_373;
    static Class22 aClass22_374;
    static Class22 loading_translation;
    static Class22 aClass22_376;
    static Class22 aClass22_377;
    static Class22 aClass22_378;
    static Class22 aClass22_379;
    static Class22 aClass22_380;
    static Class22 aClass22_381;
    static Class22 aClass22_382;
    static Class22 aClass22_383;
    static Class22 aClass22_384;
    static Class22 aClass22_385;
    static Class22 aClass22_386;
    static Class22 aClass22_387;
    static Class22 aClass22_388;
    static Class22 aClass22_389;
    static Class22 aClass22_390;
    static Class22 aClass22_391;
    static Class22 aClass22_392;
    static Class22 aClass22_393;
    static Class22 aClass22_394;
    static Class22 aClass22_395;
    static Class22 aClass22_396;
    static Class22 aClass22_397;
    static Class22 aClass22_398;
    static Class22 aClass22_399;
    static Class22 aClass22_400;
    static Class22 aClass22_401;
    static Class22 aClass22_402;
    static Class22 aClass22_403;
    static Class22 aClass22_404;
    static Class22 aClass22_405;
    static Class22 aClass22_406;
    static Class22 aClass22_407;
    static Class22 aClass22_408;
    static Class22 aClass22_409;
    static Class22 aClass22_410;
    static Class22 aClass22_411;
    static Class22 aClass22_412;
    static Class22 aClass22_413;
    static Class22 aClass22_414;
    static Class22 aClass22_415;
    static Class22 aClass22_416;
    static Class22 aClass22_417;
    static Class22 aClass22_418;
    static Class22 aClass22_419;
    static Class22 aClass22_420;
    static Class22 aClass22_421;
    static Class22 aClass22_422;
    static Class22 aClass22_423;
    static Class22 aClass22_424;
    static Class22 aClass22_425;
    static Class22 aClass22_426;
    static int anInt427;
    static int anInt428;
    static int anInt429;
    static int anInt430;
    static int anInt431;
    static int anInt432;

    final String method297(int i_0_) {
        return aStringArray363[i_0_];
    }

    static final Node_Sub13 createWalkPacket(int stepsCount, int type) {
        if (stepsCount > 25) stepsCount = 25;
        Node_Sub13 node_sub13 = null;
        if (type == 0) {
            node_sub13 = FloatBuffer.method2250(-386, Class267.aClass318_3445,
                    Class218.aClass123_2566.anIsaacCipher1571);
            node_sub13.aPacket7113.writeByte(5 + stepsCount * 2);
            Node_Sub36.anInt7423++;
        }
        if ((~type) == -2) {
            node_sub13 = FloatBuffer.method2250(-386, Class338.aClass318_4198,
                    Class218.aClass123_2566.anIsaacCipher1571);
            node_sub13.aPacket7113.writeByte(13 + 5 + stepsCount * 2);
            Class189.anInt2307++;
        }
        //walk
        node_sub13.aPacket7113.writeShortLE128(Node_Sub53.gameSceneBaseX);
        node_sub13.aPacket7113.writeShortLE128(Class320_Sub4.gameSceneBaseY);
        node_sub13.aPacket7113.writeByte(!Class175.aClass291_2100.method3450(99, 82) ? 0 : 1);
        for (int c = stepsCount - 1; c >= 0; c--) {
            node_sub13.aPacket7113.writeByte(Node_Sub39.routeFinderXArray[c]);
            node_sub13.aPacket7113.writeByte(Class339_Sub6.routeFinderYArray[c]);
        }
        Class144.aBoolean1791 = false;
        if (stepsCount > 0) {
            Class359.anInt4467 = Node_Sub39.routeFinderXArray[stepsCount - 1];
            Node_Sub15_Sub4.anInt9798 = Class339_Sub6.routeFinderYArray[stepsCount - 1];
        }
        NpcDefinition.method3002((byte) 97);
        return node_sub13;
    }

    public final String toString() {
        anInt360++;
        throw new IllegalStateException();
    }

    public static void method299(boolean bool) {
        aClass22_385 = null;
        aClass22_389 = null;
        aClass22_373 = null;
        aClass22_423 = null;
        aClass22_391 = null;
        aClass22_395 = null;
        aClass22_398 = null;
        aClass22_419 = null;
        aClass22_421 = null;
        aClass22_390 = null;
        aClass22_370 = null;
        aClass22_392 = null;
        aClass22_413 = null;
        aClass22_420 = null;
        aClass22_400 = null;
        aClass22_417 = null;
        aClass22_387 = null;
        aClass22_383 = null;
        aClass22_386 = null;
        aClass22_403 = null;
        aClass22_408 = null;
        aClass22_407 = null;
        aClass22_388 = null;
        aClass22_405 = null;
        aClass22_368 = null;
        aClass22_399 = null;
        aClass22_410 = null;
        aClass22_401 = null;
        aClass22_366 = null;
        aClass22_374 = null;
        aClass22_380 = null;
        aClass22_382 = null;
        aClass22_402 = null;
        aClass22_415 = null;
        aClass22_425 = null;
        aClass22_406 = null;
        aClass22_411 = null;
        aClass22_424 = null;
        aClass22_412 = null;
        aClass22_378 = null;
        aClass22_409 = null;
        aClass22_397 = null;
        aClass22_367 = null;
        aClass22_359 = null;
        aClass22_396 = null;
        aClass22_414 = null;
        loading_translation = null;
        aClass22_376 = null;
        aClass22_426 = null;
        aClass22_369 = null;
        aClass22_422 = null;
        aClass22_381 = null;
        aClass22_377 = null;
        aClass22_365 = null;
        aClass22_371 = null;
        aClass22_379 = null;
        aClass22_393 = null;
        aClass22_418 = null;
        aClass22_372 = null;
        aClass22_404 = null;
        if (bool == false) {
            aClass22_416 = null;
            aClass22_384 = null;
            aClass22_394 = null;
        }
    }

    static final void method300(int i, boolean bool, boolean bool_3_) {
        if (bool != true) {
            aClass22_415 = null;
        }
        Class356.method4024(bool, bool_3_, loading_translation.method297(Class35.language), i);
        anInt361++;
    }

    private Class22(String string, String string_4_, String string_5_, String string_6_) {
        aStringArray363 = new String[]{string, string_4_, string_5_, string_6_};
    }

    static {
        new Class22("#Player", "#Spieler", "#Joueur", "#Jogador");
        aClass22_368 = new Class22("Members object", "Gegenstand f\u00fcr Mitglieder", "Objet d'abonn\u00e9s",
                "Objeto para membros");
        new Class22("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um "
                                                                      + "diesen Gegenstand zu benutzen.",
                "Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
                "Acesse um servidor para " + "membros para usar este " + "objeto.");
        new Class22("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank "
                                                                           + "entsprechend eingetauscht werden.",
                "\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.",
                "V\u00e1 a " + "qualquer " + "banco " + "para " + "trocar " + "esta nota" + " pelo " + "objeto "
                + "equivalente" + ".");
        aClass22_369 = new Class22("Discard", "Ablegen", "Jeter", "Descartar");
        aClass22_370 = new Class22("Discard", "Ablegen", "Jeter", "Descartar");
        aClass22_371 = new Class22("Take", "Nehmen", "Prendre", "Pegar");
        aClass22_372 = new Class22("Drop", "Fallen lassen", "Poser", "Largar");
        new Class22("Ok", "Okay", "OK", "Ok");
        new Class22("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar");
        aClass22_373 = new Class22("Continue", "Weiter", "Continuer", "Continuar");
        new Class22("Invalid player name.", "Unzul\u00e4ssiger Charaktername!", "Nom de joueur incorrect.",
                "Nome de " + "jogador" + " inv\u00e1lido.");
        new Class22("You can't report yourself!", "Du kannst dich nicht selbst melden!",
                "Vous ne pouvez pas vous " + "signaler vous-m\u00eame " + "!",
                "Voc\u00ea n\u00e3o " + "pode denunciar a si" + " pr\u00f3prio!");
        new Class22("You already sent an abuse report under 60 secs ago! Do not abuse this system!",
                "Du hast bereits" + " vor weniger " + "als 60 " + "Sekunden einen" + " Regelversto\u00df gemeldet!",
                "Vous avez d\u00e9j\u00e0 signal\u00e9 un abus il y a moins d'une "
                + "minute ! N'abusez pas du syst\u00e8me !",
                "Voc\u00ea j\u00e1 " + "enviou uma " + "den\u00fancia de " + "abuso h\u00e1 menos" + " de um minuto. "
                + "N\u00e3o abuse " + "deste sistema!");
        new Class22(null, "Dieses System darf nicht missbraucht werden!", null, null);
        new Class22(
                "You cannot report that person for Staff Impersonation, they are " + Settings.SERVER_NAME + " Staff.",
                "Diese Person ist ein " + Settings.SERVER_NAME + "-Mitarbeiter!",
                "Cette personne est un membre du personnel de " + Settings.SERVER_NAME
                + ", vous ne pouvez pas la signaler pour abus d'identit\u00e9.",
                "Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por membro da equipe "
                + Settings.SERVER_NAME + ", pois ela faz parte da equipe.");
        new Class22(
                "You can spot a " + Settings.SERVER_NAME + " moderator by the gold crown next to their name.",
                "" + Settings.SERVER_NAME + "-Mitarbeiter haben eine goldene Krone neben ihrem Namen.",
                "Vous pouvez reconna\u00eetre les mod\u00e9rateurs " + Settings.SERVER_NAME
                + " \u00e0 la couronne dor\u00e9e en regard de leur nom.",
                "Os moderadores da " + Settings.SERVER_NAME + " s\u00e3o identificados por uma coroa "
                + "dourada pr\u00f3xima ao \u007fnome.");
        new Class22("You can report that person under a different rule.",
                "Diese Person kann bez\u00fcglich einer " + "anderen Regel gemeldet werden.",
                "Vous " + "pouvez " + "signaler cette " + "personne pour une " + "autre infraction aux"
                + " r\u00e8gles.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
        new Class22("Thank-you, your abuse report has been received.",
                "Vielen Dank, deine Meldung ist bei uns " + "eingegangen.",
                "Merci, nous avons bien " + "re\u00e7u votre rapport " + "d'abus.",
                "Obrigado. Sua " + "den\u00fancia" + " de abuso foi" + " recebida.");
        new Class22("Unable to send abuse report - system busy.",
                "Meldung konnte nicht gesendet werden - Systeme " + "\u00fcberlastet", "Impossible de signaler un abus"
                                                                                       + " - Erreur syst\u00e8me",
                "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
        new Class22("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect", "Nome inv\u00e1lido");
        new Class22("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, "
                                                                           + "um diesen Gegenstand zu benutzen.",
                "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
                "Acesse um " + "servidor para " + "membros para " + "usar este " + "objeto.");
        new Class22("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt "
                                                                                + "ein, um damit zu interagieren.",
                "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.",
                "Para interagir, " + "acesse um " + "servidor para " + "membros.");
        new Class22("Nothing interesting happens.", "Nichts Interessantes passiert.",
                "Il ne se passe rien " + "d'int\u00e9ressant.", "Nada " + "de " + "interessante acontece.");
        new Class22("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.",
                "Voc\u00ea" + " n\u00e3o consegue alcan\u00e7ar isso.");
        new Class22("Invalid teleport!", "Unzul\u00e4ssiger Teleport!", "T\u00e9l\u00e9portation non valide !",
                "Teleporte inv\u00e1lido!");
        new Class22("To go here you must login to a members' server.",
                "Du musst auf einer Mitglieder-Welt sein, um " + "dort hinzukommen.",
                "Vous devez vous " + "connecter \u00e0 un " + "serveur " + "d'abonn\u00e9s pour " + "aller \u00e0 cet "
                + "endroit.",
                "Para " + "entrar " + "aqui, " + "acesse " + "um " + "servidor " + "para " + "membros" + ".");
        new Class22("Unable to add friend - system busy.",
                "Der Freund konnte nicht hinzugef\u00fcgt werden, das " + "System ist derzeit ausgelastet.",
                "Impossible d'ajouter " + "un ami - " + "syst\u00e8me "
                + "occup\u00e9.", "N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
        new Class22("Unable to add friend - unknown player.",
                "Spieler konnte nicht hinzugef\u00fcgt werden - Spieler" + " unbekannt.",
                "Impossible d'ajouter l'ami - joueur " + "inconnu.",
                "N\u00e3o foi " + "poss\u00edvel " + "adicionar um amigo - " + "jogador desconhecido" + ".");
        new Class22("Unable to add name - system busy.",
                "Der Name konnte nicht hinzugef\u00fcgt werden, das System " + "ist derzeit ausgelastet.",
                "Impossible d'ajouter un nom - " + "syst\u00e8me occup\u00e9.",
                "N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 " + "ocupado.");
        new Class22("Unable to add name - unknown player.",
                "Name konnte nicht hinzugef\u00fcgt werden - Spieler " + "unbekannt.",
                "Impossible d'ajouter le nom - joueur " + "inconnu.",
                "N\u00e3o foi poss\u00edvel " + "adicionar um nome - " + "jogador desconhecido.");
        aClass22_374 = new Class22("Your friends list is full (200 names maximum)",
                "Deine Freunde-Liste ist voll, du" + " hast das Maximum von 200 " + "erreicht.",
                "Votre liste d'amis" + " est pleine (200" + " noms maximum)" + ".",
                "Sua lista " + "de amigos" + " est\u00e1 cheia. O limite \u00e9 200.");
        new Class22("Unable to delete friend - system busy.",
                "Der Freund konnte nicht entfernt werden, das System " + "ist derzeit ausgelastet.",
                "Impossible de supprimer " + "un ami - syst\u00e8me "
                + "occup\u00e9.", "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
        new Class22("Unable to delete name - system busy.", "Name konnte nicht gel\u00f6scht werden - Systemfehler.",
                "Impossible d'effacer le nom - syst\u00e8me occup\u00e9.",
                "N\u00e3o foi poss\u00edvel deletar o nome " + "- sistema ocupado.");
        new Class22("Unable to send message - system busy.",
                "Deine Nachricht konnte nicht verschickt werden, das " + "System ist derzeit ausgelastet.",
                "Impossible " + "d'envoyer un " + "message - " + "syst\u00e8me "
                + "occup\u00e9.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.");
        new Class22("Unable to send message - player unavailable.",
                "Deine Nachricht konnte nicht verschickt werden," + "",
                "Impossible d'envoyer un message - joueur " + "indisponible.",
                "N\u00e3o foi " + "poss\u00edvel enviar a" + " mensagem. O jogador " + "n\u00e3o est\u00e1 "
                + "dispon\u00edvel.");
        new Class22(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null);
        new Class22("Unable to send message - player not on your friends list.",
                "Nachricht kann nicht geschickt " + "werden,",
                "Impossible d'envoyer un" + " message - joueur non" + " inclus dans votre " + "liste d'amis.",
                "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 na sua"
                + " lista de amigos.");
        new Class22(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        new Class22("You appear to be telling someone your password - please don't!",
                "Willst du jemandem dein " + "Passwort verraten? Das darfst" + " du nicht! Falls das",
                "Il " + "semble que " + "vous "
                + "r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !", "Parece que "
                                                                                                         + "voc\u00ea"
                                                                                                         + " est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o fa\u00e7a isso!");
        new Class22("If you are not, please change your password to something more obscure!",
                "nicht der Fall ist, " + "\u00e4ndere dein " + "Passwort zu einem " + "ungew\u00f6hnlicheren"
                + " Begriff!", "Si ce " + "n'est " + "pas le" + " cas, "
                               + "remplacez votre mot de passe par une formule moins \u00e9vidente !",
                "Caso n\u00e3o" + " esteja, " + "altere sua " + "senha para " + "algo mais " + "obscuro!");
        new Class22("Unable to send message - set your display name first by logging into the game.",
                "Nachricht " + "konnte nicht " + "gesendet " + "werden.  " + "Bitte richte " + "erst deinen "
                + "Charakternamen " + "ein, ",
                "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au " + "jeu.",
                "N\u00e3o \u00e9 poss\u00edvel enviar a mensagem. Defina um nome de personagem antes, fazendo login no"
                + " jogo.");
        new Class22(null, "indem du dich ins Spiel einloggst.", null, null);
        new Class22("For that rule you can only report players who have spoken or traded recently.",
                "Mit dieser " + "Option " + "k\u00f6nnen " + "nur Spieler " + "gemeldet "
                + "werden,", "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.",
                "Para essa" + " regra,"
                + " voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new Class22(null, "die k\u00fcrzlich gesprochen oder gehandelt haben.", null, null);
        new Class22("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den "
                                                                            + "Privatsph\u00e4ren-Modus aktiviert.",
                "Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.",
                "O jogador est\u00e1 offline ou est\u00e1" + " com o modo de privacidade ativado.");
        new Class22("You cannot send a quick chat message to a player on this world at this time.",
                "Einem Spieler " + "auf dieser Welt" + " k\u00f6nnen " + "derzeit keine " + "Direktchat-Nachrichten",
                "Impossible d'envoyer un message rapide \u00e0 un joueur de ce serveur " + "\u00e0 l'heure actuelle.",
                "Voc\u00ea n\u00e3o pode enviar uma " + "mensagem de papo r\u00e1pido para um "
                + "jogador neste mundo neste momento.");
        new Class22(null, "geschickt werden.", null, null);
        new Class22("This player is on a quick chat world and cannot receive your message.",
                "Der Spieler kann auf " + "einer Direktchat-Welt " + "keine Nachrichten " + "empfangen.",
                "Ce " + "joueur" + " est " + "sur un"
                + " serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.",
                "Este jogador n\u00e3o " + "pode receber sua " + "mensagem porque " + "est\u00e1 em um "
                + "mundo de papo " + "r\u00e1pido.");
        new Class22("Chat disabled", "Deaktiviert", "Messagerie d\u00e9sactiv\u00e9e", "Bate-papo desativado");
        new Class22("friends_chat", "friends_chat", "friends_chat", "friends_chat");
        new Class22("You are not currently in a friends chat channel.",
                "Du befindest dich derzeit nicht in einem " + "Freundes-Chatraum.",
                "Vous ne faites pas " + "partie d'un canal "
                + "de discussion.", "No momento, voc\u00ea n\u00e3o est\u00e1 no bate-papo entre amigos.");
        new Class22("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem "
                                                                                 + "Freundes-Chatraum nicht reden.",
                "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de discussion.",
                "Voc\u00ea pode falar" + " neste bate-papo " + "entre amigos.");
        new Class22("Error sending message to friends chat - please try again later!",
                "Fehler beim Versenden der " + "Nachricht - bitte versuch es" + " sp\u00e4ter erneut.",
                "Erreur lors de l'envoi de ce message \u2013 veuillez r\u00e9essayer " + "ult\u00e9rieurement !",
                "Erro ao " + "enviar" + " mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!");
        new Class22("Please wait until you are logged out of your previous channel.",
                "Bitte warte, bis du den " + "vorherigen Chatraum verlassen" + " hast.",
                "Veuillez attendre " + "d'\u00eatre " + "d\u00e9connect\u00e9(e) de votre canal pr\u00e9c\u00e9dent.",
                "Aguarde at\u00e9 se desconectar do " + "canal anterior.");
        new Class22("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.",
                "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.",
                "No momento voc\u00ea n\u00e3o est\u00e1" + " em um canal.");
        new Class22("Attempting to join channel...", "Chatraum wird betreten...",
                "Tentative de connexion au " + "canal...", "Tentando acessar " + "canal...");
        new Class22("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de "
                                                                                         + "sortie du canal...",
                "Enviando solicita\u00e7\u00e3o para deixar o canal...");
        new Class22("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum "
                                                                             + "beizutreten - bitte warte.",
                "Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...",
                "J\u00e1 h\u00e1 " + "uma tentativa de" + " entrar em um " + "canal. " + "Aguarde...");
        new Class22("Leave request already in progress - please wait...",
                "Du versuchst bereits, einen Chatraum zu " + "verlassen - bitte warte.",
                "Demande de " + "sortie " + "d\u00e9j\u00e0 " + "effectu\u00e9e - veuillez"
                + " patienter...", "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
        new Class22("Invalid channel name entered!", "Ung\u00fcltiger Chatraum-Name angegeben.",
                "Nom de canal " + "incorrect !", "Nome de canal inv\u00e1lido!");
        new Class22("Unable to join friends chat at this time - please try again later!",
                "Freundes-Chatraum kann " + "nicht betreten werden - " + "bitte versuch es " + "sp\u00e4ter erneut.",
                "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez r\u00e9essayer "
                + "ult\u00e9rieurement !", "N\u00e3o foi poss\u00edvel participar do bate-papo entre amigos - favor "
                                           + "tentar novamente mais tarde!");
        new Class22("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au "
                                                                                   + "canal de discussion : ",
                "Falando no momento no bate-papo entre amigos: ");
        new Class22("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ",
                "Vous participez actuellement au canal de discussion du joueur : ",
                "Falando no momento no bate-papo " + "entre amigos do jogador: ");
        new Class22("To talk, start each line of chat with the / symbol.",
                "Leite eine Zeile mit / ein, um hier zu " + "chatten.",
                "Pour parler, ins\u00e9rez le" + " symbole / au d\u00e9but " + "de chaque ligne.",
                "Para " + "falar," + " comece cada linha de conversa com o s\u00edmbolo /.");
        new Class22("Error joining friends chat channel - please try again later!",
                "Fehler beim Betreten des " + "Freundes-Chatraums - bitte " + "versuch es sp\u00e4ter erneut" + ".",
                "Erreur lors de la " + "connexion au canal de " + "discussion - veuillez " + "r\u00e9essayer "
                + "ult\u00e9rieurement !",
                "Erro ao participar do bate-papo entre-amigos - favor tentar novamente " + "mais tarde!");
        new Class22("You are temporarily blocked from joining channels - please try again later!",
                "Du darfst derzeit" + " keine " + "Chatr\u00e4ume " + "betreten - bitte" + " versuch es "
                + "sp\u00e4ter.",
                "Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer " + "ult\u00e9rieurement.",
                "Voc\u00ea est\u00e1 temporariamente impedido de entrar " + "em canais. Tente de novo depois!");
        new Class22("The channel you tried to join does not exist.",
                "Der von dir gew\u00fcnschte Chatraum existiert " + "nicht.",
                "Le canal que vous essayez de " + "rejoindre n'existe pas.",
                "O canal" + " que " + "voc\u00ea tentou acessar n\u00e3o existe.");
        new Class22("The channel you tried to join is currently full.",
                "Der von dir gew\u00fcnschte Chatraum ist " + "derzeit \u00fcberf\u00fcllt.",
                "Le canal " + "que vous " + "essayez " + "de " + "rejoindre" + " est "
                + "plein.", "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
        new Class22("You do not have a high enough rank to join this friends chat channel.",
                "Dein Rang reicht nicht " + "aus, um diesen " + "Freundes-Chatraum zu " + "betreten.",
                "Votre " + "rang " + "n'est " + "pas " + "assez "
                + "\u00e9lev\u00e9 pour rejoindre ce canal de discussion.",
                "Voc\u00ea n\u00e3o tem uma " + "classifica\u00e7\u00e3o alta o " + "suficiente para participar deste "
                + "bate-papo entre amigos.");
        new Class22("You are temporarily banned from this friends chat channel.",
                "Du wurdest tempor\u00e4r von " + "diesem Freundes-Chatraum gesperrt" + ".",
                "Vous avez \u00e9t\u00e9 " + "exclu temporairement de ce"
                + " canal de discussion.", "Voc\u00ea foi temporariamente banido deste bate-papo entre amigos.");
        new Class22("You are not allowed to join this user's friends chat channel.",
                "Du darfst den Freundes-Chatraum" + " dieses Benutzers nicht " + "betreten.",
                "Vous n'\u00eates " + "pas " + "autoris\u00e9 " + "\u00e0 " + "rejoindre le " + "canal de "
                + "discussion de " + "cet utilisateur" + ".",
                "Voc\u00ea " + "n\u00e3o" + " pode " + "participar" + " do " + "bate-papo " + "entre " + "amigos "
                + "deste " + "usu\u00e1rio.");
        new Class22(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        new Class22(" left the channel.", " hat den Chatraum verlassen.", " a quitt\u00e9 le canal.",
                " deixou o " + "canal.");
        new Class22(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.",
                " a \u00e9t\u00e9 " + "expuls\u00e9 du canal" + ".", " foi expulso do " + "canal.");
        new Class22("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.",
                "Vous avez" + " \u00e9t\u00e9 expuls\u00e9 du canal.", "Voc\u00ea foi expulso do canal.");
        new Class22("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.",
                "Vous avez " + "\u00e9t\u00e9 supprim\u00e9 de ce canal.", "Voc\u00ea foi retirado desse canal.");
        new Class22("You have left the channel.", "Du hast den Chatraum verlassen.",
                "Vous avez quitt\u00e9 le canal" + ".", "Voc\u00ea saiu do canal" + ".");
        new Class22("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.",
                "Votre canal de discussion est maintenant activ\u00e9 !", "O seu bate-papo entre amigos foi ativado!");
        new Class22("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ",
                "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ",
                "Para entrar no seu " + "canal, clique em " + "\"Acessar " + "bate-papo\" e " + "digite: ");
        new Class22("Your friends chat channel has now been disabled!",
                "Dein Freundes-Chat ist jetzt ausgeschaltet" + ".",
                "Votre canal de discussion est " + "maintenant d\u00e9sactiv\u00e9 !",
                "O seu " + "bate-papo " + "entre " + "amigos " + "foi " + "desativado!");
        new Class22("You do not have permission to kick users in this channel.",
                "Du darfst keine Benutzer aus diesem" + " Chatraum rauswerfen.",
                "Vous " + "n'\u00eates pas autoris\u00e9 " + "\u00e0 expulser des utilisateurs " + "de ce canal.",
                "Voc\u00ea " + "n\u00e3o tem " + "permiss\u00e3o " + "para expulsar " + "usu\u00e1rios "
                + "neste canal.");
        new Class22("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.",
                "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
                "Voc\u00ea n\u00e3o tem " + "permiss\u00e3o para expulsar" + " este usu\u00e1rio.");
        new Class22("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.",
                "Cet utilisateur n'est pas dans ce canal.", "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
        new Class22("Your request to kick/ban this user was successful.",
                "Der Rauswurf/die Sperrung war erfolgreich" + ".",
                "Votre demande d'exclusion de ce " + "joueur a \u00e9t\u00e9 " + "accept\u00e9e.",
                "Seu pedido para " + "expulsar/suspender este jogador foi bem sucedido.");
        new Class22("Your request to refresh this user's temporary ban was successful.",
                "Die Verl\u00e4ngerung der " + "tempor\u00e4ren Sperrung " + "dieses Spielers war " + "erfolgreich.",
                "Le " + "renouvellement d'exclusion temporaire de ce joueur a \u00e9t\u00e9 accept\u00e9.",
                "Seu pedido " + "para " + "reiniciar a " + "suspens\u00e3o"
                + " tempor\u00e1ria deste jogador foi bem sucedido.");
        new Class22("You have been temporarily muted due to breaking a rule.",
                "Aufgrund eines Regelversto\u00dfes " + "wurdest du vor\u00fcbergehend stumm " + "geschaltet.",
                "La messagerie " + "instantan\u00e9e a " + "\u00e9t\u00e9 " + "temporairement " + "bloqu\u00e9e suite "
                + "\u00e0 une " + "infraction.", "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
        new Class22("This mute will remain for a further ", "Diese Stummschaltung gilt f\u00fcr weitere ",
                "Votre " + "acc\u00e8s" + " restera" + " bloqu\u00e9 encore ", "Este veto permanecer\u00e1 por mais ");
        new Class22(" days.", " Tage.", " jours.", " dias.");
        new Class22("You will be un-muted within 24 hours.",
                "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder " + "sprechen k\u00f6nnen.",
                "Vous aurez \u00e0 nouveau " + "acc\u00e8s \u00e0 la " + "messagerie instantan\u00e9e"
                + " dans 24 heures.", "O veto " + "ser\u00e1 retirado dentro de 24 horas.");
        new Class22("To prevent further mutes please read the rules.",
                "Um eine erneute Stummschaltung zu verhindern," + " lies bitte die Regeln.",
                "Pour \u00e9viter " + "un nouveau " + "blocage, lisez " + "le " + "r\u00e8glement" + ".",
                "Para " + "evitar " + "outros " + "vetos, " + "leia as " + "regras" + ".");
        new Class22("You have been permanently muted due to breaking a rule.",
                "Du wurdest permanent stumm " + "geschaltet, da du gegen eine Regel " + "versto\u00dfen hast.",
                "L'acc\u00e8s" + " \u00e0 la"
                + " messagerie instantan\u00e9e vous a d\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une"
                + " infraction.", "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
        loading_translation = new Class22("Loading - please wait.", "Ladevorgang - bitte warte.",
                "Chargement en cours. " + "Veuillez patienter.", "Carregando. Aguarde.");
        aClass22_376 = new Class22("Profiling...", "Profiling...", "Profilage...", "Profiling...");
        aClass22_377 = new Class22("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.",
                "Conex\u00e3o " + "perdida.");
        aClass22_378 = new Class22("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die "
                                                                               + "Verbindung wiederherzustellen.",
                "Veuillez patienter - tentative de r\u00e9tablissement.",
                "Tentando reestabelecer conex\u00e3o. " + "Aguarde.");
        aClass22_379 = new Class22("Checking for updates - ", "Suche nach Updates - ",
                "V\u00e9rification des mises " + "\u00e0 jour - ", "Verificando atualiza\u00e7\u00f5es - ");
        aClass22_380 = new Class22("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ",
                "Carregando " + "atualiza\u00e7\u00f5es - ");
        new Class22("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ",
                "Carregando " + "config - ");
        new Class22("Loaded config", "Konfig geladen.", "Fichiers config charg\u00e9s", "Config carregada");
        new Class22("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
        new Class22("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s", "Sprites carregados");
        new Class22("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ",
                "Carregando pacote de" + " palavras - ");
        new Class22("Loaded wordpack", "Wordpack geladen.", "Module texte charg\u00e9", "Pacote de palavras carregado");
        new Class22("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ", "Chargement des interfaces - ",
                "Carregando interfaces - ");
        new Class22("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.", "Interfaces charg\u00e9es",
                "Interfaces " + "carregadas");
        new Class22("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ",
                "Carregando interfaces - ");
        new Class22("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces charg\u00e9es",
                "Interfaces " + "carregadas");
        new Class22("Loading additional fonts - ", "Lade Zusatzschriftarten - ",
                "Chargement de polices secondaires -" + " ", "Carregando fontes principais " + "- ");
        new Class22("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires charg\u00e9es",
                "Fontes principais carregadas");
        new Class22("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ",
                "Carregando " + "mapa-m\u00fandi " + "- ");
        new Class22("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
        new Class22("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs",
                "Carregando dados da lista de mundos");
        new Class22("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs charg\u00e9e",
                "Dados " + "da " + "lista " + "de " + "mundos" + " carregados");
        new Class22("Loaded Client variable data", "Client-Variablen geladen", "Variables du Client charg\u00e9es",
                "As vari\u00e1veis do sistema foram carregadas");
        aClass22_381 = new Class22("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        new Class22("Please close the interface you have open before using 'Report Abuse'.",
                "Bitte schlie\u00df die " + "momentan " + "ge\u00f6ffnete " + "Benutzeroberfl\u00e4che," + "",
                "Fermez l'interface" + " que vous avez " + "ouverte avant " + "d'utiliser le " + "bouton \u00ab "
                + "Signaler un abus"
                + " \u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new Class22(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null, null);
        new Class22("System update in: ", "System-Update in: ", "Mise \u00e0 jour syst\u00e8me dans : ",
                "Atualiza\u00e7\u00e3o do sistema em: ");
        aClass22_382 = new Class22(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.", " entrou no jogo.");
        aClass22_383 = new Class22(" has logged out.", " loggt sich aus.", " s'est d\u00e9connect\u00e9.",
                " saiu do " + "jogo.");
        aClass22_384 = new Class22("Unable to find ", "Spieler kann nicht gefunden werden: ",
                "Impossible de trouver " + "", "N\u00e3o \u00e9 " + "poss\u00edvel " + "encontrar ");
        new Class22("Use", "Benutzen", "Utiliser", "Usar");
        aClass22_385 = new Class22("Examine", "Untersuchen", "Examiner", "Examinar");
        aClass22_386 = new Class22("Attack", "Angreifen", "Attaquer", "Atacar");
        aClass22_387 = new Class22("Choose Option", "W\u00e4hl eine Option", "Choisir une option",
                "Selecionar " + "op\u00e7\u00e3o");
        aClass22_388 = new Class22(" more options", " weitere Optionen", " autres options", " mais op\u00e7\u00f5es");
        aClass22_389 = new Class22("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para c\u00e1");
        aClass22_390 = new Class22("Face here", "Hierhin drehen", "Regarder dans cette direction",
                "Virar para " + "c\u00e1");
        aClass22_391 = new Class22("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
        aClass22_392 = new Class22("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ");
        aClass22_393 = new Class22("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ");
        aClass22_394 = new Class22("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...");
        new Class22("Close", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
                "Fermez " + "l'interface" + " que vous " + "avez " + "ouverte " + "avant " + "d'utiliser "
                + "le bouton " + "\u00ab " + "Signaler un" + " abus "
                + "\u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        aClass22_395 = new Class22(" ", ": ", " ", " ");
        aClass22_396 = new Class22("M", "M", "M", "M");
        aClass22_397 = new Class22("M", "M", "M", "M");
        aClass22_398 = new Class22("K", "T", "K", "K");
        aClass22_399 = new Class22("K", "T", "K", "K");
        new Class22("From", "Von:", "De", "De");
        aClass22_400 = new Class22("Self", "Mich", "Moi", "Eu");
        aClass22_401 = new Class22(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!",
                "" + " est d\u00e9j\u00e0 dans votre liste d'amis.", " j\u00e1 est\u00e1 na sua lista de amigos.");
        aClass22_402 = new Class22("Your ignore list is full. Max of 100 users.",
                "Deine Ignorieren-Liste ist voll, " + "du kannst nur 100 Spieler darauf " + "eintragen.",
                "Votre liste noire " + "est pleine (100 "
                + "noms maximum).", "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios.");
        aClass22_403 = new Class22(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!",
                " est d\u00e9j\u00e0 dans votre liste noire.", " j\u00e1 est\u00e1 na sua lista de ignorados.");
        aClass22_404 = new Class22("You can't add yourself to your own friends list.",
                "Du kannst dich nicht auf " + "deine eigene Freunde-Liste " + "setzen!",
                "Vous ne pouvez " + "pas ajouter " + "votre nom " + "\u00e0 votre "
                + "liste d'amis.", "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos.");
        aClass22_405 = new Class22("You can't add yourself to your own ignore list.",
                "Du kannst dich nicht auf deine" + " eigene Ignorieren-Liste " + "setzen!",
                "Vous ne pouvez pas" + " ajouter votre " + "nom \u00e0 votre" + " liste noire.",
                "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados" + ".");
        new Class22("Changes will take effect on your friends chat in the next 60 seconds.",
                "Die \u00c4nderungen am " + "Freundes-Chat werden " + "innerhalb von 60 " + "Sekunden "
                + "\u00fcbernommen.",
                "Les modifications seront apport\u00e9s \u00e0 votre canal de discussion dans les 60 prochaines "
                + "secondes.",
                "Mundan\u00e7as v\u00e3o ocorrer em seu bate-papo entre amigos nos pr\u00f3ximos 60 " + "segundos.");
        aClass22_406 = new Class22("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        aClass22_407 = new Class22(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
        aClass22_408 = new Class22("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        aClass22_409 = new Class22(" from your friends list first.", " zuerst von deiner Freunde-Liste!",
                " de votre " + "liste " + "d'amis" + ".", " da sua lista de amigos primeiro.");
        aClass22_410 = new Class22("yellow:", "gelb:", "jaune:", "amarelo:");
        aClass22_411 = new Class22("red:", "rot:", "rouge:", "vermelho:");
        aClass22_412 = new Class22("green:", "gr\u00fcn:", "vert:", "verde:");
        aClass22_413 = new Class22("cyan:", "blaugr\u00fcn:", "cyan:", "cyan:");
        aClass22_414 = new Class22("purple:", "lila:", "violet:", "roxo:");
        aClass22_415 = new Class22("white:", "weiss:", "blanc:", "branco:");
        aClass22_416 = new Class22("flash1:", "blinken1:", "clignotant1:", "flash1:");
        aClass22_417 = new Class22("flash2:", "blinken2:", "clignotant2:", "flash2:");
        aClass22_418 = new Class22("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        aClass22_419 = new Class22("glow1:", "leuchten1:", "brillant1:", "brilho1:");
        aClass22_420 = new Class22("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        aClass22_421 = new Class22("glow3:", "leuchten3:", "brillant3:", "brilho3:");
        aClass22_422 = new Class22("wave:", "welle:", "ondulation:", "onda:");
        aClass22_423 = new Class22("wave2:", "welle2:", "ondulation2:", "onda2:");
        aClass22_424 = new Class22("shake:", "sch\u00fctteln:", "tremblement:", "tremor:");
        aClass22_425 = new Class22("scroll:", "scrollen:", "d\u00e9roulement:", "rolagem:");
        aClass22_426 = new Class22("slide:", "gleiten:", "glissement:", "deslizamento:");
        new Class22("Friend", "Freund", "Ami", "Amigo");
        anInt428 = 0;
        anInt429 = 0;
        anInt432 = 100;
    }
}
