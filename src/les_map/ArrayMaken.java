package les_map;

import java.util.Scanner;

/**
 * Created by vdabcursist on 14/06/2017.
 */
public class ArrayMaken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);   /** A) Geef een scanner in */
        int[] getallen = new int[5];          /** B) Geeft een nieuwe ARRAY op */

        for (int X = 0; X < getallen.length; X++) {  /** C) Geef de opdracht om alle getallen te declarere

         Normaal zouden we dit zo kunnen doen voor elke waarde in de array
         getallen [0] = s.nextInt ();
         getallen [1] = s.nextInt ();
         getallen [2] = s.nextInt ();

         Maar hiervoor maken we efficienter een LOOP aan

         */
            System.out.print("Geef getal" + (X + 1) + "van" + getallen.length + ":");
            getallen[X] = s.nextInt();

            System.out.println("De opgegeven getallen zijn: ");


        }

        for (int j = 0; j < getallen.length; j++) {
            System.out.print(getallen[j] + " ");

        }

    }

    public static class Exc2c {
        public static void main (String[]args) {
            double getal1, getal2, getal3,totaal,gemiddelde;
            /** 1) ingeven van de variabelen - kan overal als je ze nodig hebt) */
            Scanner in =  new Scanner (System.in);
            /** Leest in wat de gebruiker ingeeft in het keybord */
            System.out.println(" Geef getal 1");
            /** Print de vraag om iets in te geven naar het scherm */
            getal1 = in.nextInt();
            /** Bepaalt de naam en het type van de variabele waar de input moet in worden opgeslagen */
            System.out.println(" Geef getal 2");
            getal2 = in.nextInt();
            System.out.println(" Geef getal 3");
            getal3 = in.nextDouble();

            totaal = getal1+getal2+getal3;
            gemiddelde = totaal/3;
            System.out.printf (" Het gemiddelde van uw 3 getallen is "+ gemiddelde);
            System.out.println();


        }
    }

    public static class exercise2a{
        public static void main(String[]args) {
            int price=35;
            int quantity=5;
            double tax=(0.21);
            double totaal=(price*quantity);

            System.out.println("The total price is "+ (totaal+(totaal*tax)));
        }
    }

    /**
     * Created by vdabcursist on 14/06/2017.
     */
    public static class Pi {
        public static void main(String[] args) {
            int max = 1000;
            int sign = 1; // (e.g. positive)
            double sum = 0;
            for(int n = 1; n <= max; n += 2) {
                sum += sign * (1.0/n);
                //System.out.printf("n=%d, sign=%d\n", n, sign);
                sign *= -1;
            }
            double closeToPi = 4 * sum;
            System.out.println("les_map.ArrayMaken.Pi = " + closeToPi);

        }
    }
}
