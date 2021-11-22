package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mercedes");
        list.add("Audi");
        list.add("BMW");
        list.add("Lada");
        list.add("Tesla");
        System.out.println(list);

        list.add(3,"Wolksvagen");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

    }
}
