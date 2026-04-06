# 354. Russian Doll Envelopes

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/354_russian_doll_envelopes`
- Folder Name: `354_russian_doll_envelopes`
- Official Link: https://leetcode.com/problems/russian-doll-envelopes/

## Problem Overview
You are given a 2D array of integers envelopes where envelopes[i] = [w i , h i ] represents the width and the height of an envelope.
One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.

## Java Starter Signature
```java
public int maxEnvelopes(int[][] envelopes)
```

## Suggested Test Cases
1. `envelopes = [[5,4],[6,4],[6,7],[2,3]]` -> `3`
2. `envelopes = [[1,1],[1,1],[1,1]]` -> `1`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RussianDollEnvelopes.java` contains the correct class name and Java method signature.
- `RussianDollEnvelopesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RussianDollEnvelopes.java` - blank Java starter solution
- `RussianDollEnvelopesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
