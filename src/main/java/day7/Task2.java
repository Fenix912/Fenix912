package day7;

import java.util.Random;

public class Task2 {


    public static void main(String[] args) {

        Random random = new Random();
        Player player1 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player2 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player3 = new Player(random.nextInt((100 - 90) + 1) + 90);

        Player.info();

        Player player4 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player5 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player6 = new Player(random.nextInt((100 - 90) + 1) + 90);

        Player.info();

        Player player7 = new Player(random.nextInt((100 - 90) + 1) + 90);
        Player player8 = new Player(random.nextInt((100 - 90) + 1) + 90);

        Player.info();

        for (int i = 0; i < 91; i++)
            player3.run();
        System.out.println();

        Player.info();


    }
}








