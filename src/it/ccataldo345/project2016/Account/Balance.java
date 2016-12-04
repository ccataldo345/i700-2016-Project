package it.ccataldo345.project2016.Account;

/**
 * Created by Chris01 on 28/11/2016.
 */
public class Balance {

    InitialCredit initialCredit = new InitialCredit();
    //Balance balance = new Balance();

    public String name;
    public double currentCredit;

    public String currentCredit(String name, Double balance) {

        // set: if currentCredit is 0 > go to InitialCredit;

        this.name = name;
        this.currentCredit = currentCredit;
        //credit(initialCredit.getInitialCredit());



        String creditRound = String.format("%.2f", this.currentCredit);  // set the decimals to 2
        this.currentCredit = Double.valueOf(creditRound);

        System.out.println("Thank you Mr. " + name + ", your currentCredit is: " + this.currentCredit + " Euro.");
        return "OK";
    }
/*
    private void buyProduct(Account account, Product product) {
        account.setCredit(account.getCredit - product.getPrice());
//do other things here
    }*/
}



