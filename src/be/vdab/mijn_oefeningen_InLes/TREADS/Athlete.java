package be.vdab.mijn_oefeningen_InLes.TREADS;

import sun.jvm.hotspot.runtime.Threads;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Athlete extends Thread {
    private String name;

    public Athlete (String name) {
        this.name = name;
    }

    public void run() {
        double distanceTraveled = 0;
        while (distanceTraveled < 100) {
            distanceTraveled += step();
            System.out.println(name + " has covered " + distanceTraveled + " meters ");
            linger();
        }
    }

    private double step() {

        int min = 1;
        int max = 3;
        return min + Math.random() * (max -min);    /*

       /* System.exit(0); */

    }
    public void linger() {
        try {
            Thread.sleep (500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
