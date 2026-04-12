package easy.two_pointers._922_sort_array_by_parity_ii;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {

        // Following Two Pointer resemblance to Dutch Flag

        // Case 1: If array is null (bypassing constraints) -> Throw Illegal Argument Exception
        if (nums == null) throw new IllegalArgumentException("Array passed is null");

        // Case 2: If array length is zero or 1 (bypassing constraints) -> Return nums
        if (nums.length == 0 || nums.length == 1) return nums;

        // Case 3: Usual case mentioned in the question
        int even = 0;
        int odd = 1;

        while (even < nums.length && odd < nums.length) {

            if (nums[even] % 2 != 0 && nums[odd] % 2 == 0) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            } else if (nums[even] % 2 == 0) {
                even += 2;
            } else if (nums[odd] % 2 != 0) {
                odd += 2;
            }
        }

        return nums;
    }
}

