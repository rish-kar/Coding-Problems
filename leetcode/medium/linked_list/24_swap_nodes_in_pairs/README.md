# 24. Swap Nodes in Pairs

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/24_swap_nodes_in_pairs`
- Folder Name: `24_swap_nodes_in_pairs`
- Official Link: https://leetcode.com/problems/swap-nodes-in-pairs/

## Problem Overview
Swap every two adjacent nodes in the linked list and return the new head.

## Java Starter Signature
```java
public ListNode swapPairs(ListNode head)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,2,3,4] -> [2,1,4,3]`
2. `head = [] -> []`
3. `head = [1] -> [1]`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SwapNodesInPairs.java` contains the correct class name and Java method signature.
- `SwapNodesInPairsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SwapNodesInPairs.java` - blank Java starter solution
- `SwapNodesInPairsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
