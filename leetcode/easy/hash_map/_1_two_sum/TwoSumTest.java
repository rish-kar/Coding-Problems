package easy.hash_map._1_two_sum;

public class TwoSumTest {

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] r1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        printResult("nums=[2,7,11,15], target=9", r1, new int[]{0, 1});

        int[] r2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        printResult("nums=[3,2,4], target=6", r2, new int[]{1, 2});

        int[] r3 = solution.twoSum(new int[]{3, 3}, 6);
        printResult("nums=[3,3], target=6", r3, new int[]{0, 1});
    }

    private static void printResult(String label, int[] actual, int[] expected) {
        System.out.println(label);
        System.out.println("  Actual:   " + arrayToString(actual));
        System.out.println("  Expected: " + arrayToString(expected));
        System.out.println();
    }

    private static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        if (arr.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(",");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
