package medium.two_pointers._75_sort_colors;

import java.util.Arrays;

public class SortColorsTest {

    public static void main(String[] args) {
        SortColors solution = new SortColors();

        // Example: [2,0,2,1,1,0] -> [0,0,1,1,2,2]
        run(solution, new int[]{2, 0, 2, 1, 1, 0}, new int[]{0, 0, 1, 1, 2, 2});

        // Already sorted
        run(solution, new int[]{0, 0, 1, 1, 2, 2}, new int[]{0, 0, 1, 1, 2, 2});

        // Reverse-ish
        run(solution, new int[]{2, 2, 1, 1, 0, 0}, new int[]{0, 0, 1, 1, 2, 2});

        // Single element
        run(solution, new int[]{1}, new int[]{1});

        // Two elements
        run(solution, new int[]{2, 0}, new int[]{0, 2});

        // Illegal value should throw
        try {
            int[] bad = {0, 1, 3};
            solution.sortColors(bad);
            System.out.println("Illegal value test -> FAILED (no exception)");
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal value test -> PASSED (threw IllegalArgumentException)");
        }
    }

    private static void run(SortColors solution, int[] input, int[] expected) {
        int[] nums = Arrays.copyOf(input, input.length);
        solution.sortColors(nums);

        System.out.println("input=" + Arrays.toString(input));
        System.out.println("  actual:   " + Arrays.toString(nums));
        System.out.println("  expected: " + Arrays.toString(expected));
        System.out.println("  pass=" + Arrays.equals(nums, expected));
        System.out.println();
    }
}
