package it.ccataldo345.project2016;

import lib.TextIO;

/**
 * Created by Chris01 on 19/11/2016.
 */
public class Market {
    public static void main(String[] args) {

        int changeInt, coins, c0, c1, c2, c3, c4, c5, c6, c7, x1, x2, x3, x4, x5, x6, x7;
        int twoEuro, oneEuro, fiftyCent, twentyCent, tenCent, fiveCent, twoCent, oneCent;
        double cost, payment, change;


        // ask user for input

        System.out.printf("Hello, welcome to Java Market!\n");
        System.out.printf("What is the price of the item you want to buy? (0.01 to 100.00 Euro)\n");
        cost = TextIO.getDouble();


        System.out.printf("How would you like to pay? (notes of 5 to 100 Euro)\n");
        payment = TextIO.getDouble();

        change = payment - cost;
        System.out.printf("Your change is:  %.2f \n", change);

        // calculate number of coins
        changeInt = (int) Math.round(change * 100.00);

        twoEuro = 200;
        oneEuro = 100;
        fiftyCent = 50;
        twentyCent = 20;
        tenCent = 10;
        fiveCent = 5;
        twoCent = 2;
        oneCent = 1;

        c0 = changeInt / twoEuro;   //number of 2 Euro coins

        x1 = changeInt % twoEuro;   //change after 2 Euros
        c1 = x1 / oneEuro;          //number of 1 Euro coins

        x2 = x1 % oneEuro;
        c2 = x2 / fiftyCent;

        x3 = x2 % fiftyCent;
        c3 = x3 / twentyCent;

        x4 = x3 % twentyCent;
        c4 = x4 / tenCent;

        x5 = x4 % tenCent;
        c5 = x5 / fiveCent;

        x6 = x5 % fiveCent;
        c6 = x6 / twoCent;

        x7 = x6 % twoCent;
        c7 = x7 / oneCent;

        coins = c0+c1+c2+c3+c4+c5+c6+c7;

        System.out.printf("You will receive: \n");

        System.out.printf("- Coins of 2 Euro:   %d \n", c0);
        System.out.printf("- Coins of 1 Euro:   %d \n", c1);
        System.out.printf("- Coins of 50 cent:  %d \n", c2);
        System.out.printf("- Coins of 20 cent:  %d \n", c3);
        System.out.printf("- Coins of 10 cent:  %d \n", c4);
        System.out.printf("- Coins of 5 cent:   %d \n", c5);
        System.out.printf("- Coins of 2 cent:   %d \n", c6);
        System.out.printf("- Coins of 1 cent:   %d \n", c7);
        System.out.printf("==================\n");
        System.out.printf("TOTAL OF COINS:      %d \n", coins);
        System.out.printf("\n");

        if (coins > 5)
            System.out.printf("I do not like coins!");
    }
}


