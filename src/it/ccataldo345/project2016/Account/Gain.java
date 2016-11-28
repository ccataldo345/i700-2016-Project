package it.ccataldo345.project2016.Account;

/*

* Created by Christian on 25/11/2016.

*/


import it.ccataldo345.project2016.Account.Account;

public class Gain {

    private double period;
    private double gain;

    private static final double YIELD = 0.035;


    public Gain() {

    }


    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }


    public double calculateGain() {
        this.gain = this.credit * this.period * YIELD;   //Gain formula
        String round = String.format("%.2f", this.gain);  // set the decimals to 2
        this.gain = Double.valueOf(round);
        return this.gain;
    }
}








