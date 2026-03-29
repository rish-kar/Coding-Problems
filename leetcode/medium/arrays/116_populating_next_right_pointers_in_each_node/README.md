# 116. Populating Next Right Pointers in Each Node

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/arrays/116_populating_next_right_pointers_in_each_node`
- Folder Name: `116_populating_next_right_pointers_in_each_node`
- Official Link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

## Problem Overview
You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL .

## Java Starter Signature
```java
public PopulatingNextRightPointersInEachNode()
```

## Suggested Test Cases
1. `root = [1,2,3,4,5,6,7]` -> `[1,#,2,3,#,4,5,6,7,#]`
2. `root = []` -> `[]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PopulatingNextRightPointersInEachNode.java` contains the correct class name and Java method signature.
- `PopulatingNextRightPointersInEachNodeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PopulatingNextRightPointersInEachNode.java` - blank Java starter solution
- `PopulatingNextRightPointersInEachNodeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
