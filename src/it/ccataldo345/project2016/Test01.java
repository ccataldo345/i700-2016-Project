package it.ccataldo345.project2016;
import lib.TextIO;

/**
 * Created by Chris01 on 15/11/2016.
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("Please enter a text:");
        String name = TextIO.getlnString();

        int nameLength = name.length();
        System.out.println("The text has " + nameLength + " characters.");

        System.out.println("New text: " + name.replace('a', '_'));

    }
}
