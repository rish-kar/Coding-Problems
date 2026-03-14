# 16. 3Sum Closest

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Two Pointers
- Folder Path: `leetcode/medium/two_pointers/16_3sum_closest`
- Folder Name: `16_3sum_closest`
- Official Link: https://leetcode.com/problems/3sum-closest/

## Problem Overview
Find the triplet whose sum is closest to the target value.

## Java Starter Signature
```java
public int threeSumClosest(int[] nums, int target)
```


## Suggested Test Cases
1. `nums = [-1,2,1,-4], target = 1 -> 2`
2. `nums = [0,0,0], target = 1 -> 0`
3. `nums = [1,1,1,0], target = -100 -> 2`

## What To Watch For
- Move the pointer that can actually improve the answer instead of advancing both blindly.
- Sorted input often enables duplicate skipping and targeted pointer motion.
- Test very small inputs because pointer crossings are a common source of bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ThreeSumClosest.java` contains the correct class name and Java method signature.
- `ThreeSumClosestTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ThreeSumClosest.java` - blank Java starter solution
- `ThreeSumClosestTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
