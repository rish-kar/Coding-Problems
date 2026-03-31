# 147. Insertion Sort List

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/147_insertion_sort_list`
- Folder Name: `147_insertion_sort_list`
- Official Link: https://leetcode.com/problems/insertion-sort-list/

## Problem Overview
You are given the head of a singly linked list, sort the list using insertion sort , and return the sorted list's head .
The steps of the insertion sort algorithm

## Java Starter Signature
```java
public ListNode insertionSortList(ListNode head)
```

## Suggested Test Cases
1. `head = [4,2,1,3]` -> `[1,2,3,4]`
2. `head = [-1,5,3,4,0]` -> `[-1,0,3,4,5]`
3. `input from Example 1` -> `output from Example 1`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `InsertionSortList.java` contains the correct class name and Java method signature.
- `InsertionSortListTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `InsertionSortList.java` - blank Java starter solution
- `InsertionSortListTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
