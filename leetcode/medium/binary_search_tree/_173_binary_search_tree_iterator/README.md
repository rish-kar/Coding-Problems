# 173. Binary Search Tree Iterator

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Stack
- Folder Path: `leetcode/medium/binary_search_tree/173_binary_search_tree_iterator`
- Folder Name: `173_binary_search_tree_iterator`
- Official Link: https://leetcode.com/problems/binary-search-tree-iterator/

## Problem Overview
Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST)
Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.

## Java Starter Signature
```java
public BinarySearchTreeIterator(TreeNode root)
```

## Suggested Test Cases
1. `input from Example 1` -> `output from Example 1`
2. `input from Example 2` -> `output from Example 2`
3. `input from Example 3` -> `output from Example 3`

## What To Watch For
- Cover edge inputs explicitly so method behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinarySearchTreeIterator.java` contains the correct class name and Java method signature.
- `BinarySearchTreeIteratorTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinarySearchTreeIterator.java` - blank Java starter solution
- `BinarySearchTreeIteratorTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
