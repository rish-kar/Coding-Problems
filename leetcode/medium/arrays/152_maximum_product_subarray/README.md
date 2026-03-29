# 152. Maximum Product Subarray

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/152_maximum_product_subarray`
- Folder Name: `152_maximum_product_subarray`
- Official Link: https://leetcode.com/problems/maximum-product-subarray/

## Problem Overview
You are given an integer array nums , find a subarray that has the largest product, and return the product .
The test cases are generated so that the answer will fit in a 32-bit integer.

## Java Starter Signature
```java
public int maxProduct(int[] nums)
```

## Suggested Test Cases
1. `nums = [2,3,-2,4]` -> `6`
2. `nums = [-2,0,-1]` -> `0`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximumProductSubarray.java` contains the correct class name and Java method signature.
- `MaximumProductSubarrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximumProductSubarray.java` - blank Java starter solution
- `MaximumProductSubarrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
