# 175. Combine Two Tables

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: SQL
- Folder Path: `leetcode/easy/sql/175_combine_two_tables`
- Folder Name: `175_combine_two_tables`
- Official Link: https://leetcode.com/problems/combine-two-tables/

## Problem Overview
Write a solution to report the first name, last name, city, and state of each person in the Person table. If the address of a personId is not present in the Address table, report null instead.
Return the result table in any order .

## Java Starter Signature
```java
public Object combine_two_tables()
```

## Suggested Test Cases
1. `Person table: +----------+----------+-----------+ | personId | lastName | firstName | +----------+----------+-----------+ | 1 | Wang | Allen | | 2 | Alice | Bob | +----------+----------+-----------+ Address table: +-----------+----------+---------------+------------+ | addressId | personId | city | state | +-----------+----------+---------------+------------+ | 1 | 2 | New York City | New York | | 2 | 3 | Leetcode | California | +-----------+----------+---------------+------------+` -> `+-----------+----------+---------------+----------+ | firstName | lastName | city | state | +-----------+----------+---------------+----------+ | Allen | Wang | Null | Null | | Bob | Alice | New York City | New York | +-----------+----------+---------------+----------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CombineTwoTables.java` contains the correct class name and Java method signature.
- `CombineTwoTablesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CombineTwoTables.java` - blank Java starter solution
- `CombineTwoTablesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
