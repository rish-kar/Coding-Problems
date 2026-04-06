# 299. Bulls and Cows

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/arrays/299_bulls_and_cows`
- Folder Name: `299_bulls_and_cows`
- Official Link: https://leetcode.com/problems/bulls-and-cows/

## Problem Overview
You are playing the Bulls and Cows game with your friend.
You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info

## Java Starter Signature
```java
public String getHint(String secret, String guess)
```

## Suggested Test Cases
1. `secret = "1807", guess = "7810"` -> `"1A3B"`
2. `secret = "1123", guess = "0111"` -> `"1A1B"`
3. `s = ""` -> `returns the correct empty-input result`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BullsAndCows.java` contains the correct class name and Java method signature.
- `BullsAndCowsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BullsAndCows.java` - blank Java starter solution
- `BullsAndCowsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
