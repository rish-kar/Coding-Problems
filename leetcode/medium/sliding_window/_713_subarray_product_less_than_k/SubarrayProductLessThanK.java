package medium.sliding_window._713_subarray_product_less_than_k;

public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        // Case 1: If nums is null/empty or k is not large enough -> Return 0
        if (nums == null || nums.length == 0 || k <= 1) return 0;

        // Case 2: Usual sliding-window case mentioned in the question
        long product = 1L;
        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (left <= right && product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}

