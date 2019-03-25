package it.ccataldo345.project2016.Account;


/**
 * Created by Chris01 on 28/11/2016.
 */

public class Balance {

    private String name;
    private double currentCredit = new InitialCredit().getInitialCredit();

    public String getName() {
        return new InitialCredit().getName();
    }

    public double getCurrentCredit() {
        return currentCredit;
    }

    public void currentCredit() {

        String creditRound = String.format("%.2f", currentCredit);  // set the decimals to 2
        currentCredit = Double.valueOf(creditRound);

        System.out.println("Thank you Mr. " + name + ", your currentCredit is: " + currentCredit + " Euro.");

    }
/*
    private void buyProduct(Account account, Product product) {
        account.setCredit(account.getCredit - product.getPrice());
//do other things here
    }*/
}



