# 132. Palindrome Partitioning II

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/two_pointers/132_palindrome_partitioning_ii`
- Folder Name: `132_palindrome_partitioning_ii`
- Official Link: https://leetcode.com/problems/palindrome-partitioning-ii/

## Problem Overview
You are given a string s , partition s such that every substring of the partition is a palindrome .
Return the minimum cuts needed for a palindrome partitioning of s .

## Java Starter Signature
```java
public int minCut(String s)
```

## Suggested Test Cases
1. `s = "aab"` -> `1`
2. `s = "a"` -> `0`
3. `s = "ab"` -> `1`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromePartitioningII.java` contains the correct class name and Java method signature.
- `PalindromePartitioningIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromePartitioningII.java` - blank Java starter solution
- `PalindromePartitioningIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
