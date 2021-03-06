package it.ccataldo345.project2016.Account;

import it.ccataldo345.project2016.AAAMain.ProjectStart;
import lib.TextIO;

/**
 * Created by Christian on 16/11/2016.
 */
public class Account {


    private String name;
    private double credit;

    ProjectStart projectStart = new ProjectStart();
    InitialCredit initialCredit = new InitialCredit();
    Password password = new Password();
    Balance balance = new Balance();
    Gain gain = new Gain();


    public String accountHome() {

        System.out.println();
        System.out.println("********************");
        System.out.println("***** ACCOUNT ******.");
        System.out.println("What would you like to do?:");
        System.out.println("1) Set your initial Credit;");
        System.out.println("2) Check your current Credit;");
        System.out.println("3) Check your password;");
        System.out.println("4) Calculate your gain;");
        System.out.println("5) Go to the previous menu.");
        System.out.println("********************");
        System.out.println();
        System.out.println("Please enter your choice (1-5):");
        int choice = TextIO.getlnInt();

        //Exit choice
        while (true) {
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                System.out.printf("Do you want to exit?(y/n):\n");
                Character exit = TextIO.getlnChar();
                if (exit == 'y') {
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
                    break;
                } else {
                    accountHome();
                }
            }

            if (choice == 1) {
                initialCredit.creditSet(name, credit);

            }

            if (choice == 2) {
                balance.currentCredit();
                //System.out.println("aaa");
            }

            if (choice == 3) {
                password.setPassword();
            }

            if (choice == 4) {
                gain.calculateGain();
            }

            if (choice == 5) {
                projectStart.projectStart();
            }
            return "OK";
        }
        return "OK";
    }
}