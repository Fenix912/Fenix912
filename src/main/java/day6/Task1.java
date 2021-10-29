package day6;


public class Task1 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Porshe";
        car1.color = "Blue";
        car1.god = 2020;
        car1.currentYear = 2010;
        int inputYear = car1.yearDifference();
        car1.info();

        System.out.println("Модель: " + car1.model + "\n" + "Цвет машины: " + car1.color + "\n" +
                "Год производства: " + car1.currentYear + "\n" + "Машине уже");
        car1.proverka(inputYear);
        System.out.println("Лет" + "\n" + " ");

        Motorbike motorbike1 = new Motorbike();
        motorbike1.model = "BMW";
        motorbike1.color = "Black";
        motorbike1.god = 2020;
        motorbike1.currentYear = 2013;
        int inputYear2 = motorbike1.yearDifference();
        motorbike1.info();

        System.out.println("Модель: " + motorbike1.model + "\n" + "Цвет Мотоцикла: " + motorbike1.color + "\n" +
                "Год производства: " + motorbike1.currentYear + "\n" + "Мотоциклу уже");
        car1.proverka(inputYear2);
        System.out.println("Лет");








    }

}
