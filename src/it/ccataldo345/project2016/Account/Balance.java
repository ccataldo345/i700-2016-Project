package it.ccataldo345.project2016.Account;

/**
 * Created by Chris01 on 28/11/2016.
 */
public class Balance {

    public String name;
    public double balance;

    public String currentBalance (String name, Double balance) {

        // set: if balance is 0 > go to InitialCredit;

        this.name = name;
        this.balance = balance;

        String creditRound = String.format("%.2f", this.balance);  // set the decimals to 2
        this.balance = Double.valueOf(creditRound);

        System.out.println("Thank you Mr. " + name + ", your balance is: " + this.balance + " Euro.");
        return "OK";
    }
}



