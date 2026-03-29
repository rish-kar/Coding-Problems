# 183. Customers Who Never Order

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: SQL
- Folder Path: `leetcode/easy/sql/183_customers_who_never_order`
- Folder Name: `183_customers_who_never_order`
- Official Link: https://leetcode.com/problems/customers-who-never-order/

## Problem Overview
Write a solution to find all customers who never order anything.
Return the result table in any order .

## Java Starter Signature
```java
public Object find_customers()
```

## Suggested Test Cases
1. `Customers table: +----+-------+ | id | name | +----+-------+ | 1 | Joe | | 2 | Henry | | 3 | Sam | | 4 | Max | +----+-------+ Orders table: +----+------------+ | id | customerId | +----+------------+ | 1 | 3 | | 2 | 1 | +----+------------+` -> `+-----------+ | Customers | +-----------+ | Henry | | Max | +-----------+`
2. `Scores = [3.50, 3.65, 4.00, 3.85, 4.00, 3.65]` -> `dense ranks = [1, 1, 2, 3, 3, 4]`
3. `dataset from Example 1` -> `result set exactly matches Example 1`

## What To Watch For
- Join tables on the correct keys before filtering or aggregating.
- Treat `NULL` handling explicitly where comparisons can drop rows unexpectedly.
- Return exactly the columns, aliases, and ordering required by the prompt.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `CustomersWhoNeverOrder.java` contains the correct class name and Java method signature.
- `CustomersWhoNeverOrderTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `CustomersWhoNeverOrder.java` - blank Java starter solution
- `CustomersWhoNeverOrderTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
