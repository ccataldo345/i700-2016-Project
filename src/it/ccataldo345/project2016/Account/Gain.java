package it.ccataldo345.project2016.Account;

/*

* Created by Christian on 25/11/2016.

*/


import lib.TextIO;

public class Gain {

    private double period;
    private double gain;

    private static final double YIELD = 0.035;   //CONSTANT value (name with all capital letters!!!)


    public Gain() {

    }


    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }


    public void calculateGain() {

        // set: if currentCredit is 0 > go to InitialCredit;

        System.out.println("Please enter the deposit period of your currentCredit: ");
        this.period = TextIO.getlnDouble();
        System.out.printf("Please enter the initialCredit currentCredit you want to deposit: \n");

        this.gain = /*currentCredit * */this.period * YIELD;   //Gain formula
        String round = String.format("%.2f", this.gain);  // set the decimals to 2
        this.gain = Double.valueOf(round);

        System.out.println("If you deposit your currentCredit of ..., you will earn: " + this.gain + " Euro.");
        System.out.println();
        return;
    }
}








