package be.VDAB.mijn_oefeningen_extra;

/**
 * Created by gerdhung-chu on 25/06/17.
 *
 Given two int values, return their sum. Unless the two values are the same, then return double their sum
 */
public class Expl_Boolean {

    public int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }
}
