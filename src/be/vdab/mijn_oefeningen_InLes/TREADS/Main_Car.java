package be.vdab.mijn_oefeningen_InLes.TREADS;


import java.lang.reflect.Field;

/**
 * Created by vdabcursist on 29/06/2017.
 */
public class Main_Car {

    private static Car c;

    public static void main(String[] args) {
        c = new Car(5,"black", 4);
        Class clazz = c.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        Field [] fld = clazz.getDeclaredFields();

        System.out.println(c);
        System.out.println(fld);

        for (int i = 0 ; i < fld.length ; i++) {

            System.out.println(fld[i].getName());



        }



    }
}
