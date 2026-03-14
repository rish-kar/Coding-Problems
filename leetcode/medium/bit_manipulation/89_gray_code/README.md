# 89. Gray Code

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Bit Manipulation
- Folder Path: `leetcode/medium/bit_manipulation/89_gray_code`
- Folder Name: `89_gray_code`
- Official Link: https://leetcode.com/problems/gray-code/

## Problem Overview
Generate a Gray code sequence of length 2^n where adjacent values differ by one bit.

## Java Starter Signature
```java
public List<Integer> grayCode(int n)
```


## Suggested Test Cases
1. `n = 2 -> [0,1,3,2] or another valid Gray order`
2. `n = 1 -> [0,1]`
3. `n = 0 -> [0]`

## What To Watch For
- Watch for sign handling and overflow near the 32-bit integer limits.
- Left shifts and subtraction loops are common tools when division is restricted.
- Bit-based constructions usually benefit from checking the highest positions first.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `GrayCode.java` contains the correct class name and Java method signature.
- `GrayCodeTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `GrayCode.java` - blank Java starter solution
- `GrayCodeTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
