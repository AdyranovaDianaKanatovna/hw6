package com.company;

public class Skeleton extends Boss {
    private int AmountArrays;

    public int getAmountArrays() {
        return AmountArrays;
    }

    public void setAmountArrays(int amountArrays) {
        AmountArrays = amountArrays;
    }

    public Skeleton(int health, int damage) {
        super(health, damage);
    }

    public void printInfo() {
        System.out.println(getHealth() + " " + getDamage() + " " + weapon.getWeaponType() + " " + weapon.getWeaponName() + getAmountArrays());

    }
}
