package it.ccataldo345.project2016.Account;

import it.ccataldo345.project2016.Account.Account;
import lib.TextIO;

/**
 * Created by Christian on 26/11/2016.
 */
public class InitialCredit {

    //Account account = new Account();

    public String name;
    public double credit;

    /*
        if (credit > 0) {
            System.out.println("You have already set your initial credit.");
            account.greetAsString();
        } else {*/


    public InitialCredit() {

    }





    public String creditSet(String name, double credit) {

        this.name = name;
        this.credit = credit;

        String creditRound = String.format("%.2f", this.credit);  // set the decimals to 2
        this.credit = Double.valueOf(creditRound);

        System.out.println("Please enter your name: ");
        name = TextIO.getlnString();
        System.out.printf("Please enter the initial credit you want to deposit: \n");
        credit = TextIO.getlnDouble();
        System.out.println("Welcome Mr. " + name + ", your initial credit is set to " + credit + " Euro.");
        return "OK";
    }

    //get and set variables name and credit
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void greet() {
        System.out.println(greetAsString());
    }

    public String greetAsString() {
        return "Welcome Mr. " + name + ", your credit is " + credit + ".";
    }

}