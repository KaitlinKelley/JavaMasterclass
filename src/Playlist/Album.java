package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

    private static void printMenu(){
        System.out.println("Actions: ");
        System.out.println("0 - quit");
        System.out.println("1 - play next song");
        System.out.println("2 - play previous song");
        System.out.println("3 - replay current song");
        System.out.println("4 - list songs in playlist");
        System.out.println("5 - show menu");
        System.out.println("6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist){
        System.out.println("===================");
        System.out.println("Songs in playlist: ");
        for(Song song: playlist){
            System.out.println(song.toString());
        }
        System.out.println("====================");
    }



    private static void play(LinkedList<Song> playlist){
        Scanner sc  = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("Playlist is empty");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("At beginning of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("At the start of the playlist");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("At the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.5);
        album.addSong("Holy man", 4.4);
        album.addSong("The gypsy", 4.3);
        album.addSong("Soldier of fortune", 4.2);

        Album album2 = new Album("For those about to rock", "ACDC");
        album2.addSong("I put the finger on you", 3.2);
        album2.addSong("Let's go", 3.1);
        album2.addSong("Evil walks", 3.6);

        LinkedList<Song> playlist = new LinkedList<>();

        album.addToPlayList(1, playlist);
        album2.addToPlayList("Let's go", playlist);

        System.out.println(playlist.get(0).toString());
        System.out.println(playlist.get(1).toString());

        play(playlist);
    }
}
