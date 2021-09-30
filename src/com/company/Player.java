package com.company;


class Player extends Person {
    protected int rageLevel;

    public Player(String name, int health, int maxHealth, int strength, int rageLevel) {
        super(name, health, maxHealth, strength);
        this.rageLevel = rageLevel;
    }
    public void setRageLevel(int rageLevel) {
        this.rageLevel = rageLevel;
    }
    public int getRageLevel() {
        return this.rageLevel;
    }

}

