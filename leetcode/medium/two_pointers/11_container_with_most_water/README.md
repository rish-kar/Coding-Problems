# 11. Container With Most Water

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Two Pointers
- Folder Path: `leetcode/medium/two_pointers/11_container_with_most_water`
- Folder Name: `11_container_with_most_water`
- Official Link: https://leetcode.com/problems/container-with-most-water/

## Problem Overview
Choose two vertical lines that hold the maximum amount of water between them.

## Java Starter Signature
```java
public int maxArea(int[] height)
```


## Suggested Test Cases
1. `height = [1,8,6,2,5,4,8,3,7] -> 49`
2. `height = [1,1] -> 1`
3. `height = [4,3,2,1,4] -> 16`

## What To Watch For
- Move the pointer that can actually improve the answer instead of advancing both blindly.
- Sorted input often enables duplicate skipping and targeted pointer motion.
- Test very small inputs because pointer crossings are a common source of bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ContainerWithMostWater.java` contains the correct class name and Java method signature.
- `ContainerWithMostWaterTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ContainerWithMostWater.java` - blank Java starter solution
- `ContainerWithMostWaterTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
