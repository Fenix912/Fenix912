package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет как дела?" );
        user1.sendMessage(user2, "Что нового?" );

        user2.sendMessage(user1, "Привет" );
        user2.sendMessage(user1, "Все хорошо" );
        user2.sendMessage(user1, "Много чего нового" );

        user3.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "Давно не виделись");
        user3.sendMessage(user1, "Может встретимся?");

        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Времени совсем нет");
        user1.sendMessage(user3, "Да, давай встретимся на днях");

        user3.sendMessage(user1, "Я позже позвоню, договоримя о встрече");

        MessageDatabase.showDialog(user1, user3);

    }
}
