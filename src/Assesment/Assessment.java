package Assesment;

import helpers.InputReader;

import java.util.ArrayList;


public class Assessment
{
    private static ArrayList<Song> songs = new ArrayList<Song>();
    private static boolean debug = false;

    /**
     * Runs the programme from the main method
     * prints options for the user to pick and then runs a function
     * @author William
     */
    public void run()
    {
        boolean runProgramme = true;

        addSongs();

        while (runProgramme)
        {
            System.out.println("1. Add a song\n" + "2. remove a song\n" + "3. List the songs\n" + "4. list the songs above a certain amount of plays\n" + "5. End the programme\n");
            int options = InputReader.getInt("\nSelect the action you would like to do: ");
            switch (options)
            {
                case 1:
                    addNewSong();
                    break;
                case 2:
                    removeSong();
                    break;
                case 3:
                    listSongs(0);
                    break;
                case 4:
                    listSpecificSongs();
                    break;
                case 5:
                    runProgramme = false;
            }
        }
    }

    private void addSongs()
    {
        Song song = new Song("The pretender", "Foo Fighters", 561068936);
        songs.add(song);

        song = new Song("Me and Michael", "MGMT", 49622743);
        songs.add(song);

        song = new Song("Chop Suey!", "System Of A Down", 893895854);
        songs.add(song);

        song = new Song("Simple Song", "The Shins", 106788827);
        songs.add(song);

        song = new Song("Fugazi", "Marillion", 206540);
        songs.add(song);
    }

    public static String addNewSong()
    {
        String title = InputReader.getString("Enter the song name: ");
        String artist = InputReader.getString("Enter the artist of the song: ");
        int playCount = InputReader.getInt("Enter the playCount of the song: ");

        Song song = new Song(title, artist, playCount);
        songs.add(song);
        return title + " " + artist + " " + playCount;
    }

    private int removeSong()
    {

        int id = InputReader.getInt("What number song would you like to remove: ");
        songs.remove(id - 1);

        return id;
    }

    public static void listSongs(int count)
    {

        for (Song song : songs)
        {
            if (song.getPlayCount() > count)
            {
                System.out.println(song);
            }
        }
    }

    private void listSpecificSongs()
    {
        int count = InputReader.getInt("How many plays? ");
        listSongs(count);
    }
}