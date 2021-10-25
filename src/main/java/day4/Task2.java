package day4;


import java.util.Random;


public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] mas = new int[100];


        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10000);
        }


        int max = 0;
        for (int element : mas) {
            if (element > max)
                max = element;
        }
        System.out.println(max);



        int min = 1000000000;
        for (int element : mas) {
            if (element < min)
                min = element;
        }
        System.out.println(min);



        int cos = 0;
        for (int element : mas) {
            if (element % 10 == 0)
                cos++;
        }
        System.out.println(cos);



        int sum = 0;
        for (int element : mas) {
            if (element % 10 == 0)
                sum = sum+element;

        }
        System.out.println(sum);

    }


}