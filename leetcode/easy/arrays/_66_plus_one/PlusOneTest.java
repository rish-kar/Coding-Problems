package easy.arrays._66_plus_one;

import java.util.Arrays;

public class PlusOneTest {

    public static void main(String[] args) {

        PlusOne solution = new PlusOne();

        // Example: [1,2,3] -> [1,2,4]
        run(solution, new int[]{1, 2, 3}, new int[]{1, 2, 4});

        // Carry in the last digit: [4,3,2,1] -> [4,3,2,2]
        run(solution, new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2});

        // Multiple carries: [9,9] -> [1,0,0]
        run(solution, new int[]{9, 9}, new int[]{1, 0, 0});

        // Single digit 9: [9] -> [1,0]
        run(solution, new int[]{9}, new int[]{1, 0});
    }

    private static void run(PlusOne solution, int[] digits, int[] expected) {
        int[] actual = solution.plusOne(Arrays.copyOf(digits, digits.length));
        System.out.println("digits=" + Arrays.toString(digits));
        System.out.println("  actual:   " + Arrays.toString(actual));
        System.out.println("  expected: " + Arrays.toString(expected));
        System.out.println();
    }
}
