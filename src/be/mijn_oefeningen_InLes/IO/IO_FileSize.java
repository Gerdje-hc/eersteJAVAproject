package be.mijn_oefeningen_InLes.IO;

import java.io.File;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class IO_FileSize {
    public static void main(String[] args) {
        File f = new File("/Users/vdabcursist/Desktop/Screen Shot 2017-06-13 at 16.06.20.png");
        f.length();
        {
            System.out.println(f.length());
        }
    }
}
