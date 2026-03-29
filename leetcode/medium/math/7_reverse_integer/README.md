# 7. Reverse Integer

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/math/7_reverse_integer`
- Folder Name: `7_reverse_integer`
- Official Link: https://leetcode.com/problems/reverse-integer/

## Problem Overview
You are given a signed 32-bit integer x , return x with its digits reversed . If reversing x causes the value to go outside the signed 32-bit integer range [-2 31 , 2 31 - 1] , then return 0 .
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

## Java Starter Signature
```java
public int reverse(int x)
```

## Suggested Test Cases
1. `x = 123` -> `321`
2. `x = -123` -> `-321`
3. `x = 120` -> `21`

## What To Watch For
- Cover edge inputs explicitly so `reverse` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseInteger.java` contains the correct class name and Java method signature.
- `ReverseIntegerTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseInteger.java` - blank Java starter solution
- `ReverseIntegerTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
