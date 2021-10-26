package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("BMV", "Blue", 2020);
        System.out.println("Модель машины: " + motorbike1.getModel());
        System.out.println("Цвет машины: " + motorbike1.getColor());
        System.out.println("Год машины: " + motorbike1.getGod());
    }
}
class Motorbike {
    private String Model;
    private String Color;
    private int God;

    public Motorbike(String Model, String Color, int God) {
        this.Model = Model;
        this.Color = Color;
        this.God = God;
    }

    public String getModel() {
        return Model;
    }
    public String getColor() {
        return Color;
    }
    public int getGod() {
        return God;
    }
}
