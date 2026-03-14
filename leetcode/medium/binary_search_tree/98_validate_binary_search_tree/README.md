# 98. Validate Binary Search Tree

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/98_validate_binary_search_tree`
- Folder Name: `98_validate_binary_search_tree`
- Official Link: https://leetcode.com/problems/validate-binary-search-tree/

## Problem Overview
Check whether the binary tree satisfies the BST ordering rules everywhere.

## Java Starter Signature
```java
public boolean isValidBST(TreeNode root)
```

The starter Java file also includes a lightweight `TreeNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `root = [2,1,3] -> true`
2. `root = [5,1,4,null,null,3,6] -> false`
3. `a tree with duplicate values in BST positions should be false`

## What To Watch For
- Use the BST ordering rule globally, not just between a node and its direct children.
- Inorder traversal is often the easiest way to expose the sorted-value property.
- Be careful with duplicate values because many BST problems require strict inequality.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ValidateBinarySearchTree.java` contains the correct class name and Java method signature.
- `ValidateBinarySearchTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ValidateBinarySearchTree.java` - blank Java starter solution
- `ValidateBinarySearchTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
