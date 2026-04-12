package easy.two_pointers._922_sort_array_by_parity_ii;

import java.util.Arrays;

public class SortArrayByParityIITest {

    public static void main(String[] args) {
        SortArrayByParityII solution = new SortArrayByParityII();

        // Example 1: nums = [4,2,5,7] -> valid: even indices are even, odd indices are odd
        int[] nums1 = {4, 2, 5, 7};
        int[] out1 = solution.sortArrayByParityII(nums1);
        System.out.println("Test 1 -> " + Arrays.toString(out1) + " | valid=" + isValid(out1));

        // Example 2: nums = [2,3] -> [2,3]
        int[] nums2 = {2, 3};
        int[] out2 = solution.sortArrayByParityII(nums2);
        System.out.println("Test 2 -> " + Arrays.toString(out2) + " | valid=" + isValid(out2));

        // Larger case
        int[] nums3 = {3, 4, 1, 2, 5, 8, 7, 6};
        int[] out3 = solution.sortArrayByParityII(nums3);
        System.out.println("Test 3 -> " + Arrays.toString(out3) + " | valid=" + isValid(out3));
    }

    private static boolean isValid(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i % 2) != (arr[i] % 2)) return false;
        }
        return true;
    }
}

