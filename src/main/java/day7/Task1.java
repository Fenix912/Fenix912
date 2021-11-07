package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Cy-157", 2015, 30,18000);
        Airplane airplane2 = new Airplane("Cy-158", 2015, 20,18000);
        Airplane.compareairplanes(airplane1, airplane2);
    }
}
