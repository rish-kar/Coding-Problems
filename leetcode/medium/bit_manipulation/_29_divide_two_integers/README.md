# 29. Divide Two Integers

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/bit_manipulation/29_divide_two_integers`
- Folder Name: `29_divide_two_integers`
- Official Link: https://leetcode.com/problems/divide-two-integers/

## Problem Overview
You are given two integers dividend and divisor , divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8 , and -2.7335 would be truncated to -2 .

## Java Starter Signature
```java
public int divide(int dividend, int divisor)
```

## Suggested Test Cases
1. `dividend = 10, divisor = 3` -> `3`
2. `dividend = 7, divisor = -3` -> `-2`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `divide` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DivideTwoIntegers.java` contains the correct class name and Java method signature.
- `DivideTwoIntegersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DivideTwoIntegers.java` - blank Java starter solution
- `DivideTwoIntegersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
