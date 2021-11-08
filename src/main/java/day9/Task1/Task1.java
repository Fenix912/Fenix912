package day9.Task1;

public class Task1 {

    public static void main(String[] args) {
     Student student = new Student("Igor", "12");
        System.out.println("Группа студента: " + student.getGroupName());
        student.printInfo();
        System.out.println("");
     Teacher teacher = new Teacher("Irina","Physics");
        System.out.println("Название предмета: " + teacher.getSubjectName());
        teacher.printInfo();


    }
}
