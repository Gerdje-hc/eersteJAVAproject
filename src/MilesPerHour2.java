/**
 * Created by vdabcursist on 13/06/2017.
 * Resultaat berekend door ConvertMilesPerHourF.java class functie <<< zelf aangemaakte funtie
 */
public class MilesPerHour2 {
    public static void main (String []args){
        double afstand = 14;
        int tijd = (45 * 60) + 30;
        int aantalSecondenPerUur = 3600;

        double tijdInUren = tijd /(double) aantalSecondenPerUur;
        double kilometerPerUur = afstand /tijdInUren;


        double milesPerHourConvert = ConvertMilesPerHourF.convert(kilometerPerUur);

        double eindResultaat = Math.round (milesPerHourConvert * 100) /100d;


        /** Als je een vast getal ingeeft gaat et systeem deze zien als een int
         *  Als je een komma getal ingeeft wordt deze ingezien als float
         *  vb:double tijdInUren = tijd /3600.0;
         *  of vb double tijdInUren = tijd /(double) aantalSecondenPerUur;
         */


        System.out.println(tijdInUren);



        /** Alles wordt afgerond, dit doet java omdat hij denkt dat hij 2 int moet berekenen.
         * Je gaat van de int een double maken door er een 0. achter te zetten of een d
         */

        System.out.println(eindResultaat);
        System.out.format ("%,2f", eindResultaat );




    }
}
