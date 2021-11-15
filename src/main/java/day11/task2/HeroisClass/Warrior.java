package day11.task2.HeroisClass;

public class Warrior extends Hero {

    public Warrior() {
        physDef = 0.8;
        physAtt = 30;
        magicDef = 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}