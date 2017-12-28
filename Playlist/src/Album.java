import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Arnas on 2017.04.20.
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title){
        for(Song song : this.songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index > 0) && index <= this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        } else {
            System.out.println("This album doesn't have a track");
            return false;
        }
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        int trackNumber = this.songs.indexOf(song);
        return addToPlaylist(trackNumber, playlist);
    }
}
