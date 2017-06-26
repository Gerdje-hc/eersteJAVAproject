package be.mijn_oefeningen_InLes.IO;

/**
 * Created by vdabcursist on 26/06/2017.
 */
import java.io.*;

public class MyBufferedReaderExercise {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/vdabcursist/Desktop/Test Map/Alice.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {      //** Als de lines niet NULL zijn, geef alle lijnen
                //System.out.println(line);                       // ** hier kan je definieren wat hij moet doen met de lijnen ...VB afprinten print deze lijnen uit
                line =line.replaceAll(" ", "");  //** vb  alle spaties, weghalen
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
