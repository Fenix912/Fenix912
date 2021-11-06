package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    void info() {
        System.out.println(" Изготовитель: "+ producer + "\n" + " год выпуска: " + year + "\n" + " длинна: " + length + "\n" +
                " вес: " + weight + "\n" + " количество топлива в баке: " + fuel);
    }

    public void fillUp(int newFuel){
        fuel += newFuel;
    }

    public static void compareairplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.getLength() > airplane2.getLength()){
            System.out.println("Первый самолет длинее второго");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длинее первого");
        } else {
            System.out.println("Самолеты равны по длинне");
        }
    }


}












