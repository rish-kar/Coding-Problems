package easy.two_pointers._905_sort_array_by_parity;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        // Following Two Pointer resemblance to Dutch Flag

        // Case 1: If array is null (bypassing constraints) -> Throw Illegal Argument Exception
        if (nums == null) throw new IllegalArgumentException("Array passed is null");

        // Case 2: If array length is zero (bypassing constraints) -> Return nums
        if (nums.length == 0) return nums;

        // Case 3: Usual case mentioned in the question
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            if (nums[low] % 2 != 0) {
                if (nums[high] % 2 == 0) {
                    int temp = nums[low];
                    nums[low] = nums[high];
                    nums[high] = temp;
                    low++;
                    high--;
                } else high--;
            } else low++;
        }
        return nums;

    }
}

