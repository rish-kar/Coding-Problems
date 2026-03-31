# 103. Binary Tree Zigzag Level Order Traversal

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/binary_tree/103_binary_tree_zigzag_level_order_traversal`
- Folder Name: `103_binary_tree_zigzag_level_order_traversal`
- Official Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

## Problem Overview
You are given the root of a binary tree, return the zigzag level order traversal of its nodes' values . (i.e., from left to right, then right to left for the next level and alternate between).
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<List<Integer>> zigzagLevelOrder(TreeNode root)
```

## Suggested Test Cases
1. `root = [3,9,20,null,null,15,7]` -> `[[3],[20,9],[15,7]]`
2. `root = [1]` -> `[[1]]`
3. `root = []` -> `[]`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinaryTreeZigzagLevelOrderTraversal.java` contains the correct class name and Java method signature.
- `BinaryTreeZigzagLevelOrderTraversalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinaryTreeZigzagLevelOrderTraversal.java` - blank Java starter solution
- `BinaryTreeZigzagLevelOrderTraversalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
