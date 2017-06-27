package be.VDAB.les_map;

/**
 * Created by vdabcursist on 13/06/2017.
 */
public class Primer {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (Primer.isPrimeNumber(i)) {
                System.out.println(i);

            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        } else {
            int deler = 2;
            while (deler < n - 1) {
                int rest = n % deler;
                if (rest == 0) {
                    return false;
                }
                deler++;
            }
        }
        return true;
    }


}
