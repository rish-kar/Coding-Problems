# 319. Bulb Switcher

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Math
- Folder Path: `leetcode/medium/math/319_bulb_switcher`
- Folder Name: `319_bulb_switcher`
- Official Link: https://leetcode.com/problems/bulb-switcher/

## Problem Overview
There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the i th round, you toggle every i bulb. For the n th round, you only toggle the last bulb.

## Java Starter Signature
```java
public int bulbSwitch(int n)
```

## Suggested Test Cases
1. `n = 3` -> `1`
2. `n = 0` -> `0`
3. `n = 1` -> `1`

## What To Watch For
- Cover edge inputs explicitly so `bulbSwitch` behaves correctly on boundary cases.
- Maintain the core invariant of your chosen approach at every update step.
- Return the result in the exact format expected by the LeetCode judge.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BulbSwitcher.java` contains the correct class name and Java method signature.
- `BulbSwitcherTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BulbSwitcher.java` - blank Java starter solution
- `BulbSwitcherTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
