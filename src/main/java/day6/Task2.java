package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Cy-157", 2015, 20,18000);
        airplane.setLength(25);
        airplane.setYear(2017);

        airplane.fillUp(500);
        airplane.fillUp(800);

        airplane.info();

    }
}
