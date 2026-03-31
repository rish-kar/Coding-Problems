# 93. Restore IP Addresses

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Strings
- Folder Path: `leetcode/medium/backtracking/93_restore_ip_addresses`
- Folder Name: `93_restore_ip_addresses`
- Official Link: https://leetcode.com/problems/restore-ip-addresses/

## Problem Overview
A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 ( inclusive ) and cannot have leading zeros.
You are given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s . You are not allowed to reorder or remove any digits in s . You may return the valid IP addresses in any order.

## Java Starter Signature
```java
public List<String> restoreIpAddresses(String s)
```

## Suggested Test Cases
1. `s = "25525511135"` -> `["255.255.11.135","255.255.111.35"]`
2. `s = "0000"` -> `["0.0.0.0"]`
3. `s = "101023"` -> `["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]`

## What To Watch For
- Check empty-string and single-character edge cases first.
- Update indices carefully so character comparisons stay in bounds.
- Avoid unnecessary substring copies inside tight loops.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RestoreIPAddresses.java` contains the correct class name and Java method signature.
- `RestoreIPAddressesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RestoreIPAddresses.java` - blank Java starter solution
- `RestoreIPAddressesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
