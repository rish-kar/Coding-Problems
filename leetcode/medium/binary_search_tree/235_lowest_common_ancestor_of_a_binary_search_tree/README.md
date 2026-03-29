# 235. Lowest Common Ancestor of a Binary Search Tree

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/235_lowest_common_ancestor_of_a_binary_search_tree`
- Folder Name: `235_lowest_common_ancestor_of_a_binary_search_tree`
- Official Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

## Problem Overview
You are given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
According to the definition of LCA on Wikipedia : “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself ).”

## Java Starter Signature
```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
```

## Suggested Test Cases
1. `root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8` -> `6`
2. `root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4` -> `2`
3. `root = [2,1], p = 2, q = 1` -> `2`

## What To Watch For
- Cover edge inputs explicitly so `lowestCommonAncestor` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LowestCommonAncestorOfABinarySearchTree.java` contains the correct class name and Java method signature.
- `LowestCommonAncestorOfABinarySearchTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LowestCommonAncestorOfABinarySearchTree.java` - blank Java starter solution
- `LowestCommonAncestorOfABinarySearchTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
