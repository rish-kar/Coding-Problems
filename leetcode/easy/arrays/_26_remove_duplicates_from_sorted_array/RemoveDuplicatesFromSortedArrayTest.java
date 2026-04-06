package easy.arrays._26_remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayTest {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Test 1 -> k=" + k1 + ", nums=" + Arrays.toString(nums1) + " | Expected: k=2, prefix=[1,2]");

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Test 2 -> k=" + k2 + ", nums=" + Arrays.toString(nums2) + " | Expected: k=5, prefix=[0,1,2,3,4]");

        int[] nums3 = {1};
        int k3 = solution.removeDuplicates(nums3);
        System.out.println("Test 3 -> k=" + k3 + ", nums=" + Arrays.toString(nums3) + " | Expected: k=1, prefix=[1]");
    }
}
