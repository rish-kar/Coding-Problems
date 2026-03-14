# 95. Unique Binary Search Trees II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Binary Search Tree
- Folder Path: `leetcode/medium/binary_search_tree/95_unique_binary_search_trees_ii`
- Folder Name: `95_unique_binary_search_trees_ii`
- Official Link: https://leetcode.com/problems/unique-binary-search-trees-ii/

## Problem Overview
Return every structurally unique BST that stores values 1 through n.

## Java Starter Signature
```java
public List<TreeNode> generateTrees(int n)
```

The starter Java file also includes a lightweight `TreeNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `n = 3 -> 5 unique BST roots`
2. `n = 1 -> single-node tree`
3. `n = 0 -> []`

## What To Watch For
- Use the BST ordering rule globally, not just between a node and its direct children.
- Inorder traversal is often the easiest way to expose the sorted-value property.
- Be careful with duplicate values because many BST problems require strict inequality.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `UniqueBinarySearchTreesII.java` contains the correct class name and Java method signature.
- `UniqueBinarySearchTreesIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `UniqueBinarySearchTreesII.java` - blank Java starter solution
- `UniqueBinarySearchTreesIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
