# 110. Balanced Binary Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Tree
- Folder Path: `leetcode/easy/binary_tree/110_balanced_binary_tree`
- Folder Name: `110_balanced_binary_tree`
- Official Link: https://leetcode.com/problems/balanced-binary-tree/

## Problem Overview
You are given a binary tree, determine if it is height-balanced .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean isBalanced(TreeNode root)
```

## Suggested Test Cases
1. `root = [3,9,20,null,null,15,7]` -> `true`
2. `root = [1,2,2,3,3,null,null,4,4]` -> `false`
3. `root = []` -> `true`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BalancedBinaryTree.java` contains the correct class name and Java method signature.
- `BalancedBinaryTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BalancedBinaryTree.java` - blank Java starter solution
- `BalancedBinaryTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
