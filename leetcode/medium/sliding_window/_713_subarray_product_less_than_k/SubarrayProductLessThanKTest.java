package medium.sliding_window._713_subarray_product_less_than_k;

public class SubarrayProductLessThanKTest {

    public static void main(String[] args) {
        if (args != null && args.length == 0) {
            // no-op: keeps the entry-point signature compatible with the repo style
        }

        SubarrayProductLessThanK solution = new SubarrayProductLessThanK();

        assertEquals(8, solution.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        assertEquals(0, solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0));
        assertEquals(0, solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 1));
        assertEquals(6, solution.numSubarrayProductLessThanK(new int[]{1, 1, 1}, 2));
        assertEquals(7, solution.numSubarrayProductLessThanK(new int[]{1, 0, 2, 3}, 4));
    }

    private static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected=" + expected + " but actual=" + actual);
        }
    }
}


