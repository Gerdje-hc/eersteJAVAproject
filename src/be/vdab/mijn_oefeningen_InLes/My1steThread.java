package be.vdab.mijn_oefeningen_InLes;
import java.lang.*;


/**
 * Created by vdabcursist on 28/06/2017.
 */
public class My1steThread {

    class Cat implements Runnable {

        public void run() {

            Thread me = Thread.currentThread();

            System.out.println( me.getName() + "" + me.getId());

        }
    }
}
