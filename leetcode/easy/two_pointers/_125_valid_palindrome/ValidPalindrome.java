package easy.two_pointers._125_valid_palindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        // Case 1: If s is null -> Throw new Illegal Argument Exception
        if (s == null) throw new IllegalArgumentException("String passed is null");

        // Case 2: Usual case mentioned in the question
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {

            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
