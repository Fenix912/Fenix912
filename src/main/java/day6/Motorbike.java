package day6;

class Motorbike {
    String model;
    String color;
    int god;
    int currentYear;


    void info() {
        System.out.println("Это Мотоцикл");
    }

    int yearDifference() {
        int inputYear2 = god - currentYear;
        return inputYear2;
    }

    public void proverka(int inputYear2) {
        if (inputYear2 < 0) {
            System.out.println("значение должно быть положительным");
        } else {
            System.out.println(inputYear2);
        }
    }
}