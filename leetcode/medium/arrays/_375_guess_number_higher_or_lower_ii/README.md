# 375. Guess Number Higher or Lower II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Dynamic Programming
- Folder Path: `leetcode/medium/arrays/375_guess_number_higher_or_lower_ii`
- Folder Name: `375_guess_number_higher_or_lower_ii`
- Official Link: https://leetcode.com/problems/guess-number-higher-or-lower-ii/

## Problem Overview
We are playing the Guessing Game. The game will work as follows
You are given a particular n , return the minimum amount of money you need to guarantee a win regardless of what number I pick .

## Java Starter Signature
```java
public int getMoneyAmount(int n)
```

## Suggested Test Cases
1. `n = 10` -> `16`
2. `n = 1` -> `0`
3. `n = 2` -> `1`

## What To Watch For
- Define state meaning before coding transitions.
- Initialize base states explicitly to avoid propagation errors.
- Verify transition bounds so index access never goes out of range.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GuessNumberHigherOrLowerII.java` contains the correct class name and Java method signature.
- `GuessNumberHigherOrLowerIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GuessNumberHigherOrLowerII.java` - blank Java starter solution
- `GuessNumberHigherOrLowerIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
