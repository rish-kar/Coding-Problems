# 100. Same Tree

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Tree
- Folder Path: `leetcode/easy/binary_tree/100_same_tree`
- Folder Name: `100_same_tree`
- Official Link: https://leetcode.com/problems/same-tree/

## Problem Overview
Return true when the two binary trees have the same structure and node values.

## Java Starter Signature
```java
public boolean isSameTree(TreeNode p, TreeNode q)
```

The starter Java file also includes a lightweight `TreeNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `p = [1,2,3], q = [1,2,3] -> true`
2. `p = [1,2], q = [1,null,2] -> false`
3. `p = [1,2,1], q = [1,1,2] -> false`

## What To Watch For
- Handle null children naturally so traversal logic stays simple.
- Traversal order is the whole point here, so name it clearly before coding.
- An iterative version may need an explicit stack even if the recursive idea feels easier.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SameTree.java` contains the correct class name and Java method signature.
- `SameTreeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SameTree.java` - blank Java starter solution
- `SameTreeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
