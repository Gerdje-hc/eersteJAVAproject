package be.VDAB.les_map;

import java.util.Scanner;

/**
 * Created by vdabcursist on 14/06/2017. - Oef 5.2.3
 */
public class SalaryCalculator {
    public static void main(String[] args) {

        System.out.println("Geef de naam van werknemer 1");
        Scanner s1 = new Scanner(System.in);
        String werknemer1 = s1.nextLine ();
        System.out.println("Geef de naam van werknemer 2");
        String werknemer2 = s1.nextLine();
        System.out.println("Geef de naam van werknemer 1");
        String werknemer3 = s1.nextLine();

        System.out.println("Geef de gepresteerde uren van werknemer 1");
        int urenWerkn1 = s1.nextInt();
        System.out.println("Geef de gepresteerde uren van werknemer 2");
        int urenWerkn2 = s1.nextInt();
        System.out.println("Geef de gepresteerde uren van werknemer 3");
        int urenWerkn3 = s1.nextInt();

        System.out.println("Geef de gepresteerde overuren van werknemer 1");
        int overurenWerkn1 = s1.nextInt();
        System.out.println("Geef de gepresteerde overuren van werknemer 2");
        int overurenWerkn2 = s1.nextInt();
        System.out.println("Geef de gepresteerde overuren van werknemer 3");
        int overurenWerkn3 = s1.nextInt();

        System.out.println("Geef het uurloon van werknemer 1");
        double uurloonWerkn1 = s1.nextInt();
        System.out.println("Geef het uurloon van werknemer 2");
        double uurloonWerkn2 = s1.nextInt();
        System.out.println("Geef het uurloon van werknemer 3");
        double uurloonWerkn3 = s1.nextInt();

        int totaalWerkurenwerkn1 = (urenWerkn1 + overurenWerkn1);
        int totaalWerkurenwerkn2 = (urenWerkn1 + overurenWerkn1);
        int totaalWerkurenwerkn3 = (urenWerkn1 + overurenWerkn1);

        if (totaalWerkurenwerkn1 >= 40){

            System.out.println ("Het salaris van werknemer1 is");

        } else
            System.out.println ("");







        double salarisWerkn1 = ((urenWerkn1 * uurloonWerkn1)+ ((overurenWerkn1 * uurloonWerkn1 )*1.5));
        double salarisWerkn2 = ((urenWerkn1 * uurloonWerkn1)+ ((overurenWerkn1 * uurloonWerkn1 )*1.5));
        double salarisWerkn3 = ((urenWerkn1 * uurloonWerkn1)+ ((overurenWerkn1 * uurloonWerkn1 )*1.5));

        System.out.println ("Het salaris van " + werknemer1 + "is" + salarisWerkn1);
        System.out.println ("Het salaris van " + werknemer2 + "is" + salarisWerkn2);
        System.out.println ("Het salaris van " + werknemer3 +  "is" + salarisWerkn3);

    }
}