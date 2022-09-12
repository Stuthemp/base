package chaper_1;

/**
 * todo Document type UnsignedNumbers
 */
public class UnsignedNumbers {

    public static void demo() {

        String s = "F";

        int result = Integer.parseUnsignedInt(s,16);
        System.out.println(result);
        System.out.println(Integer.toUnsignedString(-2_147_483_648));

    }

}
