class Solution
{
    public int FindWays(int n, int m, int[][] blocked_cells)
    {
        int[][] table = new int[n+1][m+1];
        for(int i=0;i<blocked_cells.length;i++){
            table[blocked_cells[i][0]][blocked_cells[i][1]] = -1;
        }
        table[0][1]=1;
        int mod = 1000000007;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(table[i][j] == -1) {
                    table[i][j]=0;
                } else {
                    table[i][j]=((table[i-1][j])%mod + (table[i][j-1])%mod)%mod;
                }
            }
        }
        // for(int i=0;i<n;i++)
        //     System.out.println(Arrays.toString(table[i]));
        return table[n][m]%mod;
    }
}