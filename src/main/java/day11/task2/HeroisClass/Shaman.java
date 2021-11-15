package day11.task2.HeroisClass;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {

    int magicalAttack = 15;

    static final int TREAT_YOURSELF = 50;
    static final int LECHENIN_ALLIES = 30;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
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
        public void healTeammate (Hero hero){
            if (hero.health + LECHENIN_ALLIES > MAX_HEALTH) {
                hero.health = MAX_HEALTH;
            } else {
                hero.health += LECHENIN_ALLIES;
            }
        }

        @Override
        public void magicalAttack (Hero hero){
            double magAttack = physAtt;
            if (hero.health - magAttack < MIN_HEALTH * (1 - magicDef)) {
                hero.health = MIN_HEALTH;
            } else {
                hero.health -= magAttack;
            }
        }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}