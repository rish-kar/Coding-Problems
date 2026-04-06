# 197. Rising Temperature

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: SQL
- Folder Path: `leetcode/easy/sql/197_rising_temperature`
- Folder Name: `197_rising_temperature`
- Official Link: https://leetcode.com/problems/rising-temperature/

## Problem Overview
Write a solution to find all dates' id with higher temperatures compared to its previous dates (yesterday).
Return the result table in any order .

## Java Starter Signature
```java
public Object rising_temperature()
```

## Suggested Test Cases
1. `Weather table: +----+------------+-------------+ | id | recordDate | temperature | +----+------------+-------------+ | 1 | 2015-01-01 | 10 | | 2 | 2015-01-02 | 25 | | 3 | 2015-01-03 | 20 | | 4 | 2015-01-04 | 30 | +----+------------+-------------+` -> `+----+ | id | +----+ | 2 | | 4 | +----+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RisingTemperature.java` contains the correct class name and Java method signature.
- `RisingTemperatureTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RisingTemperature.java` - blank Java starter solution
- `RisingTemperatureTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
