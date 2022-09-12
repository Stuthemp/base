package chaper_1;

/**
 * todo Document type FindBiggestPrefix
 */
public class FindBiggestPrefix {

    public static String find(String s1, String s2) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < (Math.min(s1.length(), s2.length())); i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                result.append(s1.charAt(i));
            }
        }

        return result.toString();

    }

}
