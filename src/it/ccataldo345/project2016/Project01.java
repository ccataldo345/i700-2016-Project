/**
 * Created by Christian Cataldo on 08/11/2016.
 */

package it.ccataldo345.project2016;

import lib.TextIO;
import java.util.ArrayList;

public class Project01 {
    public static void main(String[] args) {
        System.out.println("Project by Christian Cataldo, IT College Tallinn, CSE group C11, 2016");
        System.out.println("Welcome to Java online store");
        //Create an arrayList to store the user
        ArrayList<Account> user = new ArrayList<>();


        System.out.printf("Please enter a name:\n");
        String name = TextIO.getlnString();

        System.out.printf("Please enter your initial credit you want to deposit: \n");
        double credit = TextIO.getlnDouble();

        Account newAccount = new Account(name, credit);
        user.add(newAccount);


        for (Account account : user) {
            account.greet();
        }
    }
}