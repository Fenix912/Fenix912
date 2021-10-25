package day4;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        int[][] nas = new int[12][8];
        Random rand = new Random();

        for (int i = 0; i < nas.length; i++) {
            for (int j = 0; j < nas[i].length; j++) {
                nas[i][j] = rand.nextInt(10);
            }
        }
        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < nas.length; i++) {
            int sum = 0;
            for (int j = 0; j < nas[i].length; j++) {
                sum = sum + nas[i][j];
            }
            if (sum >= maxSum){
                maxSum = sum;
                maxSumInd = i;

            }
        }
        System.out.println(maxSumInd);
    }

}


