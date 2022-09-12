package chaper_1;

import java.util.Objects;

/**
 * todo Document type ConvertType
 */
public class ConvertType {

    public static Object convert(String arg) {

        try {
            Integer toInt = Integer.valueOf(arg);
            return toInt;
        } catch (NumberFormatException e1) {
            try {
                Long toLong = Long.parseLong(arg);
                return toLong;
            } catch (NumberFormatException e2) {
                try {
                    Float toFloat = Float.valueOf(arg);
                    return toFloat;
                } catch (NumberFormatException e3) {
                    try {
                        Double toDouble = Double.valueOf(arg);
                        return toDouble;
                    } catch (NumberFormatException e4) {
                        System.out.println(e4);
                    }
                }
            }
        }
        throw new IllegalArgumentException("Wrong argument");
    }


}
