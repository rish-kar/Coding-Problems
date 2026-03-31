package easy.strings._67_add_binary;

public class AddBinary {
  public String addBinary(String a, String b) {

    // Case 1: If both strings are null or empty -> Illegal Argument Exception
    if ((a.isEmpty() || a == null) && (b.isEmpty() || b == null)) throw new IllegalArgumentException(
        "Strings passed are null or empty");

    // Case 2: If first string is not null, second string is null/empty -> Return first string
    if (!a.isEmpty() && (b.isEmpty() || b == null)) return a;

    // Case 3: If first string is null/empty, second string is not null -> Return second string
    if ((a.isEmpty() || a == null) && !b.isEmpty()) return b;

    // Case 4: Usual case mentioned in the question
    StringBuilder finalString = new StringBuilder();
    StringBuilder aBuilder = new StringBuilder(a).reverse();
    StringBuilder bBuilder = new StringBuilder(b).reverse();

    int maxLen = Math.max(a.length(), b.length());
    int carry = 0;

    for (int i = 0; i < maxLen; i++) {

      int digitA = (i < aBuilder.length()) ? aBuilder.charAt(i) - '0' : 0;
      int digitB = (i < bBuilder.length()) ? bBuilder.charAt(i) - '0' : 0;

      int sum = digitA + digitB + carry;

      finalString.append(sum % 2);
      carry = sum / 2;
    }

    if (carry != 0) finalString.append(carry);

    return finalString.reverse().toString();
  }
}
