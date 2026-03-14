# 72. Edit Distance

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/dynamic_programming/72_edit_distance`
- Folder Name: `72_edit_distance`
- Official Link: https://leetcode.com/problems/edit-distance/

## Problem Overview
Return the minimum number of insertions, deletions, and replacements needed to convert one word into the other.

## Java Starter Signature
```java
public int minDistance(String word1, String word2)
```


## Suggested Test Cases
1. `word1 = "horse", word2 = "ros" -> 3`
2. `word1 = "intention", word2 = "execution" -> 5`
3. `word1 = "", word2 = "abc" -> 3`

## What To Watch For
- Base cases matter because every later state depends on them.
- Write down the transition clearly before coding so each state means exactly one thing.
- Check whether the answer belongs at the final cell, the final index, or the best value seen anywhere.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `EditDistance.java` contains the correct class name and Java method signature.
- `EditDistanceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `EditDistance.java` - blank Java starter solution
- `EditDistanceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
