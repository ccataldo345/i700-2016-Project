package it.ccataldo345.project2016.Account;

import lib.TextIO;

/**
 * Created by Christian on 26/11/2016.
 */
public class InitialCredit {

    public String name;
    public double initialCredit;

    /*
        if (balance > 0) {
            System.out.println("You have already set your initialCredit balance.");
            account.accountHome();
        } else {*/


    public String creditSet(String name, double initialCredit) {

        this.name = name;
        this.initialCredit = initialCredit;

        String creditRound = String.format("%.2f", this.initialCredit);  // set the decimals to 2
        this.initialCredit = Double.valueOf(creditRound);

        System.out.println("Please enter your name: ");
        name = TextIO.getlnString();
        System.out.printf("Please enter the initialCredit balance you want to deposit: \n");
        initialCredit = TextIO.getlnDouble();
        System.out.println("Mr. " + name + ", your initialCredit balance is set to " + initialCredit + " Euro.");
        return "OK";
    }

    //get and set variables name and balance
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialCredit() {
        return initialCredit;
    }

    public void setInitialCredit(double initialCredit) {
        this.initialCredit = initialCredit;
    }

    public String greetAsString() {
        return "Welcome Mr. " + name + ", your credit is " + initialCredit + ".";
    }
}