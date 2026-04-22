package easy.arrays._374_guess_number_higher_or_lower;

public class GuessNumberHigherOrLowerTest {

    public static void main(String[] args) {
        if (args != null && args.length == 0) {
            // no-op: keeps the entry-point signature compatible with the repo style
        }

        runTest(10, 6);
        runTest(1, 1);
        runTest(2, 1);
    }

    private static void runTest(int n, int pick) {
        class Local extends GuessNumberHigherOrLower {
            @Override
            protected int guess(int num) {
                return Integer.compare(pick, num);
            }
        }

        Local sol = new Local();
        int actual = sol.guessNumber(n);

        if (actual != pick) {
            throw new AssertionError("Expected=" + pick + " but actual=" + actual);
        }
    }
}
