package easy.strings._58_length_of_last_word;

public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {

    // Case 1: Input is null or empty (outside LeetCode constraints) -> fail fast.
    if (s == null || s.isEmpty()) {
      throw new IllegalArgumentException("Input string must be non-null and non-empty.");
    }

    // Case 2: Usual case mentioned in the question
    String trimmed = s.trim();
    int currentWordLength = 0;

    for (int i = 0; i < trimmed.length(); i++) {
      if (trimmed.charAt(i) == ' ') {
        currentWordLength = 0;
      } else {
        currentWordLength++;
      }
    }

    return currentWordLength;
  }
}
