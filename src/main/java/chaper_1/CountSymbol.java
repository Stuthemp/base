package chaper_1;

import java.util.HashMap;
import java.util.Map;

/**
 * todo Document type CountSymbol
 */
public class CountSymbol {

    public static HashMap<Character, Integer> count(String s){

        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
                if(result.containsKey(s.charAt(i))) {
                    int quantity = result.get(s.charAt(i));
                    quantity += 1;
                    result.put(s.charAt(i), quantity);
                } else {
                    result.put(s.charAt(i), 1);
                }
        }

        return result;
    }

}
