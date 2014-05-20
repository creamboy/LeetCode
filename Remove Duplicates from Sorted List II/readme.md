Remove Duplicates from Sorted List II 

Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.

Java:
  Create a node other than any node in the list as a previous node before head. This can help us to maintain our head node dynamicly. 

Python:
  Create a new node class to ensure that we donot select a value is same as some node in the list.  
Runtime:
Java O(n) Python O(n)

Space:
Java O(1) Python O(1)
