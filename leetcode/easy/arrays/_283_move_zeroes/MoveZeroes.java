package easy.arrays._283_move_zeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // Case 1: One element -> nothing to move.
        if (nums.length == 1) return;

        // Case 2: Two pointers.
        // leftPointer -> where the next non-zero should go.
        // scanPointer -> scans ahead looking for the next non-zero.
        for (int leftPointer = 0, scanPointer = 1;
             leftPointer < nums.length - 1 && scanPointer < nums.length;
             scanPointer++) {

            // Case 3: Current slot is zero -> swap in the next non-zero.
            if (nums[leftPointer] == 0) {
                if (nums[scanPointer] != 0) {
                    nums[leftPointer] = nums[scanPointer];
                    nums[scanPointer] = 0;
                    leftPointer++;
                    scanPointer = leftPointer;
                }
            } else {
                leftPointer++;
                scanPointer = leftPointer;
            }
        }
    }

    public void moveZeroesWithWhile(int[] nums) {
        // Following Dutch Parity Pattern
        // Case 1: If array is null (bypassing constraints) -> Throw Illegal Argument Exception
        if (nums == null) throw new IllegalArgumentException("Array passed is null");

        // Case 2: If array is empty (bypassing constraints) -> Do nothing since there is nothing to return
        if (nums.length == 0) return;

        // Case 3: Usual Case
        int reader = 0, writer = 0;

        while (reader != nums.length - 1) {
            if (writer >= nums.length) break;
            if (nums[reader] != 0) {
                reader++;
                writer++;
            } else {
                if (writer < nums.length && nums[writer] == 0) writer++;
                else if (writer < nums.length && nums[writer] != 0) {

                    nums[reader] = nums[writer];
                    nums[writer] = 0;
                    reader++;
                    writer = reader;

                }
            }
        }
    }
}
