# 226. Invert Binary Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Tree
- Folder Path: `leetcode/easy/binary_tree/226_invert_binary_tree`
- Folder Name: `226_invert_binary_tree`
- Official Link: https://leetcode.com/problems/invert-binary-tree/

## Problem Overview
You are given the root of a binary tree, invert the tree, and return its root .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public TreeNode invertTree(TreeNode root)
```

## Suggested Test Cases
1. `root = [4,2,7,1,3,6,9]` -> `[4,7,2,9,6,3,1]`
2. `root = [2,1,3]` -> `[2,3,1]`
3. `root = []` -> `[]`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `InvertBinaryTree.java` contains the correct class name and Java method signature.
- `InvertBinaryTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `InvertBinaryTree.java` - blank Java starter solution
- `InvertBinaryTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
