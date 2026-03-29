# 201. Bitwise AND of Numbers Range

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Bit Manipulation
- Folder Path: `leetcode/medium/sql/201_bitwise_and_of_numbers_range`
- Folder Name: `201_bitwise_and_of_numbers_range`
- Official Link: https://leetcode.com/problems/bitwise-and-of-numbers-range/

## Problem Overview
You are given two integers left and right that represent the range [left, right] , return the bitwise AND of all numbers in this range, inclusive .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int rangeBitwiseAnd(int left, int right)
```

## Suggested Test Cases
1. `left = 5, right = 7` -> `4`
2. `left = 0, right = 0` -> `0`
3. `left = 1, right = 2147483647` -> `0`

## What To Watch For
- Cover edge inputs explicitly so `rangeBitwiseAnd` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BitwiseANDOfNumbersRange.java` contains the correct class name and Java method signature.
- `BitwiseANDOfNumbersRangeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BitwiseANDOfNumbersRange.java` - blank Java starter solution
- `BitwiseANDOfNumbersRangeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
