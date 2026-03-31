# 111. Minimum Depth of Binary Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Tree
- Folder Path: `leetcode/easy/binary_tree/111_minimum_depth_of_binary_tree`
- Folder Name: `111_minimum_depth_of_binary_tree`
- Official Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/

## Problem Overview
You are given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

## Java Starter Signature
```java
public int minDepth(TreeNode root)
```

## Suggested Test Cases
1. `root = [3,9,20,null,null,15,7]` -> `2`
2. `root = [2,null,3,null,4,null,5,null,6]` -> `5`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MinimumDepthOfBinaryTree.java` contains the correct class name and Java method signature.
- `MinimumDepthOfBinaryTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MinimumDepthOfBinaryTree.java` - blank Java starter solution
- `MinimumDepthOfBinaryTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
