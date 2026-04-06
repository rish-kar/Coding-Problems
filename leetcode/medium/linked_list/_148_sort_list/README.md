# 148. Sort List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/148_sort_list`
- Folder Name: `148_sort_list`
- Official Link: https://leetcode.com/problems/sort-list/

## Problem Overview
You are given the head of a linked list, return the list after sorting it in ascending order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public ListNode sortList(ListNode head)
```

## Suggested Test Cases
1. `head = [4,2,1,3]` -> `[1,2,3,4]`
2. `head = [-1,5,3,4,0]` -> `[-1,0,3,4,5]`
3. `head = []` -> `[]`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SortList.java` contains the correct class name and Java method signature.
- `SortListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SortList.java` - blank Java starter solution
- `SortListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
