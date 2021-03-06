# Compute Before Matrix

### Medium Accuracy: 91.06% Submissions: 2006 Points: 4

---

For a given 2D Matrix before, the corresponding cell (x, y) of the after matrix is calculated as follows:

<pre>
     res = 0;
     for(i = 0; i <= x; i++){
     for( j = 0; j <= y; j++){              
          res += before(i,j);
     }
     }
     after(x,y) = res;
</pre>

Given an N\*M 2D-Matrix after, your task is to find the corresponding before matrix for the given matrix.

## Example 1:

<pre>
Input:
N = 2, M = 3
after[][] = {{1, 3, 6},
            {3, 7, 11}}

Output:
1 2 3
2 2 1

Explanation:
The before matrix for the given after matrix
matrix is {{1, 2, 3}, {2, 2, 1}}.
</pre>

## Example 2:

<pre>
Input: 
N = 1, M = 3
after[][] = {{1, 3, 5}}

Output:
1 2 2

Explanation: 
The before matrix for the given after matrix
is {{1, 2, 2}}.
</pre>

## Your Task:

Complete the function computeBeforeMatrix() which takes the integers N, M, and the 2D Matrix after as the input parameters, and returns the before matrix of the given after matrix.

### Expected Time Complexity: O(N\*M) , Expected Auxiliary Space: O(1)

## Constraints:

- 1 ≤ N, M, after[i][j] ≤ 10^9
