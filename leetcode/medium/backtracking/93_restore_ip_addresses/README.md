# 93. Restore IP Addresses

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Backtracking
- Folder Path: `leetcode/medium/backtracking/93_restore_ip_addresses`
- Folder Name: `93_restore_ip_addresses`
- Official Link: https://leetcode.com/problems/restore-ip-addresses/

## Problem Overview
Return all valid IP addresses that can be formed by inserting three dots into the string.

## Java Starter Signature
```java
public List<String> restoreIpAddresses(String s)
```


## Suggested Test Cases
1. `s = "25525511135" -> ["255.255.11.135","255.255.111.35"]`
2. `s = "0000" -> ["0.0.0.0"]`
3. `s = "101023" -> multiple valid addresses`

## What To Watch For
- Define the stopping condition first so you know exactly when to record an answer.
- Undo each choice after the recursive call so the next branch starts cleanly.
- If duplicates are possible, decide where to prune them before recursion explodes.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RestoreIpAddresses.java` contains the correct class name and Java method signature.
- `RestoreIpAddressesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RestoreIpAddresses.java` - blank Java starter solution
- `RestoreIpAddressesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
