# 229. Majority Element II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/hash_map/229_majority_element_ii`
- Folder Name: `229_majority_element_ii`
- Official Link: https://leetcode.com/problems/majority-element-ii/

## Problem Overview
You are given an integer array of size n , find all elements that appear more than ⌊ n/3 ⌋ times.
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public List<Integer> majorityElement(int[] nums)
```

## Suggested Test Cases
1. `nums = [3,2,3]` -> `[3]`
2. `nums = [1]` -> `[1]`
3. `nums = [1,2]` -> `[1,2]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MajorityElementII.java` contains the correct class name and Java method signature.
- `MajorityElementIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MajorityElementII.java` - blank Java starter solution
- `MajorityElementIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
