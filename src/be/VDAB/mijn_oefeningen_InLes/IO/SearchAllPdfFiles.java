package be.VDAB.mijn_oefeningen_InLes.IO;

import java.io.File;
import java.nio.file.Files;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class SearchAllPdfFiles {
    public static void main(String[] args) {
        File startdirecory = new File("/Users/gerdhung-chu/Desktop/MAO-WERKMAP/Starters/");
        if(startdirecory.listFiles() != null) {                 //** opdracht INDIEN NIET NULL (!=null) doorzoek de directory en list all files
            for (File candidate : startdirecory.listFiles())    //** Voor alle (for) Files gedefinieerd "candidate" 'zit in' startdirectory.listFiles()  .....
            {
               if (candidate.getAbsolutePath().endsWith(".txt"));  //** als  absolutePath eindigt met .txt
                candidate.length();
                {
                   System.out.println(candidate.getAbsolutePath () + " and File size in Kibi is " + candidate.length()/1024);  //** byte size gedeeld door 1024 is Kibi > kilo bytes
               }


            }
        }

        {

        }
    }
}
