package easy.arrays._283_move_zeroes;

import java.util.Arrays;

public class MoveZeroesTest {

    public static void main(String[] args) {

        MoveZeroes solution = new MoveZeroes();

        // Example 1: [0,1,0,3,12] -> [1,3,12,0,0]
        runMoveZeroes(solution, new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0});

        // Example 2: [0] -> [0]
        runMoveZeroes(solution, new int[]{0}, new int[]{0});

        // No zeros
        runMoveZeroes(solution, new int[]{1, 2, 3}, new int[]{1, 2, 3});

        // All zeros
        runMoveZeroes(solution, new int[]{0, 0, 0}, new int[]{0, 0, 0});

        // Leading zeros
        runMoveZeroes(solution, new int[]{0, 0, 1}, new int[]{1, 0, 0});

        // Now test the alternative while-based implementation on same cases
        runMoveZeroesWithWhile(solution, new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0});
        runMoveZeroesWithWhile(solution, new int[]{0}, new int[]{0});
        runMoveZeroesWithWhile(solution, new int[]{1, 2, 3}, new int[]{1, 2, 3});
        runMoveZeroesWithWhile(solution, new int[]{0, 0, 0}, new int[]{0, 0, 0});
        runMoveZeroesWithWhile(solution, new int[]{0, 0, 1}, new int[]{1, 0, 0});
    }

    private static void runMoveZeroes(MoveZeroes solution, int[] input, int[] expected) {
        int[] nums = Arrays.copyOf(input, input.length);
        solution.moveZeroes(nums);
        System.out.println("moveZeroes input=" + Arrays.toString(input));
        System.out.println("  actual:   " + Arrays.toString(nums));
        System.out.println("  expected: " + Arrays.toString(expected));
        System.out.println("  pass=" + Arrays.equals(nums, expected));
        System.out.println();
    }

    private static void runMoveZeroesWithWhile(MoveZeroes solution, int[] input, int[] expected) {
        int[] nums = Arrays.copyOf(input, input.length);
        solution.moveZeroesWithWhile(nums);
        System.out.println("moveZeroesWithWhile input=" + Arrays.toString(input));
        System.out.println("  actual:   " + Arrays.toString(nums));
        System.out.println("  expected: " + Arrays.toString(expected));
        System.out.println("  pass=" + Arrays.equals(nums, expected));
        System.out.println();
    }
}
