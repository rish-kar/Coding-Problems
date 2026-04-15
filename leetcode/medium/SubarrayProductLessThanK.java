package medium;

// 713. Subarray Product Less Than K
public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        // Case 1: If target (k) is zero -> Return zero
        if (k == 0) return 0;

        // Case 2: Usual case mentioned in the question
        int multipliedValue = 0;
        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] * 1 < k) count++;

            multipliedValue = multipliedValue * nums[right];
            count++;

            while (multipliedValue > k) {
                multipliedValue = multipliedValue / nums[left];
                left++;
                count--;
            }

        }
        return count;
    }


    public static void main() {

        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println("Answer: " + numSubarrayProductLessThanK(nums, k));
    }
}
