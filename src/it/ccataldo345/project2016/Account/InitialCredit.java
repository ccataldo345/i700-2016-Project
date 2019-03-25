package it.ccataldo345.project2016.Account;

import lib.TextIO;

/**
 * Created by Christian on 26/11/2016.
 */
public class InitialCredit {

    private String name;
    private double initialCredit = 0;
    private double deposit = 0;
    private double currentCredit = 0;

    //get and set variables name and currentCredit
    public String getName() {
        return this.name;
    }

    public double getInitialCredit() {
        return initialCredit;
    }

    public void makeDeposit(double initialCredit) {
        this.initialCredit = initialCredit;
    }

    public void creditSet(String name, double initialCredit) {

        Account account = new Account();

        String creditRound = String.format("%.2f", this.initialCredit);  // set the decimals to 2
        this.initialCredit = Double.valueOf(creditRound);

        if (initialCredit > 0) {
            System.out.println("You have already set your initial currentCredit.");
            account.accountHome();
        } else {
            System.out.println("Please enter your name: ");
            name = TextIO.getlnString();
            //Balance.name = name;
            System.out.printf("Please enter the amount you want to deposit: \n\n");
            initialCredit = TextIO.getlnDouble();
            //Balance.currentCredit = initialCredit;
            System.out.println("Mr. " + name + ", your initial Credit is set to " + initialCredit + " Euro.");
        }

        account.accountHome();
    }

}