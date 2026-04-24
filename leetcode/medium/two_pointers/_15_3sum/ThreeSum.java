package medium.two_pointers._15_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        // Case 1: Usual case asked in the question
        Arrays.sort(nums);

        List<Integer> numbers;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                long sum = (long) nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    numbers = new ArrayList<>();

                    numbers.add(nums[i]);
                    numbers.add(nums[left]);
                    numbers.add(nums[right]);

                    result.add(numbers);

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else right--;
            }
        }

        return result;
    }
}
