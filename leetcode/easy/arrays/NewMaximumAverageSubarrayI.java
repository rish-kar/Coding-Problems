package easy.arrays;

// 643. Maximum Average Subarray I
public class NewMaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {

        // Case 1: If array passed is null or size is 0 (bypassing constraints) -> Return 0
        if (nums == null || nums.length == 0) return 0;

        // Case 2: If k is less than 0 (bypassing constraints) -> Throw Illegal Argument Exception
        if (k <= 0) throw new IllegalArgumentException("Dividend negative.");

        // Case 3: If k > length of array -> Throw Illegal Argument Exception
        if (k > nums.length) throw new IllegalArgumentException("Scope more than data.");

        // Case 4: Usual case mentioned in the question
        double windowValue = 0;
        double answer = 0;

        for (int i=0; i<k; i++) {
            windowValue += nums[i];
        }
        answer = windowValue;

        for (int i=k; i<nums.length; i++) {
            windowValue = windowValue - nums[i-k] + nums[i];

            answer = Math.max(answer, windowValue);
        }
        return answer/k;
    }
}
