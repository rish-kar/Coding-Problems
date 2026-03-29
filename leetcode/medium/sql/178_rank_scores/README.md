# 178. Rank Scores

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: SQL
- Folder Path: `leetcode/medium/sql/178_rank_scores`
- Folder Name: `178_rank_scores`
- Official Link: https://leetcode.com/problems/rank-scores/

## Problem Overview
Write a solution to find the rank of the scores. The ranking should be calculated according to the following rules
Return the result table ordered by score in descending order.

## Java Starter Signature
```java
public Object order_scores()
```

## Suggested Test Cases
1. `Scores table: +----+-------+ | id | score | +----+-------+ | 1 | 3.50 | | 2 | 3.65 | | 3 | 4.00 | | 4 | 3.85 | | 5 | 4.00 | | 6 | 3.65 | +----+-------+` -> `+-------+------+ | score | rank | +-------+------+ | 4.00 | 1 | | 4.00 | 1 | | 3.85 | 2 | | 3.65 | 3 | | 3.65 | 3 | | 3.50 | 4 | +-------+------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RankScores.java` contains the correct class name and Java method signature.
- `RankScoresTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RankScores.java` - blank Java starter solution
- `RankScoresTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
