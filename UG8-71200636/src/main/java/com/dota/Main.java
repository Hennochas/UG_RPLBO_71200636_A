package com.dota;

public class Main
{
    public static void main( String[] args ) {
        Lina lina = new Lina();
        DragonKnight dragonKnight = new DragonKnight();
        LegionCommander legionCommander = new LegionCommander();
//simulasi game
        lina.skill(dragonKnight);
        dragonKnight.skill();
        dragonKnight.attack(lina);
        dragonKnight.attack(lina);
        legionCommander.skill(lina);
        lina.skill(legionCommander);

        lina.showCharacterInfo();
        dragonKnight.showCharacterInfo();
        legionCommander.showCharacterInfo();
    }
}
