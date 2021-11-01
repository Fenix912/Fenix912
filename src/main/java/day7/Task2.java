package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(30);
        Player player2 = new Player(97);
        Player player3 = new Player(70);

        Player.info();

        Player player4 = new Player(100);
        Player player5 = new Player(43);
        Player player6 = new Player(94);

        Player.info();

        Player player7 = new Player(73);
        Player player8 = new Player(63);

        Player.info();

        for (int i = 0;i < 91; i++)
        player3.run();
        System.out.println();

        Player.info();

    }
}
