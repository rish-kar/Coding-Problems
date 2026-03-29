# 2. Add Two Numbers

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Linked List
- Folder Path: `leetcode/medium/linked_list/2_add_two_numbers`
- Folder Name: `2_add_two_numbers`
- Official Link: https://leetcode.com/problems/add-two-numbers/

## Problem Overview
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order , and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Java Starter Signature
```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2)
```

## Suggested Test Cases
1. `l1 = [2,4,3], l2 = [5,6,4]` -> `[7,0,8]`
2. `l1 = [0], l2 = [0]` -> `[0]`
3. `l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]` -> `[8,9,9,9,0,0,0,1]`

## What To Watch For
- Handle `null` and single-node lists before pointer rewiring.
- Store next-node references before changing links to avoid losing the list.
- Return the updated head node required by the method signature.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `AddTwoNumbers.java` contains the correct class name and Java method signature.
- `AddTwoNumbersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `AddTwoNumbers.java` - blank Java starter solution
- `AddTwoNumbersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
