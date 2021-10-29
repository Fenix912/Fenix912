package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String Item;

    public Teacher(String name, String item) {
        this.name = name;
        this.Item = item;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getItem() {
        return Item;
    }
    public void setItem(String item) {
        Item = item;
    }

    void evaluate(Student student){
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 2;


        String grade = "";
        switch (randomNumber) {
            case 2:
                grade = "Неудовлитворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "Отлично";
                break;
        }
            System.out.println("Преподаватель " + this.name + "\n" + "оценил студента с именем " + student.getName() + "\n" + "по предмету " +  this.Item + "\n" + "на оценку " + grade);



        }
    }

