# 270. Closest Binary Search Tree Value

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Search
- Folder Path: `leetcode/easy/binary_search_tree/270_closest_binary_search_tree_value`
- Folder Name: `270_closest_binary_search_tree_value`
- Official Link: https://leetcode.com/problems/closest-binary-search-tree-value/

## Problem Overview
Implement the core logic for Closest Binary Search Tree Value exactly as the prompt defines.
Search the sorted space by shrinking bounds until the target index or value is determined.

## Java Starter Signature
```java
public int closestValue(Object root, double target)
```

## Suggested Test Cases
1. `input from Example 1` -> `output from Example 1`
2. `input from Example 2` -> `output from Example 2`
3. `input from Example 3` -> `output from Example 3`

## What To Watch For
- Keep interval boundaries consistent (`[low, high]` or `[low, high)`) through the whole loop.
- Recompute the midpoint safely and update the correct boundary each step.
- Return the exact index/boundary requested, not just any matching position.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ClosestBinarySearchTreeValue.java` contains the correct class name and Java method signature.
- `ClosestBinarySearchTreeValueTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ClosestBinarySearchTreeValue.java` - blank Java starter solution
- `ClosestBinarySearchTreeValueTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
