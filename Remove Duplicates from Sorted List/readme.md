Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

We use two pointers. One for current location, the other for checking duplicates in the future.

Runtime:
Java O(n^2) Python O(n)

Space
O(0)
