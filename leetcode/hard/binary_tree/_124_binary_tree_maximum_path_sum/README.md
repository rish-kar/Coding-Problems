# 124. Binary Tree Maximum Path Sum

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Binary Tree
- Folder Path: `leetcode/hard/binary_tree/124_binary_tree_maximum_path_sum`
- Folder Name: `124_binary_tree_maximum_path_sum`
- Official Link: https://leetcode.com/problems/binary-tree-maximum-path-sum/

## Problem Overview
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once . Note that the path does not need to pass through the root.
The path sum of a path is the sum of the node's values in the path.

## Java Starter Signature
```java
public int maxPathSum(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,2,3]` -> `6`
2. `root = [-10,9,20,null,null,15,7]` -> `42`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinaryTreeMaximumPathSum.java` contains the correct class name and Java method signature.
- `BinaryTreeMaximumPathSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinaryTreeMaximumPathSum.java` - blank Java starter solution
- `BinaryTreeMaximumPathSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
