package com.dota;

public class Lina extends MagicCharacter implements TargetSkill{
    public Lina() {
        this.name = "Lina";
        this.health = 800;
        this.damage = 70;
        this.mana = 120;
    }

    public boolean skill(Character character) {
        if (this.mana >= 60) {
            int damage2 = this.damage;
            this.damage = 600;
            attack(character);
            this.damage = damage2;
            return true;
        } else {
            return false;
        }
    }

    public void attack(Character character) {
        character.attacked(this.damage);
        if (character.isDie()) {
            this.mana += 45;
        }
    }
}