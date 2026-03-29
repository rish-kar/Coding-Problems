# 98. Validate Binary Search Tree

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/98_validate_binary_search_tree`
- Folder Name: `98_validate_binary_search_tree`
- Official Link: https://leetcode.com/problems/validate-binary-search-tree/

## Problem Overview
You are given the root of a binary tree, determine if it is a valid binary search tree (BST) .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public boolean isValidBST(TreeNode root)
```

## Suggested Test Cases
1. `root = [2,1,3]` -> `true`
2. `root = [5,1,4,null,null,3,6]` -> `false`
3. `input = []` -> `true`

## What To Watch For
- Cover edge inputs explicitly so `isValidBST` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidateBinarySearchTree.java` contains the correct class name and Java method signature.
- `ValidateBinarySearchTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidateBinarySearchTree.java` - blank Java starter solution
- `ValidateBinarySearchTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
