package com.company;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerStrength;
    private int playerArmorHealth;

    public Player(String playerName, int playerHealth, int playerStrength, int playerArmorHealth) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerStrength = playerStrength;
        this.playerArmorHealth = playerArmorHealth;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }
    public int getPlayerHealth() {
        return this.playerHealth;
    }

    public int getPlayerStrength() {
        return this.playerStrength;
    }

    public void setPlayerStrength(int playerStrength) {
        this.playerStrength = playerStrength;
    }

    public int getPlayerArmorHealth() {
        return this.playerArmorHealth;
    }

    public void setPlayerArmorHealth(int playerArmorHealth) {
        this.playerArmorHealth = playerArmorHealth;
    }




}
