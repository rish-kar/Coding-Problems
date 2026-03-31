# 373. Find K Pairs with Smallest Sums

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/373_find_k_pairs_with_smallest_sums`
- Folder Name: `373_find_k_pairs_with_smallest_sums`
- Official Link: https://leetcode.com/problems/find-k-pairs-with-smallest-sums/

## Problem Overview
You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k .
Define a pair (u, v) which consists of one element from the first array and one element from the second array.

## Java Starter Signature
```java
public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k)
```

## Suggested Test Cases
1. `nums1 = [1,7,11], nums2 = [2,4,6], k = 3` -> `[[1,2],[1,4],[1,6]]`
2. `nums1 = [1,1,2], nums2 = [1,2,3], k = 2` -> `[[1,1],[1,1]]`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindKPairsWithSmallestSums.java` contains the correct class name and Java method signature.
- `FindKPairsWithSmallestSumsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindKPairsWithSmallestSums.java` - blank Java starter solution
- `FindKPairsWithSmallestSumsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
