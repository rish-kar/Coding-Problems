# 96. Unique Binary Search Trees

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/96_unique_binary_search_trees`
- Folder Name: `96_unique_binary_search_trees`
- Official Link: https://leetcode.com/problems/unique-binary-search-trees/

## Problem Overview
Return how many structurally unique BSTs can be built with values 1 through n.

## Java Starter Signature
```java
public int numTrees(int n)
```


## Suggested Test Cases
1. `n = 3 -> 5`
2. `n = 1 -> 1`
3. `n = 5 -> 42`

## What To Watch For
- Use the BST ordering rule globally, not just between a node and its direct children.
- Inorder traversal is often the easiest way to expose the sorted-value property.
- Be careful with duplicate values because many BST problems require strict inequality.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniqueBinarySearchTrees.java` contains the correct class name and Java method signature.
- `UniqueBinarySearchTreesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniqueBinarySearchTrees.java` - blank Java starter solution
- `UniqueBinarySearchTreesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
