# 96. Unique Binary Search Trees

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/96_unique_binary_search_trees`
- Folder Name: `96_unique_binary_search_trees`
- Official Link: https://leetcode.com/problems/unique-binary-search-trees/

## Problem Overview
You are given an integer n , return the number of structurally unique BST' s (binary search trees) which has exactly n nodes of unique values from 1 to n .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int numTrees(int n)
```

## Suggested Test Cases
1. `n = 3` -> `5`
2. `n = 1` -> `1`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `numTrees` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniqueBinarySearchTrees.java` contains the correct class name and Java method signature.
- `UniqueBinarySearchTreesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniqueBinarySearchTrees.java` - blank Java starter solution
- `UniqueBinarySearchTreesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
