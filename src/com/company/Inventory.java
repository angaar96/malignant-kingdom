package com.company;

public class Inventory {
    protected int noOfPotions;
    protected int noOfRupees;

    public Inventory(int noOfPotions, int noOfRupees) {
        this.noOfPotions = noOfPotions;
        this.noOfRupees = noOfRupees;
    }

    public int getNoOfPotions() {
        return noOfPotions;
    }

    public void setNoOfPotions(int noOfPotions) {
        this.noOfPotions = noOfPotions;
    }

    public int getNoOfRupees() {
        return noOfRupees;
    }

    public void setNoOfRupees(int noOfRupees) {
        this.noOfRupees = noOfRupees;
    }

}
