# 106. Construct Binary Tree from Inorder and Postorder Traversal

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_tree/106_construct_binary_tree_from_inorder_and_postorder_traversal`
- Folder Name: `106_construct_binary_tree_from_inorder_and_postorder_traversal`
- Official Link: https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

## Problem Overview
You are given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public TreeNode buildTree(int[] inorder, int[] postorder)
```

## Suggested Test Cases
1. `inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]` -> `[3,9,20,null,null,15,7]`
2. `inorder = [-1], postorder = [-1]` -> `[-1]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ConstructBinaryTreeFromInorderAndPostorderTraversal.java` contains the correct class name and Java method signature.
- `ConstructBinaryTreeFromInorderAndPostorderTraversalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ConstructBinaryTreeFromInorderAndPostorderTraversal.java` - blank Java starter solution
- `ConstructBinaryTreeFromInorderAndPostorderTraversalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
