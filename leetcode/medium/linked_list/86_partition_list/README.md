# 86. Partition List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/86_partition_list`
- Folder Name: `86_partition_list`
- Official Link: https://leetcode.com/problems/partition-list/

## Problem Overview
Reorder the linked list so nodes smaller than x come before nodes greater than or equal to x while preserving relative order.

## Java Starter Signature
```java
public ListNode partition(ListNode head, int x)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `head = [1,4,3,2,5,2], x = 3 -> [1,2,2,4,3,5]`
2. `head = [2,1], x = 2 -> [1,2]`
3. `head = [] -> []`

## What To Watch For
- Handle an empty list and a single-node list before pointer rewiring gets complicated.
- Dummy nodes often simplify edge cases that affect the head of the list.
- Reconnect the remaining tail carefully so nodes are not lost or cycled by mistake.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PartitionList.java` contains the correct class name and Java method signature.
- `PartitionListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PartitionList.java` - blank Java starter solution
- `PartitionListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
