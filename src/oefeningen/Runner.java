package oefeningen;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Runner {
    public static void main (String []arg){

        double x = 3+2;
        Rectangle r = new Rectangle (3.5,x);
        double a = r.getArea();
        System.out.println(a);
    }
}
