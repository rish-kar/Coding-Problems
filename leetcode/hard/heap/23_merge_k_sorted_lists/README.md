# 23. Merge k Sorted Lists

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Heap
- Folder Path: `leetcode/hard/heap/23_merge_k_sorted_lists`
- Folder Name: `23_merge_k_sorted_lists`
- Official Link: https://leetcode.com/problems/merge-k-sorted-lists/

## Problem Overview
Merge many sorted linked lists into one sorted linked list.

## Java Starter Signature
```java
public ListNode mergeKLists(ListNode[] lists)
```

The starter Java file also includes a lightweight `ListNode` definition so the folder compiles cleanly in isolation.

## Suggested Test Cases
1. `lists = [[1,4,5],[1,3,4],[2,6]] -> [1,1,2,3,4,4,5,6]`
2. `lists = [] -> []`
3. `lists = [[]] -> []`

## What To Watch For
- A heap is helpful when you need the current smallest or largest item repeatedly.
- Store enough context in each heap entry to continue from the same source after a pop.
- Always guard against empty inputs before pushing initial elements.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MergeKSortedLists.java` contains the correct class name and Java method signature.
- `MergeKSortedListsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MergeKSortedLists.java` - blank Java starter solution
- `MergeKSortedListsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
