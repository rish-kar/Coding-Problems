package easy.arrays._374_guess_number_higher_or_lower;

public class GuessNumberHigherOrLowerTest {

    public static void main(String[] args) {
        // Note: GuessNumberHigherOrLower is currently a TODO in this repo.
        // This test class is intentionally lightweight and demonstrates how to locally
        // test once the solution is implemented.

        // When implemented, uncomment these tests.
        // runTest(10, 6);
        // runTest(1, 1);
        // runTest(2, 1);
        System.out.println("TODO: Implement GuessNumberHigherOrLower.guessNumber before enabling tests.");
    }

    // Example of a local harness that simulates the judge.
    @SuppressWarnings("unused")
    private static void runTest(int n, int pick) {
        class Local extends GuessNumberHigherOrLower {
            @Override
            protected int guess(int num) {
                return Integer.compare(pick, num);
            }
        }

        Local sol = new Local();
        int actual = sol.guessNumber(n);
        System.out.println("n=" + n + ", pick=" + pick);
        System.out.println("  actual:   " + actual);
        System.out.println("  expected: " + pick);
        System.out.println();
    }
}
