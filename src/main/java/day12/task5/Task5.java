package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Till Lindemann", 30));
        members1.add(new MusicArtist("Kruspe-Bernstein", 34));
        members1.add(new MusicArtist("Paul Landers", 40));
        members1.add(new MusicArtist("Oliver Riedel",43));
        members1.add(new MusicArtist("Christian Lorenz",41));
        members1.add(new MusicArtist("Christoph Schneider",35));

        MusicBand band1 = new MusicBand("Rammstein", 1994, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Vlad Topalov", 40));
        members2.add(new MusicArtist("Sergey Lazarev", 36));

        MusicBand band2 = new MusicBand("Smash", 2000, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
    }
