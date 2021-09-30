package com.company;

public class Person {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int strength;

    public Person(String name, int health, int maxHealth, int strength) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.strength = strength;
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
}
