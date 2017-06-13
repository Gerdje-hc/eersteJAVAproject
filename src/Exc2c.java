/**
 * Created by gerdhung-chu on 12/06/17.
 */
import java.util.Scanner;
public class Exc2c {
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
