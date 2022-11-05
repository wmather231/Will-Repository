package Assesment;

import static Assesment.Assessment.newline;

public class Song {
    //creating the different variables for the array list
    private static int numberOfSongs = 0;
    private int id;
    private String title;
    private String artist;
    private int playCount;

    public Song(String title, String artist, int playCount) { //Allowing the array list to add the title, artist, and play count to the list
        numberOfSongs++;
        this.id = numberOfSongs;
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
//Then printing the current list

        System.out.println(id + " " + title + ", " + artist + ", " + playCount + newline);

    }

}