# 398. Random Pick Index

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/arrays/398_random_pick_index`
- Folder Name: `398_random_pick_index`
- Official Link: https://leetcode.com/problems/random-pick-index/

## Problem Overview
You are given an integer array nums with possible duplicates , randomly output the index of a given target number. You can assume that the given target number must exist in the array.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public RandomPickIndex(int[] nums)
```

## Suggested Test Cases
1. `nums = [single element]` -> `returns the correct base-case value`
2. `nums = [0]` -> `0`
3. `nums = [1,2,3]` -> `3`

## What To Watch For
- Cover edge inputs explicitly so method behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RandomPickIndex.java` contains the correct class name and Java method signature.
- `RandomPickIndexTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RandomPickIndex.java` - blank Java starter solution
- `RandomPickIndexTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
