Reverse Linked List II 

Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ¡Ü m ¡Ü n ¡Ü length of list.

Java:
Python:
First store the previous node of m node. Then change each node next to the m node to next to the previous node.

Runtime:
Java O(n) Python O(n)

Space:
Java O(1) Python O(1)
