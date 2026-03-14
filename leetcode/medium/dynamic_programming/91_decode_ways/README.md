# 91. Decode Ways

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/dynamic_programming/91_decode_ways`
- Folder Name: `91_decode_ways`
- Official Link: https://leetcode.com/problems/decode-ways/

## Problem Overview
Count how many valid letter decodings the digit string has using 1 -> A through 26 -> Z.

## Java Starter Signature
```java
public int numDecodings(String s)
```


## Suggested Test Cases
1. `s = "12" -> 2`
2. `s = "226" -> 3`
3. `s = "06" -> 0`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DecodeWays.java` contains the correct class name and Java method signature.
- `DecodeWaysTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DecodeWays.java` - blank Java starter solution
- `DecodeWaysTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
