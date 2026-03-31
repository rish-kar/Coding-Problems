# 95. Unique Binary Search Trees II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/95_unique_binary_search_trees_ii`
- Folder Name: `95_unique_binary_search_trees_ii`
- Official Link: https://leetcode.com/problems/unique-binary-search-trees-ii/

## Problem Overview
You are given an integer n , return all the structurally unique BST' s (binary search trees), which has exactly n nodes of unique values from 1 to n . Then return the answer in any order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<TreeNode> generateTrees(int n)
```

## Suggested Test Cases
1. `n = 3` -> `[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]`
2. `n = 1` -> `[[1]]`
3. `second official example` -> `same expected output as the example`

## What To Watch For
- Cover edge inputs explicitly so `generateTrees` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniqueBinarySearchTreesII.java` contains the correct class name and Java method signature.
- `UniqueBinarySearchTreesIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniqueBinarySearchTreesII.java` - blank Java starter solution
- `UniqueBinarySearchTreesIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
