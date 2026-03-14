# 7. Reverse Integer

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/math/7_reverse_integer`
- Folder Name: `7_reverse_integer`
- Official Link: https://leetcode.com/problems/reverse-integer/

## Problem Overview
Reverse the digits of the integer and return 0 if the reversed value falls outside the 32-bit signed range.

## Java Starter Signature
```java
public int reverse(int x)
```


## Suggested Test Cases
1. `x = 123 -> 321`
2. `x = -123 -> -321`
3. `x = 1534236469 -> 0`

## What To Watch For
- Check overflow boundaries before returning the result.
- Negative values and zero often need separate reasoning from the main positive case.
- Look for repeated structure that can be reduced with arithmetic instead of brute force.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseInteger.java` contains the correct class name and Java method signature.
- `ReverseIntegerTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseInteger.java` - blank Java starter solution
- `ReverseIntegerTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
