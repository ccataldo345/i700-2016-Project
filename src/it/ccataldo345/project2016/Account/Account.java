package it.ccataldo345.project2016.Account;

import lib.TextIO;

/**
 * Created by Christian on 16/11/2016.
 */
public class Account extends Object {

    public String name;
    public double credit;
    InitialCredit initial = new InitialCredit();


    public void greet() {
        System.out.println(greetAsString());
    }

    public String greetAsString() {
        //return "Welcome Mr. " + name + ", your credit is " + credit + ".";
        //}
        System.out.println();
        System.out.println("Welcome to your Account.");
        System.out.println("What would you like to do?:");
        System.out.println("1) Set your initial account;");
        System.out.println("2) Check your balance;");
        System.out.println("3) Check your password;");
        System.out.println("4) Calculate your gain;");
        System.out.println("5) Go to previous menu.");
        System.out.println();

        System.out.println("Please enter your choice:");
        int choice = TextIO.getlnInt();

        //Exit choice
        while (true) {
            if (choice == 0) {
                System.out.printf("Do you want to exit?(y/n):\n");
                Character exit = TextIO.getlnChar();
                if (exit == 'y') {
                    System.out.println("Good bye, have a nice day");
                    break;
                }
            }

            if (choice == 1) {
                initial.creditSet(name, credit);
                /*//clean the interface
                public static void clearScreen() {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }*/
            }


            if (choice == 2) {

            }

    /*
        //Create an arrayList to store the user
        ArrayList<Account> user = new ArrayList<>();

        Account newAccount = new Account(name, credit);
        newAccount.greet();
        user.add(newAccount);
    }*/

            return "OK";
            //return "Welcome Mr. " + name + ", your credit is " + credit + ".";
        } return "OK";

    }
}