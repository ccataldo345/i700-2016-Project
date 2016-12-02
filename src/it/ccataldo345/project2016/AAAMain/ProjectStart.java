/*
 *
 * Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016
 */

package it.ccataldo345.project2016.AAAMain;

import it.ccataldo345.project2016.Account.Account;
import it.ccataldo345.project2016.Games.Games;
import it.ccataldo345.project2016.Shop.Shop;
import lib.TextIO;

public class ProjectStart {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("*********************************************************************");
        System.out.println("Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016");
        System.out.println("*********************************************************************");
        System.out.println();

        projectStart();
    }

    public static void projectStart() {

        Account account = new Account();
        Games games = new Games();
        Shop shop = new Shop();

        System.out.println();
        System.out.println("*** ONLINE STORE ***");
        System.out.println();
        System.out.println("What would you like to do?:");
        System.out.println("1) Go to your account;");
        System.out.println("2) Play games;");
        System.out.println("3) Buy in our shop.");
        System.out.println();

        System.out.println("Please enter your choice:");
        int choice = TextIO.getlnInt();

        //Exit choice
        while (true) {
            if (choice != 1 && choice!=2 && choice!=3) {
                System.out.printf("Do you want to exit?(y/n):\n");
                Character exit = TextIO.getlnChar();
                if (exit == 'y') {
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
                    break;
                } else {
                    projectStart();
                }
            }

            if (choice == 1) {
                account.accountHome();
                /*//clean the interface
                public static void clearScreen() {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }*/

            }

            if (choice == 2) {
                games.gamesHome();

            }

            if (choice == 3) {
                //shop.shopHome();

            }
        }
    }
}
