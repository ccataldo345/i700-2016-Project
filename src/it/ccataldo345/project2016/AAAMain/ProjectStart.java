/*
 *
 * Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016
 */

package it.ccataldo345.project2016.AAAMain;

import it.ccataldo345.project2016.Account.Account;
//import it.ccataldo345.project2016.Account.Balance;
import it.ccataldo345.project2016.Account.Balance;
import it.ccataldo345.project2016.Account.InitialCredit;
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
        ClearScreen clearScreen = new ClearScreen();
        Balance currentCredit = new Balance();
        InitialCredit initialCredit = new InitialCredit();

        System.out.println();
        System.out.println("********************");
        System.out.println("*** ONLINE STORE ***");
        System.out.println("What would you like to do?:");
        System.out.println("1) Go to your account");
        System.out.println("2) Play games");
        System.out.println("3) Buy in our shop");
        System.out.println("4) Exit the store");
        System.out.println("********************");
        System.out.println();

        //Exit choice - (check if input is empty or different from 1-4)
        while (true) {
            System.out.println("Please enter your choice (1-4):");
            String choiceString = TextIO.getlnString();
            if (choiceString.isEmpty() && choiceString!= "1" && choiceString!="2" && choiceString!="3" && choiceString!="4") {
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

            int choice = Integer.parseInt(choiceString);        //convert String into Int
            if (choice == 1) {
                account.accountHome();
            }

            if (choice == 2) {
                games.gamesHome();
            }

            if (choice == 3) {
                //shop.shopHome();
            }

            if (choice == 4) {
                System.out.println("Good bye, have a nice day!");
                System.exit(0);
                break;
            }
        }
    }
}
