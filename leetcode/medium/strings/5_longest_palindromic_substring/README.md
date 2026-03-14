# 5. Longest Palindromic Substring

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/strings/5_longest_palindromic_substring`
- Folder Name: `5_longest_palindromic_substring`
- Official Link: https://leetcode.com/problems/longest-palindromic-substring/

## Problem Overview
Return the longest contiguous substring that reads the same forward and backward.

## Java Starter Signature
```java
public String longestPalindrome(String s)
```


## Suggested Test Cases
1. `s = "babad" -> "bab" or "aba"`
2. `s = "cbbd" -> "bb"`
3. `s = "a" -> "a"`

## What To Watch For
- Pay close attention to spaces, punctuation, repeated characters, and empty-string behavior.
- Parsing problems usually have a strict order of operations, so handle sign and invalid input carefully.
- When building a result string, think about whether repeated concatenation should be avoided.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestPalindromicSubstring.java` contains the correct class name and Java method signature.
- `LongestPalindromicSubstringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestPalindromicSubstring.java` - blank Java starter solution
- `LongestPalindromicSubstringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
