package easy;

public class NewFibonacciSeries {

    public int fib(int n) {

        // Case 1: If n is less than 1 -> Return directly
        if (n <= 1) return n;

        // Case 2: Usual case mentioned in the question
        return fib(n - 1) + fib(n - 2);
    }
}
