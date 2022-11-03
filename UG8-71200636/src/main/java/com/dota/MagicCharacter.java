package com.dota;

abstract class MagicCharacter extends Character{
    protected int mana;

    public void showCharacterInfo() {
        System.out.println("Hero : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Damage : " + this.damage);
        System.out.println("Mana : " + this.mana);
    }

    public void attacked(int damage) {
        this.health -= damage;
    }
}