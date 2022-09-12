package chaper_1;

import java.util.*;

/**
 * todo Document type CheckAnagramm
 */
public class CheckAnagramm {

    public static boolean check(String s1, String s2) {
        String[] chars1 = s1.split("");
        String[] chars2 = s2.split("");

        List<String> al1 = Arrays.asList(chars1);
        List<String> al2 = Arrays.asList(chars2);

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if(!Objects.equals(chars1[i], chars2[i])) {
                return false;
            }
        }

        return true;
    }

}
