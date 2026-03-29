# 25. Reverse Nodes in k-Group

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Linked List
- Folder Path: `leetcode/hard/linked_list/25_reverse_nodes_in_k_group`
- Folder Name: `25_reverse_nodes_in_k_group`
- Official Link: https://leetcode.com/problems/reverse-nodes-in-k-group/

## Problem Overview
You are given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list .
k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

## Java Starter Signature
```java
public ListNode reverseKGroup(ListNode head, int k)
```

## Suggested Test Cases
1. `head = [1,2,3,4,5], k = 2` -> `[2,1,4,3,5]`
2. `head = [1,2,3,4,5], k = 3` -> `[3,2,1,4,5]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseNodesInKGroup.java` contains the correct class name and Java method signature.
- `ReverseNodesInKGroupTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseNodesInKGroup.java` - blank Java starter solution
- `ReverseNodesInKGroupTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
