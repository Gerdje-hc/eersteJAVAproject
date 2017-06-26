package be.mijn_oefeningen_extra;

/**
 * Created by gerdhung-chu on 25/06/17.
 */
public class Expl_lenghtString {

    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
}
