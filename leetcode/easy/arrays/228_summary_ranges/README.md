# 228. Summary Ranges

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/228_summary_ranges`
- Folder Name: `228_summary_ranges`
- Official Link: https://leetcode.com/problems/summary-ranges/

## Problem Overview
You are given a sorted unique integer array nums .
A range [a,b] is the set of all integers from a to b (inclusive).

## Java Starter Signature
```java
public List<String> summaryRanges(int[] nums)
```

## Suggested Test Cases
1. `nums = [0,1,2,4,5,7]` -> `["0->2","4->5","7"]`
2. `nums = [0,2,3,4,6,8,9]` -> `["0","2->4","6","8->9"]`
3. `nums = [0]` -> `0`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SummaryRanges.java` contains the correct class name and Java method signature.
- `SummaryRangesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SummaryRanges.java` - blank Java starter solution
- `SummaryRangesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
