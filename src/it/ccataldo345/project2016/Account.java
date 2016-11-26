package it.ccataldo345.project2016;

/**
 * Created by Christian on 16/11/2016.
 */
public class Account extends Object {
    private String name;
    private double credit;

    public Account() {

    }

    public Account(String name, double credit) {
        this.name = name;
        this.credit = credit;
        String creditRound = String.format("%.2f", this.credit);  // set the decimals to 2
        this.credit = Double.valueOf(creditRound);
    }

    public void greet() {
        System.out.println(greetAsString());
    }

    public String greetAsString() {
        return "Welcome Mr. " + name + ", your credit is " + credit + ".";
    }

    //get and set variables name and credit
    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

}
