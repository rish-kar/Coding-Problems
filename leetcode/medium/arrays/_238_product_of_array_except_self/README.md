# 238. Product of Array Except Self

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/238_product_of_array_except_self`
- Folder Name: `238_product_of_array_except_self`
- Official Link: https://leetcode.com/problems/product-of-array-except-self/

## Problem Overview
You are given an integer array nums , return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i] .
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

## Java Starter Signature
```java
public int[] productExceptSelf(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3,4]` -> `[24,12,8,6]`
2. `nums = [-1,1,0,-3,3]` -> `[0,0,9,0,0]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ProductOfArrayExceptSelf.java` contains the correct class name and Java method signature.
- `ProductOfArrayExceptSelfTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ProductOfArrayExceptSelf.java` - blank Java starter solution
- `ProductOfArrayExceptSelfTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
