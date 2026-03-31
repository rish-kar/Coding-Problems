# 275. H-Index II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/math/275_h_index_ii`
- Folder Name: `275_h_index_ii`
- Official Link: https://leetcode.com/problems/h-index-ii/

## Problem Overview
You are given an array of integers citations where citations[i] is the number of citations a researcher received for their i th paper and citations is sorted in non-descending order , return the researcher's h-index .
According to the definition of h-index on Wikipedia : The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

## Java Starter Signature
```java
public int hIndex(int[] citations)
```

## Suggested Test Cases
1. `citations = [0,1,3,5,6]` -> `3`
2. `citations = [1,2,100]` -> `2`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `HIndexII.java` contains the correct class name and Java method signature.
- `HIndexIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `HIndexII.java` - blank Java starter solution
- `HIndexIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
