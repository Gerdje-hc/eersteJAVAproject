package be.les_map;

import java.util.Scanner;

/**
 * Created by vdabcursist on 14/06/2017.
 */
public class ArrayOef {
    public static void main(String[] args) {

        System.out.println("Geef getal a, getalb, getal c");

        Scanner s = new Scanner(System.in);

        int [] getallen = new int [3];
        for (int x = 0; x < getallen.length; x++){
            getallen [x] = s.nextInt();
        }
            for(int j = 0; j < getallen.length; j++) {

                int v = getallen[j];
                System.out.println(v);

            }

    }
}
