# 94. Binary Tree Inorder Traversal

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Stack
- Folder Path: `leetcode/easy/binary_tree/94_binary_tree_inorder_traversal`
- Folder Name: `94_binary_tree_inorder_traversal`
- Official Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

## Problem Overview
You are given the root of a binary tree, return the inorder traversal of its nodes' values .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<Integer> inorderTraversal(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,null,2,3]` -> `[1,3,2]`
2. `root = [1,2,3,4,5,null,8,null,null,6,7,9]` -> `[4,2,6,5,7,1,3,9,8]`
3. `root = []` -> `[]`

## What To Watch For
- Cover edge inputs explicitly so `inorderTraversal` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinaryTreeInorderTraversal.java` contains the correct class name and Java method signature.
- `BinaryTreeInorderTraversalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinaryTreeInorderTraversal.java` - blank Java starter solution
- `BinaryTreeInorderTraversalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
