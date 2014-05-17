Linked List Cycle II 

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?

Use fast and slow pointer. When fast pointer reaches slow one, the steps remain from fast pointer to the cycle entry is the equal to the steps from head to the cycle entry. 

Time complexity: O(n)
Space: O(0)
