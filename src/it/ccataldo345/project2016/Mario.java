package it.ccataldo345.project2016;

import lib.TextIO;

/**
 * Created by Christian Cataldo on 19/11/2016.
 */
public class Mario {
    public static void main(String[] args) {

        System.out.printf("Hello, this is Mario game!\n");
        System.out.printf("Please insert the pyramid height (1-10)\n");
        int height = TextIO.getInt();

        for (int line = 1; line <= height; line++) {
            for (int space = height - line; space > 0 ; space--) {     //count
                System.out.printf(" ");
            }
            for (int hash = 0; hash < line ; hash++) {
                System.out.printf("##");
            }
            System.out.printf("\n");
        }
    }
}
