# 128. Longest Consecutive Sequence

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/128_longest_consecutive_sequence`
- Folder Name: `128_longest_consecutive_sequence`
- Official Link: https://leetcode.com/problems/longest-consecutive-sequence/

## Problem Overview
You are given an unsorted array of integers nums , return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.

## Java Starter Signature
```java
public int longestConsecutive(int[] nums)
```

## Suggested Test Cases
1. `nums = [100,4,200,1,3,2]` -> `4`
2. `nums = [0,3,7,2,5,8,4,6,0,1]` -> `9`
3. `nums = [1,0,1,2]` -> `3`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LongestConsecutiveSequence.java` contains the correct class name and Java method signature.
- `LongestConsecutiveSequenceTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LongestConsecutiveSequence.java` - blank Java starter solution
- `LongestConsecutiveSequenceTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
