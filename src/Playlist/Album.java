package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artistName){
        this.name = albumName;
        this.artist = artistName;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) != null){
            return false;
        }
        this.songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title){
        for (Song currentSong : songs) {
            if (currentSong.getTitle().equals(title)) {
                return currentSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if(index >= 0 && index<=this.songs.size() - 1){
            playlist.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song songToCheck = findSong(songTitle);
        if(songToCheck != null){
            playlist.add(songToCheck);
            return true;
        }
        return false;
    }
}
