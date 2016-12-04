package it.ccataldo345.project2016.Account;
import it.ccataldo345.project2016.Account.Account;
import lib.TextIO;

/**
 * Created by Christian Cataldo on 15/11/2016.
 Test from Practicum 2 exercises/new functions
 + added functions from Practicum 3
 + added functions from Practicum 4
 */
public class Password {

    public void setPassword() {


        System.out.println("Please enter the password: (hint: type 'password')");
        String password = TextIO.getlnString();

        //booleans + String "is equal" method
        String passwordOk = "password";
        //boolean passwordNotEqual = true;

        while (!password.equals(passwordOk)) {
            System.out.println("The password is incorrect, please try again.");
            password = TextIO.getlnString();

            if (password.equals(passwordOk)) {
                System.out.println("The password is correct.");
                break;
            }
        }

        int passwordLength = password.length(); //count lenght of text
        System.out.println("The password has " + passwordLength + " characters.");
        if (passwordLength % 2 == 0) {      //check if number is even
            System.out.println("The number " + passwordLength + " is even.");
        } else {
            System.out.println("The number " + passwordLength + " is odd.");
        }
        //replace characters (from - to)
        System.out.println("Your encrypted password is: ");
        String cryptedPassword = password.replace("a", "@").replace("s", "5").replace("o", "8");
        System.out.println(cryptedPassword);
        //String [] cryptedPW = new cryptedPassword [];  ??? transform string into array

        //set 2d array
        int size = 10;
        //char rnd = (char)('a' + 13) % 26;   do develop with random character to be printed in array table

        //set borders
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean firstRow = row == 0;
                boolean lastRow = row == size - 1;
                boolean firstCol = col == 0;
                boolean lastCol = col == size - 1;
                if (firstRow && firstCol || lastRow && firstCol) {
                    System.out.print("+  ");
                } else if (firstRow && lastCol || lastRow && lastCol) {
                    System.out.print(" +");
                } else if (firstRow || lastRow) {
                    System.out.print("- ");
                } else if (firstCol) {
                    System.out.print("| ");
                } else if (lastCol) {
                    System.out.print("  |");

                //set encrypted numbers
                } else if (row == col) {
                    System.out.print(" @");
                }else if (row == col + 3) {
                    System.out.print(" 5");
                } else if (col == row + 5) {
                System.out.print(" 8");
                }else {
                    System.out.print(" 0");
                }
            }
            System.out.println();

        }
    }
}



