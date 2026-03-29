# 230. Kth Smallest Element in a BST

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/230_kth_smallest_element_in_a_bst`
- Folder Name: `230_kth_smallest_element_in_a_bst`
- Official Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/

## Problem Overview
You are given the root of a binary search tree, and an integer k , return the k th smallest value ( 1-indexed ) of all the values of the nodes in the tree .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int kthSmallest(TreeNode root, int k)
```

## Suggested Test Cases
1. `root = [3,1,4,null,2], k = 1` -> `1`
2. `root = [5,3,6,2,4,null,null,1], k = 3` -> `3`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Cover edge inputs explicitly so `kthSmallest` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `KthSmallestElementInABST.java` contains the correct class name and Java method signature.
- `KthSmallestElementInABSTTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `KthSmallestElementInABST.java` - blank Java starter solution
- `KthSmallestElementInABSTTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
