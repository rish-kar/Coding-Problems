# 99. Recover Binary Search Tree

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/hard/binary_search_tree/99_recover_binary_search_tree`
- Folder Name: `99_recover_binary_search_tree`
- Official Link: https://leetcode.com/problems/recover-binary-search-tree/

## Problem Overview
Fix the BST in place after exactly two node values have been swapped by mistake.

## Java Starter Signature
```java
public void recoverTree(TreeNode root)
```

The starter Java file also includes a lightweight `TreeNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `root = [1,3,null,null,2] -> repaired BST`
2. `root = [3,1,4,null,null,2] -> repaired BST`
3. `the final inorder traversal must be sorted`

## What To Watch For
- Use the BST ordering rule globally, not just between a node and its direct children.
- Inorder traversal is often the easiest way to expose the sorted-value property.
- Be careful with duplicate values because many BST problems require strict inequality.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RecoverBinarySearchTree.java` contains the correct class name and Java method signature.
- `RecoverBinarySearchTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RecoverBinarySearchTree.java` - blank Java starter solution
- `RecoverBinarySearchTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
