package com.company;

public class Main {

    public static void main(String[] args) {
    Boss boss = new Boss(700,50);
    boss.weapon.setWeaponType("Gun");
    boss.weapon.setWeaponName("Lola");
        boss.printInfo();

        Skeleton skeleton1 = new Skeleton(250,30);
        skeleton1.weapon.setWeaponType("Arrow");
        skeleton1.weapon.setWeaponName("Mario");
        skeleton1.setAmountArrays(30);
        skeleton1.printInfo();

        Skeleton skeleton2 = new Skeleton(250,30);
        skeleton2.weapon.setWeaponType("Arrow");
        skeleton2.weapon.setWeaponName("Mario");
        skeleton2.setAmountArrays(30);
        skeleton2.printInfo();



    }

}
