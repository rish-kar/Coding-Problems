# 180. Consecutive Numbers

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: SQL
- Folder Path: `leetcode/medium/sql/180_consecutive_numbers`
- Folder Name: `180_consecutive_numbers`
- Official Link: https://leetcode.com/problems/consecutive-numbers/

## Problem Overview
Find all numbers that appear at least three times consecutively.
Return the result table in any order .

## Java Starter Signature
```java
public Object consecutive_numbers()
```

## Suggested Test Cases
1. `Logs table: +----+-----+ | id | num | +----+-----+ | 1 | 1 | | 2 | 1 | | 3 | 1 | | 4 | 2 | | 5 | 1 | | 6 | 2 | | 7 | 2 | +----+-----+` -> `+-----------------+ | ConsecutiveNums | +-----------------+ | 1 | +-----------------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `ConsecutiveNumbers.java` contains the correct class name and Java method signature.
- `ConsecutiveNumbersTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `ConsecutiveNumbers.java` - blank Java starter solution
- `ConsecutiveNumbersTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
