package be.VDAB.mijn_oefeningen_extra.Excercises_IO;

import java.io.File;
import java.io.IOException;

/**
 * Created by gerdhung-chu on 27/06/17.
 */
public class SearchFile_1_1 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/gerdhung-chu/Desktop/MAO-WERKMAP/alice.txt");
        f.exists();
        {
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());

        }
    }
}