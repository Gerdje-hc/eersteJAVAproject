package be.VDAB.les_map; /**
 * voorbeeld If / Els if Boolean expressie.
 */
import java.util.Scanner;

public class IfEls {
    public static void main (String []args){
        double getal;

        /** opdracht print naar scherm en geef een getal in */
        System.out.println ("Geef een getal op.");
        Scanner s = new Scanner (System.in);
        getal = s.nextInt ();


        if (getal < 10) {

            System.out.println ("Small number!");

    } else
            System.out.println ("Big number!");
        }


}
