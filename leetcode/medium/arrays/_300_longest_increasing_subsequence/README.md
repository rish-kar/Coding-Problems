# 300. Longest Increasing Subsequence

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/300_longest_increasing_subsequence`
- Folder Name: `300_longest_increasing_subsequence`
- Official Link: https://leetcode.com/problems/longest-increasing-subsequence/

## Problem Overview
Check whether string `s` can be formed by deleting some characters from `t` while keeping the remaining characters in order.
Return `true` when `s` appears as a subsequence of `t`; otherwise return `false`.

## Java Starter Signature
```java
public int lengthOfLIS(int[] nums)
```

## Suggested Test Cases
1. `nums = [10,9,2,5,3,7,101,18]` -> `4`
2. `nums = [0,1,0,3,2,3]` -> `4`
3. `nums = [7,7,7,7,7,7,7]` -> `1`

## What To Watch For
- An empty string `s` is always a subsequence of any `t`.
- Advance through `t` fully, but move the pointer in `s` only when characters match.
- Do not confuse subsequence with substring; matched characters do not need to be adjacent.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestIncreasingSubsequence.java` contains the correct class name and Java method signature.
- `LongestIncreasingSubsequenceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestIncreasingSubsequence.java` - blank Java starter solution
- `LongestIncreasingSubsequenceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
