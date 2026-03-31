# 188. Best Time to Buy and Sell Stock IV

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/188_best_time_to_buy_and_sell_stock_iv`
- Folder Name: `188_best_time_to_buy_and_sell_stock_iv`
- Official Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/

## Problem Overview
You are given an integer array prices where prices[i] is the price of a given stock on the i th day, and an integer k .
Find the maximum profit you can achieve. You may complete at most k transactions: i.e. you may buy at most k times and sell at most k times.

## Java Starter Signature
```java
public int maxProfit(int k, int[] prices)
```

## Suggested Test Cases
1. `k = 2, prices = [2,4,1]` -> `2`
2. `k = 2, prices = [3,2,6,5,0,3]` -> `7`
3. `nums = [single element]` -> `returns the correct base-case value`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BestTimeToBuyAndSellStockIV.java` contains the correct class name and Java method signature.
- `BestTimeToBuyAndSellStockIVTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BestTimeToBuyAndSellStockIV.java` - blank Java starter solution
- `BestTimeToBuyAndSellStockIVTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
