package it.ccataldo345.project2016.Shop;

import it.ccataldo345.project2016.AAAMain.ProjectStart;
import lib.TextIO;


/**
 * Created by Christian on 25/11/2016.
 */
public class Shop {

    ProjectStart projectStart = new ProjectStart();
    Food food = new Food();
    Electronics electronics = new Electronics();

    public void shopHome() {

        System.out.println();
        System.out.println("********************");
        System.out.println("*** SHOP ***");
        System.out.println();
        System.out.println("What would you like to buy?");
        System.out.println("1) Food");
        System.out.println("2) Electronics");
        System.out.println("3) Go to the previous menu.");
        System.out.println("********************");
        System.out.println();
        System.out.println("Please enter your choice (1-3):");
        int choiceShop = TextIO.getlnInt();

        //Exit choice
        while (true) {
            if (choiceShop != 1 && choiceShop != 2 && choiceShop != 3 && choiceShop != 4 && choiceShop != 5) {
                System.out.printf("Do you want to exit?(y/n):\n");
                Character exit = TextIO.getlnChar();
                if (exit == 'y') {
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
                    break;
                } else {
                    shopHome();
                }
            }

            if(choiceShop ==1) {
                //food.foodHome();
            }

            if(choiceShop ==2) {
                //electronics.electronicsHome();
            }

            if(choiceShop==3){
                projectStart.projectStart();
            }

        }
    }
}


