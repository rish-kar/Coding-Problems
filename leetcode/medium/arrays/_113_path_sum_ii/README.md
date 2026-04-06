# 113. Path Sum II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/arrays/113_path_sum_ii`
- Folder Name: `113_path_sum_ii`
- Official Link: https://leetcode.com/problems/path-sum-ii/

## Problem Overview
You are given the root of a binary tree and an integer targetSum , return all root-to-leaf paths where the sum of the node values in the path equals targetSum . Each path should be returned as a list of the node values , not node references .
A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

## Java Starter Signature
```java
public List<List<Integer>> pathSum(TreeNode root, int targetSum)
```

## Suggested Test Cases
1. `root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22` -> `[[5,4,11,2],[5,8,4,5]]`
2. `root = [1,2,3], targetSum = 5` -> `[]`
3. `root = [1,2], targetSum = 0` -> `[]`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PathSumII.java` contains the correct class name and Java method signature.
- `PathSumIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PathSumII.java` - blank Java starter solution
- `PathSumIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
