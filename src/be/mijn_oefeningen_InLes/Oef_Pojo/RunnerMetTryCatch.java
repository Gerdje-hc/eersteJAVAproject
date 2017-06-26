package be.mijn_oefeningen_InLes.Oef_Pojo;

/**
 * Created by vdabcursist on 23/06/2017.
 */

public class RunnerMetTryCatch {


    public static void main(String[] args) {

        try {

            Dog[] dogAsiel = new Dog[3];   /* new ARRAY - Of we geven een hoeveelheid elementen in ts [] of je somt alle
                                          elementen op , verschillende manieren om op te lijsten*/

            dogAsiel[0] = new Dog("Xam", "protect");
            dogAsiel[1] = new Dog("Pluto", "fun");
            dogAsiel[2] = new Dog("Rob", "jump");
            dogAsiel[3] = new Dog("Rob", "jump");
            dogAsiel[4] = new Dog("Rob", "jump");

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(" Helaas er is geen plaats in het asiel");

        }
    }
}