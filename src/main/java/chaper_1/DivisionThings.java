package chaper_1;

/**
 * todo Document type DivisionThings
 */
public class DivisionThings {

    public static void divide() {

        int divSignMinMax = Integer.MIN_VALUE / Integer.MAX_VALUE;
        System.out.println("divSignMinMax: " + divSignMinMax);

        int divSignMaxMin = Integer.MAX_VALUE / Integer.MIN_VALUE;
        System.out.println("divSignMaxMin: " + divSignMaxMin);

        int moduloSignedMinMax = Integer.MIN_VALUE % Integer.MAX_VALUE;
        System.out.println("moduloSignedMinMax: " + moduloSignedMinMax);

        int moduloSignedMaxMin = Integer.MAX_VALUE % Integer.MIN_VALUE;
        System.out.println("moduloSignedMaxMin: " + moduloSignedMaxMin);

        int divisionUnsignedMinMax = Integer.divideUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("divisionUnsignedMinMax: " + divisionUnsignedMinMax);

        int divisionUnsignedMaxMin = Integer.divideUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println("divisionUnsignedMaxMin: " + divisionUnsignedMaxMin);

        int moduloUnsignedMinMax = Integer.remainderUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("moduloUnsignedMinMax: " + moduloUnsignedMinMax);

        int moduloUnsignedMaxMin = Integer.remainderUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println("moduloUnsignedMaxMin: " + moduloUnsignedMaxMin);


    }

}
