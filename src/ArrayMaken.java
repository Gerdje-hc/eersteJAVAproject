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
}
