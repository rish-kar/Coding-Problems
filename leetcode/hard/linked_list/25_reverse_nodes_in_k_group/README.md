# 25. Reverse Nodes in k-Group

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Linked List
- Folder Path: `leetcode/hard/linked_list/25_reverse_nodes_in_k_group`
- Folder Name: `25_reverse_nodes_in_k_group`
- Official Link: https://leetcode.com/problems/reverse-nodes-in-k-group/

## Problem Overview
Reverse the linked list in groups of size k while leaving any incomplete final group unchanged.

## Java Starter Signature
```java
public ListNode reverseKGroup(ListNode head, int k)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,2,3,4,5], k = 2 -> [2,1,4,3,5]`
2. `head = [1,2,3,4,5], k = 3 -> [3,2,1,4,5]`
3. `head = [1,2], k = 3 -> [1,2]`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ReverseNodesInKGroup.java` contains the correct class name and Java method signature.
- `ReverseNodesInKGroupTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ReverseNodesInKGroup.java` - blank Java starter solution
- `ReverseNodesInKGroupTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
