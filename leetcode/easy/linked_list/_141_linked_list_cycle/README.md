# 141. Linked List Cycle

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Linked List
- Folder Path: `leetcode/easy/linked_list/141_linked_list_cycle`
- Folder Name: `141_linked_list_cycle`
- Official Link: https://leetcode.com/problems/linked-list-cycle/

## Problem Overview
You are given head , the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter .

## Java Starter Signature
```java
public boolean hasCycle(ListNode head)
```

## Suggested Test Cases
1. `head = [3,2,0,-4], pos = 1` -> `true`
2. `head = [1,2], pos = 0` -> `true`
3. `head = [1], pos = -1` -> `false`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `LinkedListCycle.java` contains the correct class name and Java method signature.
- `LinkedListCycleTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `LinkedListCycle.java` - blank Java starter solution
- `LinkedListCycleTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
