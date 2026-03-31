# 9. Palindrome Number

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Math
- Folder Path: `leetcode/easy/math/9_palindrome_number`
- Folder Name: `9_palindrome_number`
- Official Link: https://leetcode.com/problems/palindrome-number/

## Problem Overview
You are given an integer x , return true if x is a palindrome , and false otherwise .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean isPalindrome(int x)
```

## Suggested Test Cases
1. `x = 121` -> `true`
2. `x = -121` -> `false`
3. `x = 10` -> `false`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromeNumber.java` contains the correct class name and Java method signature.
- `PalindromeNumberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromeNumber.java` - blank Java starter solution
- `PalindromeNumberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
