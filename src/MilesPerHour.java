/**
 * Created by vdabcursist on 13/06/2017.
 */
public class MilesPerHour {
    public static void main (String []args){
        double afstand = 14;
        int tijd = (45 * 60) + 30;

        int aantalSecondenPerUur = 3600;


        /** Als je een vast getal ingeeft gaat et systeem deze zien als een int
         *  Als je een komma getal ingeeft wordt deze ingezien als float
         *  vb:double tijdInUren = tijd /3600.0;
         *  of vb double tijdInUren = tijd /(double) aantalSecondenPerUur;
         */
        double tijdInUren = tijd /(double) aantalSecondenPerUur;

        System.out.println(tijdInUren);

        double kilometerPerUur = afstand /tijdInUren;
        double mijlPerUur = kilometerPerUur /1.6;
        double eindResultaat = Math.round (mijlPerUur * 100) /100d;

        /** Alles wordt afgerond, dit doet java omdat hij denkt dat hij 2 int moet berekenen.
         * Je gaat van de int een double maken door er een 0. achter te zetten of een d
         */

        System.out.println(eindResultaat);
        System.out.format ("%,2f", mijlPerUur );



    }
}
