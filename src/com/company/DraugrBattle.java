package com.company;

import java.util.Random;
import java.util.Scanner;

public class DraugrBattle {
    Draugr draugr;
    Player player;
    Inventory playerInventory;
    Inventory draugrInventory;

    public DraugrBattle(Draugr draugr, Player player, Inventory playerInventory, Inventory draugrInventory) {
        this.draugr = draugr;
        this.player = player;
        this.playerInventory = playerInventory;
        this.draugrInventory = draugrInventory;
    }

    public void runBattle() {

        while (draugr.getHealth() > 0) {
            Scanner choice = new Scanner(System.in);
            Random rand = new Random();
            // Draugr Turn
            // The Draugr has a 40% chance of taking a potion if his health reaches below 20% of his maximum health (which is 70/350).
            if (draugr.getHealth() <= 70 && draugrInventory.getNoOfPotions() > 0) {
                float draugrChanceOfTakingAPotion = rand.nextFloat();
                if (draugrChanceOfTakingAPotion <= 0.4) {
                    draugrInventory.setNoOfPotions(draugrInventory.getNoOfPotions() - 1);
                    draugr.setHealth(draugr.getHealth() + 40);
                    System.out.println("");
                    System.out.println("The Draugr has taken a potion and healed 40 points.");
                    System.out.println("");
                    System.out.println("DRAUGR HEALTH: " + draugr.getHealth() + "/" + draugr.getMaxHealth());
                }
            } else if (draugr.getHealth() <= 70) {
                // The Draugr has a 50% chance of becoming enraged if his health reaches below 20% of his maximum health (which is 70/350). and he doesn't take a potion.
                // In the enraged state, his strength increases to 70, and he heals 20 health points.
                float draugrChanceOfBecomingEnraged = rand.nextFloat();
                if (draugrChanceOfBecomingEnraged <= 0.5) {
                    draugr.setStrength(70);
                    draugr.setHealth(draugr.getHealth() + 20);
                    System.out.println("");
                    System.out.println("The Draugr has become enraged! His strength has increased to 70 and he has healed 20 health points.");
                    System.out.println("");
                    System.out.println("         .            )        )\n" +
                            "                  (  (|              .\n" +
                            "              )   )\\/ ( ( (\n" +
                            "      *  (   ((  /     ))\\))  (  )    )\n" +
                            "    (     \\   )\\(          |  ))( )  (|\n" +
                            "    >)     ))/   |          )/  \\((  ) \\\n" +
                            "    (     (      .        -.     V )/   )(    (\n" +
                            "     \\   /     .   \\            .       \\))   ))\n" +
                            "       )(      (  | |   )            .    (  /\n" +
                            "      )(    ,'))     \\ /          \\( `.    )\n" +
                            "      (\\>  ,'/__      ))            __`.  /\n" +
                            "     ( \\   | /  ___   ( \\/     ___   \\ | ( (\n" +
                            "      \\.)  |/  /   \\__      __/   \\   \\|  ))\n" +
                            "     .  \\. |>  \\      | __ |      /   <|  /\n" +
                            "          )/    \\____/ :..: \\____/     \\ <\n" +
                            "   )   \\ (|__  .      / ;: \\          __| )  (\n" +
                            "  ((    )\\)  ~--_     --  --      _--~    /  ))\n" +
                            "   \\    (    |  ||               ||  |   (  /\n" +
                            "         \\.  |  ||_             _||  |  /\n" +
                            "           > :  |  ~V+-I_I_I-+V~  |  : (.\n" +
                            "          (  \\:  T\\   _     _   /T  : ./\n" +
                            "           \\  :    T^T T-+-T T^T    ;<\n" +
                            "            \\..`_       -+-       _'  )\n" +
                            "  )            . `--=.._____..=--'. ./         (\n" +
                            " ((     ) (          )             (     ) (   )> \n" +
                            "  > \\/^/) )) (   ( /(.      ))     ))._/(__))./ (_.\n" +
                            " (  _../ ( \\))    )   \\ (  / \\.  ./ ||  ..__:|  _. \\\n" +
                            " |  \\__.  ) |   (/  /: :)) |   \\/   |(  <.._  )|  ) )\n" +
                            "))  _./   |  )  ))  __  <  | :(     :))   .//( :  : |\n" +
                            "(: <     ):  --:   ^  \\  )(   )\\/:   /   /_/ ) :._) :\n" +
                            " \\..)   (_..  ..  :    :  : .(   \\..:..    ./__.  ./\n" +
                            "            ^    ^      \\^ ^           ^\\/^     ^ ");
                    System.out.println("");
                    System.out.println("DRAUGR HEALTH: " + draugr.getHealth() + "/" + draugr.getMaxHealth());
                }
            } else {
                float draugrChanceOfHit = rand.nextFloat();
                if (draugrChanceOfHit <= 0.6) {
                    player.setHealth(player.getHealth() - draugr.getStrength());
                    System.out.println("");
                    System.out.println("Oh no! The Draugr got you!");
                    System.out.println("");
                    System.out.println("You take " + draugr.getStrength() + " points of damage.");
                    System.out.println("");
                    System.out.println("YOUR HEALTH: " + player.getHealth() + "/" + player.getMaxHealth());
                    System.out.println("");
                    player.setRageLevel(player.getRageLevel() + 20);
                    System.out.println("You gained 20 rage points.");
                    System.out.println("");
                    System.out.println("YOUR RAGE: " + player.getRageLevel());

                    if (player.getHealth() <= 0) {
                        System.out.println("Oh No! The Draugr killed you!");
                        System.out.println("");
                        System.out.println("YOU DID NOT SURVIVE THE MALIGNANT KINGDOM");
                        System.exit(0);
                    }
                } else {
                    System.out.println("");
                    System.out.println("The Draugr missed!");
                    System.out.println("");
                }
            }

            // Player Turn
            System.out.println("YOUR HEALTH: " + player.getHealth() + "/" + player.getMaxHealth());
            System.out.println("");
            System.out.println("DRAUGR HEALTH: " + draugr.getHealth() + "/" + draugr.getMaxHealth());
            System.out.println("");
            System.out.println("What should you do?");
            System.out.println("[1] Attack with your sword. You have a 60% chance of a hit.");
            System.out.println("[2] Taunt. Taunting has a 40% chance of your strength increasing by 20 points.");
            System.out.println("[3] Use a potion. A potion heals 40 health points.");
            if (player.getRageLevel() < 100) {
                System.out.println("[4]  [CURRENTLY UNAVAILABLE] Blinding Rage - A devastating special attack which generates after your accumulate a rage level of 100.");
                System.out.println("CURRENT RAGE LEVEL: " + player.getRageLevel() + ". Your rage will increase by 20 for every hit you take.");
            }
            if (player.getRageLevel() >= 100) {
                System.out.println("[4] Use Blinding Rage - A devastating special attack. It has an 80% chance of hitting. ");
            }
            System.out.println("PLEASE SELECT AN ACTION BY ENTERING AN NUMBER:");
            int playerBattleChoice = choice.nextInt();
            switch (playerBattleChoice) {
                case 1:
                    float playerChanceOfHit = rand.nextFloat();
                    if (playerChanceOfHit <= 0.6) {
                        draugr.setHealth(draugr.getHealth() - player.getStrength());
                        System.out.println("You stab the Draugr with your blade.");
                        System.out.println("");
                        System.out.println("He takes " + player.getStrength() + " points of damage.");
                        System.out.println("");
                        System.out.println("DRAUGR HEALTH: " + draugr.getHealth() + "/" + draugr.getMaxHealth());
                    } else {
                        System.out.println("You missed! The Draugr is a crafty bugger.");
                    }
                    ;
                    break;
                case 2:
                    System.out.println("You taunt the Draugr.");
                    System.out.println("");
                    float chanceOfStrengthIncrease = rand.nextFloat();
                    if (chanceOfStrengthIncrease <= 0.4) {
                        player.setStrength(player.getStrength() + 20);
                        System.out.println("Your strength has increased by 20 points.");
                        System.out.println("");
                        System.out.println("YOUR STRENGTH: " + player.getStrength());
                    } else {
                        System.out.println("");
                        System.out.println("Unfortunately, you don't feel any stronger.");
                    }
                    break;
                case 3:
                    playerInventory.setNoOfPotions(playerInventory.getNoOfPotions() - 1);
                    if (player.getHealth() + 40 >= player.getMaxHealth()) {
                        player.setHealth(player.getMaxHealth());
                    } else {
                        player.setHealth(player.getHealth() + 40);
                    }
                    System.out.println("");
                    System.out.println("You have used a potion and recovered 40 health points.");
                    System.out.println("");
                    System.out.println("You now have " + playerInventory.getNoOfPotions() + " potions left");
                    System.out.println("");
                    System.out.println("YOUR HEALTH: " + player.getHealth() + "/" + player.getMaxHealth());
                    break;
                case 4:
                    if (player.getRageLevel() >= 100) {
                        player.setRageLevel(player.getRageLevel() - 100);
                        float blindingRageChanceOfHit = rand.nextFloat();
                        if (blindingRageChanceOfHit >= 0.2) {
                            int damageToDraugr = 100;
                            draugr.setHealth(draugr.getHealth() - 100);
                            System.out.println("You stab the Draugr with your blade.");
                            System.out.println("He takes " + 100 + " points of damage.");
                            System.out.println("DRAUGR HEALTH: " + draugr.getHealth() + "/" + draugr.getMaxHealth());
                        } else {
                            System.out.println("Oh no! After all that buildup, your Blinding Rage attack missed the Draugr! Unlucky!");
                        }
                    } else {
                        System.out.println("Don't be naughty. You can't do Blinding Rage again so soon. Just for that, you miss a turn and lose your 100 rage points. Remember, greed is a grave sin.");
                    }
                    break;
            }
        }
    }
}
