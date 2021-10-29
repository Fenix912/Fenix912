package day6;

public class Car {
    String model;
    String color;
    int god;
    int currentYear;

    void info() {
        System.out.println("Это Машина");
    }

    int yearDifference() {
        int inputYear = god - currentYear;
        return inputYear;
    }

    public void proverka(int inputYear) {
        if (inputYear < 0) {
            System.out.println("значение должно быть положительным");
        } else {
            System.out.println(inputYear);
        }
    }
}

