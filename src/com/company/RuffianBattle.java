package com.company;

import java.util.Random;
import java.util.Scanner;

public class RuffianBattle {
    Ruffian ruffian;
    Player player;
    Inventory playerInventory;
    Inventory ruffianInventory;

    public RuffianBattle(Ruffian ruffian, Player player, Inventory playerInventory, Inventory ruffianInventory) {
        this.ruffian = ruffian;
        this.player = player;
        this.playerInventory = playerInventory;
        this.ruffianInventory = ruffianInventory;
    }

    public void runBattle() {

        while (ruffian.getHealth() > 0) {
            Scanner choice = new Scanner(System.in);
            Random rand = new Random();
            // Ruffian Turn
            // The Ruffian has a 40% chance of taking a potion if his health reaches below 20% of his maximum health (which is 40/200).
            if (ruffian.getHealth() <= 40 && ruffianInventory.getNoOfPotions() > 0) {
                float ruffianChanceOfTakingAPotion = rand.nextFloat();
                if (ruffianChanceOfTakingAPotion <= 0.4) {
                    ruffianInventory.setNoOfPotions(ruffianInventory.getNoOfPotions() - 1);
                    ruffian.setHealth(ruffian.getHealth() + 40);
                    System.out.println("");
                    System.out.println("The Ruffian has taken a potion and healed 40 points.");
                    System.out.println("");
                    System.out.println("RUFFIAN HEALTH: " + ruffian.getHealth() + "/" + ruffian.getMaxHealth());
                }
            } else {
                float ruffianChanceOfHit = rand.nextFloat();
                if (ruffianChanceOfHit <= 0.6) {
                    player.setHealth(player.getHealth() - ruffian.getStrength());
                    System.out.println("");
                    System.out.println("Oh no! The Ruffian got you!");
                    System.out.println("");
                    System.out.println("You take " + ruffian.getStrength() + " points of damage.");
                    System.out.println("");
                    System.out.println("YOUR HEALTH: " + player.getHealth() + "/" + player.getMaxHealth());
                    System.out.println("");
                    player.setRageLevel(player.getRageLevel() + 20);
                    System.out.println("You gained 20 rage points.");
                    System.out.println("");
                    System.out.println("YOUR RAGE: " + player.getRageLevel());

                    if (player.getHealth() < 0) {
                        System.out.println("Oh No! The Ruffian killed you!");
                        System.out.println("");
                        System.out.println("YOU DID NOT SURVIVE THE MALIGNANT KINGDOM");
                        System.exit(0);
                    }
                } else {
                    System.out.println("");
                    System.out.println("The ruffian missed!");
                    System.out.println("");
                }
            }

            // Player Turn
            System.out.println("YOUR HEALTH: " + player.getHealth() + "/" + player.getMaxHealth());
            System.out.println("");
            System.out.println("RUFFIAN HEALTH: " + ruffian.getHealth() + "/" + ruffian.getMaxHealth());
            System.out.println("");
            System.out.println("What should you do?");
            System.out.println("[1] Attack with your sword. You have a 60% chance of a hit.");
            System.out.println("[2] Taunt. Taunting has a 20% chance of your strength increasing by 20 points.");
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
                        ruffian.setHealth(ruffian.getHealth() - player.getStrength());
                        System.out.println("You stab the ruffian with your blade");
                        System.out.println("");
                        System.out.println("He takes " + player.getStrength() + " points of damage.");
                        System.out.println("");
                        System.out.println("RUFFIAN HEALTH: " + ruffian.getHealth() + "/" + ruffian.getMaxHealth());
                    } else {
                        System.out.println("You missed! The ruffian is a crafty bugger.");
                    }
                    ;
                    break;
                case 2:
                    System.out.println("You taunt the ruffian.");
                    System.out.println("");
                    float chanceOfStrengthIncrease = rand.nextFloat();
                    if (chanceOfStrengthIncrease <= 0.2) {
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
                    if (player.getHealth() + 40 > player.getMaxHealth()) {
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
                            int damageToRuffian = 100;
                            ruffian.setHealth(ruffian.getHealth() - 100);
                            System.out.println("You stab the ruffian with your blade.");
                            System.out.println("He takes " + 100 + " points of damage.");
                            System.out.println("RUFFIAN HEALTH: " + ruffian.getHealth());
                        } else {
                            System.out.println("Oh no! After all that buildup, your Blinding Rage attack missed the Ruffian! Unlucky!");
                        }
                    } else {
                        System.out.println("Don't be naughty. You can't do Blinding Rage again so soon. Just for that, you miss a turn and lose your 100 rage points. Remember, greed is a grave sin.");
                    }
                    break;
            }
        }
    }
}
