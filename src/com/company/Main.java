package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("MALIGNANT KINGDOM");
        System.out.println("");
        System.out.println("You awaken in a dungeon. The only source of light is a candle, burning gently against the howling of the night. It's so cold. Your teeth are chattering.");
        System.out.println("");
        System.out.println("You pick yourself up. You are not injured but you feel pain in the pit of your stomach. You do not know how long it has been since your last meal.");
        System.out.println("");
        System.out.println("'Hello Friend. You've been out for a while now. I was starting to think you were dead.'");
        System.out.println("");
        System.out.println("Your eyes dart across the room. You see an old man on the other end of the cell. He looks weary and wise. ");
        System.out.println("");
        System.out.println("        ,\n" +
                "            ,:' `..;\n" +
                "            `. ,;;'%\n" +
                "            +;;'%%%%%\n" +
                "             /- %,)%%\n" +
                "             `   \\ %%\n" +
                "              =  )/ \\\n" +
                "              `-'/ / \\\n" +
                "                /\\/.-.\\\n" +
                "               |  (    |\n" +
                "               |  |   ||\n" +
                "               |  |   ||\n" +
                "           _.-----'   ||\n" +
                "          / \\________,'|\n" +
                "         (((/  |       |\n" +
                "         //    |       |\n" +
                "        //     |\\      |\n" +
                "       //      | \\     |\n" +
                "      //       |  \\    |\n" +
                "     //        |   \\   |\n" +
                "    //         |    \\  |\n" +
                "   //          |    |\\ |\n" +
                "  //           |    | \\|\n" +
                " //            \\    \\\n" +
                "c'             |\\    \\\n" +
                "               | \\    \\\n" +
                "               |  \\    \\\n" +
                "               |.' \\    \\\n" +
                "              _\\    \\.-' \\ \n" +
                "             (___.-(__.'\\/");
        System.out.println("OLD MAN: 'Say. What's your name friend?'");
        Scanner choice = new Scanner(System.in);
        System.out.println("[1] '**** You and **** your mother. Old creep. Trash. Go die. Die a painful death. Stop bothering me.' ");
        System.out.println("[2] 'Please leave me alone. It's better if you don't know me.'");
        System.out.println("[3] --- Tell him your name --- ");
        System.out.println("");
        System.out.println("Please select a response by typing a number");
        int responseQ1 = choice.nextInt();
        if (responseQ1 == 1) {
            System.out.println("OLD MAN: 'WHAT DID YOU SAY!? How DARE you speak to me like that!!?'");
            System.out.println("");
            System.out.println("OLD MAN: 'Do you know who I am? What I am capable of !!!?'");
            System.out.println("");
            System.out.println("OLD MAN: 'I only wanted to HELP you! Now, I will send you to a place where you will SUFFER in perpetuity. Even the Oracle will not be able to help you.'");
            System.out.println("");
            System.out.println("OLD MAN: The old man brandishes his walking cane. Except, it is not a cane, but a staff. ");
            System.out.println("");
            System.out.println("He begins to cast a spell. You can barely stand. You must face the consequences of your actions.");
            System.out.println("");
            System.out.println("[1] I'm sorry. Please forgive me. My actions were too rash.");
            System.out.println("[2] --- Attempt to fight him --- ");
            System.out.println("[3] **** YOU!!!! **** YOUR MOTHER!!! **** YOUR FATHER!!!! **** YOUR ENTIRE FAMILY TREE!!!!!");
            System.out.println("Please select a response by typing a number: ");
            int responseQ2 = choice.nextInt();
            if (responseQ2 == 1) {
                System.out.println("OLD SAGE: 'It's much too late for that.'");
                System.out.println("");
                System.out.println("OLD SAGE: 'If you were truly sorry, you wouldn't have said it in the first place'");
                System.out.println("");
            } else if (responseQ2 == 2) {
                System.out.println("After considerable effort, you stand yourself up. There is barely any energy in your body.");
                System.out.println("");
                System.out.println("You attempt to throw a punch. The sage knocks you over with his staff. ");
                System.out.println("");
                System.out.println("OLD SAGE: 'Pathetic.'");
                System.out.println("");
                System.out.println("He stares at your weak, languid body.");
                System.out.println("");
                System.out.println("OLD SAGE: 'Look at you. You're nothing to me.'");
                System.out.println("'YOU'");
                System.out.println("'DON'T'");
                System.out.println("'DESERVE'");
                System.out.println("");
                System.out.println("'MY'");
                System.out.println("'BLOOD.'");
            } else {
                System.out.println("");
                System.out.println("OLD SAGE: WHEN I WIPE YOU FROM THIS PLANE OF EXISTENCE, IT WILL HAVE LOST NOTHING OF VALUE");
            };
            System.out.println("");
            System.out.println("OLD SAGE: 'DRAZARIS'");
            System.out.println("");
            System.out.println("You are whisked away to a dark place. The air is hot and humid. You cannot see anything at all. You can barely breathe. You are wrapped in chains.");
            System.out.println("");
            System.out.println("You feel a geared mechanism pull you down. It's getting hotter. You realise you are being lowered into some kind of fire pit.");
            System.out.println("");
            System.out.println("           (  .      )\n" +
                    "           )           (              )\n" +
                    "                 .  '   .   '  .  '  .\n" +
                    "        (    , )       (.   )  (   ',    )\n" +
                    "         .' ) ( . )    ,  ( ,     )   ( .\n" +
                    "      ). , ( .   (  ) ( , ')  .' (  ,    )\n" +
                    "     (_,) . ), ) _) _,')  (, ) '. )  ,. (' )\n" +
                    " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("");
            System.out.println("The pain is unbearable. It washes over you. But you cannot die. You cannot pass out or rest. The old sage has placed a terrible curse upon you.");
            System.out.println("");
            System.out.println("You must live with the choices you have made.");
            System.out.println("");
            System.out.println("YOU DID NOT SURVIVE THE MALIGNANT KINGDOM.");
            System.exit(0);

        } else if (responseQ1 == 2) {
            System.out.println("");
            System.out.println("OLD MAN: 'Do not fear, my son. Nobody can hurt me. I am not mortal. Speak thy name: '");
        };
        System.out.println("PLEASE ENTER A NAME: ");
        choice.nextLine();
        String playerName = choice.nextLine();
        System.out.println("OLD MAN: " + playerName + ", you are weak. Let me heal you. " );
        System.out.println("");
        System.out.println("He brandishes his walking stick. It's actually a magical staff in disguise.");
        Player player = new Player(playerName, 100, 25, 0);
        System.out.println("");
        System.out.println("YOUR HEALTH: " + player.getPlayerHealth() + "/100, YOUR STRENGTH: " + player.getPlayerStrength() );
        System.out.println("");
        System.out.println("OLD SAGE: 'You are now fully healed.'");
        System.out.println("");
        System.out.println("The old sage kicks up a chair and sits directly opposite you.");
        System.out.println("");
        System.out.println("OLD SAGE: 'So. You thought you could gallivant with the king's daughter and expect there to be no price to pay?'");
        System.out.println("");
        System.out.println("OLD SAGE: 'Still, for a peasant you are quite the warrior. Killed six of the king's men. No small feat for a peasant.'");
        System.out.println("");
        System.out.println("The old sage stops talking. He seems deep in thought. You feel his eyes judging every inch of your being.");
        System.out.println("");
        System.out.println("OLD SAGE: 'I come to you, with an opportunity.'");
        System.out.println("");
        System.out.println("OLD SAGE: 'I will help you escape this prison. Come with me and live the life of a warrior until your debt is paid.'");
        System.out.println("");
        System.out.println("OLD SAGE: 'It's either that or you spend the rest of your life being tortured for the simple crime of falling in love.'");
        System.out.println("");
        System.out.println("OLD SAGE: 'Who knows, one day you may accrue enough honor to wed the princess.'");
        System.out.println("");
        System.out.println("OLD SAGE: 'What say you, " + player.getPlayerName() + "?");
        System.out.println("");
        System.out.println("[1] I don't want to. I'm a pacifist. I don't want to hurt anyone.");
        System.out.println("[2] I'll take my chances here you old codger. P*** off.");
        System.out.println("[3] Yes please. I'll do anything. Get me out of this foul place.");
        System.out.println("");
        System.out.println("PLEASE SELECT A RESPONSE BY TYPING A NUMBER: ");
        int responseQ3 = choice.nextInt();
        if (responseQ3 == 1) {
            System.out.println("OLD SAGE: 'Really!? 6 dead soldiers would disagree with you.'");
            System.out.println("");
            System.out.println("OLD SAGE: 'You are gifted in combat. Use it. Seek your freedom.'");
            System.out.println("");
            System.out.println("You decide to take the old sage up on his offer.");
            System.out.println("");
        } else if (responseQ3 == 2) {
            System.out.println("So be it. It's your funeral. I come to you with gifts of ambrosia, and you elect to eat mud. Drown in your own stupidity.'");
            System.out.println("");
            System.out.println("The old sage brandishes his staff.");
            System.out.println("");
            System.out.println("OLD SAGE: 'TELARIS!'");
            System.out.println("");
            System.out.println("The old man disappears into a portal. It closes behind him. You have doomed yourself. ");
            System.out.println("");
            System.out.println("18 HOURS LATER");
            System.out.println("");
            System.out.println("The door to the cell opens. A group of men enter. They are all soldiers brandishing weapons. In the middle, a man with a black hood emerges. It is an executioner.");
            System.out.println("");
            System.out.println("                       _\n" +
                    "                                         ,;;;\n" +
                    "                                       .;;||:.\n" +
                    "                                      :;;|||::\n" +
                    "                                    ,;;;;;||::.\n" +
                    "                                   ,;;;;;||||||:.\n" +
                    "                                  ,;;;;|||||||||||.\n" +
                    "                                 ,;;;||!!!!!!!|||||.\n" +
                    "                                ,;;;;|!!!!!!!!!|||||\n" +
                    "                                ;;;;!!!!!!!!!!!!|||||\n" +
                    "                               |;;;;;/~\\!!!,'~\\!!||||\n" +
                    "                              :;;;;;|   |!!|   |!!|||\n" +
                    "                              :;;;;;;-._;!!`._/!!!!|`.\n" +
                    "                              |;;;;;;|||!!;;;!!||!!|||\n" +
                    "         ____                  |;;;;;|||!!;;;|||!!||,'\n" +
                    "       ,- _ _`,                 |;;;|||!!!;;|||!!||/ ~-.__\n" +
                    "     /'/~; ; ; )             _--`;;;|||!!!;;|||!!,' \"\" __.--.\\\n" +
                    "    | ( .---~~--._       _.-~:\"\" `:;|||!!;;;|||/' \".-~~      `.\\\n" +
                    "    `. ((.;~---._ `-.  ,'     :\"\"  `:|!!;;;;/' \"  ;            :|.\n" +
                    "     : ((;##### `-. :,'       :\"\"\"\"  |!!;;;/ \"\" .'  __         ;||\n" +
                    "      :   #####| `;  `-._     :\"\"\"\"  ||!!;/ \"\" .' .'          ,:||\n" +
                    "       |   ###  | `.     `-._:\"\"\"\"\"  `!!!:  \"  :              ';||\n" +
                    "       |   ###   .  `-.      `-._____.----'~~~`'`.           '|\"|\n" +
                    "      |    ###   :    `.                         ;          .'\"||\n" +
                    "      |    ###   ;     `._                                .'\"|||\n" +
                    "      |    ###  |     ,-' `-._         _                 / \"||||\n" +
                    "       |   ###     ,-'    |\"  `-._      `-.            ,' \"|||:|\n" +
                    "       |   ###   ,'       |\"\"     `-.___   `.       _/   \"|||:::|\n" +
                    "        `_ ###_.'         |\"\"\"\"\"        `---'-____.'    \"\"\"||||||\n" +
                    "           ###            `.\"\"\"\"\"\"\"\"\"\"\"\"             \"\"\"\"\"\"\"||||\n" +
                    "           ###             |\"\"\" \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|||\"\"\"\"|\n" +
                    "           ###             |\"\"\"\"\"\" \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|||\"\"\"\"\"|\n" +
                    "           ###             `.\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"__|\n" +
                    "           ###              `.\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"____.---'   \\\n" +
                    "    /|     ###               `.\"\"\"\"\"\"\"\"\"____.----'    //-\\    |\\\n" +
                    "  .||      ###                `--.__,--' //|| \\\\     //   \\  //~|\n" +
                    "  ||:      ###                / /\\ \\    // ||  \\\\   //     \\// :|\n" +
                    "  |||.     ###               / /  \\ \\  //  ||   \\\\ //____.-/  :: \\\n" +
                    "  |||||.   ###              //_____\\ \\//   ||    \\\\/       ::  ::||\n" +
                    "  |||||||  ###              ~~|     ~~\\____/~\\_.-~~  :::       ::||\n" +
                    "  |||||||| ###                `.                              ::|||\n" +
                    "  |||||||||||||.   |          ||                               :|||\n" +
                    "  ||||||||||||||||||          |||                     : ___   ::`||\n" +
                    "  ||||||||||||||||||          `||:: `._             _.-':::::::::||\n" +
                    "  ||||||||||||||||||           |||||   `-._     _.-'       ::::::|'\n" +
                    "  ||||||||||||||||||           |||||::     `\\/~'              ::|'\n" +
                    "  |||||||||||||'   |           `||||:        \\                  |\n" +
                    "  |||||||  ###                  ||::::        |                 |\n" +
                    "  |||||/~~~~~~~~~.              `||:::         |               |'\n" +
                    "  ||||   /\\   /\\  `.             ||::::         |              |\n" +
                    "  ||| :  ~~ II~~ :  |            ||:::::        |             |'\n" +
                    "  ||  : ________ :  |            `||:::::       |             |\n" +
                    "  ||    \\##_#_#/   .'             |||:::::      |             |\n" +
                    "   \\| ____________'");
            System.out.println("");
            System.out.println("EXECUTIONER: 'You killed my friends. They were innocent. Honourable men. Loyal servants of the kingdom.'");
            System.out.println("");
            System.out.println("The men grab you. They lay your head down on a block in the center of the room. You are overwhelmed. You don't stand a chance.");
            System.out.println("");
            System.out.println("EXECUTIONER: 'Joshua.'");
            System.out.println("");
            System.out.println("EXECUTIONER: 'Robin.'");
            System.out.println("");
            System.out.println("EXECUTIONER: 'Adam.'");
            System.out.println("");
            System.out.println("EXECUTIONER: 'John.'");
            System.out.println("");
            System.out.println("EXECUTIONER: 'Arthur.'");
            System.out.println("");
            System.out.println("EXECUTIONER: 'William.'");
            System.out.println("");
            System.out.println("");
            System.out.println("The executioner tightens his grip on his axe and clenches his teeth. His eyes are full of sorrow and determination.");
            System.out.println("");
            System.out.println("EXECUTIONER: 'I hope you are all at peace in the Kingdom of Heaven.'");
            System.out.println("EXECUTIONER: '" + player.getPlayerName() + ". I hope God does not forgive you. I hope you burn in hell.'");
            System.out.println("");
            System.out.println("The executioner swings his axe over your head. You see your face reflected in the silver of the axe head as it catches the light. It looks tired.");
            System.out.println("");
            System.out.println("You think of the princess. Her gentle touch. The only pure thing in this malevolent world.");
            System.out.println("");
            System.out.println("");
            player.setPlayerHealth(0);
            System.out.println("YOU ARE EXECUTED FOR KILLING 6 OF THE KING'S MEN. YOU DID NOT SURVIVE THE MALIGNANT KINGDOM.");
            System.exit(0);
        };
        System.out.println("OLD SAGE: 'Good. Follow me.' ");
        System.out.println("");
        System.out.println("The old sage brandishes his staff and prepares to cast a spell.");
        System.out.println("");
        System.out.println("OLD SAGE: 'TELARIS!'");
        System.out.println("");
        System.out.println("A portal appears. The old sage steps in and you follow. You are now in a laboratory of some sort.");
        System.out.println("");
        System.out.println("OLD SAGE: 'First order of business. Drink this. It will increase your strength. It's a serum I've invented.'");
        System.out.println("");
        System.out.println("You drink the potion. You feel stronger.");
        System.out.println("");
        player.setPlayerStrength(50);
        System.out.println("3YOUR STRENGTH: " + player.getPlayerStrength());
        System.out.println("");
        System.out.println("OLD SAGE: 'Good. Put this armor on.'");
        System.out.println("");
        System.out.println("You eye the armor. It is thick and the metalwork is astonishing. This old sage must have connections in high places.");
        System.out.println("");
        System.out.println("You put the armor on.");
        System.out.println("");
        player.setPlayerArmorHealth(100);
        System.out.println("YOUR HEALTH: " + player.getPlayerHealth() + " YOUR ARMOR HEALTH: " + player.getPlayerArmorHealth());
        System.out.println("");
        System.out.println("  _.--.    .--._\n" +
                "                 .\"  .\"      \".  \".\n" +
                "                ;  .\"    /\\    \".  ;\n" +
                "                ;  '._,-/  \\-,_.`  ;\n" +
                "                \\  ,`  / /\\ \\  `,  /\n" +
                "                 \\/    \\/  \\/    \\/\n" +
                "                 ,=_    \\/\\/    _=,\n" +
                "                 |  \"_   \\/   _\"  |\n" +
                "                 |_   '\"-..-\"'   _|\n" +
                "                 | \"-.        .-\" |\n" +
                "                 |    \"\\    /\"    |\n" +
                "                 |      |  |      |\n" +
                "         ___     |      |  |      |     ___\n" +
                "     _,-\",  \",   '_     |  |     _'   ,\"  ,\"-,_\n" +
                "   _(  \\  \\   \\\"=--\"-.  |  |  .-\"--=\"/   /  /  )_\n" +
                " ,\"  \\  \\  \\   \\      \"-'--'-\"      /   /  /  /  \".\n" +
                "!     \\  \\  \\   \\                  /   /  /  /     !\n" +
                ":      \\  \\  \\   \\                /   /  /  /      ");
        System.out.println("");
        System.out.println("You look in the mirror. You look incredible. Just having the armor on makes you feel stronger.");
        System.out.println("");
        int currentStrength = player.getPlayerStrength();
        player.setPlayerStrength((currentStrength + 25));
        System.out.println("YOUR STRENGTH: " + player.getPlayerStrength());
        System.out.println("");
        System.out.println("The old sage stares at you. Except, it seems like he's staring past you. He's deep in contemplation for some time. Finally, he speaks.");
        System.out.println("");
        System.out.println("OLD SAGE: 'It fits you as well as it did Arthur.'");
        System.out.println("");
        System.out.println("OLD SAGE: 'My son was a fine warrior. But even he couldn't best the cruel dragon Falcor.'");
        System.out.println("");
        System.out.println("OLD SAGE: 'All he ever wanted was to make me proud.'");
        System.out.println("");
        System.out.println("You sit in silence for a few seconds.");
        System.out.println("");
        System.out.println("OLD SAGE: 'Come, " + player.getPlayerName() + ". It's time to give you your first quest.'" );













        }
    }
