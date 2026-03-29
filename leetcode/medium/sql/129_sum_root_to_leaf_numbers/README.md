# 129. Sum Root to Leaf Numbers

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/sql/129_sum_root_to_leaf_numbers`
- Folder Name: `129_sum_root_to_leaf_numbers`
- Official Link: https://leetcode.com/problems/sum-root-to-leaf-numbers/

## Problem Overview
You are given the root of a binary tree containing digits from 0 to 9 only.
Each root-to-leaf path in the tree represents a number.

## Java Starter Signature
```java
public int sumNumbers(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,2,3]` -> `25`
2. `root = [4,9,0,5,1]` -> `1026`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SumRootToLeafNumbers.java` contains the correct class name and Java method signature.
- `SumRootToLeafNumbersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SumRootToLeafNumbers.java` - blank Java starter solution
- `SumRootToLeafNumbersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
