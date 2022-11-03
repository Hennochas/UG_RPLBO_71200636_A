package com.dota;

public class LegionCommander extends PhysicalCharacter implements TargetSkill{
    private int kill;
    public LegionCommander() {
        this.name = "Legion Commander";
        this.health = 1200;
        this.damage = 120;
        setArmor(30);
    }

    public void attack(Character character) {
        character.attacked(this.damage + (this.kill * 10));
        if (character.isDie()) {
            this.kill += 1;
        }
    }

    public boolean skill(Character character) {
        if (!character.isDie()) {
            while (!character.isDie()) {
                attack(character);
            }
            return true;
        }   else {
            return false;
        }
    }
}
