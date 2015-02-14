Unique Paths
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Above is a 3 x 7 grid. How many possible unique paths are there?

Note: m and n will be at most 100.

Java:	m[i][j] <-> m[n-j][n-i] //First swap diagonally
	 m[i][j] <-> matrix[n-i][j] // Second swap vertically
Python:


Time Complexity: O(n^2)
Auxiliary Space: O(n) 


