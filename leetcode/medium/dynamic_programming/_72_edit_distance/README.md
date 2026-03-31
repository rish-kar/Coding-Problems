# 72. Edit Distance

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/dynamic_programming/72_edit_distance`
- Folder Name: `72_edit_distance`
- Official Link: https://leetcode.com/problems/edit-distance/

## Problem Overview
You are given two strings word1 and word2 , return the minimum number of operations required to convert word1 to word2 .
You have the following three operations permitted on a word

## Java Starter Signature
```java
public int minDistance(String word1, String word2)
```

## Suggested Test Cases
1. `word1 = "horse", word2 = "ros"` -> `3`
2. `word1 = "intention", word2 = "execution"` -> `5`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `EditDistance.java` contains the correct class name and Java method signature.
- `EditDistanceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `EditDistance.java` - blank Java starter solution
- `EditDistanceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
