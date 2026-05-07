package easy.math._326_power_of_three;

public class PowerOfThree {
    public boolean isPowerOfThreeRecursive(int n) {

        // Case 1: If n = 1 -> Return true
        if (n == 1) return true;

        // Case 2: If n <= 0 or n has a remainder -> Return false
        if (n <= 0 || n % 3 != 0) return false;

        return isPowerOfThreeRecursive(n / 3);

    }
}
