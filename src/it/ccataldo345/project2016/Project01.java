/**
 * Created by Christian Cataldo on 08/11/2016.
 */

package it.ccataldo345.project2016;

import lib.TextIO;

public class Project01 {
    public static void main(String[] args) {
        System.out.println("Project by Christian Cataldo, IT College Tallinn, Cyber Security Engineering, 2016");
        Account personAccount = getPersonData();
        double gain = personAccount.calculateGain();
        System.out.println("Name: " + personAccount.getName());
        System.out.println("Credit: " + personAccount.getMoney() + " Euros.");
        System.out.println(personAccount.getName() + " will earn " + gain + " Euros in " + personAccount.getPeriod() + " years!");
    }

    public static Account getPersonData(){
        Account client = new Account();
        System.out.println("Please enter your name: ");
        client.setName(TextIO.getlnString());

        System.out.println("Please enter amount in Euros: ");
        client.setMoney(TextIO.getlnDouble());

        System.out.println("Please enter time lenght of deposit in years: ");
        client.setPeriod(TextIO.getlnDouble());
        
        return client;
    }


/*    old code:

        public static String name() {

        System.out.println("Please enter your name: ");
        ben.setName(TextIO.getlnString());
    }*/

/*    public static double money() {
        System.out.println("Please enter amount in Euros: ");
        double money01 = TextIO.getlnDouble();
        return money01;
    }*/

/*    public static double period() {
        System.out.println("Please enter time lenght of deposit in years: ");
        double time01 = TextIO.getlnDouble();
        return time01;
    }

    public static double gain() {
        double yield01 = 0.035;
        double gain01 = money() * period() * yield01;
        return gain01;
    }*/
}
