# 142. Linked List Cycle II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/142_linked_list_cycle_ii`
- Folder Name: `142_linked_list_cycle_ii`
- Official Link: https://leetcode.com/problems/linked-list-cycle-ii/

## Problem Overview
You are given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null .
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to ( 0-indexed ). It is -1 if there is no cycle. Note that pos is not passed as a parameter .

## Java Starter Signature
```java
public ListNode detectCycle(ListNode head)
```

## Suggested Test Cases
1. `head = [3,2,0,-4], pos = 1` -> `tail connects to node index 1`
2. `head = [1,2], pos = 0` -> `tail connects to node index 0`
3. `head = [1], pos = -1` -> `no cycle`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LinkedListCycleII.java` contains the correct class name and Java method signature.
- `LinkedListCycleIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LinkedListCycleII.java` - blank Java starter solution
- `LinkedListCycleIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
