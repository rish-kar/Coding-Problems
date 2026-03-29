# 104. Maximum Depth of Binary Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Tree
- Folder Path: `leetcode/easy/binary_tree/104_maximum_depth_of_binary_tree`
- Folder Name: `104_maximum_depth_of_binary_tree`
- Official Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/

## Problem Overview
You are given the root of a binary tree, return its maximum depth .
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Java Starter Signature
```java
public int maxDepth(TreeNode root)
```

## Suggested Test Cases
1. `root = [3,9,20,null,null,15,7]` -> `3`
2. `root = [1,null,2]` -> `2`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximumDepthOfBinaryTree.java` contains the correct class name and Java method signature.
- `MaximumDepthOfBinaryTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximumDepthOfBinaryTree.java` - blank Java starter solution
- `MaximumDepthOfBinaryTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
