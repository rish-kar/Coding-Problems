package easy.strings._242_valid_anagram;

public class ValidAnagramTest {

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        run(solution, "anagram", "nagaram", true, "Example 1");
        run(solution, "rat", "car", false, "Example 2");
        run(solution, "", "", true, "Example 3");
        run(solution, "a", "ab", false, "Length mismatch");
    }

    private static void run(ValidAnagram solution, String s, String t, boolean expected, String name) {
        boolean actual = solution.isAnagram(s, t);
        if (actual != expected) {
            throw new AssertionError(name + " failed. Expected: " + expected + ", Actual: " + actual);
        }
    }
}
