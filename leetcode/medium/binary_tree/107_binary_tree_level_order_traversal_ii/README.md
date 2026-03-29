# 107. Binary Tree Level Order Traversal II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/binary_tree/107_binary_tree_level_order_traversal_ii`
- Folder Name: `107_binary_tree_level_order_traversal_ii`
- Official Link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

## Problem Overview
You are given the root of a binary tree, return the bottom-up level order traversal of its nodes' values . (i.e., from left to right, level by level from leaf to root).
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<List<Integer>> levelOrderBottom(TreeNode root)
```

## Suggested Test Cases
1. `root = [3,9,20,null,null,15,7]` -> `[[15,7],[9,20],[3]]`
2. `root = [1]` -> `[[1]]`
3. `root = []` -> `[]`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinaryTreeLevelOrderTraversalII.java` contains the correct class name and Java method signature.
- `BinaryTreeLevelOrderTraversalIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinaryTreeLevelOrderTraversalII.java` - blank Java starter solution
- `BinaryTreeLevelOrderTraversalIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
