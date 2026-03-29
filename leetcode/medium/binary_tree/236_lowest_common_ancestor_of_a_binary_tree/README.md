# 236. Lowest Common Ancestor of a Binary Tree

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/binary_tree/236_lowest_common_ancestor_of_a_binary_tree`
- Folder Name: `236_lowest_common_ancestor_of_a_binary_tree`
- Official Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

## Problem Overview
You are given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
According to the definition of LCA on Wikipedia : “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself ).”

## Java Starter Signature
```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
```

## Suggested Test Cases
1. `root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1` -> `3`
2. `root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4` -> `5`
3. `root = [1,2], p = 1, q = 2` -> `1`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LowestCommonAncestorOfABinaryTree.java` contains the correct class name and Java method signature.
- `LowestCommonAncestorOfABinaryTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LowestCommonAncestorOfABinaryTree.java` - blank Java starter solution
- `LowestCommonAncestorOfABinaryTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
