package medium.strings._166_fraction_to_recurring_decimal;
public class FractionToRecurringDecimalTest {
    public static void main(String[] args) {
        FractionToRecurringDecimal solution = new FractionToRecurringDecimal();
        String r1 = solution.fractionToDecimal(1, 2);
        System.out.println("numerator = 1, denominator = 2");
        System.out.println("  Actual:   " + r1);
        System.out.println("  Expected: 0.5");
        System.out.println();
        String r2 = solution.fractionToDecimal(2, 1);
        System.out.println("numerator = 2, denominator = 1");
        System.out.println("  Actual:   " + r2);
        System.out.println("  Expected: 2");
        System.out.println();
        String r3 = solution.fractionToDecimal(2, 3);
        System.out.println("numerator = 2, denominator = 3");
        System.out.println("  Actual:   " + r3);
        System.out.println("  Expected: 0.(6)");
    }
}