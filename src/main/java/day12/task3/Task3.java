package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand n0 = new MusicBand("Metallica", 1981);
        MusicBand n1 = new MusicBand("Nirvana", 1987);
        MusicBand n8 = new MusicBand("TheKillers", 2001);
        MusicBand n2 = new MusicBand("GreenDay", 1987);
        MusicBand n9 = new MusicBand("OneRepublic", 2002);
        MusicBand n3 = new MusicBand("Korn", 1993);
        MusicBand n4 = new MusicBand("Slipknot", 1995);
        MusicBand n7 = new MusicBand("NeonTrees", 2008);
        MusicBand n5 = new MusicBand("ABBA", 1969);
        MusicBand n6 = new MusicBand("FallOutBoy", 2001);

        List<MusicBand> musicBand = new ArrayList<>();
        musicBand.add(n0);
        musicBand.add(n1);
        musicBand.add(n2);
        musicBand.add(n3);
        musicBand.add(n4);
        musicBand.add(n5);
        musicBand.add(n6);
        musicBand.add(n7);
        musicBand.add(n8);
        musicBand.add(n9);

        System.out.println(musicBand);

        Collections.shuffle(musicBand);
        System.out.println(musicBand);

        List<MusicBand> groupsAfter2000 = new ArrayList<>();

       for(MusicBand n: musicBand){
           if(n.getYear() > 2000){
               groupsAfter2000.add(n);
           }
       }
        System.out.println(groupsAfter2000);
    }
}



