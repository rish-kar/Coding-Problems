# 89. Gray Code

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/bit_manipulation/89_gray_code`
- Folder Name: `89_gray_code`
- Official Link: https://leetcode.com/problems/gray-code/

## Problem Overview
An n-bit gray code sequence is a sequence of 2 n integers where
You are given an integer n , return any valid n-bit gray code sequence .

## Java Starter Signature
```java
public List<Integer> grayCode(int n)
```

## Suggested Test Cases
1. `n = 2` -> `[0,1,3,2]`
2. `n = 1` -> `[0,1]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `grayCode` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GrayCode.java` contains the correct class name and Java method signature.
- `GrayCodeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GrayCode.java` - blank Java starter solution
- `GrayCodeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
