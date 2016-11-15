/**
 * Created by Chris01 on 08/11/2016.
 */

package it.ccataldo345.project2016;

import lib.TextIO;

public class Project01 {
    public static void main(String[] args) {
        System.out.println("Project by Christian Cataldo, IT College Tallinn, Cyber Security Engineering, 2016");
        name();
    }


    public static String name() {
        System.out.println("Please enter your name: ");
        String x = TextIO.getlnString();
        return x;
        }
    }
