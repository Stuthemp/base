package chaper_1;

import java.util.HashMap;
import java.util.Map;

/**
 * todo Document type FIndMostRepeated
 */
public class FIndMostRepeated {

    public static Character find(String s) {
        HashMap<Character, Integer> hm = CountSymbol.count(s);
        int max = 0;
        Character res = ' ';
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                res = e.getKey();
            }
        }

        return res;
    }

}
