/**
 * Created by Christian Cataldo on 08/11/2016.
 * Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016
 */

package it.ccataldo345.project2016;

import lib.TextIO;
import java.util.ArrayList;

public class Project01 {
    public static void main(String[] args) {
        System.out.println("Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016");
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
/*        while (true) {
            if (choice.isEmpty()) {             //.isEmpty does not work!!!
                System.out.printf("Do you want to exit?(y/n):\n");
                Character exit = TextIO.getlnChar();
                if (exit == 'y') {
                    break;
                }
            }*/

        if (choice == 1) {

            //Create an arrayList to store the user
            ArrayList<Account> user = new ArrayList<>();


            System.out.printf("Welcome to your Java account!\n");
            System.out.println("Please enter your name: ");
            String name = TextIO.getlnString();

            System.out.printf("Please enter your initial credit you want to deposit: \n");
            double credit = TextIO.getlnDouble();


            Account newAccount = new Account(name, credit);
            user.add(newAccount);


            for (Account account : user) {
                account.greet();
            }
        }
    }
}
