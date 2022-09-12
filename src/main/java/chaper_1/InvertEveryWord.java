package chaper_1;

/**
 * todo Document type InvertEveryWord
 */
public class InvertEveryWord {

    public static String invert(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        StringBuilder revertedWord = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ' && i != s.length() - 1) {
                word.append(s.charAt(i));
            }
            if(s.charAt(i) == ' ' || i == s.length()-1){
                for (int j = 0; j < word.length(); j++) {
                    revertedWord.append(word.charAt(word.length() - 1 - j));
                }
                revertedWord.append(s.charAt(i));
                sb.append(revertedWord);
                word = new StringBuilder("");
                revertedWord = new StringBuilder("");
            }
        }

        return sb.toString();
    }

    public static String revertEverything(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

}
