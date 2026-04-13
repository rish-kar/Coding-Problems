package easy.sliding_window._643_maximum_average_subarray_i;

public class MaximumAverageSubarrayITest {

    public static void main(String[] args) {
        MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();

        // Example 1
        assertDoubleEquals(12.75, solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));

        // Single window equals whole array
        assertDoubleEquals(2.0, solution.findMaxAverage(new int[]{2}, 1));

        // Negative numbers
        assertDoubleEquals(-2.0, solution.findMaxAverage(new int[]{-1, -2, -3}, 1));

        // Bypassing constraints: null
        assertDoubleEquals(0.0, solution.findMaxAverage(null, 1));

        // Bypassing constraints: k <= 0
        assertThrows(() -> solution.findMaxAverage(new int[]{1, 2, 3}, 0));

        // Bypassing constraints: k > n
        assertThrows(() -> solution.findMaxAverage(new int[]{1, 2, 3}, 4));

        System.out.println("MaximumAverageSubarrayITest: ALL PASSED");
    }

    private static void assertDoubleEquals(double expected, double actual) {
        double eps = 1e-9;
        if (Math.abs(expected - actual) > eps) {
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

