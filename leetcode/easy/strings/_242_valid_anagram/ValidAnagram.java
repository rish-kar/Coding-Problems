package easy.strings._242_valid_anagram;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        // Case 1: Length of s is not equal to length of t -> Return false
        if (s.length() != t.length()) return false;

        // Case 2: Usual case mentioned in the question
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2)) return true;

        return false;
    }
}
