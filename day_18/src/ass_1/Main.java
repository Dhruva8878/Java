package ass_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Song s=new Song();
        PlayList playList=new PlayList();

        for(int i=0; i<2; i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Song Name");
            String songName= sc.next();
            System.out.println("Enter Movie Name");
            String Movie= sc.next();

            Song song=new Song(Movie,songName);
            playList.addSong(song);
        }
        s.play();
    }

}
