# 9. Palindrome Number

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Math
- Folder Path: `leetcode/easy/math/9_palindrome_number`
- Folder Name: `9_palindrome_number`
- Official Link: https://leetcode.com/problems/palindrome-number/

## Problem Overview
Check whether the decimal representation of the integer is the same from left to right and right to left.

## Java Starter Signature
```java
public boolean isPalindrome(int x)
```


## Suggested Test Cases
1. `x = 121 -> true`
2. `x = -121 -> false`
3. `x = 10 -> false`

## What To Watch For
- Check overflow boundaries before returning the result.
- Negative values and zero often need separate reasoning from the main positive case.
- Look for repeated structure that can be reduced with arithmetic instead of brute force.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromeNumber.java` contains the correct class name and Java method signature.
- `PalindromeNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromeNumber.java` - blank Java starter solution
- `PalindromeNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
