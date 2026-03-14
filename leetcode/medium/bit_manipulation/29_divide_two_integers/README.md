# 29. Divide Two Integers

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Bit Manipulation
- Folder Path: `leetcode/medium/bit_manipulation/29_divide_two_integers`
- Folder Name: `29_divide_two_integers`
- Official Link: https://leetcode.com/problems/divide-two-integers/

## Problem Overview
Divide two integers without using multiplication, division, or mod operators while clamping overflow.

## Java Starter Signature
```java
public int divide(int dividend, int divisor)
```


## Suggested Test Cases
1. `dividend = 10, divisor = 3 -> 3`
2. `dividend = 7, divisor = -3 -> -2`
3. `dividend = -2147483648, divisor = -1 -> 2147483647`

## What To Watch For
- Watch for sign handling and overflow near the 32-bit integer limits.
- Left shifts and subtraction loops are common tools when division is restricted.
- Bit-based constructions usually benefit from checking the highest positions first.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DivideTwoIntegers.java` contains the correct class name and Java method signature.
- `DivideTwoIntegersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DivideTwoIntegers.java` - blank Java starter solution
- `DivideTwoIntegersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
