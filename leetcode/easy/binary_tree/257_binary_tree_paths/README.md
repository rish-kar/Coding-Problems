# 257. Binary Tree Paths

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Strings
- Folder Path: `leetcode/easy/binary_tree/257_binary_tree_paths`
- Folder Name: `257_binary_tree_paths`
- Official Link: https://leetcode.com/problems/binary-tree-paths/

## Problem Overview
You are given the root of a binary tree, return all root-to-leaf paths in any order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<String> binaryTreePaths(TreeNode root)
```

## Suggested Test Cases
1. `root = [1,2,3,null,5]` -> `["1->2->5","1->3"]`
2. `root = [1]` -> `["1"]`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BinaryTreePaths.java` contains the correct class name and Java method signature.
- `BinaryTreePathsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BinaryTreePaths.java` - blank Java starter solution
- `BinaryTreePathsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
