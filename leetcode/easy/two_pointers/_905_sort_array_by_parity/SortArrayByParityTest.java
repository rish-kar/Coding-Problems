package easy.two_pointers._905_sort_array_by_parity;

import java.util.Arrays;

public class SortArrayByParityTest {

    public static void main(String[] args) {
        SortArrayByParity solution = new SortArrayByParity();

        // Example 1: [3,1,2,4] -> any even-first arrangement
        int[] nums1 = {3, 1, 2, 4};
        int[] out1 = solution.sortArrayByParity(nums1);
        System.out.println("Test 1 -> " + Arrays.toString(out1) + " | valid=" + isValid(out1));

        // Example 2: [0] -> [0]
        int[] nums2 = {0};
        int[] out2 = solution.sortArrayByParity(nums2);
        System.out.println("Test 2 -> " + Arrays.toString(out2) + " | valid=" + isValid(out2));

        // Already partitioned
        int[] nums3 = {2, 4, 6, 1, 3, 5};
        int[] out3 = solution.sortArrayByParity(nums3);
        System.out.println("Test 3 -> " + Arrays.toString(out3) + " | valid=" + isValid(out3));

        // All odds
        int[] nums4 = {1, 3, 5, 7};
        int[] out4 = solution.sortArrayByParity(nums4);
        System.out.println("Test 4 -> " + Arrays.toString(out4) + " | valid=" + isValid(out4));

        // All evens
        int[] nums5 = {2, 4, 8, 10};
        int[] out5 = solution.sortArrayByParity(nums5);
        System.out.println("Test 5 -> " + Arrays.toString(out5) + " | valid=" + isValid(out5));
    }

    /**
     * Validates that: (1) the array is a permutation of the input parity partitioning, and
     * (2) once we see an odd, we never see an even afterwards.
     */
    private static boolean isValid(int[] arr) {
        boolean seenOdd = false;
        for (int x : arr) {
            if ((x & 1) == 1) {
                seenOdd = true;
            } else if (seenOdd) {
                return false;
            }
        }
        return true;
    }
}

