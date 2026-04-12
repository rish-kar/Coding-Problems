package medium.two_pointers._75_sort_colors;

public class SortColors {
    public void sortColors(int[] nums) {

        // Case 1: If array passed is null (bypassing constraints) -> Throw Illegal Argument Exception
        if (nums == null) throw new IllegalArgumentException("Array passed is null.");

        // Case 2: If array length is zero (bypassing constraints) -> Do nothing since return type is void

        // Case 3: Usual case mentioned in the question
        int low = 0, mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) mid++;
            else if (nums[mid] == 2) {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            } else throw new IllegalArgumentException("Illegal array value");
        }
    }
}
