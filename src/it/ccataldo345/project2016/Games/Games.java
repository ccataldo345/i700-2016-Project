package it.ccataldo345.project2016;

import lib.TextIO;

//Created by Christian on 25/11/2016.


public class Games {
    private int choiceGames;


    public Games(int) {

        System.out.println("Welcome to Java games!");
        System.out.println("");
        System.out.println();
        System.out.println("What game you want to play?");
        System.out.println("1) Mario;");
        System.out.println("2) Coins.");
        System.out.println();
        System.out.println("Please enter your choice:");
        int choiceGames = TextIO.getlnInt();

        if(choiceGames ==1) {
            return Mario;
        } else if(choiceGames ==2) {
            return Coins;
        }
    }
}
