package chaper_1;

import java.util.HashMap;
import java.util.Map;

/**
 * todo Document type FindNotFirstRepeated
 */
public class FindNotFirstRepeated {

    public static Character find(String s) {
        int repeated = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int currentValue =  map.get(s.charAt(i));
                currentValue++;
                map.put(s.charAt(i),currentValue);
                continue;
            }
            map.put(s.charAt(i),1);
        }

        for (Map.Entry<Character, Integer> e: map.entrySet()) {
            if(e.getValue() == 1) {
                return e.getKey();
            }
        }

        throw new IllegalArgumentException("No repeated symbol found");
    }

}
