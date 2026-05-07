package easy.math._231_power_of_two;

public class PowerOfTwo {
    public boolean isPowerOfTwoRecursive(int n) {

        // Case 1: If n = 0 -> Return false
        if (n == 0) return false;

        // Case 2: If n = 1 -> Return true
        if (n == 1) return true;

        // Case 3: If number is odd -> Return false directly
        if (n % 2 != 0) return false;

        // Case 4: If number is divided and reduced 2 -> Return true
        if (n / 2 == 1) return true;

        return isPowerOfTwoRecursive(n / 2);
    }
}
