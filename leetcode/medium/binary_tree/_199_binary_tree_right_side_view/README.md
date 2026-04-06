# 199. Binary Tree Right Side View

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Tree
- Folder Path: `leetcode/medium/binary_tree/199_binary_tree_right_side_view`
- Folder Name: `199_binary_tree_right_side_view`
- Official Link: https://leetcode.com/problems/binary-tree-right-side-view/

## Problem Overview
You are given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<Integer> rightSideView(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,2,3,null,5,null,4]` -> `[1,3,4]`
2. `root = [1,2,3,4,null,null,null,5]` -> `[1,3,4,5]`
3. `root = [1,null,3]` -> `[1,3]`

## What To Watch For
- Use clear base cases for `null` children to avoid incorrect recursion results.
- Keep traversal order aligned with what the problem asks you to compute.
- Separate node-level work from subtree aggregation to prevent state bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinaryTreeRightSideView.java` contains the correct class name and Java method signature.
- `BinaryTreeRightSideViewTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinaryTreeRightSideView.java` - blank Java starter solution
- `BinaryTreeRightSideViewTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
