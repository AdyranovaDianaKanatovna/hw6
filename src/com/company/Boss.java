package com.company;

public class Boss extends Gameitey {
Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }
    public void printInfo(){
        System.out.println(getHealth() + " " + getDamage() + " " +weapon.getWeaponType() + " " + weapon.getWeaponName());
    }

}
