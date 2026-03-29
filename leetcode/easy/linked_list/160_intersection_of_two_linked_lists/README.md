# 160. Intersection of Two Linked Lists

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Linked List
- Folder Path: `leetcode/easy/linked_list/160_intersection_of_two_linked_lists`
- Folder Name: `160_intersection_of_two_linked_lists`
- Official Link: https://leetcode.com/problems/intersection-of-two-linked-lists/

## Problem Overview
You are given the heads of two singly linked-lists headA and headB , return the node at which the two lists intersect . If the two linked lists have no intersection at all, return null .
For example, the following two linked lists begin to intersect at node c1

## Java Starter Signature
```java
public ListNode getIntersectionNode(ListNode headA, ListNode headB)
```

## Suggested Test Cases
1. `intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3` -> `Intersected at '8'`
2. `intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1` -> `Intersected at '2'`
3. `intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2` -> `No intersection`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `IntersectionOfTwoLinkedLists.java` contains the correct class name and Java method signature.
- `IntersectionOfTwoLinkedListsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `IntersectionOfTwoLinkedLists.java` - blank Java starter solution
- `IntersectionOfTwoLinkedListsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
