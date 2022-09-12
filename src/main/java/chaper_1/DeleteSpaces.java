package chaper_1;

/**
 * todo Document type DeleteSpaces
 */
public class DeleteSpaces {

    public static String delete(String s) {
        String[] splitted = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String string: splitted) {
            result.append(string);
        }

        return result.toString();
    }

}
