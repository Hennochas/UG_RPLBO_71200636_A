package com.dota;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill {
    private int dragonFormAttack;

    public DragonKnight() {
        this.name = "Dragon Knight";
        this.health = 1800;
        this.damage = 95;
        setArmor(50);
    }

    public void skill() {
        this.dragonFormAttack = 2;
    }

    public void attack(Character character) {
        if (dragonFormAttack > 0) {
            character.attacked(this.damage + 90);
            this.dragonFormAttack -= 1;
        }
        else {
            character.attacked(this.damage);
        }
    }
}
