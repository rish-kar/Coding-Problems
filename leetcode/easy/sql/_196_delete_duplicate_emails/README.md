# 196. Delete Duplicate Emails

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: SQL
- Folder Path: `leetcode/easy/sql/196_delete_duplicate_emails`
- Folder Name: `196_delete_duplicate_emails`
- Official Link: https://leetcode.com/problems/delete-duplicate-emails/

## Problem Overview
Write a solution to delete all duplicate emails, keeping only one unique email with the smallest id .
For SQL users, please note that you are supposed to write a DELETE statement and not a SELECT one.

## Java Starter Signature
```java
public Object delete_duplicate_emails()
```

## Suggested Test Cases
1. `Person table: +----+------------------+ | id | email | +----+------------------+ | 1 | john@example.com | | 2 | bob@example.com | | 3 | john@example.com | +----+------------------+` -> `+----+------------------+ | id | email | +----+------------------+ | 1 | john@example.com | | 2 | bob@example.com | +----+------------------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `DeleteDuplicateEmails.java` contains the correct class name and Java method signature.
- `DeleteDuplicateEmailsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `DeleteDuplicateEmails.java` - blank Java starter solution
- `DeleteDuplicateEmailsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
