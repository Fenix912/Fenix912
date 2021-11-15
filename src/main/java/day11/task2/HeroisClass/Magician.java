package day11.task2.HeroisClass;

import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    int magicalAttack = 20;

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magAttack = magicalAttack * (1 - hero.magicDef);
        if (hero.health - magAttack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magAttack;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}