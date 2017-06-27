package be.VDAB.mijn_oefeningen_InLes.IO;

import java.io.IOException;

/**
 * Created by gerdhung-chu on 27/06/17.
 * Voorbeeld van:
 * System.out.print           >> (output to user) schrijf de vraag naar de user (scherm)
 * byte sentence[] = new byte[200];       >>> Definieer (type and name) de input van de user >>> nieuwe array van characters
 * int size = System.in.read(sentence);   >>>> Declareer de nieuwe input (input)
 * System.out.write(sentence, 0, size); >>> (output to user) Schrijf de sentence naar het scherm
 * System.err.println(" This concludes our demonstration");  ?? Error handling ?? Als er een Error is komt deze
 * in plaats van de zin te staan. " Als er geen is verschijn This concludes our demonstration"
 * Afhankelijk van de gebruikte tty, staat in de Terminal de system.err in het rood, system.out staat in het zwart
 * en sysyem.in staat in het groen.
 */
public class Hello {
        public static void main(String[] args) throws IOException {
            System.out.print("Please enter a sentence: ");
            byte sentence[] = new byte[200];
            int size = System.in.read(sentence);
            System.out.write(sentence, 0, size);
            System.err.println(" This concludes our demonstration");
        }
    }
