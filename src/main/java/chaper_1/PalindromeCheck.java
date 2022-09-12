package chaper_1;

/**
 * todo Document type PolindromCheck
 */
public class PalindromeCheck {

    public static boolean check(String s) {

        if(s.length() % 2 == 0){
            return s.substring(0,s.length()/2).equals(InvertEveryWord.revertEverything(s.substring(s.length()/2)));
        } else {
            s = s.substring(0,s.length()/2) + s.substring(s.length()/2 + 1);
            return s.substring(0,s.length()/2).equals(InvertEveryWord.revertEverything(s.substring(s.length()/2)));
        }

    }

}
