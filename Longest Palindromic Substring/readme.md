Longest Palindromic Substring

Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.

Java:
Python:
So, it becomes simple, you only need to scan from beginning to the end, adding one character at a time, keeping track of maxPalindromeLen, and for each added character, you check if the substrings ending with this new character, with length P+1 or P+2, are palindromes, and update accordingly.

Time Complexity: O(n^2)
Auxiliary Space: O(n) 


