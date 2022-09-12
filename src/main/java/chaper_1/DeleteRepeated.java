package chaper_1;

import java.util.ArrayList;

/**
 * todo Document type DeleteRepeated
 */
public class DeleteRepeated {

    public static String delete(String arg) {
        StringBuilder sb = new StringBuilder("");
        ArrayList<Character> syms = new ArrayList<>();
        for (int i = 0; i < arg.length(); i++) {
            if(syms.contains(arg.charAt(i)))
                continue;
            syms.add(arg.charAt(i));
            sb.append(arg.charAt(i));
        }

        return sb.toString();

    }

}
