package it.ccataldo345.project2016;
import lib.TextIO;

/**
 * Created by Christian Cataldo on 15/11/2016.
 Test from Practicum 2 exercises/new functions
 + added functions from Practicum 3
 */
public class Password {
    public static void main(String[] args) {
        System.out.println("Please enter the password: (hint: type 'password')");
        String password = TextIO.getlnString();

        int passwordLength = password.length(); //count lenght of text
        System.out.println("The password has " + passwordLength + " characters.");
        if (passwordLength % 2 == 0) {      //check if number is even
            System.out.println("The number " + passwordLength + " is even.");
        } else {
            System.out.println("The number " + passwordLength + " is odd.");
        }

        //booleans + String "is equal" method
        String passwordOk = "password";
        boolean passwordNotEqual = true;

        if (passwordOk.equals(password)) {
            passwordNotEqual = false;
            System.out.println("The password is correct.");
        } else {
            System.out.println("The password is incorrect.");
        }
        //replace characters (from - to)
        System.out.println("Encrypted password: " + password.replace("a", "@").replace("s", "5").replace("o", "0"));

    }

}

