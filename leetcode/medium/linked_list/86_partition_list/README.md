# 86. Partition List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/86_partition_list`
- Folder Name: `86_partition_list`
- Official Link: https://leetcode.com/problems/partition-list/

## Problem Overview
You are given the head of a linked list and a value x , partition it such that all nodes less than x come before nodes greater than or equal to x .
You should preserve the original relative order of the nodes in each of the two partitions.

## Java Starter Signature
```java
public ListNode partition(ListNode head, int x)
```

## Suggested Test Cases
1. `head = [1,4,3,2,5,2], x = 3` -> `[1,2,2,4,3,5]`
2. `head = [2,1], x = 2` -> `[1,2]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PartitionList.java` contains the correct class name and Java method signature.
- `PartitionListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PartitionList.java` - blank Java starter solution
- `PartitionListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
