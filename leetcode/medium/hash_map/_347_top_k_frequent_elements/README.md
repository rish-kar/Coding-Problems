# 347. Top K Frequent Elements

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/hash_map/347_top_k_frequent_elements`
- Folder Name: `347_top_k_frequent_elements`
- Official Link: https://leetcode.com/problems/top-k-frequent-elements/

## Problem Overview
You are given an integer array nums and an integer k , return the k most frequent elements . You may return the answer in any order .
Focus on boundary cases so the method stays correct for small or extreme inputs.

## Java Starter Signature
```java
public int[] topKFrequent(int[] nums, int k)
```

## Suggested Test Cases
1. `nums = [1,1,1,2,2,3], k = 2` -> `[1,2]`
2. `nums = [1], k = 1` -> `[1]`
3. `nums = [1,2,1,2,1,2,3,1,3,2], k = 2` -> `[1,2]`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `TopKFrequentElements.java` contains the correct class name and Java method signature.
- `TopKFrequentElementsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `TopKFrequentElements.java` - blank Java starter solution
- `TopKFrequentElementsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
