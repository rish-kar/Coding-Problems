# 131. Palindrome Partitioning

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/two_pointers/131_palindrome_partitioning`
- Folder Name: `131_palindrome_partitioning`
- Official Link: https://leetcode.com/problems/palindrome-partitioning/

## Problem Overview
You are given a string s , partition s such that every substring of the partition is a palindrome . Then return all possible palindrome partitioning of s .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<List<String>> partition(String s)
```

## Suggested Test Cases
1. `s = "aab"` -> `[["a","a","b"],["aa","b"]]`
2. `s = "a"` -> `[["a"]]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromePartitioning.java` contains the correct class name and Java method signature.
- `PalindromePartitioningTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromePartitioning.java` - blank Java starter solution
- `PalindromePartitioningTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
