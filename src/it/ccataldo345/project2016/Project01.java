/**
 * Created by Chris01 on 08/11/2016.
 */

package it.ccataldo345.project2016;

import lib.TextIO;

public class Project01 {
    public static void main(String[] args) {
        System.out.println("Project by Christian Cataldo, IT College Tallinn, Cyber Security Engineering, 2016");
        // name();
        // money();
        System.out.println(name() + " has " + money() + " Euros.");
    }


    public static String name() {
        System.out.println("Please enter your name: ");
        String name01 = TextIO.getlnString();
        return name01;
    }

    public static int money() {
        System.out.println("Please enter amount in Euros: ");
        int money01 = TextIO.getlnInt();
        return money01;
        }
    }
