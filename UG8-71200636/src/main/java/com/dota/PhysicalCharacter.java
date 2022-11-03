package com.dota;

abstract class PhysicalCharacter extends Character {
    private int armor;

    public PhysicalCharacter(){}

    public PhysicalCharacter(String name, int health, int damage, int armor) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        setArmor(armor);
    }

    public void showCharacterInfo() {
        System.out.println("Hero : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Damage : " + this.damage);
        System.out.println("Armor : " + getArmor());
    }

    public void attacked(int damage) {
        this.health -= (damage - getArmor());
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}