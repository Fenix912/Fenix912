package day6;


public class Task1 {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Porshe");
        car1.setColor("Blue");
        car1.setYear(2010);



        car1.info();

        System.out.println("Модель: " + car1.getModel() + "\n" + "Цвет машины: " + car1.getColor() + "\n" +
                "Год производства: " + car1.getyear() + "\n" + "Колличество лет машине: " + car1.yearDifference(2020));
        System.out.println("\n");

        Motorbike motorbike1 = new Motorbike();
        motorbike1.setModel("BMW");
        motorbike1.setColor("Black");
        motorbike1.setYear(2019);


        motorbike1.info();

        System.out.println("Модель: " + motorbike1.getModel() + "\n" + "Цвет Мотоцикла: " + motorbike1.getColor() + "\n" +
                "Год производства: " + motorbike1.getYear() + "\n" + "Колличество лет мотоциклу: " +
                motorbike1.yearDifference(2020));










    }

}
