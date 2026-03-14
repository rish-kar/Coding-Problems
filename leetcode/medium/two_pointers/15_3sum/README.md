# 15. 3Sum

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Two Pointers
- Folder Path: `leetcode/medium/two_pointers/15_3sum`
- Folder Name: `15_3sum`
- Official Link: https://leetcode.com/problems/3sum/

## Problem Overview
Return all unique triplets whose values add up to zero.

## Java Starter Signature
```java
public List<List<Integer>> threeSum(int[] nums)
```


## Suggested Test Cases
1. `nums = [-1,0,1,2,-1,-4] -> [[-1,-1,2],[-1,0,1]]`
2. `nums = [0,1,1] -> []`
3. `nums = [0,0,0] -> [[0,0,0]]`

## What To Watch For
- Move the pointer that can actually improve the answer instead of advancing both blindly.
- Sorted input often enables duplicate skipping and targeted pointer motion.
- Test very small inputs because pointer crossings are a common source of bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ThreeSum.java` contains the correct class name and Java method signature.
- `ThreeSumTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ThreeSum.java` - blank Java starter solution
- `ThreeSumTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
