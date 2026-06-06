import java.util.*;

class Playlist {
    public static void main(String[] args) {
        LinkedHashSet<String> songs = new LinkedHashSet<>();

        songs.add("Song1");
        songs.add("Song2");
        songs.add("Song1");

        System.out.println(songs);
    }
}