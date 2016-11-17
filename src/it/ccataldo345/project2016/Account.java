package it.ccataldo345.project2016;

import java.text.DecimalFormat;

/**
 * Created by Chris01 on 16/11/2016.
 */
public class Account {
    private String name;
    private double money;
    private double period;
    private double gain;

    private static final double YIELD = 0.035;

    public double calculateGain() {
        this.gain = this.money * this.period * YIELD;
        String round = String.format("%1.2f", this.gain);  // set the decimals to 2
        this.gain = Double.valueOf(round);
        return this.gain;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }
}
