package chaper_1;

import java.util.Arrays;

/**
 * todo Document type ConnectStrings
 */
public class ConnectStrings {

    public static String connect(String... arg) {
        String splitter = arg[arg.length - 1];

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < arg.length - 2; i++) {
            res.append(arg[i]);
            res.append(splitter);
        }

        res.append(arg[arg.length-2]);

        return res.toString();
    }

}
