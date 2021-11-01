package day6;

public class Car {

    private String model;
    private String color;
    private int year;
    private int currentYear;



    void info() {
        System.out.println("Это Машина");
    }



    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getyear() {
        return year;
    }

    public void setYear(int Year) {
        this.year = Year;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

}

