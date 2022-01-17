package com.company;

public class Gameitey {
    private int Health;
    private int Damage;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
    public Gameitey(int health, int damage) {
        Health = health;
        Damage = damage;
    }
}
