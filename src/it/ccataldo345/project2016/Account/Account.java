package it.ccataldo345.project2016.Account;

import lib.TextIO;

/**
 * Created by Christian on 16/11/2016.
 */
public class Account extends Object {

    public Account() {

    }

    public Account() {

        System.out.println("Welcome to your Java Account");
        System.out.println();
        System.out.println("What would you like to do?:");
        System.out.println("1) Set your initial account;");
        System.out.println("2) Check your balance;");
        System.out.println("3) Check your password;");
        System.out.println("3) Calculate your gain;");
        System.out.println();

        System.out.println("Please enter your choice:");
        int choice = TextIO.getlnInt();

        if (choice == 1)

        {

            //Create an arrayList to store the user
            ArrayList<Account> user = new ArrayList<>();

            Account newAccount = new Account(name, credit);
            newAccount.greet();
            user.add(newAccount);
        }

    }

}