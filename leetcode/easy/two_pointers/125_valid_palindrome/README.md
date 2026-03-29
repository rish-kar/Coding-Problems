# 125. Valid Palindrome

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/two_pointers/125_valid_palindrome`
- Folder Name: `125_valid_palindrome`
- Official Link: https://leetcode.com/problems/valid-palindrome/

## Problem Overview
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
You are given a string s , return true if it is a palindrome , or false otherwise .

## Java Starter Signature
```java
public boolean isPalindrome(String s)
```

## Suggested Test Cases
1. `s = "A man, a plan, a canal: Panama"` -> `true`
2. `s = "race a car"` -> `false`
3. `s = " "` -> `true`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidPalindrome.java` contains the correct class name and Java method signature.
- `ValidPalindromeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidPalindrome.java` - blank Java starter solution
- `ValidPalindromeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
