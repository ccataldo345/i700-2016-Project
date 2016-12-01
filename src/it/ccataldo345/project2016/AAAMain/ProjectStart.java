/**
 * Created by Christian Cataldo on 08/11/2016.
 * Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016
 */

package it.ccataldo345.project2016.AAAMain;

import com.sun.org.apache.xpath.internal.SourceTree;
import it.ccataldo345.project2016.Account.Account;
import it.ccataldo345.project2016.Games.*;
import lib.TextIO;
import java.util.ArrayList;

public class ProjectStart {
    public static void main(String[] args) {

        Account account = new Account();

        System.out.println("*********************************************************************");
        System.out.println("Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016");
        System.out.println("*********************************************************************");
        System.out.println();
        System.out.println("Welcome to Java online store");
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
            if (choice == 0) {             //.isEmpty does not work!!!
                System.out.printf("Do you want to exit?(y/n):\n");
                Character exit = TextIO.getlnChar();
                if (exit == 'y') {
                    System.out.println("Good bye, have a nice day");
                    break;
                }
            }

            if (choice == 1) {
                account.greetAsString();
                /*//clean the interface
                public static void clearScreen() {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }*/



//                for (Account account : user) {
//                    account.greet();
//                }
            }

            if (choice == 2) {
                //Games;   ????ERRORRRRR
            }

            if (choice == 3) {
                //????ERRORRRRR
            }
        }
    }
}
