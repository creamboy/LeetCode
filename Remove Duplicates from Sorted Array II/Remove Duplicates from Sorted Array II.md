Remove Duplicates from Sorted Array II 

Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].

Solution: In this case we remove the middle duplicates from a sequence of duplicates. So, we retain first element and last element. And skip the elements which are the same to their left and right one.

Runtime:
Java O(n) Python O(n)

Space
Java O(0) Python O(0)

