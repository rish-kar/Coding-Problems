# 144. Binary Tree Preorder Traversal

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Stack
- Folder Path: `leetcode/easy/binary_tree/144_binary_tree_preorder_traversal`
- Folder Name: `144_binary_tree_preorder_traversal`
- Official Link: https://leetcode.com/problems/binary-tree-preorder-traversal/

## Problem Overview
You are given the root of a binary tree, return the preorder traversal of its nodes' values .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<Integer> preorderTraversal(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,null,2,3]` -> `[1,2,3]`
2. `root = [1,2,3,4,5,null,8,null,null,6,7,9]` -> `[1,2,4,5,6,7,3,8,9]`
3. `root = []` -> `[]`

## What To Watch For
- Cover edge inputs explicitly so `preorderTraversal` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinaryTreePreorderTraversal.java` contains the correct class name and Java method signature.
- `BinaryTreePreorderTraversalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinaryTreePreorderTraversal.java` - blank Java starter solution
- `BinaryTreePreorderTraversalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
