# 374. Guess Number Higher or Lower

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Search
- Folder Path: `leetcode/easy/arrays/374_guess_number_higher_or_lower`
- Folder Name: `374_guess_number_higher_or_lower`
- Official Link: https://leetcode.com/problems/guess-number-higher-or-lower/

## Problem Overview
We are playing the Guess Game. The game is as follows
I pick a number from 1 to n . You have to guess which number I picked (the number I picked stays the same throughout the game).

## Java Starter Signature
```java
public int guessNumber(int n)
```

## Suggested Test Cases
1. `n = 10, pick = 6` -> `6`
2. `n = 1, pick = 1` -> `1`
3. `n = 2, pick = 1` -> `1`

## What To Watch For
- Keep interval boundaries consistent (`[low, high]` or `[low, high)`) through the whole loop.
- Recompute the midpoint safely and update the correct boundary each step.
- Return the exact index/boundary requested, not just any matching position.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GuessNumberHigherOrLower.java` contains the correct class name and Java method signature.
- `GuessNumberHigherOrLowerTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GuessNumberHigherOrLower.java` - blank Java starter solution
- `GuessNumberHigherOrLowerTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
