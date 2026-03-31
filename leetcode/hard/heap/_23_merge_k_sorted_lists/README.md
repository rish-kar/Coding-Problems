# 23. Merge k Sorted Lists

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Linked List
- Folder Path: `leetcode/hard/heap/23_merge_k_sorted_lists`
- Folder Name: `23_merge_k_sorted_lists`
- Official Link: https://leetcode.com/problems/merge-k-sorted-lists/

## Problem Overview
You are given an array of k linked-lists lists , each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

## Java Starter Signature
```java
public ListNode mergeKLists(ListNode[] lists)
```

## Suggested Test Cases
1. `lists = [[1,4,5],[1,3,4],[2,6]]` -> `[1,1,2,3,4,4,5,6]`
2. `lists = []` -> `[]`
3. `lists = [[]]` -> `[]`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MergeKSortedLists.java` contains the correct class name and Java method signature.
- `MergeKSortedListsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MergeKSortedLists.java` - blank Java starter solution
- `MergeKSortedListsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
