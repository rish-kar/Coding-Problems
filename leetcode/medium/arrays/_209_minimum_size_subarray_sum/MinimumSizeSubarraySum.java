package medium.arrays._209_minimum_size_subarray_sum;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {

        // Case 1: Usual case mentioned in the question (no edge cases)

        int left = 0;
        int window = 0;
        int answer = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            window += nums[right];

            while (window >= target) {
                answer = Math.min(answer, right - left + 1);
                window -= nums[left];
                left++;
            }
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}
