# 166. Fraction to Recurring Decimal

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/166_fraction_to_recurring_decimal`
- Folder Name: `166_fraction_to_recurring_decimal`
- Official Link: https://leetcode.com/problems/fraction-to-recurring-decimal/

## Problem Overview
You are given two integers representing the numerator and denominator of a fraction, return the fraction in string format .
If the fractional part is repeating, enclose the repeating part in parentheses

## Java Starter Signature
```java
public String fractionToDecimal(int numerator, int denominator)
```

## Suggested Test Cases
1. `numerator = 1, denominator = 2` -> `"0.5"`
2. `numerator = 2, denominator = 1` -> `"2"`
3. `numerator = 4, denominator = 333` -> `"0.(012)"`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FractionToRecurringDecimal.java` contains the correct class name and Java method signature.
- `FractionToRecurringDecimalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FractionToRecurringDecimal.java` - blank Java starter solution
- `FractionToRecurringDecimalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
