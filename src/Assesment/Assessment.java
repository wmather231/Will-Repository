package Assesment;

import helpers.InputReader;
import java.util.ArrayList;

public class Assessment {
    //Creating the Array List and the Song class
    private static final ArrayList<Song> songs = new ArrayList<Song>();

    static String newline = System.lineSeparator(); //allows for new lines in the same print statement
    public void run()
    {

        boolean runProgramme = true;
        addSongs();
        //while loop allows the programme to return to the beninging
        while (runProgramme) {
            //adding the initial songs to the programme



            //Presenting the user with the options of the programme
            System.out.println("1. Add a song" + newline + "2. remove a song" + newline + "3. List the songs" + newline + "4. list the songs in the order of plays" + newline + "5. End the programme");
            String options = InputReader.getString(newline + "Select the action you would like to do: ");
            switch (options) {
                case "1" -> addNewSong();
                case "2" -> removeSong();
                case "3" -> listSongs();
                case "4" -> listSpecificSongs();
                case "5" -> runProgramme = false;
            } //end of switch
        }//end of while loop
    }

    private void addSongs() {
        Song song = new Song("The pretender", "Foo Fighters", 561068936);
        song = new Song("Me and Michael", "MGMT", 49622743);
        song = new Song("Chop Suey!", "System Of A Down", 893895854);
        song = new Song("Simple Song", "The Shins", 106788827);
        song = new Song("Fugazi", "Marillion", 206540);
    }

    public static String addNewSong() { //the function for adding songs
        String title = InputReader.getString("Enter the song name: ");
        String artist = InputReader.getString("Enter the artist of the song: ");
        int playCount = InputReader.getInt("Enter the playCount of the song: ");
        int id = InputReader.getInt("Which number is it: ");

        Song song = new Song(title, artist ,playCount);
        return title + " " + artist + " " + playCount;

    }
    public static void removeSong() { //the function for removing songs

        int selection = InputReader.getInt("What number song would you like to remove: ");
        songs.remove(selection--);

    }
    private static void listSongs() {
        System.out.println(songs);
    }
    private static void listSpecificSongs() {
    }

}//end of assessment