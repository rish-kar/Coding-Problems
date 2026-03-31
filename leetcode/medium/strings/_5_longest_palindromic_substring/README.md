# 5. Longest Palindromic Substring

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/5_longest_palindromic_substring`
- Folder Name: `5_longest_palindromic_substring`
- Official Link: https://leetcode.com/problems/longest-palindromic-substring/

## Problem Overview
You are given a string s , return the longest palindromic substring in s .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public String longestPalindrome(String s)
```

## Suggested Test Cases
1. `s = "babad"` -> `"bab"`
2. `s = "cbbd"` -> `"bb"`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestPalindromicSubstring.java` contains the correct class name and Java method signature.
- `LongestPalindromicSubstringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestPalindromicSubstring.java` - blank Java starter solution
- `LongestPalindromicSubstringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
