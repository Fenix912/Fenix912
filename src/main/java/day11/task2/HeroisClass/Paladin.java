package day11.task2.HeroisClass;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {

    static final int TREAT_YOURSELF = 25;
    static final int LECHENIN_ALLIES = 10;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + TREAT_YOURSELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += TREAT_YOURSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + LECHENIN_ALLIES > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += LECHENIN_ALLIES;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}