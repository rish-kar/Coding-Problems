package medium.sliding_window._1052_grumpy_bookstore_owner;

public class GrumpyBookstoreOwnerTest {

    public static void main(String[] args) {
        GrumpyBookstoreOwner solution = new GrumpyBookstoreOwner();

        // Example
        assertEquals(16, solution.maxSatisfied(
                new int[]{1, 0, 1, 2, 1, 1, 7, 5},
                new int[]{0, 1, 0, 1, 0, 1, 0, 1},
                3));

        // minutes = 0 => cannot suppress grumpy, just sum non-grumpy
        assertEquals(8, solution.maxSatisfied(
                new int[]{1, 2, 3, 4},
                new int[]{0, 1, 1, 0},
                0));

        // minutes = n => all customers satisfied
        assertEquals(10, solution.maxSatisfied(
                new int[]{1, 2, 3, 4},
                new int[]{1, 1, 1, 1},
                4));

        // Bypassing constraints: both null
        assertEquals(0, solution.maxSatisfied(null, null, 1));

        // Bypassing constraints: mismatch lengths
        assertThrows(() -> solution.maxSatisfied(new int[]{1}, new int[]{0, 1}, 1));

        // Bypassing constraints: negative minutes
        assertThrows(() -> solution.maxSatisfied(new int[]{1}, new int[]{0}, -1));

        // Bypassing constraints: minutes > n
        assertThrows(() -> solution.maxSatisfied(new int[]{1}, new int[]{0}, 2));

        System.out.println("GrumpyBookstoreOwnerTest: ALL PASSED");
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

