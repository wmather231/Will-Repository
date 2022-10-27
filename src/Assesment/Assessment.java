package Assesment;

import helpers.InputReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Assessment {

    public static void main(String[] args)
    {


        HashMap<String, Integer> songs = new HashMap<String, Integer>();
        songs.put("The pretender, foo fighters", 561068936);
        songs.put("Me and Michael, MGMT", 49622743);
        songs.put("Chop Suey!, System Of A Down", 893895854);
        songs.put("Simple Song, The Shins", 106788827);
        songs.put("Fugazi, Marillion", 206540);



        String options = InputReader.getString("Select the action you would like to do:");
        switch (options) {
            case "1": addSong(); break;
            case "2": removeSong(); break;
            case "3": listSongs(); break;
            case "4": listSpecificSongs();
        } //end of switch

    }
    public static void addSong() {
    }
    public static void removeSong() {
    }
    private static void listSongs() {
    }
    private static void listSpecificSongs() {
    }

}//end of assessment