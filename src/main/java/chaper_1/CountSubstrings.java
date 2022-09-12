package chaper_1;

/**
 * todo Document type CountSubstrings
 */
public class CountSubstrings {

    public static int count(String string, String sub) {
        int result = 0;
        String[] splitted = string.split(sub);

        while (string.contains(sub)) {
            result++;
            string = string.substring(string.indexOf(sub) + 1);
        }

        return result;

    }


}
