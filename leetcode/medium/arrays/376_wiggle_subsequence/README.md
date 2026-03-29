# 376. Wiggle Subsequence

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/376_wiggle_subsequence`
- Folder Name: `376_wiggle_subsequence`
- Official Link: https://leetcode.com/problems/wiggle-subsequence/

## Problem Overview
Check whether string `s` can be formed by deleting some characters from `t` while keeping the remaining characters in order.
Return `true` when `s` appears as a subsequence of `t`; otherwise return `false`.

## Java Starter Signature
```java
public int wiggleMaxLength(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,7,4,9,2,5]` -> `6`
2. `nums = [1,17,5,10,13,15,10,5,16,8]` -> `7`
3. `nums = [1,2,3,4,5,6,7,8,9]` -> `2`

## What To Watch For
- An empty string `s` is always a subsequence of any `t`.
- Advance through `t` fully, but move the pointer in `s` only when characters match.
- Do not confuse subsequence with substring; matched characters do not need to be adjacent.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WiggleSubsequence.java` contains the correct class name and Java method signature.
- `WiggleSubsequenceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WiggleSubsequence.java` - blank Java starter solution
- `WiggleSubsequenceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
