package medium.sliding_window._1343_number_of_subarrays_of_size_k_and_average_greater_than_or_equal_to_threshold;

public class NumberOfGreaterAverageSubArrays {

    public int numOfSubarrays(int[] arr, int k, int threshold) {

        // Case 1: If array passed is null (bypassing constraints) -> Return 0
        if (arr == null || arr.length == 0) return 0;

        // Case 2: If k is 0 or negative (bypassing constraints) -> Throw Illegal Argument exception
        if (k <= 0) throw new IllegalArgumentException("Value of k is invalid");

        // Case 3: If threshold is negative (bypassing constraints) -> Throw Illegal Argument exception
        if (threshold < 0) throw new IllegalArgumentException("Value of threshold is negative");

        // Case 4: Usual case mentioned in the question
        int window = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            window += arr[i];
        }
        if (window / k >= threshold) count++;

        for (int i = k; i < arr.length; i++) {
            window = window - arr[i - k] + arr[i];
            if (window / k >= threshold) count++;
        }

        return count;
    }

}

