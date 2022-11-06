package Assesment;

import java.util.ArrayList;




/**
 * This class is used to store information about a single song
 * each time a new song is created it is given a new ID which is a simple number
 * playCount will be used to count the number of times a song has been streamed
 * @author William
 */
public class Song
{

    private static int numberOfSongs = 0;
    private int id;
    private String title;
    private String artist;
    private int playCount;

    /**
     * This method created a new song and initialise all the attributes
     * including the generation of a new unique ID
     */
    public Song(String title, String artist, int playCount)
    {
        numberOfSongs++;
        this.id = numberOfSongs;

        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }
    public String toString()
    {
        return id + " " + title + ", " + artist + ", " + playCount + "\n";
    }

    public int getPlayCount() {
        return playCount;
    }

}