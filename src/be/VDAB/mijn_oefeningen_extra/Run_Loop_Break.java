package be.VDAB.mijn_oefeningen_extra;

/**
 * Created by gerdhung-chu on 25/06/17.
 */
public class Run_Loop_Break {

    public static void main(String[] args) {
        int x = 1;
        while (x > 0) {
            System.out.println(x);
            if (x == 10) {
                break;      /* de break statement geeft aan waar de loop moet stoppen en verder gaan naar de volgende syntax. Hier zit je anders in een infinitive loop   */
            }
            x++;
        }

        for (int y = 10; y < 40; y = y + 5) {
            if (y == 30) {
                continue; }
                System.out.println(y);
            }
        }
    }
