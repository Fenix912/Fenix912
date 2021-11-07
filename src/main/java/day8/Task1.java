package day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long startTime1 = System.currentTimeMillis();

        for(int i =0; i <= 20000; i++)
            numbers = numbers + i + " ";

        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
        System.out.print(numbers);



        StringBuilder sb = new StringBuilder("");

        long startTime2 = System.currentTimeMillis();

        for(int i =0; i <= 20000; i++)
            sb.append(i).append(" ");

        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));

        System.out.print(sb);
    }

}
