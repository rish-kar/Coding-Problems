# 258. Add Digits

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Math
- Folder Path: `leetcode/easy/math/258_add_digits`
- Folder Name: `258_add_digits`
- Official Link: https://leetcode.com/problems/add-digits/

## Problem Overview
You are given an integer num , repeatedly add all its digits until the result has only one digit, and return it.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int addDigits(int num)
```

## Suggested Test Cases
1. `num = 38` -> `2`
2. `num = 0` -> `0`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `addDigits` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `AddDigits.java` contains the correct class name and Java method signature.
- `AddDigitsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `AddDigits.java` - blank Java starter solution
- `AddDigitsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
