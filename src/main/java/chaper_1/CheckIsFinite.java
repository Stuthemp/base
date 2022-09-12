package chaper_1;

/**
 * todo Document type CheckIsFinite
 */
public class CheckIsFinite {

    public static boolean check(Object o) {

        if(o instanceof Float) {
            return Float.isFinite((Float) o);
        }
        if(o instanceof Double) {
            return Double.isFinite((Double) o);
        }

        throw new IllegalArgumentException("Wrong argument");

    }

}
