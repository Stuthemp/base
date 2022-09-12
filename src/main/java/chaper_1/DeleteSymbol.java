package chaper_1;

/**
 * todo Document type DeleteSymbol
 */
public class DeleteSymbol {

    public static String delete(String arg, Character symb) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arg.length(); i++) {
            if(arg.charAt(i) != symb) {
                sb.append(arg.charAt(i));
            }
        }

        return sb.toString();
    }

}
