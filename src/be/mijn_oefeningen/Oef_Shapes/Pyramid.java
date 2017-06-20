package be.mijn_oefeningen.Oef_Shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Pyramid {

        public static void main(String[] args) {
            for(int i = 0; i < 10; i++) {
                printPiramid(i);
                System.out.println();
            }


        }

        private static void printPiramid(int height) {
            for(int d = 0; d <= height; d++) {

                for(int s = 0; s < height - d; s++) {
                    System.out.print("\t");
                }

                for(int w = 0; w <= d; w++) {
                    printPowerOf(2, w);
                }
                for(int w = d - 1; w >= 0; w--) {
                    printPowerOf(2, w);
                }
                System.out.println();


            }
        }

        public static void printPowerOf(int base, int exponent) {
            int val = (int) Math.pow(base, exponent);
            System.out.print(val + "\t");
        }
    }
