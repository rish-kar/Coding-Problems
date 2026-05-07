package easy.strings._344_reverse_string;

import java.lang.classfile.Signature;
import java.util.Arrays;

public class ReverseString {
    public void reverseStringRecursive(char[] s) {

        // Case 1: Usual case mentioned in the question
        int index = 0;
        reverseRecursive(index, s);
    }

    public void reverseRecursive(int index, char[] s) {

        if (index >= s.length / 2) return;

        char temp = s[index];
        s[index] = s[s.length - index - 1];
        s[s.length - index - 1] = temp;

        reverseRecursive(index + 1, s);
    }
}
