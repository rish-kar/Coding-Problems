# 21. Merge Two Sorted Lists

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Linked List
- Folder Path: `leetcode/easy/linked_list/21_merge_two_sorted_lists`
- Folder Name: `21_merge_two_sorted_lists`
- Official Link: https://leetcode.com/problems/merge-two-sorted-lists/

## Problem Overview
You are given the heads of two sorted linked lists list1 and list2 .
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

## Java Starter Signature
```java
public ListNode mergeTwoLists(ListNode list1, ListNode list2)
```

## Suggested Test Cases
1. `list1 = [1,2,4], list2 = [1,3,4]` -> `[1,1,2,3,4,4]`
2. `list1 = [], list2 = []` -> `[]`
3. `list1 = [], list2 = [0]` -> `[0]`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MergeTwoSortedLists.java` contains the correct class name and Java method signature.
- `MergeTwoSortedListsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MergeTwoSortedLists.java` - blank Java starter solution
- `MergeTwoSortedListsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
