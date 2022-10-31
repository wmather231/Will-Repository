package Assesment;

public class Song {
    //creating the different variables for the array list
    private String title;
    private String artist;
    private int playCount;

    public Song(String title, String artist, int playCount) { //Allowing the array list to add the title, artist, and play count to the list
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
//Then printing the current list
        System.out.println(title + " " + artist + " " + playCount);
    }

}
