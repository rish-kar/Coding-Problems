# 101. Symmetric Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Tree
- Folder Path: `leetcode/easy/binary_tree/101_symmetric_tree`
- Folder Name: `101_symmetric_tree`
- Official Link: https://leetcode.com/problems/symmetric-tree/

## Problem Overview
You are given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean isSymmetric(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,2,2,3,4,4,3]` -> `true`
2. `root = [1,2,2,null,3,null,3]` -> `false`
3. `input = []` -> `true`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SymmetricTree.java` contains the correct class name and Java method signature.
- `SymmetricTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SymmetricTree.java` - blank Java starter solution
- `SymmetricTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
