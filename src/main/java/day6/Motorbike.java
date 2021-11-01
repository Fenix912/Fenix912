package day6;

class Motorbike {

    private String model;
    private String color;
    private int year;



    void info() {
        System.out.println("Это Мотоцикл");
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}