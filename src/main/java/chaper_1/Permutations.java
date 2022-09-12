package chaper_1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * todo Document type Permutations
 */
public class Permutations {

    private static Set<String> mutations;

    public static Set<String> permutations(String s) {
        mutations = new HashSet<>();
//        Set<String> chars = Arrays.stream(s.split("")).collect(Collectors.toSet());
//        StringBuilder sb = new StringBuilder("");
//
//        for (String string: chars) {
//            sb.append(string);
//        }

        itetMutate("",s);

        return mutations;
    }

    public static void itetMutate(String pref, String s) {
        if(s.length() == 1){
            mutations.add(pref + s);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String prefix  = pref;
            prefix += s.charAt(i);
            String firstPart = s.substring(0,i);
            String secondPart = s.substring(i+1);
            String arg = firstPart + secondPart;
            itetMutate(prefix, arg);
        }
    }

}
