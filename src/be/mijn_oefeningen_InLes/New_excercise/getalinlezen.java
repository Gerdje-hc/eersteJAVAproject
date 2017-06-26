package be.mijn_oefeningen_InLes.New_excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class getalinlezen {

    public static void main (String [ ]args ) {

        Scanner s = new Scanner(System.in);

        System.out.println("Geef een getal op ");
        int getal = s.nextByte();

        System.out.println("Getal is " + getal);
        try {
            getal = s.nextInt();
            System.out.println("Geozen getal is : " + getal);
        } catch (InputMismatchException e) {
            s.reset();
            System.out.println("Er is een foute invoer gebeurd!");
        }
    }

}
