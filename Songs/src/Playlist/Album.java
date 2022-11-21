package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;

    private ArrayList<Song> songs;



    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<>();
    }

        public boolean addSong(String songTitle,double songDuration){
        if (finsdSong(songTitle)==null){
            return songs.add(new Song(songTitle,songDuration));
        }
        return false;
    }
    public Song finsdSong(String songName){

        for (Song songExsist:
                songs) {
            if (songExsist.getTitle().equals(songName)){
                return songExsist;
            }
        }
        return null;
    }

    public boolean addToPlayList(int amountOfSongs, LinkedList<Song> linkedPlayList ){
        for (int i = 0; i < amountOfSongs; i++) {
            return linkedPlayList.add(songs.get(i));
        }
        return false;
    }
    public boolean addToPlayList(String nameOfSong, LinkedList<Song> addViaSongName ){

        if (finsdSong(nameOfSong)!=null){
               return addViaSongName.add(finsdSong(nameOfSong));
            }

        return false;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }

 /*   @Override
    private String toString() {

            return name+" : "+artist;


      }*/
}
