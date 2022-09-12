package chaper_1;

/**
 * todo Document type DeleteOuterSpaces
 */
public class DeleteOuterSpaces {

    public static String delete(String s) {

        StringBuilder result = new StringBuilder();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                result.append(s.substring(i));
                break;
            }
        }

        for (int i = result.length() - 1; i >= 0; i--) {
            if(result.charAt(i) != ' ') {
                res = result.substring(0,i + 1);
                break;
            }
        }

        return res;
    }

}
