# 252. Meeting Rooms

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/intervals/252_meeting_rooms`
- Folder Name: `252_meeting_rooms`
- Official Link: https://leetcode.com/problems/meeting-rooms/

## Problem Overview
Implement the core logic for Meeting Rooms exactly as the prompt defines.
Work through the array based on the problem rule and compute the requested value.

## Java Starter Signature
```java
public boolean canAttendMeetings(Object intervals)
```

## Suggested Test Cases
1. `input = []` -> `true`
2. `input = [1]` -> `false`
3. `input = [1,2,3]` -> `true`

## What To Watch For
- Guard array boundaries whenever indices move or swap operations occur.
- Account for empty and single-element arrays before the main logic.
- If in-place behavior is expected, avoid extra structures that change space complexity.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MeetingRooms.java` contains the correct class name and Java method signature.
- `MeetingRoomsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MeetingRooms.java` - blank Java starter solution
- `MeetingRoomsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
