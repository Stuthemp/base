package chaper_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * todo Document type Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(CountSyms.count("abcdagsdgb"));
        System.out.println(FindNotFirstRepeated.find("abcdagsdgb"));
        System.out.println(InvertEveryWord.invert("Who are you?"));
        System.out.println(InvertEveryWord.revertEverything("Who are you?"));
        System.out.println(IsOnlyNumbers.check("9095a738z952609e125723151331538"));
        System.out.println(VowelConsonant.count("abcefigoju"));
        HashMap<Character, Integer> quantity = CountSymbol.count("aabbbccccdeeeee");
        for (Map.Entry<Character, Integer> entry: quantity.entrySet()) {
            System.out.println("Char: " + entry.getKey() + " Val: " + entry.getValue());
        }
        Object i = ConvertType.convert("12");
        System.out.println(i.getClass().getName());
        i = ConvertType.convert("4294967295");
        System.out.println(i.getClass().getName());
        i = ConvertType.convert("12.3");
        System.out.println(i.getClass().getName());
        System.out.println(DeleteSpaces.delete("I am jonny"));
        System.out.println(ConnectStrings.connect("a","b","c","d","-"));
        String a = "12345678";
        String fp = a.substring(0,4);
        String sp = a.substring(5);
        System.out.println(fp + " " + sp);
        Set<String> muts = Permutations.permutations("AABC");
        System.out.println(PalindromeCheck.check("ABCBA"));
        System.out.println(DeleteRepeated.delete("ABBCSSDDD"));
        System.out.println(DeleteSymbol.delete("AFBFNFMFMSF",'F'));
        System.out.println(FIndMostRepeated.find("AABBBBBCCCDDDD"));
        String[] strings = SortStringLength.sort(new String[] {"asd","asdd","a"});
        for (int j = 0; j < strings.length; j++) {
            System.out.println(strings[j]);
        }
        System.out.println(FindSubstring.find("ALABAMA","BAMA"));
        System.out.println(CountSubstrings.count("Abcfbcgbc","bc"));
        System.out.println(CheckAnagramm.check("abc","acb"));
        System.out.println(ConcatSameString.concat("abc",3));
        System.out.println(DeleteOuterSpaces.delete(" asd  "));
        System.out.println(FindBiggestPrefix.find("asdzxc","asdzjokg"));
        UnsignedNumbers.demo();
        System.out.println(CompareUnsigned.compare(-1234,123));
        DivisionThings.divide();
        System.out.println(CheckIsFinite.check(3.5D));
        LogicOperations.operate(11,49);
        FloatingPoint.next(1);

    }
}
