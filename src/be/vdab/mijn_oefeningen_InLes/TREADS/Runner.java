package be.vdab.mijn_oefeningen_InLes.TREADS;

/**
 * Created by vdabcursist on 28/06/2017.
 */

public class Runner {

    private static final int NUMBER_OF_LANES = 8;

    public static void main(String[] args) {

        String[] participants ={

                "Athlete 1",
                "Athlete 2",
                "Athlete 3",
                "Athlete 4",
                "Athlete 5",
                "Athlete 6",
                "Athlete 7",
                "Athlete 8",


        };

        for (int i= 0; i < NUMBER_OF_LANES ; i++){
            new Athlete (participants [i]).start();

        }

    }
}
