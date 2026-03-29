# 335. Self Crossing

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/335_self_crossing`
- Folder Name: `335_self_crossing`
- Official Link: https://leetcode.com/problems/self-crossing/

## Problem Overview
You are given an array of integers distance .
You start at the point (0, 0) on an X-Y plane, and you move distance[0] meters to the north, then distance[1] meters to the west, distance[2] meters to the south, distance[3] meters to the east, and so on. In other words, after each move, your direction changes counter-clockwise.

## Java Starter Signature
```java
public boolean isSelfCrossing(int[] distance)
```

## Suggested Test Cases
1. `distance = [2,1,1,2]` -> `true`
2. `distance = [1,2,3,4]` -> `false`
3. `distance = [1,1,1,2,1]` -> `true`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SelfCrossing.java` contains the correct class name and Java method signature.
- `SelfCrossingTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SelfCrossing.java` - blank Java starter solution
- `SelfCrossingTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
