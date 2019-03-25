package it.ccataldo345.project2016.Games;

import it.ccataldo345.project2016.AAAMain.ProjectStart;
import lib.TextIO;

//Created by Christian on 25/11/2016.


public class Games {

    ProjectStart projectStart = new ProjectStart();
    Mario mario = new Mario();
    Coins coins = new Coins();


    public void gamesHome (){

        System.out.println();
        System.out.println("********************");
        System.out.println("*** GAMES ***");
        System.out.println("What game would you like to play?");
        System.out.println("1) Mario");
        System.out.println("2) Coins");
        System.out.println("3) Go to the previous menu");
        System.out.println("********************");
        System.out.println();
        System.out.println("Please enter your choice (1-3):");
        int choiceGames = TextIO.getlnInt();

        //Exit choice
        while (true) {
            if (choiceGames != 1 && choiceGames != 2 && choiceGames != 3 && choiceGames != 4 && choiceGames != 5) {
                System.out.printf("Do you want to exit?(y/n):\n");
                Character exit = TextIO.getlnChar();
                if (exit == 'y') {
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
                    break;
                } else {
                    gamesHome();
                }
            }

            if(choiceGames ==1) {
            mario.marioGame();
            }

            if(choiceGames ==2) {
            coins.coinsGame();
            }

            if (choiceGames == 3) {
                projectStart.projectStart();
            }

        }
    }
}
