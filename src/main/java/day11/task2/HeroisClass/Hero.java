package day11.task2.HeroisClass;

import day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health;
    int physAtt;
    double physDef;
    double magicDef;


    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double Attack = physAtt * (1 - hero.physDef);
        if (hero.health - Attack < MIN_HEALTH ) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= Attack;

        }
    }
}