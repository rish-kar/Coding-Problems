# 100. Same Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Tree
- Folder Path: `leetcode/easy/binary_tree/100_same_tree`
- Folder Name: `100_same_tree`
- Official Link: https://leetcode.com/problems/same-tree/

## Problem Overview
You are given the roots of two binary trees p and q , write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

## Java Starter Signature
```java
public boolean isSameTree(TreeNode p, TreeNode q)
```

## Suggested Test Cases
1. `p = [1,2,3], q = [1,2,3]` -> `true`
2. `p = [1,2], q = [1,null,2]` -> `false`
3. `p = [1,2,1], q = [1,1,2]` -> `false`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SameTree.java` contains the correct class name and Java method signature.
- `SameTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SameTree.java` - blank Java starter solution
- `SameTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
