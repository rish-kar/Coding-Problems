# 315. Count of Smaller Numbers After Self

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/sql/315_count_of_smaller_numbers_after_self`
- Folder Name: `315_count_of_smaller_numbers_after_self`
- Official Link: https://leetcode.com/problems/count-of-smaller-numbers-after-self/

## Problem Overview
You are given an integer array nums , return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i] .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<Integer> countSmaller(int[] nums)
```

## Suggested Test Cases
1. `nums = [5,2,6,1]` -> `[2,1,1,0]`
2. `nums = [-1]` -> `[0]`
3. `nums = [-1,-1]` -> `[0,0]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CountOfSmallerNumbersAfterSelf.java` contains the correct class name and Java method signature.
- `CountOfSmallerNumbersAfterSelfTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CountOfSmallerNumbersAfterSelf.java` - blank Java starter solution
- `CountOfSmallerNumbersAfterSelfTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
