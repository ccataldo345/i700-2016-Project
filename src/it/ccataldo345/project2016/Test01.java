package it.ccataldo345.project2016;

/**
 * Created by Chris01 on 17/11/2016.
 */
public class Test01 {
    public static void main(String[] args) {
        char rndChar = (char)(('a' + Math.random() * 26));
        int [] rndInt = new int [5];
        for (int i = 0; i < rndInt.length; i++) {
            System.out.println(rndInt[i]);
        }

    }
}
