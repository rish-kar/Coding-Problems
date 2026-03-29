# 134. Gas Station

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/134_gas_station`
- Folder Name: `134_gas_station`
- Official Link: https://leetcode.com/problems/gas-station/

## Problem Overview
There are n gas stations along a circular route, where the amount of gas at the i th station is gas[i] .
You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the i th station to its next (i + 1) th station. You begin the journey with an empty tank at one of the gas stations.

## Java Starter Signature
```java
public int canCompleteCircuit(int[] gas, int[] cost)
```

## Suggested Test Cases
1. `gas = [1,2,3,4,5], cost = [3,4,5,1,2]` -> `3`
2. `gas = [2,3,4], cost = [3,4,3]` -> `-1`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GasStation.java` contains the correct class name and Java method signature.
- `GasStationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GasStation.java` - blank Java starter solution
- `GasStationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
