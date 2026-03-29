# 99. Recover Binary Search Tree

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/hard/binary_search_tree/99_recover_binary_search_tree`
- Folder Name: `99_recover_binary_search_tree`
- Official Link: https://leetcode.com/problems/recover-binary-search-tree/

## Problem Overview
You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public void recoverTree(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,3,null,null,2]` -> `[3,1,null,null,2]`
2. `root = [3,1,4,null,null,2]` -> `[2,1,4,null,null,3]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `recoverTree` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RecoverBinarySearchTree.java` contains the correct class name and Java method signature.
- `RecoverBinarySearchTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RecoverBinarySearchTree.java` - blank Java starter solution
- `RecoverBinarySearchTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
