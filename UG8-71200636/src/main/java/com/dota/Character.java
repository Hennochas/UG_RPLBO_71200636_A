package com.dota;

abstract class Character implements ObjectAttack{
    protected String name;
    protected int health;
    protected int damage;

    public Character(){}

    public Character(String name, int health , int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void showCharacterInfo() {
        System.out.println("Hero : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Damage : " + this.damage);
    }

    public boolean isDie() {
        return health <= 0;
    }

    public void attacked(int damage) {
        this.health -= damage;
        if (health < 0) {
            this.health = 0;
        }
    }
}