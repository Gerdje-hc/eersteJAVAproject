package be.les_map;

import java.util.Scanner;

/**
 * Created by vdabcursist on 14/06/2017.
 */
public class PrintNumberInWords {
    public static void main(String[] args) {

        System.out.println("Geef een getal op.");
        Scanner s = new Scanner(System.in);
        int getal = s.nextInt();

        switch (getal) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }

    }
}
