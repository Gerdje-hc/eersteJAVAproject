package be.VDAB.mijn_oefeningen_extra.Excercises_IO;

import java.io.File;
import java.io.IOException;

/**
 * Created by gerdhung-chu on 27/06/17.
 */
public class RenameFile {

        public static void main(String[] args) throws IOException {
            //Old File
            File oldfile =new File("/Users/gerdhung-chu/Desktop/MAO-WERKMAP/starters/alice.txt");
            //New File
            File newfile =new File("/Users/gerdhung-chu/Desktop/MAO-WERKMAP/starters/New-alice.txt");
	/*renameTo() return boolean value
	 * It return true if rename operation is
	 * successful
	 */
            boolean flag = oldfile.renameTo(newfile);
            if(flag){
                System.out.println("File renamed successfully");
            }else{
                System.out.println("Rename operation failed");
            }
        }
}

