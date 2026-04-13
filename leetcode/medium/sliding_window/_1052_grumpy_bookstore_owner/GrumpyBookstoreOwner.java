package medium.sliding_window._1052_grumpy_bookstore_owner;

public class GrumpyBookstoreOwner {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        // Case 1: If customer array is null and grumpy array is null (bypassing constraints) -> Return 0
        if (customers == null && grumpy == null) return 0;

        // Case 2: If customer array is null and grumpy array is not null (bypassing constraints) -> Throw Illegal Argument Exception
        if (customers == null && grumpy != null) throw new IllegalArgumentException("Customer array is null");

        // Case 3: If customer array is not null and grumpy array is null (bypassing constraints) -> Throw Illegal Argument Exception
        if (customers != null && grumpy == null) throw new IllegalArgumentException("Grumpy array is null");

        // Case 4: If customer array and grumpy array size does not match (bypassing constraints) -> Throw Illegal Argument Exception
        if (customers.length != grumpy.length)
            throw new IllegalArgumentException("Both array provided size is not the same");

        // Case 5: If minutes provided are in negative (bypassing constraints) -> Throw Illegal Argument Exception
        if (minutes < 0 || minutes > customers.length)
            throw new IllegalArgumentException("Minutes provided are negative or exceeding array length value");

        // Case 6: Usual case mentioned in the question
        int window = 0;
        int answer = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                window += customers[i];
            }
        }

        answer = window;

        for (int i = minutes; i < customers.length; i++) {

            window += (grumpy[i] == 1 ? customers[i] : 0);
            window -= (grumpy[i - minutes] == 1 ? customers[i - minutes] : 0);
            answer = Math.max(answer, window);

        }
        window = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                window += customers[i];
            }
        }

        answer = window + answer;

        return answer;
    }

}

