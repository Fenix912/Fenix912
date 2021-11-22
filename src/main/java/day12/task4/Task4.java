package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Till Lindemann");
        members1.add("Kruspe-Bernstein");
        members1.add("Paul Landers");
        members1.add("Oliver Riedel");
        members1.add("Christian Lorenz");
        members1.add("Christoph Schneider");

        MusicBand band1 = new MusicBand("Rammstein", 1994, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Vlad Topalov");
        members2.add("Sergey Lazarev");

        MusicBand band2 = new MusicBand("Smash", 2000, members2);

        band1.printMembers();
        band2.printMembers();


        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}