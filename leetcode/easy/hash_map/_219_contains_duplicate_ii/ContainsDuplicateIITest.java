package easy.hash_map._219_contains_duplicate_ii;
public class ContainsDuplicateIITest {
    public static void main(String[] args) {
        ContainsDuplicateII solution = new ContainsDuplicateII();
        boolean r1 = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        System.out.println("nums = [1,2,3,1], k = 3");
        System.out.println("  Actual:   " + r1);
        System.out.println("  Expected: true");
        System.out.println();
        boolean r2 = solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
        System.out.println("nums = [1,0,1,1], k = 1");
        System.out.println("  Actual:   " + r2);
        System.out.println("  Expected: true");
        System.out.println();
        boolean r3 = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
        System.out.println("nums = [1,2,3,1,2,3], k = 2");
        System.out.println("  Actual:   " + r3);
        System.out.println("  Expected: false");
    }
}