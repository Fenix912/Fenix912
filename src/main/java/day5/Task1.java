package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Porshe");
        car1.setColor("Red");
        car1.setyear(2020);

        System.out.println("Модель машины: " + car1.getModel());
        System.out.println("Цвет машины: " + car1.getColor());
        System.out.println("Год машины: " + car1.getyear());
    }
}


