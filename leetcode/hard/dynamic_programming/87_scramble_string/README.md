# 87. Scramble String

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/hard/dynamic_programming/87_scramble_string`
- Folder Name: `87_scramble_string`
- Official Link: https://leetcode.com/problems/scramble-string/

## Problem Overview
Determine whether one string can be transformed into the other by recursively swapping non-empty partitions.

## Java Starter Signature
```java
public boolean isScramble(String s1, String s2)
```


## Suggested Test Cases
1. `s1 = "great", s2 = "rgeat" -> true`
2. `s1 = "abcde", s2 = "caebd" -> false`
3. `s1 = "a", s2 = "a" -> true`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ScrambleString.java` contains the correct class name and Java method signature.
- `ScrambleStringTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ScrambleString.java` - blank Java starter solution
- `ScrambleStringTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
