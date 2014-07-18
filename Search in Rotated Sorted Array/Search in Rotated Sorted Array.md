Search in Rotated Sorted Array

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Java:
Python:
Use binary search. There are four cases we need take care of.

Runtime:
Java O(logn) Python O(logn)

Space:
Java O(0) Python O(0)
