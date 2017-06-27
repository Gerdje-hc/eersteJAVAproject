package be.VDAB.les_map; /**
 * Created by vdabcursist on 13/06/2017.
 */
import java.util.Scanner;
public class RegelVanCramer {
    public static void main (String []args){
        double a=3.4, b=50.2, c=2.1, d=0.55, e=44.5, f=5.9; // je kan variabelen onder of naarst elkaar declareren

        double x, y; //voor overzicht best, de gekende waarden en de ongekende apart invoeren

        x= (e*d - b*f) / (a*d - b*c);
        y= (a*f) - (e*c) / a*d - (b*c);
        /** je kan ook volgende syntax gebruiken
         *  double x, y; --> kan je weglaten
         * double x= (e*d - b*f) / (a*d - b*c);
         * double y= (a*f) - (e*c) / a*d - (b*c);
         */

        Scanner s = new Scanner(System.in);
        System.out.println ("Geef waarden op voor a, b, c, , d , e en f: ");


        /** Kan je ook in 1 lijn declareren gescheiden door komma en beindig door punt komma
         *
         */

        System.out.println("x = " + y);
        System.out.println ("y = " + y);
    }
}
