/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Translation {
    static Translation aTranslation_359 = new Translation("This is the " + Settings.SERVER_NAME
            + " developer console. To close, press the `, \u00b2 or \u00a7 keys on "
            + "your keyboard.",
            "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten `, ² or § drücken.",
            "Ceci est la console de développement. Pour la fermer, appuyez sur les touches `, ² ou §.",
            "Este é o painel de controle do desenvolvedor. Para fechar, pressione `, ² ou §.");
    static int anInt360;
    static int anInt361;
    static int anInt362;
    private final String[] translations;
    static int anInt364;
    static Translation aTranslation_365 = new Translation("There was an error executing the command.",
            "Es gab einen Fehler beim Ausführen des Befehls.",
            "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.");
    static Translation aTranslation_366 = new Translation("Unknown developer command: ", "Unbekannter Befehl: ",
            "Commande inconnue : ", "Comando desconhecido: ");
    static Translation aTranslation_367 = new Translation("Cancel", "Abbrechen", "Annuler", "Cancelar");
    static Translation aTranslation_368;
    static Translation aTranslation_369;
    static Translation aTranslation_370;
    static Translation aTranslation_371;
    static Translation aTranslation_372;
    static Translation aTranslation_373;
    static Translation aTranslation_374;
    static Translation loading_translation;
    static Translation aTranslation_376;
    static Translation aTranslation_377;
    static Translation aTranslation_378;
    static Translation aTranslation_379;
    static Translation aTranslation_380;
    static Translation aTranslation_381;
    static Translation aTranslation_382;
    static Translation aTranslation_383;
    static Translation aTranslation_384;
    static Translation aTranslation_385;
    static Translation aTranslation_386;
    static Translation aTranslation_387;
    static Translation aTranslation_388;
    static Translation aTranslation_389;
    static Translation aTranslation_390;
    static Translation aTranslation_391;
    static Translation aTranslation_392;
    static Translation aTranslation_393;
    static Translation aTranslation_394;
    static Translation aTranslation_395;
    static Translation aTranslation_396;
    static Translation aTranslation_397;
    static Translation aTranslation_398;
    static Translation aTranslation_399;
    static Translation aTranslation_400;
    static Translation aTranslation_401;
    static Translation aTranslation_402;
    static Translation aTranslation_403;
    static Translation aTranslation_404;
    static Translation aTranslation_405;
    static Translation aTranslation_406;
    static Translation aTranslation_407;
    static Translation aTranslation_408;
    static Translation aTranslation_409;
    static Translation aTranslation_410;
    static Translation aTranslation_411;
    static Translation aTranslation_412;
    static Translation aTranslation_413;
    static Translation aTranslation_414;
    static Translation aTranslation_415;
    static Translation aTranslation_416;
    static Translation aTranslation_417;
    static Translation aTranslation_418;
    static Translation aTranslation_419;
    static Translation aTranslation_420;
    static Translation aTranslation_421;
    static Translation aTranslation_422;
    static Translation aTranslation_423;
    static Translation aTranslation_424;
    static Translation aTranslation_425;
    static Translation aTranslation_426;
    static int anInt427;
    static int anInt428;
    static int anInt429;
    static int anInt430;
    static int anInt431;
    static int anInt432;

    final String getTranslatedString(int language) {
        return translations[language];
    }

    static Node_Sub13 createWalkPacket(int stepsCount, int type) {
        if (stepsCount > 25) stepsCount = 25;
        Node_Sub13 node_sub13 = null;
        if (type == 0) {
            node_sub13 = FloatBuffer.method2250(-386, Class267.aClass318_3445,
                    Class218.aClass123_2566.anIsaacCipher1571);
            Objects.requireNonNull(node_sub13).aPacket7113.writeByte(5 + stepsCount * 2);
            Node_Sub36.anInt7423++;
        }
        if (type == 1) {
            node_sub13 = FloatBuffer.method2250(-386, Class338.aClass318_4198,
                    Class218.aClass123_2566.anIsaacCipher1571);
            Objects.requireNonNull(node_sub13).aPacket7113.writeByte(13 + 5 + stepsCount * 2);
            Class189.anInt2307++;
        }
        //walk
        Objects.requireNonNull(node_sub13).aPacket7113.writeShortLE128(Node_Sub53.gameSceneBaseX);
        node_sub13.aPacket7113.writeShortLE128(Class320_Sub4.gameSceneBaseY);
        node_sub13.aPacket7113.writeByte(!Class175.aClass291_2100.method3450(82) ? 0 : 1);
        for (int c = stepsCount - 1; c >= 0; c--) {
            node_sub13.aPacket7113.writeByte(Node_Sub39.routeFinderXArray[c]);
            node_sub13.aPacket7113.writeByte(Class339_Sub6.routeFinderYArray[c]);
        }
        Class144.aBoolean1791 = false;
        if (stepsCount > 0) {
            Class359.anInt4467 = Node_Sub39.routeFinderXArray[stepsCount - 1];
            Node_Sub15_Sub4.anInt9798 = Class339_Sub6.routeFinderYArray[stepsCount - 1];
        }
        NpcDefinition.method3002();
        return node_sub13;
    }

    public final String toString() {
        anInt360++;
        throw new IllegalStateException();
    }

    public static void method299() {
        aTranslation_385 = null;
        aTranslation_389 = null;
        aTranslation_373 = null;
        aTranslation_423 = null;
        aTranslation_391 = null;
        aTranslation_395 = null;
        aTranslation_398 = null;
        aTranslation_419 = null;
        aTranslation_421 = null;
        aTranslation_390 = null;
        aTranslation_370 = null;
        aTranslation_392 = null;
        aTranslation_413 = null;
        aTranslation_420 = null;
        aTranslation_400 = null;
        aTranslation_417 = null;
        aTranslation_387 = null;
        aTranslation_383 = null;
        aTranslation_386 = null;
        aTranslation_403 = null;
        aTranslation_408 = null;
        aTranslation_407 = null;
        aTranslation_388 = null;
        aTranslation_405 = null;
        aTranslation_368 = null;
        aTranslation_399 = null;
        aTranslation_410 = null;
        aTranslation_401 = null;
        aTranslation_366 = null;
        aTranslation_374 = null;
        aTranslation_380 = null;
        aTranslation_382 = null;
        aTranslation_402 = null;
        aTranslation_415 = null;
        aTranslation_425 = null;
        aTranslation_406 = null;
        aTranslation_411 = null;
        aTranslation_424 = null;
        aTranslation_412 = null;
        aTranslation_378 = null;
        aTranslation_409 = null;
        aTranslation_397 = null;
        aTranslation_367 = null;
        aTranslation_359 = null;
        aTranslation_396 = null;
        aTranslation_414 = null;
        loading_translation = null;
        aTranslation_376 = null;
        aTranslation_426 = null;
        aTranslation_369 = null;
        aTranslation_422 = null;
        aTranslation_381 = null;
        aTranslation_377 = null;
        aTranslation_365 = null;
        aTranslation_371 = null;
        aTranslation_379 = null;
        aTranslation_393 = null;
        aTranslation_418 = null;
        aTranslation_372 = null;
        aTranslation_404 = null;
        aTranslation_416 = null;
        aTranslation_384 = null;
        aTranslation_394 = null;
    }

    static void method300(int i, boolean bool_3_) {
        Class356.method4024(bool_3_, loading_translation.getTranslatedString(Class35.language), i);
        anInt361++;
    }

    private Translation(String english, String german, String french, String portuguese) {
        translations = new String[]{english, german, french, portuguese};
    }

    static {
        new Translation("#Player", "#Spieler", "#Joueur", "#Jogador");
        aTranslation_368 = new Translation("Members object", "Gegenstand f\u00fcr Mitglieder", "Objet d'abonn\u00e9s",
                "Objeto para membros");
        new Translation("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
                "Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
                "Acesse um servidor para membros para usar este objeto.");
        new Translation("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.",
                "\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.",
                "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        aTranslation_369 = new Translation("Discard", "Ablegen", "Jeter", "Descartar");
        aTranslation_370 = new Translation("Discard", "Ablegen", "Jeter", "Descartar");
        aTranslation_371 = new Translation("Take", "Nehmen", "Prendre", "Pegar");
        aTranslation_372 = new Translation("Drop", "Fallen lassen", "Poser", "Largar");
        new Translation("Ok", "Okay", "OK", "Ok");
        new Translation("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar");
        aTranslation_373 = new Translation("Continue", "Weiter", "Continuer", "Continuar");
        new Translation("Invalid player name.", "Unzul\u00e4ssiger Charaktername!", "Nom de joueur incorrect.",
                "Nome de jogador inválido.");
        new Translation("You can't report yourself!", "Du kannst dich nicht selbst melden!",
                "Vous ne pouvez pas vous signaler vous-même !",
                "Você não pode denunciar a si próprio!");
        new Translation("You already sent an abuse report under 60 secs ago! Do not abuse this system!",
                "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!",
                "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !",
                "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        new Translation(null, "Dieses System darf nicht missbraucht werden!", null, null);
        new Translation(
                "You cannot report that person for Staff Impersonation, they are Divergent Staff.",
                "Diese Person ist ein Divergent-Mitarbeiter!",
                "Cette personne est un membre du personnel de Divergent, vous ne pouvez pas la signaler pour abus d'identité.",
                "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Divergent, pois ela faz parte da equipe.");
        new Translation(
                "You can spot a Divergent moderator by the gold crown next to their name.",
                "Divergent-Mitarbeiter haben eine goldene Krone neben ihrem Namen.",
                "Vous pouvez reconnaître les modérateurs Divergent à la couronne dorée en regard de leur nom.",
                "Os moderadores da Divergent são identificados por uma coroa dourada próxima ao \u007Fnome.");
        new Translation("You can report that person under a different rule.",
                "Diese Person kann bezüglich einer anderen Regel gemeldet werden.",
                "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
        new Translation("Thank-you, your abuse report has been received.",
                "Vielen Dank, deine Meldung ist bei uns eingegangen.",
                "Merci, nous avons bien reçu votre rapport d'abus.",
                "Obrigado. Sua denúncia de abuso foi recebida.");
        new Translation("Unable to send abuse report - system busy.",
                "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système",
                "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
        new Translation("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect", "Nome inv\u00e1lido");
        new Translation("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
                "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
                "Acesse um servidor para membros para usar este objeto.");
        new Translation("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.",
                "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.",
                "Para interagir, acesse um servidor para membros.");
        new Translation("Nothing interesting happens.", "Nichts Interessantes passiert.",
                "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        new Translation("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.",
                "Você não consegue alcançar isso.");
        new Translation("Invalid teleport!", "Unzul\u00e4ssiger Teleport!", "T\u00e9l\u00e9portation non valide !",
                "Teleporte inv\u00e1lido!");
        new Translation("To go here you must login to a members' server.",
                "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.",
                "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.",
                "Para entrar aqui, acesse um servidor para membros.");
        new Translation("Unable to add friend - system busy.",
                "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.",
                "Impossible d'ajouter un ami - système occupé.", "N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
        new Translation("Unable to add friend - unknown player.",
                "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.",
                "Impossible d'ajouter l'ami - joueur inconnu.",
                "Não foi possível adicionar um amigo - jogador desconhecido.");
        new Translation("Unable to add name - system busy.",
                "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.",
                "Impossible d'ajouter un nom - système occupé.",
                "Não foi possível adicionar o nome. O sistema está ocupado.");
        new Translation("Unable to add name - unknown player.",
                "Name konnte nicht hinzugefügt werden - Spieler unbekannt.",
                "Impossible d'ajouter le nom - joueur inconnu.",
                "Não foi possível adicionar um nome - jogador desconhecido.");
        aTranslation_374 = new Translation("Your friends list is full (200 names maximum)",
                "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.",
                "Votre liste d'amis est pleine (200 noms maximum).",
                "Sua lista de amigos está cheia. O limite é 200.");
        new Translation("Unable to delete friend - system busy.",
                "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.",
                "Impossible de supprimer un ami - système occupé.", "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
        new Translation("Unable to delete name - system busy.", "Name konnte nicht gel\u00f6scht werden - Systemfehler.",
                "Impossible d'effacer le nom - syst\u00e8me occup\u00e9.",
                "Não foi possível deletar o nome - sistema ocupado.");
        new Translation("Unable to send message - system busy.",
                "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.",
                "Impossible d'envoyer un message - système occupé.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.");
        new Translation("Unable to send message - player unavailable.",
                "Deine Nachricht konnte nicht verschickt werden,",
                "Impossible d'envoyer un message - joueur indisponible.",
                "Não foi possível enviar a mensagem. O jogador não está disponível.");
        new Translation(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null);
        new Translation("Unable to send message - player not on your friends list.",
                "Nachricht kann nicht geschickt werden,",
                "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.",
                "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new Translation(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        new Translation("You appear to be telling someone your password - please don't!",
                "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das",
                "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que "
                + "voc\u00ea"
                + " est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o fa\u00e7a isso!");
        new Translation("If you are not, please change your password to something more obscure!",
                "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !",
                "Caso não esteja, altere sua senha para algo mais obscuro!");
        new Translation("Unable to send message - set your display name first by logging into the game.",
                "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ",
                "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.",
                "Não é possível enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.");
        new Translation(null, "indem du dich ins Spiel einloggst.", null, null);
        new Translation("For that rule you can only report players who have spoken or traded recently.",
                "Mit dieser Option können nur Spieler gemeldet werden,", "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.",
                "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new Translation(null, "die k\u00fcrzlich gesprochen oder gehandelt haben.", null, null);
        new Translation("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.",
                "Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.",
                "O jogador está offline ou está com o modo de privacidade ativado.");
        new Translation("You cannot send a quick chat message to a player on this world at this time.",
                "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten",
                "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.",
                "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        new Translation(null, "geschickt werden.", null, null);
        new Translation("This player is on a quick chat world and cannot receive your message.",
                "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.",
                "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.",
                "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        new Translation("Chat disabled", "Deaktiviert", "Messagerie d\u00e9sactiv\u00e9e", "Bate-papo desativado");
        new Translation("friends_chat", "friends_chat", "friends_chat", "friends_chat");
        new Translation("You are not currently in a friends chat channel.",
                "Du befindest dich derzeit nicht in einem Freundes-Chatraum.",
                "Vous ne faites pas partie d'un canal de discussion.", "No momento, voc\u00ea n\u00e3o est\u00e1 no bate-papo entre amigos.");
        new Translation("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.",
                "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de discussion.",
                "Você pode falar neste bate-papo entre amigos.");
        new Translation("Error sending message to friends chat - please try again later!",
                "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.",
                "Erreur lors de l'envoi de ce message – veuillez réessayer ultérieurement !",
                "Erro ao enviar mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!");
        new Translation("Please wait until you are logged out of your previous channel.",
                "Bitte warte, bis du den vorherigen Chatraum verlassen hast.",
                "Veuillez attendre d'être déconnecté(e) de votre canal précédent.",
                "Aguarde até se desconectar do canal anterior.");
        new Translation("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.",
                "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.",
                "No momento você não está em um canal.");
        new Translation("Attempting to join channel...", "Chatraum wird betreten...",
                "Tentative de connexion au canal...", "Tentando acessar canal...");
        new Translation("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...",
                "Enviando solicita\u00e7\u00e3o para deixar o canal...");
        new Translation("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.",
                "Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...",
                "Já há uma tentativa de entrar em um canal. Aguarde...");
        new Translation("Leave request already in progress - please wait...",
                "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.",
                "Demande de sortie déjà effectuée - veuillez patienter...", "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
        new Translation("Invalid channel name entered!", "Ung\u00fcltiger Chatraum-Name angegeben.",
                "Nom de canal incorrect !", "Nome de canal inv\u00e1lido!");
        new Translation("Unable to join friends chat at this time - please try again later!",
                "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.",
                "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível participar do bate-papo entre amigos - favor tentar novamente mais tarde!");
        new Translation("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ",
                "Falando no momento no bate-papo entre amigos: ");
        new Translation("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ",
                "Vous participez actuellement au canal de discussion du joueur : ",
                "Falando no momento no bate-papo entre amigos do jogador: ");
        new Translation("To talk, start each line of chat with the / symbol.",
                "Leite eine Zeile mit / ein, um hier zu chatten.",
                "Pour parler, insérez le symbole / au début de chaque ligne.",
                "Para falar, comece cada linha de conversa com o símbolo /.");
        new Translation("Error joining friends chat channel - please try again later!",
                "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.",
                "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !",
                "Erro ao participar do bate-papo entre-amigos - favor tentar novamente mais tarde!");
        new Translation("You are temporarily blocked from joining channels - please try again later!",
                "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.",
                "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.",
                "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        new Translation("The channel you tried to join does not exist.",
                "Der von dir gewünschte Chatraum existiert nicht.",
                "Le canal que vous essayez de rejoindre n'existe pas.",
                "O canal que você tentou acessar não existe.");
        new Translation("The channel you tried to join is currently full.",
                "Der von dir gewünschte Chatraum ist derzeit überfüllt.",
                "Le canal que vous essayez de rejoindre est plein.", "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
        new Translation("You do not have a high enough rank to join this friends chat channel.",
                "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.",
                "Votre rang n'est pas assez élevé pour rejoindre ce canal de discussion.",
                "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.");
        new Translation("You are temporarily banned from this friends chat channel.",
                "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.",
                "Vous avez été exclu temporairement de ce canal de discussion.", "Voc\u00ea foi temporariamente banido deste bate-papo entre amigos.");
        new Translation("You are not allowed to join this user's friends chat channel.",
                "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.",
                "Vous n'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.",
                "Você não pode participar do bate-papo entre amigos deste usuário.");
        new Translation(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        new Translation(" left the channel.", " hat den Chatraum verlassen.", " a quitt\u00e9 le canal.",
                " deixou o canal.");
        new Translation(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.",
                " a été expulsé du canal.", " foi expulso do canal.");
        new Translation("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.",
                "Vous avez été expulsé du canal.", "Voc\u00ea foi expulso do canal.");
        new Translation("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.",
                "Vous avez été supprimé de ce canal.", "Voc\u00ea foi retirado desse canal.");
        new Translation("You have left the channel.", "Du hast den Chatraum verlassen.",
                "Vous avez quitté le canal.", "Você saiu do canal.");
        new Translation("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.",
                "Votre canal de discussion est maintenant activ\u00e9 !", "O seu bate-papo entre amigos foi ativado!");
        new Translation("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ",
                "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ",
                "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        new Translation("Your friends chat channel has now been disabled!",
                "Dein Freundes-Chat ist jetzt ausgeschaltet.",
                "Votre canal de discussion est maintenant désactivé !",
                "O seu bate-papo entre amigos foi desativado!");
        new Translation("You do not have permission to kick users in this channel.",
                "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.",
                "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.",
                "Você não tem permissão para expulsar usuários neste canal.");
        new Translation("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.",
                "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
                "Você não tem permissão para expulsar este usuário.");
        new Translation("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.",
                "Cet utilisateur n'est pas dans ce canal.", "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
        new Translation("Your request to kick/ban this user was successful.",
                "Der Rauswurf/die Sperrung war erfolgreich.",
                "Votre demande d'exclusion de ce joueur a été acceptée.",
                "Seu pedido para expulsar/suspender este jogador foi bem sucedido.");
        new Translation("Your request to refresh this user's temporary ban was successful.",
                "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.",
                "Le renouvellement d'exclusion temporaire de ce joueur a été accepté.",
                "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.");
        new Translation("You have been temporarily muted due to breaking a rule.",
                "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.",
                "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
        new Translation("This mute will remain for a further ", "Diese Stummschaltung gilt f\u00fcr weitere ",
                "Votre accès restera bloqué encore ", "Este veto permanecer\u00e1 por mais ");
        new Translation(" days.", " Tage.", " jours.", " dias.");
        new Translation("You will be un-muted within 24 hours.",
                "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.",
                "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        new Translation("To prevent further mutes please read the rules.",
                "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.",
                "Pour éviter un nouveau blocage, lisez le règlement.",
                "Para evitar outros vetos, leia as regras.");
        new Translation("You have been permanently muted due to breaking a rule.",
                "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.",
                "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
        loading_translation = new Translation("Loading - please wait.", "Ladevorgang - bitte warte.",
                "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
        aTranslation_376 = new Translation("Profiling...", "Profiling...", "Profilage...", "Profiling...");
        aTranslation_377 = new Translation("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.",
                "Conexão perdida.");
        aTranslation_378 = new Translation("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.",
                "Veuillez patienter - tentative de r\u00e9tablissement.",
                "Tentando reestabelecer conexão. Aguarde.");
        aTranslation_379 = new Translation("Checking for updates - ", "Suche nach Updates - ",
                "Vérification des mises à jour - ", "Verificando atualiza\u00e7\u00f5es - ");
        aTranslation_380 = new Translation("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ",
                "Carregando atualizações - ");
        new Translation("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ",
                "Carregando config - ");
        new Translation("Loaded config", "Konfig geladen.", "Fichiers config charg\u00e9s", "Config carregada");
        new Translation("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
        new Translation("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s", "Sprites carregados");
        new Translation("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ",
                "Carregando pacote de palavras - ");
        new Translation("Loaded wordpack", "Wordpack geladen.", "Module texte charg\u00e9", "Pacote de palavras carregado");
        new Translation("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ", "Chargement des interfaces - ",
                "Carregando interfaces - ");
        new Translation("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.", "Interfaces charg\u00e9es",
                "Interfaces carregadas");
        new Translation("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ",
                "Carregando interfaces - ");
        new Translation("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces charg\u00e9es",
                "Interfaces carregadas");
        new Translation("Loading additional fonts - ", "Lade Zusatzschriftarten - ",
                "Chargement de polices secondaires - ", "Carregando fontes principais - ");
        new Translation("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires charg\u00e9es",
                "Fontes principais carregadas");
        new Translation("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ",
                "Carregando mapa-múndi - ");
        new Translation("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
        new Translation("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs",
                "Carregando dados da lista de mundos");
        new Translation("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs charg\u00e9e",
                "Dados da lista de mundos carregados");
        new Translation("Loaded Client variable data", "Client-Variablen geladen", "Variables du Client charg\u00e9es",
                "As vari\u00e1veis do sistema foram carregadas");
        aTranslation_381 = new Translation("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        new Translation("Please close the interface you have open before using 'Report Abuse'.",
                "Bitte schließ die momentan geöffnete Benutzeroberfläche,",
                "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new Translation(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null, null);
        new Translation("System update in: ", "System-Update in: ", "Mise \u00e0 jour syst\u00e8me dans : ",
                "Atualiza\u00e7\u00e3o do sistema em: ");
        aTranslation_382 = new Translation(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.", " entrou no jogo.");
        aTranslation_383 = new Translation(" has logged out.", " loggt sich aus.", " s'est d\u00e9connect\u00e9.",
                " saiu do jogo.");
        aTranslation_384 = new Translation("Unable to find ", "Spieler kann nicht gefunden werden: ",
                "Impossible de trouver ", "Não é possível encontrar ");
        new Translation("Use", "Benutzen", "Utiliser", "Usar");
        aTranslation_385 = new Translation("Examine", "Untersuchen", "Examiner", "Examinar");
        aTranslation_386 = new Translation("Attack", "Angreifen", "Attaquer", "Atacar");
        aTranslation_387 = new Translation("Choose Option", "W\u00e4hl eine Option", "Choisir une option",
                "Selecionar opção");
        aTranslation_388 = new Translation(" more options", " weitere Optionen", " autres options", " mais op\u00e7\u00f5es");
        aTranslation_389 = new Translation("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para c\u00e1");
        aTranslation_390 = new Translation("Face here", "Hierhin drehen", "Regarder dans cette direction",
                "Virar para cá");
        aTranslation_391 = new Translation("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
        aTranslation_392 = new Translation("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ");
        aTranslation_393 = new Translation("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ");
        aTranslation_394 = new Translation("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...");
        new Translation("Close", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
                "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        aTranslation_395 = new Translation(" ", ": ", " ", " ");
        aTranslation_396 = new Translation("M", "M", "M", "M");
        aTranslation_397 = new Translation("M", "M", "M", "M");
        aTranslation_398 = new Translation("K", "T", "K", "K");
        aTranslation_399 = new Translation("K", "T", "K", "K");
        new Translation("From", "Von:", "De", "De");
        aTranslation_400 = new Translation("Self", "Mich", "Moi", "Eu");
        aTranslation_401 = new Translation(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!",
                " est déjà dans votre liste d'amis.", " j\u00e1 est\u00e1 na sua lista de amigos.");
        aTranslation_402 = new Translation("Your ignore list is full. Max of 100 users.",
                "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.",
                "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios.");
        aTranslation_403 = new Translation(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!",
                " est d\u00e9j\u00e0 dans votre liste noire.", " j\u00e1 est\u00e1 na sua lista de ignorados.");
        aTranslation_404 = new Translation("You can't add yourself to your own friends list.",
                "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!",
                "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos.");
        aTranslation_405 = new Translation("You can't add yourself to your own ignore list.",
                "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!",
                "Vous ne pouvez pas ajouter votre nom à votre liste noire.",
                "Você não pode adicionar a si próprio à sua lista de ignorados.");
        new Translation("Changes will take effect on your friends chat in the next 60 seconds.",
                "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.",
                "Les modifications seront apportés à votre canal de discussion dans les 60 prochaines secondes.",
                "Mundanças vão ocorrer em seu bate-papo entre amigos nos próximos 60 segundos.");
        aTranslation_406 = new Translation("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        aTranslation_407 = new Translation(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
        aTranslation_408 = new Translation("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        aTranslation_409 = new Translation(" from your friends list first.", " zuerst von deiner Freunde-Liste!",
                " de votre liste d'amis.", " da sua lista de amigos primeiro.");
        aTranslation_410 = new Translation("yellow:", "gelb:", "jaune:", "amarelo:");
        aTranslation_411 = new Translation("red:", "rot:", "rouge:", "vermelho:");
        aTranslation_412 = new Translation("green:", "gr\u00fcn:", "vert:", "verde:");
        aTranslation_413 = new Translation("cyan:", "blaugr\u00fcn:", "cyan:", "cyan:");
        aTranslation_414 = new Translation("purple:", "lila:", "violet:", "roxo:");
        aTranslation_415 = new Translation("white:", "weiss:", "blanc:", "branco:");
        aTranslation_416 = new Translation("flash1:", "blinken1:", "clignotant1:", "flash1:");
        aTranslation_417 = new Translation("flash2:", "blinken2:", "clignotant2:", "flash2:");
        aTranslation_418 = new Translation("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        aTranslation_419 = new Translation("glow1:", "leuchten1:", "brillant1:", "brilho1:");
        aTranslation_420 = new Translation("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        aTranslation_421 = new Translation("glow3:", "leuchten3:", "brillant3:", "brilho3:");
        aTranslation_422 = new Translation("wave:", "welle:", "ondulation:", "onda:");
        aTranslation_423 = new Translation("wave2:", "welle2:", "ondulation2:", "onda2:");
        aTranslation_424 = new Translation("shake:", "sch\u00fctteln:", "tremblement:", "tremor:");
        aTranslation_425 = new Translation("scroll:", "scrollen:", "d\u00e9roulement:", "rolagem:");
        aTranslation_426 = new Translation("slide:", "gleiten:", "glissement:", "deslizamento:");
        new Translation("Friend", "Freund", "Ami", "Amigo");
        anInt428 = 0;
        anInt429 = 0;
        anInt432 = 100;
    }
}
