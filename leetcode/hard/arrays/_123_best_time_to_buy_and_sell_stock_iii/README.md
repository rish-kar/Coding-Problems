# 123. Best Time to Buy and Sell Stock III

## Metadata
- Platform: LeetCode
- Difficulty: Hard
- Primary Topic: Arrays
- Folder Path: `leetcode/hard/arrays/123_best_time_to_buy_and_sell_stock_iii`
- Folder Name: `123_best_time_to_buy_and_sell_stock_iii`
- Official Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

## Problem Overview
You are given an array prices where prices[i] is the price of a given stock on the i th day.
Find the maximum profit you can achieve. You may complete at most two transactions .

## Java Starter Signature
```java
public int maxProfit(int[] prices)
```

## Suggested Test Cases
1. `prices = [3,3,5,0,0,3,1,4]` -> `6`
2. `prices = [1,2,3,4,5]` -> `4`
3. `prices = [7,6,4,3,1]` -> `0`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BestTimeToBuyAndSellStockIII.java` contains the correct class name and Java method signature.
- `BestTimeToBuyAndSellStockIIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BestTimeToBuyAndSellStockIII.java` - blank Java starter solution
- `BestTimeToBuyAndSellStockIIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
