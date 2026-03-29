# 105. Construct Binary Tree from Preorder and Inorder Traversal

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/binary_tree/105_construct_binary_tree_from_preorder_and_inorder_traversal`
- Folder Name: `105_construct_binary_tree_from_preorder_and_inorder_traversal`
- Official Link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

## Problem Overview
You are given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public TreeNode buildTree(int[] preorder, int[] inorder)
```

## Suggested Test Cases
1. `preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]` -> `[3,9,20,null,null,15,7]`
2. `preorder = [-1], inorder = [-1]` -> `[-1]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ConstructBinaryTreeFromPreorderAndInorderTraversal.java` contains the correct class name and Java method signature.
- `ConstructBinaryTreeFromPreorderAndInorderTraversalTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ConstructBinaryTreeFromPreorderAndInorderTraversal.java` - blank Java starter solution
- `ConstructBinaryTreeFromPreorderAndInorderTraversalTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
