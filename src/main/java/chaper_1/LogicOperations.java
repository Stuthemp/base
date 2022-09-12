package chaper_1;

/**
 * todo Document type LogicOperations
 */
public class LogicOperations {

    public static void operate(int a, int b) {

        if(a > 10 && b < 50) {
            System.out.println("AND");
        }
        if(a > 10 || b < 50) {
            System.out.println("OR");
        }
        if(a > 10 ^ b < 50) {
            System.out.println("XOR");
        }

    }

}
