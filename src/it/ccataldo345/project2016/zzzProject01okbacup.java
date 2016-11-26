/*
*
 * Created by Christian Cataldo on 08/11/2016.

package it.ccataldo345.project2016;

import lib.TextIO;

public class Project01okbackup {
    public static void main(String[] args) {
        System.out.println("Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016");
        Account personAccount = getPersonData();       //get data from Account Class??
        double gain = personAccount.calculateGain();
        System.out.println("Name: " + personAccount.getName());
        System.out.println("Credit: " + personAccount.getCredit() + " Euros.");
        System.out.println(personAccount.getName() + " will earn " + gain + " Euros in " + personAccount.getPeriod() + " years!");
    }

    public static Account getPersonData() {
        Account client = new Account();         //declare a new Object
        //while (true) {
        System.out.println("Please enter your name: ");
        //   String name = TextIO.getlnString();

        client.setName(TextIO.getlnString());

//            if (name.isEmpty()) {
//                break;
//            }


        System.out.println("Please enter amount in Euros: ");
        client.setCredit(TextIO.getlnDouble());

        System.out.println("Please enter time lenght of deposit in years: ");
        client.setPeriod(TextIO.getlnDouble());

        return client;
    }
}


    old code:

        public static String name() {

        System.out.println("Please enter your name: ");
        ben.setName(TextIO.getlnString());
    }

    public static double money() {
        System.out.println("Please enter amount in Euros: ");
        double money01 = TextIO.getlnDouble();
        return money01;
    }

    public static double period() {
        System.out.println("Please enter time lenght of deposit in years: ");
        double time01 = TextIO.getlnDouble();
        return time01;
    }

    public static double gain() {
        double yield01 = 0.035;
        double gain01 = money() * period() * yield01;
        return gain01;
    }

*/
