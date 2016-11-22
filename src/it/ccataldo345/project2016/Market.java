package it.ccataldo345.project2016;

import lib.TextIO;

/**
 * Created by Christian Cataldo on 19/11/2016.
 */
public class Market {
    public static void main(String[] args) {

        int coins, c0, c1, c2, c3, c4, c5, c6, c7;  //no. of coins
        double x1, x2, x3, x4, x5, x6, x7;          //change after x coin value
        double k0, k1, k2, k3, k4, k5, k6, k7, kTot;    //check value cx x coin value
        double twoEuro, oneEuro, fiftyCent, twentyCent, tenCent, fiveCent, twoCent, oneCent;    //coin value
        double cost, payment, changeTotal, changeNotes, changeCoins;    //input/output



        // ask user for input

        System.out.printf("Hello, welcome to Java Market!\n");
        System.out.printf("What is the price of the item you want to buy? (insert amount in Euro)\n");
        cost = TextIO.getDouble();
        System.out.printf("How would you like to pay? (insert amount in Euro)\n");
        payment = TextIO.getDouble();

        //calculate change
        changeTotal = payment - cost;

        //paymant less than cost
        if (payment < cost) {
            System.out.printf("Please add %.2f Euro.\n", (cost-payment));
            return;
        }

        //Payment equal cost, no change due
        if (changeTotal == 0) {
            System.out.printf("No change is due. Thanks for buying at Java Market. \n");
            return;
        }

        //payment more than cost, change calculation
        System.out.printf("Your total change is: %.2f Euro.\n", changeTotal);
        System.out.println();

        changeNotes = ((int)changeTotal / 5) * 5;
        changeCoins = changeTotal - changeNotes;


        System.out.printf("Your change in notes is: %.2f Euro.\n", changeNotes);
        System.out.println();

        changeCoins = changeTotal - changeNotes;
        System.out.printf("Your change in coins is: %.2f Euro.\n", changeCoins);
        System.out.println();
        changeCoins = Math.round(changeCoins*100.00);

        // calculate number of coins

        //coins value
        twoEuro = 200;
        oneEuro = 100;
        fiftyCent = 50;
        twentyCent = 20;
        tenCent = 10;
        fiveCent = 5;
        twoCent = 2;
        oneCent = 1;

        c0 = (int)(changeCoins / twoEuro);      //number of 2 Euro coins
        x1 = changeCoins % twoEuro;             //change after 2 Euros
        c1 = (int)(x1 / oneEuro);               //number of 1 Euro coins
        x2 = x1 % oneEuro;
        c2 = (int)(x2 / fiftyCent);
        x3 = x2 % fiftyCent;
        c3 = (int)(x3 / twentyCent);
        x4 = x3 % twentyCent;
        c4 = (int)(x4 / tenCent);
        x5 = x4 % tenCent;
        c5 = (int)(x5 / fiveCent);
        x6 = x5 % fiveCent;
        c6 = (int)(x6 / twoCent);
        x7 = x6 % twoCent;
        c7 = (int)(x7 / oneCent);

        coins = c0 + c1 + c2 + c3 + c4 + c5 + c6 + c7;    //total number of coins

        k0 = c0 * twoEuro;      //result of no. of coins x coin value
        k1 = c1 * oneEuro;
        k2 = c2 * fiftyCent;
        k3 = c3 * twentyCent;
        k4 = c4 * tenCent;
        k5 = c5 * fiveCent;
        k6 = c6 * twoCent;
        k7 = c7 * oneCent;
        kTot = (k0 + k1 + k2 + k3 + k4 + k5 + k6 + k7);



        System.out.printf("- Coins of 2 Euro:   %d  (%.2f)\n", c0, k0/100);
        System.out.printf("- Coins of 1 Euro:   %d  (%.2f)\n", c1, k1/100);
        System.out.printf("- Coins of 50 cent:  %d  (%.2f)\n", c2, k2/100);
        System.out.printf("- Coins of 20 cent:  %d  (%.2f)\n", c3, k3/100);
        System.out.printf("- Coins of 10 cent:  %d  (%.2f)\n", c4, k4/100);
        System.out.printf("- Coins of 5 cent:   %d  (%.2f)\n", c5, k5/100);
        System.out.printf("- Coins of 2 cent:   %d  (%.2f)\n", c6, k6/100);
        System.out.printf("- Coins of 1 cent:   %d  (%.2f)\n", c7, k7/100);
        System.out.printf("======================\n");
        System.out.printf("TOTAL NO. OF COINS:  %d  (%.2f)\n", coins, kTot/100);
        System.out.printf("\n");

        if (coins > 5)
            System.out.printf("I do not like coins!");
    }
}

