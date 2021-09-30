package com.company;

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
        System.out.println("Your eyes dart across the room. You see an old man on the other end of the cell. He looks weary and wise. His clothes look odd. Out of time. ");
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
        switch (responseQ1) {
            case 1:
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
                // nested switch case;
                switch (responseQ2) {
                    case 1:
                        System.out.println("OLD SAGE: 'It's much too late for that.'");
                        System.out.println("");
                        System.out.println("OLD SAGE: 'If you were truly sorry, you wouldn't have said it in the first place'");
                        System.out.println("");

                    case 2:
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
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("OLD SAGE: WHEN I WIPE YOU FROM THIS PLANE OF EXISTENCE, IT WILL HAVE LOST NOTHING OF VALUE");
                }
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
            case 2:
                System.out.println("");
                System.out.println("OLD MAN: 'Do not fear, my son. Nobody can hurt me. I am not mortal. Speak thy name: '");
        }
        System.out.println("PLEASE ENTER A NAME: ");
        choice.nextLine();
        String playerName = choice.nextLine();
        System.out.println("Hello " + playerName + ". My name is Uzahr. I am a sage.");
        System.out.println("");
        System.out.println("Uzahr: " + playerName + ", you are weak. Let me heal you. " );
        System.out.println("");
        System.out.println("He brandishes his walking stick. It's actually a magical staff in disguise.");
        Player player = new Player(playerName, 100, 100,20, 0);
        System.out.println("");
        System.out.println("YOUR HEALTH: " + player.getHealth() + "/" + player.getMaxHealth() + "\nYOUR STRENGTH: " + player.getStrength() );
        System.out.println("");
        System.out.println("Uzahr: 'You are now fully healed.'");
        System.out.println("");
        System.out.println("The old sage kicks up a chair and sits directly opposite you.");
        System.out.println("");
        System.out.println("Uzahr: 'So. You thought you could gallivant with the king's daughter and expect there to be no price to pay?'");
        System.out.println("");
        System.out.println("Uzahr: 'Still, you are quite the warrior. Killed six of the king's men. No small feat for a peasant.'");
        System.out.println("");
        System.out.println("Uzahr stops talking. He seems deep in thought. You feel his eyes judging every inch of your being.");
        System.out.println("");
        System.out.println("Uzahr: 'I come to you, with an opportunity.'");
        System.out.println("");
        System.out.println("Uzahr: 'I will help you escape this prison. Come with me and live the life of a warrior until your debt is paid.'");
        System.out.println("");
        System.out.println("Uzahr: 'It's either that or you spend the rest of your life being tortured for the simple crime of falling in love.'");
        System.out.println("");
        System.out.println("Uzahr: 'Who knows, one day you may accrue enough honor to wed the princess.'");
        System.out.println("");
        System.out.println("Uzahr: 'What say you, " + player.getName() + "?");
        System.out.println("");
        System.out.println("[1] I don't want to. I'm a pacifist. I don't want to hurt anyone.");
        System.out.println("[2] I'll take my chances here you old codger. P*** off.");
        System.out.println("[3] Yes please. I'll do anything. Get me out of this foul place.");
        System.out.println("");
        System.out.println("PLEASE SELECT A RESPONSE BY TYPING A NUMBER: ");
        int responseQ3 = choice.nextInt();
        switch (responseQ3) {
            case 1:
                System.out.println("Uzahr: 'Really!? 6 dead soldiers would disagree with you.'");
                System.out.println("");
                System.out.println("Uzahr: 'You are gifted in combat. Use it. Seek your freedom. Find redemption for your crimes.'");
                System.out.println("");
                System.out.println("...");
                System.out.println("");
                System.out.println("You decide to take Uzahr up on his offer.");
                System.out.println("");
                break;
            case 2:
                System.out.println("Uzahr: 'So be it. It's your funeral. I come to you with gifts of ambrosia, and you elect to eat mud. Drown in your own stupidity.'");
                System.out.println("");
                System.out.println("Uzahr brandishes his staff.");
                System.out.println("");
                System.out.println("Uzahr: 'TELARIS!'");
                System.out.println("");
                System.out.println("Uzahr disappears into a portal. It closes behind him.");
                System.out.println("");
                System.out.println("You have doomed yourself.");
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
                System.out.println("EXECUTIONER: '" + player.getName() + ". I hope God does not forgive you. I hope you burn in hell.'");
                System.out.println("");
                System.out.println("The executioner swings his axe over your head. You see your face reflected in the silver of the axe head as it catches the light. It looks tired.");
                System.out.println("");
                System.out.println("You think of the princess. Her gentle touch. The only pure thing in this cruel world.");
                System.out.println("");
                System.out.println("");
                player.setHealth(0);
                System.out.println("YOU ARE EXECUTED FOR KILLING 6 OF THE KING'S MEN. YOU DID NOT SURVIVE THE MALIGNANT KINGDOM.");
                System.exit(0);
                break;
        }
        System.out.println("Uzahr: 'Good. Follow me.' ");
        System.out.println("");
        System.out.println("Uzahr brandishes his staff and prepares to cast a spell.");
        System.out.println("");
        System.out.println("OLD SAGE: 'TELARIS!'");
        System.out.println("");
        System.out.println("A portal appears. Uzahr steps in and you follow. You are now in a laboratory of some sort.");
        System.out.println("");
        System.out.println("The tables are littered with shelves full of test tubes, bunsen burners and flasks. It makes sense that the old sage also dabbles with alchemy.");
        System.out.println("\n" +
                "                                                       .:\n" +
                "                                                      / )\n" +
                "                                                     ( (\n" +
                "                                                      \\ )\n" +
                "      o                                             ._(/_.\n" +
                "       o                                            |___%|\n" +
                "     ___              ___  ___  ___  ___             | %|\n" +
                "     | |        ._____|_|__|_|__|_|__|_|_____.       | %|\n" +
                "     | |        |__________________________|%|       | %|\n" +
                "     |o|          | | |%|  | |  | |  |~| | |        .|_%|.\n" +
                "    .' '.         | | |%|  | |  |~|  |#| | |        | ()%|\n" +
                "   /  o  \\        | | :%:  :~:  : :  :#: | |     .__|___%|__.\n" +
                "  :____o__:     ._|_|_.\"    \"    \"    \"._|_|_.   |      ___%|_\n" +
                "  '._____.'     |___|%|                |___|%|   |_____(____  )\n" +
                "                                                           ( (\n" +
                "                                                            \\ '._____.-\n" +
                "                                                  grp        '._______.-");
        System.out.println("");
        System.out.println("Uzahr: 'First order of business. Drink this. It will increase your strength. It's a serum I've invented.'");
        System.out.println("");
        System.out.println("You drink the potion. You feel stronger.");
        System.out.println("");
        player.setStrength(30);
        System.out.println("YOUR STRENGTH: " + player.getStrength());
        System.out.println("");
        System.out.println("Uzahr: 'Good. Now, put this armor on.'");
        System.out.println("");
        System.out.println("You eyeball the armor. The plating is thick and the metalwork is astonishing. This old sage must have connections in high places.");
        System.out.println("You can see dry bloodstains on the inside of the armor.");
        System.out.println("");
        System.out.println("You try not to think about it and put the armor on.");
        System.out.println("");
        player.setHealth(player.getHealth() + 100);
        player.setMaxHealth(player.getMaxHealth()+100);
        System.out.println("YOUR HEALTH IS NOW: " + player.getHealth() + "/" + player.getMaxHealth());
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
        System.out.println("You look in the mirror. You look dangerous. Just having the armor on makes you feel stronger.");
        System.out.println("");
        player.setStrength(player.getStrength() + 5);
        System.out.println("YOUR STRENGTH: " + player.getStrength());
        System.out.println("");
        System.out.println("Uzahr: '...'");
        System.out.println("");
        System.out.println("Uzahr stares at you for a few seconds. Except, it seems as if he's staring past you.  Finally, he speaks.");
        System.out.println("");
        System.out.println("Uzahr: 'It fits you as well as it did Arthur.'");
        System.out.println("");
        System.out.println("Uzahr: 'My son was a fine warrior. But even he couldn't best the cruel dragon Falcor.'");
        System.out.println("");
        System.out.println("Uzahr: 'All he ever wanted was to make me proud.'");
        System.out.println("");
        System.out.println("You sit in silence for a few seconds.");
        System.out.println("");
        System.out.println("Uzahr: 'Come, " + player.getName() + ". It's time to give you your first quest.'");
        System.out.println("Uzahr picks up a scroll from one of the shelves. It's a map of the area.");
        System.out.println("   ___________\n" +
                "           / |       | |\n" +
                "        ,' ,'         \\/',_    __\n" +
                "     ,'__/             |    ',|  \"'-,,,,,,,\n" +
                "   ,/  _|',     Greenrun   |         Arrowmoor   |   \\\n" +
                "   |  |   |',           \\               |    \\\n" +
                "   |__|   |  ',    XXXXX      ',             |     \\\n" +
                "  /       |     ',        ,_\"\"\"\"\"---'-_,'______\\\n" +
                " /        |        ',,_-'\"    |        |        ',\n" +
                "|_________|         |         /        |        / ',,'\"\"\"\"|\n" +
                "|__  | Moonguard        ,____/         |        _|       /    |___  /\n" +
                "'\\___|      ,'_,'|_,-,_______|         |       /      , '/\n" +
                "  \\,' _', _/  ,, ,',|        |   Riverward       \\       |   '\" ,'\n" +
                "   \\ / |_ ,  |  \\||||       ,' |      ,'|    _\"\"    |,'\n" +
                "    ' ,'  ', |  ||||| __ ,'   _|_ ,'    |    |\"\"---/\n" +
                "       ' ,\"\"\"','\"\"\"\"\"\" |     /           \\\"\"\"|    /\n" +
                "                      |_____|_      __''\"    \\   |\n" +
                "                     |  |  /  \"\"\"\"\"\"   |      \\ /\n" +
                "                      \\ / |            |       /\n" +
                "                       \\--'            |      /\n" +
                "                       |   \\__        _|__    |\n" +
                "                       |      |__     |   ',,,|\n" +
                "                       |   Stonehorn      |____|/|\n" +
                "                       /         _|    ,,'_   |\n" +
                "                      |__________|___,'  ,,' /\n" +
                "                       \\      ---'    \\,/  ,'\n" +
                "                        \\     |    ,,,' \\_/\n" +
                "                         |    |_,''      |/\n" +
                "                         |    |       []_|\n" +
                "                          \\___'        /\n" +
                "                           \\ Snowport      __,'\n" +
                "                            \\_____/        ");
        System.out.println("");
        System.out.println("Uzahr: 'I've marked where you have to go. We are currently in Arrowmoor. Go west and you will reach the target's location in Greenrun.");
        System.out.println("");
        System.out.println("Uzahr: 'Your task is to slay an Enraged Draugr. It has been terrorizing the local residents and there is a bounty on it's head.'");
        System.out.println("");
        System.out.println("Uzahr: 'I also need you to retrieve it's horn. I require it for one of my experiments.'");
        System.out.println("");
        System.out.println("Uzahr: 'In return, I will provide you with a place to stay while you pay your debt off to me. You will also receive a share of the reward for the bounty.'");
        System.out.println("");
        System.out.println("Uzahr: 'Take that blade. Judging by the bloody mess you left in the King's court, you already know how to use it well.");
        System.out.println("");
        System.out.println("             _,._\n" +
                " .         ,'   ,`-.\n" +
                "| \\       /     |\\  `.\n" +
                "\\ \\      (  ,-,-` ). `-._ __\n" +
                " \\ \\      \\|\\,'     `\\  /'  `\\\n" +
                "  \\ \\      ` |, ,  /  \\ \\     \\\n" +
                "   \\ \\         `,_/`, /\\,`-.__/`.\n" +
                "    \\ \\            | ` /    /    `-._\n" +
                "     \\\\\\           `-/'    /         `-.\n" +
                "      \\\\`/ _______,-/_   /'             \\\n" +
                "     ---'`|       |`  ),' `---.  ,       |\n" +
                "      \\..-`--..___|_,/          /       /\n" +
                "                 |    |`,-,...,/      ,'     \n" +
                "                 \\    | |_|   /     ,' __  r-'',\n" +
                "                  |___|/  |, /  __ /-''  `'`)  |  \n" +
                "               _,-'   ||__\\ /,-' /     _,.--|  (\n" +
                "            .-'       )   `(_   / _,.-'  ,-' _,/\n" +
                "             `-------'       `--''       `'''");
        System.out.println("");
        System.out.println("You pick the blade up off the floor");
        System.out.println("");
        System.out.println(" __-----_________________{]__________________________________________________\n" +
                "{&&&&&&&#%%&#%&%&%&%&%#%&|]__________________________________________________\\\n" +
                "                         {]");
        System.out.println("");
        System.out.println("It is thinner than a typical soldier's blade but the durability seems strong.");
        System.out.println("");
        System.out.println("Uzahr: 'Wielding this blade should give you the strength to fight the Draugr.'");
        System.out.println("");
        player.setStrength(player.getStrength() + 10);
        System.out.println("");
        System.out.println("YOUR STRENGTH: " + player.getStrength());
        System.out.println("Uzahr: 'Take these five healing potions as well.'");
        System.out.println("       ___\n" +
                "       )_(                                            _\n" +
                "       | |                                           [_ ]\n" +
                "     .-'-'-.       _                               .-'. '-.\n" +
                "    /-::_..-\\    _[_]_                            /:;/ _.-'\\\n" +
                "    )_     _(   /_   _\\      [-]                  |:._   .-|\n" +
                "    |;::    |   )_``'_(    .-'-'-.       (-)      |:._     |\n" +
                "    |;::    |   |;:   |    :-...-:     .-'-'-.    |:._     |\n" +
                "    |;::    |   |;:   |    |;:   |     |-...-|    |:._     |\n" +
                "    |;::-.._|   |;:.._|    |;:.._|     |;:.._|    |:._     |\n" +
                "    `-.._..-'   `-...-'    `-...-'     `-...-'    `-.____.-'    ");
        System.out.println("");
        Inventory playerInventory = new Inventory(5);
        System.out.println("YOUR INVENTORY: ");
        System.out.println("Potions: " + playerInventory.getNoOfPotions());
        System.out.println("");
        System.out.println("Your eyes dart over to the magic potions on the other side of the laboratory");
        System.out.println("Uzahr: 'Tell you what. If you complete this quest, I'll teach you some magic.'");
        System.out.println("");
        System.out.println("Uzahr: 'Any questions?'");
        System.out.println("");
        System.out.println("[1] If you're such a powerful sage, why don't you do slay the Draugr?");
        System.out.println("[2] Why don't you open up a portal to Greenrun for me? I don't want to travel all that way.");
        System.out.println("[3] Thank you for everything. I'll be back with the horn. ");
        System.out.println("PLEASE SELECT A RESPONSE BY TYPING A NUMBER");
        int responseQ4 = choice.nextInt();
        switch (responseQ4) {
            case 1:
                System.out.println("");
                System.out.println("Uzahr: 'I am old. I can not move fast. While I can cast deadly spells, I lack the physical prowess for battle.'");
                break;
            case 2:
                System.out.println("");
                System.out.println("Uzahr: 'Opening portals is no minor feat. It drains a lot of my energy. I don't do it unless I need to. Say, when I need to break a criminal out of prison.'");
                break;
            case 3:
                System.out.println("");
                System.out.println("Uzahr: 'You are most welcome, " + player.getName() + ".'");
                break;
        }
        System.out.println("");
        System.out.println("Uzahr: 'Now be on your way, " + player.getName() + ". You may take my horse, Argo, with you. May God be with you.'");
        System.out.println("");
        System.out.println("You shake Uzahr's hand. You are very grateful to him. This is the beginning of a beautiful friendship.");
        System.out.println("");
        System.out.println("You exit the building.");
        System.out.println("");
        System.out.println("The sunlight blinds you and the cool autumn air fills your lungs. You take a moment to process things.");
        System.out.println("");
        System.out.println("After everything that transpired with Helena, You were not sure if you would ever taste freedom again.");
        System.out.println("");
        System.out.println("                              |\\    /|\n" +
                "                              ___| \\,,/_/\n" +
                "                           ---__/ \\/    \\\n" +
                "                          __--/     (D)  \\\n" +
                "                          _ -/    (_      \\\n" +
                "                         // /       \\_ /  -\\\n" +
                "   __-------_____--___--/           / \\_ O o)\n" +
                "  /                                 /   \\__/\n" +
                " /                                 /\n" +
                "||          )                   \\_/\\\n" +
                "||         /              _      /  |\n" +
                "| |      /--______      ___\\    /\\  :\n" +
                "| /   __-  - _/   ------    |  |   \\ \\\n" +
                " |   -  -   /                | |     \\ )\n" +
                " |  |   -  |                 | )     | |\n" +
                "  | |    | |                 | |    | |\n" +
                "  | |    < |                 | |   |_/\n" +
                "  < |    /__\\                <  \\\n" +
                "  /__\\                       /___\\");
        System.out.println("You pet Argo. He lets out a whinny and looks at you lovingly. He seems friendly.");
        System.out.println("");
        System.out.println("Filled with determination, you mount Argo and head west in pursuit of the Enraged Draugr.");
        System.out.println("");
        System.out.println("6 HOURS LATER");
        System.out.println("");
        System.out.println("It is getting dark. You are close to your destination. You decide to stop, rest and continue your journey tomorrow.");
        System.out.println("");
        System.out.println("Some time has passed. You are hungry. You feel weaker.");
        player.setHealth(player.getHealth() - 20);
        System.out.println("YOUR HEALTH : " + player.getHealth() + "/" + player.getMaxHealth());
        System.out.println("");
        System.out.println("You should probably replenish your health for the battle tomorrow. You spot a farm near where you have built your campsite.");
        System.out.println("");
        System.out.println("[1] Head to the farm to ask for a meal.");
        System.out.println("[2] Steal a chicken from the farm and cook it. Your needs are more than theirs. ");
        int responseQ5 = choice.nextInt();
        switch (responseQ5) {
            case 1:
                System.out.println("");
                System.out.println("You approach the farm and tie Argo to the horse post.");
                System.out.println("");
                System.out.println("As you approach the door, you hear screaming inside.");
                break;
            case 2:
                System.out.println("");
                System.out.println("You cross the fence into the animal pen.");
                System.out.println("");
                System.out.println("You stop. You can hear screaming in the distance. Your stomach can wait.");
                System.out.println("");
                System.out.println("You approach the door of the home in the farm. You hear screaming and shouting inside.");
                break;
        }

        System.out.println("");
        System.out.println("Unknown Voice: 'I killed that boy so I could have you all to myself. You are mine.'");
        System.out.println("");
        System.out.println("Unknown Voice: 'What are you going to do with that knife? You know how many people I've killed for nary a penny? Do not be foolish, girl.'");
        System.out.println("");
        System.out.println("Unknown Voice: 'AHH!'");
        System.out.println("");
        System.out.println("Unknown Voice: 'STUPID B****. YOU'LL PAY FOR THAT!'");
        System.out.println("");
        System.out.println("You burst through the door. There is a family cowering on one side behind a young woman. A crazed man is on the other side.");
        System.out.println("");
        System.out.println("The crazed ruffian stops and stares at you. He is holding a dagger. ");
        System.out.println("");
        System.out.println("            _____    ____\n" +
                "             .#########.#######..\n" +
                "          .#######################.\n" +
                "        .############################.\n" +
                "       .################################.\n" +
                "      .#########,##,#####################.\n" +
                "     .#########-#,'########## ############.\n" +
                "    .######'#-##' # ##'### #. `####:#######.\n" +
                "    #####:'# #'###,##' # # +#. `###:':######\n" +
                "   .####,'###,##  ###  # # #`#. -####`######.\n" +
                "  .####+.' ,'#  ##' #   # # #`#`.`#####::####\n" +
                "  ####'    #  '##'  #   #_'# #.## `#######;##\n" +
                "  #:##'      '       #   # ``..__# `#######:#\n" +
                "  #:##'  .#######s.   #.  .s######.\\`#####:##\n" +
                "  #:##   .\"______\"\"'    '\"\"_____\"\". `.#####:#\n" +
                " .#:##   ><'(##)'> )    ( <'(##)`><   `####;#\n" +
                " ##:##  , , -==-' '.    .` `-==- . \\  ######'\n" +
                " #|-'| / /      ,  :    : ,       \\ ` :####:'\n" +
                " :#  |: '  '   /  .     .  .  `    `  |`####\n" +
                " #|  :|   /   '  '       `  \\   . ,   :  #:# \n" +
                " #L. | | ,  /   `.-._ _.-.'   .  \\ \\  : ) J##\n" +
                "###\\ `  /  '                   \\  : : |  /##\n" +
                " ## #|.:: '       _    _        ` | | |'####\n" +
                " #####|\\  |  (.-'.__`-'__.`-.)   :| ' ######\n" +
                " ######\\:      `-...___..-' '     :: /######\n" +
                " #######\\``.                   ,'|  /#######\n" +
                ".# ######\\  \\       ___       / /' /#######\n" +
                "# #'#####|\\  \\    -     -    /  ,'|### #. #.\n" +
                "`#  #####| '-.`             ' ,-'  |### #  #\n" +
                "    #' `#|    '._         ,.-'     #`#`#.\n" +
                "         |       .'------' :       |#   #\n" +
                "         |       :         :       |\n" +
                "         |       :         :       |\n" +
                "                 :         :          ");
        System.out.println("His eyes have a delirious look to them. You suspect he succumbed to a life of savagery and madness long ago. ");
        System.out.println("");
        System.out.println("You brandish your sword and prepare to do battle with this crazed ruffian. He has a stab wound in his leg so he shouldn't be a challenge for someone like you.");
        System.out.println("");
        System.out.println("He lunges at you first with his dagger. ");
        Ruffian ruffian = new Ruffian("Ruffian", 170,200,25);
        Inventory ruffianInventory = new Inventory(2);
        int playerStrengthBeforeRuffianBattle = player.getStrength();
        // BEGIN FIRST BATTLE
        RuffianBattle ruffianBattle = new RuffianBattle(ruffian, player, playerInventory, ruffianInventory);
        ruffianBattle.runBattle();
        System.out.println("Well done, you've killed the Ruffian.");
        player.setStrength(playerStrengthBeforeRuffianBattle);
        System.out.println("Taunting effects have worn off. Your strength has reverted back to " + player.getStrength());
        System.out.println("");
        System.out.println("The Ruffian lies on the floor clutching his stomach in pain. There is blood everywhere.");
        System.out.println("");
        System.out.println("Before you can say anything, the girl runs across and stabs the ruffian over and over in a mad frenzy.");
        System.out.println("");
        System.out.println("A man runs over and tries to pull her off. You assume it is her father. ");
        System.out.println("");
        System.out.println("Cecelia's Father: 'Enough. Cecelia, ENOUGH!'");
        System.out.println("");
        System.out.println("She continues stabbing.");
        System.out.println("");
        System.out.println("Cecelia's Father: 'It won't bring Jacob back.'");
        System.out.println("");
        System.out.println("She stops and sits in silence. On her face is a defeated expression. She won't recover from this ordeal for a long time.");
        System.out.println("");
        System.out.println("Everyone sits in shock for a moment.");
        System.out.println("");
        System.out.println("The ruffian may be dead but what they have lost is irreplaceable.");
        System.out.println("");
        System.out.println("You ponder about the lives of the men you took in the court.");
        System.out.println("");
        System.out.println("Who were you to take them from their sons and daughters? Their fathers and mothers? You ended up in that dungeon all the same. You extinguished their flames for nothing.");
        System.out.println("");
        System.out.println("Cecelia's Father: 'Brave knight, thank you for your service. This man has been hounding us for a year. Last month, he took the life of my son-in-law. You have erased a great scourge from this earth.'");
        System.out.println("");
        System.out.println("Cecelia's Father: 'What brings you here? What is your name?'");
        System.out.println("");
        System.out.println("You tell him your name and the details of your quest. You learn that his name is Martin. His wife, Emilia treats your wounds. Some hours pass.");
        System.out.println("");
        System.out.println("Martin: '" + player.getName() + ", we are in your debt. Please, rest in the barn and join us for breakfast tomorrow before you go on your way.'" );
        System.out.println("");
        System.out.println("You take him up on his offer and bunk up in the barn.");
        if (responseQ5 == 2) {
            System.out.println("You feel guilty and struggle to sleep. You were dead set on robbing these people before you fought the ruffian. The moral struggle weakens you and your resolve. ");
            player.setStrength(player.getStrength()-10);
            System.out.println("YOUR STRENGTH HAS DECREASED BY 10 POINTS. YOUR CURRENT STRENGTH :" + player.getStrength());
        };
        System.out.println("You wake up in the morning and eat some food with the family. Then you set off on your journey once again.");
        System.out.println("");
        System.out.println("YOU ARE NOW FULLY HEALED.");
        player.setHealth(player.getMaxHealth());
        System.out.println("YOUR HEALTH: " + player.getHealth() +"/" + player.getMaxHealth());

















        }
    }
