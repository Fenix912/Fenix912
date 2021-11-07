package day4;


import day7.Player;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int koll = scanner.nextInt();

        Random rand = new Random();
        int[] aa = new int[koll];

        for (int i = 0; i < aa.length; i++) {
            aa[i] = rand.nextInt(10);

        }
        System.out.println(Arrays.toString(aa));

        System.out.println("Длинна Массива: " + aa.length);



        int vosem = 0;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] > 8)
                vosem++;
        }
        System.out.println("Колличество чисел больше 8: " + vosem);


        int van = 0;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] == 1)
                van++;
        }
        System.out.println("Колличество чисел равных 1: " + van);


        int chotnie = 0;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] % 2 == 0)
                chotnie++;
        }
        System.out.println("Колличество четных чисел: " + chotnie);


        int noyChot = 0;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] % 2 == 1)
                noyChot++;
        }
        System.out.println("Колличество нечетных чисел: " + noyChot);


        int summa = 0;
        for (int num : aa) {
            summa = summa+num;
            noyChot++;
        }
        System.out.println("Сумма всех числе: " + summa);

    }
}


