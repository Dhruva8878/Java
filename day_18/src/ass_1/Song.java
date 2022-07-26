package ass_1;

import java.util.Objects;

public class Song {


    private String movieName;
    private String songName;
    Song(){}


    public String getMovieName() {
        return movieName;
    }

    public String getSongName() {
        return songName;
    }

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;

    }


    public void play(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return movieName.equals(song.movieName) && songName.equals(song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }


    @Override
    public String toString() {
        return "Song{" +
                "movieName='" + movieName + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }



}
