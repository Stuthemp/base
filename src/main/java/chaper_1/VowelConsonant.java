package chaper_1;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type VowelConsonant
 */
public class VowelConsonant {

    public static String count(String s) {
        ArrayList<Character> vowels = new ArrayList<>(List.of( 'a','e','i','o','u'));
        int vowelsCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                vowelsCount++;
            } else {
                consonantCount++;
            }
        }

        return "Vowels: " + vowelsCount + " Consonants: " + consonantCount;
    }

}
