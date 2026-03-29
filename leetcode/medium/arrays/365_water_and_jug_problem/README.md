# 365. Water and Jug Problem

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/arrays/365_water_and_jug_problem`
- Folder Name: `365_water_and_jug_problem`
- Official Link: https://leetcode.com/problems/water-and-jug-problem/

## Problem Overview
You are given two jugs with capacities x liters and y liters. You have an infinite water supply. Then return whether the total amount of water in both jugs may reach target using the following operations
Follow these steps to reach a total of 4 liters

## Java Starter Signature
```java
public boolean canMeasureWater(int x, int y, int target)
```

## Suggested Test Cases
1. `x = 3, y = 5, target = 4` -> `true`
2. `x = 2, y = 6, target = 5` -> `false`
3. `x = 1, y = 2, target = 3` -> `true`

## What To Watch For
- Cover edge inputs explicitly so `canMeasureWater` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `WaterAndJugProblem.java` contains the correct class name and Java method signature.
- `WaterAndJugProblemTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `WaterAndJugProblem.java` - blank Java starter solution
- `WaterAndJugProblemTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
