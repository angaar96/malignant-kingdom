package com.company;

public class Person {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int strength;
    protected int armorHealth;
    protected int totalHealth;

    public Person(String name, int health, int maxHealth, int strength, int armorHealth, int totalHealth) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.armorHealth = armorHealth;
        this.totalHealth = armorHealth + health;

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return this.health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getStrength() {
        return this.strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmorHealth() {
        return this.armorHealth;
    }
    public void setArmorHealth(int armorHealth) {
        this.armorHealth = armorHealth;
    }

    public int getTotalHealth() {
        return this.totalHealth;
    }
    public void setTotalHealth(int totalHealth) {
        this.totalHealth = totalHealth;
    }
}
