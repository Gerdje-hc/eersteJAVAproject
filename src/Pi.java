/**
 * Created by vdabcursist on 14/06/2017.
 */
public class Pi {
    public static void main(String[] args) {
        int max = 1000;
        int sign = 1; // (e.g. positive)
        double sum = 0;
        for(int n = 1; n <= max; n += 2) {
            sum += sign * (1.0/n);
            //System.out.printf("n=%d, sign=%d\n", n, sign);
            sign *= -1;
        }
        double closeToPi = 4 * sum;
        System.out.println("Pi = " + closeToPi);

    }
}
