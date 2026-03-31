# 108. Convert Sorted Array to Binary Search Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/binary_search_tree/108_convert_sorted_array_to_binary_search_tree`
- Folder Name: `108_convert_sorted_array_to_binary_search_tree`
- Official Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

## Problem Overview
You are given an integer array nums where the elements are sorted in ascending order , convert it to a height-balanced binary search tree .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public TreeNode sortedArrayToBST(int[] nums)
```

## Suggested Test Cases
1. `nums = [-10,-3,0,5,9]` -> `[0,-3,9,-10,null,5]`
2. `nums = [1,3]` -> `[3,1]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ConvertSortedArrayToBinarySearchTree.java` contains the correct class name and Java method signature.
- `ConvertSortedArrayToBinarySearchTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ConvertSortedArrayToBinarySearchTree.java` - blank Java starter solution
- `ConvertSortedArrayToBinarySearchTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
