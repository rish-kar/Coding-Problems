# 198. House Robber

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/dynamic_programming/198_house_robber`
- Folder Name: `198_house_robber`
- Official Link: https://leetcode.com/problems/house-robber/

## Problem Overview
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night .
You are given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police .

## Java Starter Signature
```java
public int rob(int[] nums)
```

## Suggested Test Cases
1. `nums = [1,2,3,1]` -> `4`
2. `nums = [2,7,9,3,1]` -> `12`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `HouseRobber.java` contains the correct class name and Java method signature.
- `HouseRobberTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `HouseRobber.java` - blank Java starter solution
- `HouseRobberTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
