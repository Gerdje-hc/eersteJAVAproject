package les_map;

import java.util.Scanner;

/**
 * Created by vdabcursist on 14/06/2017.
 */
public class CheckPassFail {
    public static void main(String[] args) {

        System.out.println("Geef een getal op.");
        Scanner s = new Scanner(System.in);
        int mark = s.nextInt();

        if (mark >= 50) {
            System.out.println(" PASS!");
        } else
            System.out.println("FAIL!");

    }
}

