package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] a = new int[100];

        Random random = new Random();

        for(int i = 0; i < a.length; i++)
            a[i] = random.nextInt(10000);

            int maxSum = 0;
            int maxSumIdx = 0;
            for(int i = 0; i < a.length -2; i++){
                int sum = 0;
                for(int j = i; j < i +3; i++) {
                    sum += a[j];

                }
                if(sum > maxSum){
                    maxSum = sum;
                    maxSumIdx = 1;
                }
            }
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }

}
