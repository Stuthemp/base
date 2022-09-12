package chaper_1;

/**
 * todo Document type IsOnlyNumbers
 */
public class IsOnlyNumbers {

    public static boolean check(String s) {

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < 48 || s.charAt(i) > 57) {
                return false;
            }
        }

        return true;
    }

}
