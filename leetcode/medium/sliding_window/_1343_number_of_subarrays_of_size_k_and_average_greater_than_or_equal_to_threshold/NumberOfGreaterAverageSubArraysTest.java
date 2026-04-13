package medium.sliding_window._1343_number_of_subarrays_of_size_k_and_average_greater_than_or_equal_to_threshold;

public class NumberOfGreaterAverageSubArraysTest {

    public static void main(String[] args) {
        NumberOfGreaterAverageSubArrays solution = new NumberOfGreaterAverageSubArrays();

        // Example 1
        assertEquals(3, solution.numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));

        // Example 2
        assertEquals(6, solution.numOfSubarrays(new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3}, 3, 5));

        // k = 1
        assertEquals(2, solution.numOfSubarrays(new int[]{1, 5, 10}, 1, 5));

        // Bypassing constraints: null
        assertEquals(0, solution.numOfSubarrays(null, 3, 4));

        // Bypassing constraints: k <= 0
        assertThrows(() -> solution.numOfSubarrays(new int[]{1, 2, 3}, 0, 1));

        // Bypassing constraints: threshold < 0
        assertThrows(() -> solution.numOfSubarrays(new int[]{1, 2, 3}, 1, -1));

        System.out.println("NumberOfGreaterAverageSubArraysTest: ALL PASSED");
    }

    private static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected=" + expected + " but actual=" + actual);
        }
    }

    private static void assertThrows(Runnable r) {
        try {
            r.run();
            throw new AssertionError("Expected exception, but nothing was thrown");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }
}

