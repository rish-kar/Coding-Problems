import java.util.*;

public class TestStringToIntegerAtoi {

    static class Case {
        final String input;
        final int expected;
        final String note;

        Case(String input, int expected, String note) {
            this.input = input;
            this.expected = expected;
            this.note = note;
        }
    }

    public static void main(String[] args) {
        List<Case> tests = new ArrayList<>();

        // Common examples from problem description
        tests.add(new Case("42", 42, "simple positive"));
        tests.add(new Case("   -42", -42, "leading spaces and negative sign"));
        tests.add(new Case("4193 with words", 4193, "digits then words"));
        tests.add(new Case("words and 987", 0, "words before digits -> 0"));
        tests.add(new Case("-91283472332", Integer.MIN_VALUE, "negative overflow -> clamp to min"));
        tests.add(new Case("2147483648", Integer.MAX_VALUE, "positive overflow -> clamp to max"));

        // Signs and zeros
        tests.add(new Case("+1", 1, "explicit plus"));
        tests.add(new Case("   +0 123", 0, "plus, zero then space then digits -> stop at space"));
        tests.add(new Case("0032", 32, "leading zeros"));

        // Empty and whitespace-only
        tests.add(new Case("", 0, "empty string"));
        tests.add(new Case("   ", 0, "only spaces"));
        tests.add(new Case("+", 0, "only plus sign"));
        tests.add(new Case("-", 0, "only minus sign"));

        // Mixed characters
        tests.add(new Case("00000-42a1234", 0, "zeros then non-digit '-' -> should be 0 per rules"));
        tests.add(new Case(" -0012a42", -12, "leading spaces then negative with leading zeros then letters"));
        tests.add(new Case("   +004500", 4500, "plus and leading zeros"));
        tests.add(new Case(" -   234", 0, "invalid because spaces after sign -> should be 0"));

        // Edge numeric boundaries
        tests.add(new Case("2147483647", 2147483647, "Integer.MAX_VALUE"));
        tests.add(new Case("-2147483648", -2147483648, "Integer.MIN_VALUE"));
        tests.add(new Case("  0000000000012345678", 12345678, "long with many leading zeros"));
        tests.add(new Case("91283472332", Integer.MAX_VALUE, "overflow positive should clamp to max"));

        // Additional trick cases
        tests.add(new Case("0-1", 0, "stop when non-digit encountered after initial digit(s)"));
        tests.add(new Case("   + 413", 0, "space between sign and digits is invalid -> 0"));

        run(tests);
    }

    private static void run(List<Case> tests) {
        int passed = 0;
        int failed = 0;
        int errored = 0;
        int index = 1;

        StringToIntegerAtoi solver = new StringToIntegerAtoi();

        for (Case c : tests) {
            System.out.println("Test #" + index + ": '" + c.input + "' -> expected: " + c.expected + " (" + c.note + ")");
            try {
                int actual = solver.myAtoi(c.input);
                if (actual == c.expected) {
                    System.out.println("  PASS\n");
                    passed++;
                } else {
                    System.out.println("  FAIL: got " + actual + " but expected " + c.expected + "\n");
                    failed++;
                }
            } catch (Exception e) {
                System.out.println("  ERROR: threw " + e.getClass().getSimpleName() + ": " + e.getMessage() + "\n");
                errored++;
            }
            index++;
        }

        System.out.println("========== SUMMARY ==========");
        System.out.println("Total: " + tests.size());
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Errored: " + errored);
        System.out.println("=============================");

        if (failed == 0 && errored == 0) {
            System.out.println("All tests passed!");
        } else {
            System.out.println("Some tests failed or threw exceptions. Inspect the failing cases above.");
        }
    }
}

