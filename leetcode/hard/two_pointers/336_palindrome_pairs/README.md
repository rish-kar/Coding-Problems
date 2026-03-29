# 336. Palindrome Pairs

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Strings
- Folder Path: `leetcode/hard/two_pointers/336_palindrome_pairs`
- Folder Name: `336_palindrome_pairs`
- Official Link: https://leetcode.com/problems/palindrome-pairs/

## Problem Overview
You are given a 0-indexed array of unique strings words .
A palindrome pair is a pair of integers (i, j) such that

## Java Starter Signature
```java
public List<List<Integer>> palindromePairs(String[] words)
```

## Suggested Test Cases
1. `words = ["abcd","dcba","lls","s","sssll"]` -> `[[0,1],[1,0],[3,2],[2,4]]`
2. `words = ["bat","tab","cat"]` -> `[[0,1],[1,0]]`
3. `words = ["a",""]` -> `[[0,1],[1,0]]`

## What To Watch For
- Handle odd and even length cases correctly when comparing mirrored characters.
- Normalize or skip non-relevant characters only if the problem statement requires it.
- Stop early once a mismatch proves the answer cannot be valid.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PalindromePairs.java` contains the correct class name and Java method signature.
- `PalindromePairsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PalindromePairs.java` - blank Java starter solution
- `PalindromePairsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
