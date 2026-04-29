package medium.hash_map._347_top_k_frequent_elements;

import java.util.Arrays;

public class TopKFrequentElementsTest {

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();

        run(solution, new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}, "Example 1");
        run(solution, new int[]{1}, 1, new int[]{1}, "Example 2");
        run(solution, new int[]{4, 1, -1, 2, -1, 2, 3}, 2, new int[]{-1, 2}, "Mixed values");
    }

    private static void run(TopKFrequentElements solution, int[] nums, int k, int[] expected, String name) {
        int[] actual = solution.topKFrequent(nums, k);

        int[] sortedActual = Arrays.copyOf(actual, actual.length);
        int[] sortedExpected = Arrays.copyOf(expected, expected.length);
        Arrays.sort(sortedActual);
        Arrays.sort(sortedExpected);

        if (!Arrays.equals(sortedActual, sortedExpected)) {
            throw new AssertionError(name + " failed. Expected: " + Arrays.toString(sortedExpected)
                    + ", Actual: " + Arrays.toString(sortedActual));
        }
    }
}
