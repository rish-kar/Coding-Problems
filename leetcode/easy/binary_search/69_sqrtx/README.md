# 69. Sqrt(x)

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Binary Search
- Folder Path: `leetcode/easy/binary_search/69_sqrtx`
- Folder Name: `69_sqrtx`
- Official Link: https://leetcode.com/problems/sqrtx/

## Problem Overview
Return the integer square root of x, truncating any fractional part.

## Java Starter Signature
```java
public int mySqrt(int x)
```


## Suggested Test Cases
1. `x = 4 -> 2`
2. `x = 8 -> 2`
3. `x = 1 -> 1`

## What To Watch For
- Decide whether the interval is closed or half-open and keep that rule consistent.
- Midpoint and boundary updates should always shrink the search space.
- When the loop ends, confirm whether the answer is a found index or an insertion boundary.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `Sqrtx.java` contains the correct class name and Java method signature.
- `SqrtxTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `Sqrtx.java` - blank Java starter solution
- `SqrtxTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
