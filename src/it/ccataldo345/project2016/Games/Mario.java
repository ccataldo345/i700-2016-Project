package it.ccataldo345.project2016.Games;

import lib.TextIO;
import java.lang.*;
import java.util.Scanner;

/**
 * Created by Christian Cataldo on 19/11/2016.
 */
public class Mario {



    public void marioGame() {

        System.out.printf("Hello, this is Mario game!\n");
        System.out.printf("Please insert the pyramid height (1-10)\n");
        int height = TextIO.getInt();

        for (int line = 1; line <= height; line++) {                    //line number (1 to height)
            for (int space = height - line; space > 0; space--) {     //count spaces
                System.out.printf(" ");
            }
            for (int hash = 0; hash < line; hash++) {                  //count #
                System.out.printf("##");
            }
            System.out.printf("\n");
        }

        exitMenu();
    }

    public void exitMenu() {
        Games games = new Games();
        char input;
        System.out.println("Do you want to play again? (y/n)");
        input = TextIO.getChar();
        if (input == 'y'){
            marioGame();
        }
        else {
            games.gamesHome();
        }
        /*Scanner reader = new Scanner(System.in);
        System.out.println("Do you want to play again? (1/0)");
        int input = reader.nextInt();
        if (input == 1){
            marioGame();
        }
        else {
            games.gamesHome();
        }*/
    }
}