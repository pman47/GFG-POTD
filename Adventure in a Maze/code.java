class Solution
{
    int count ;
    public int f(int[][] a,int i,int j,int n,int[][]vis,int[][] cnt){
        if(i>=n||j>=n){
            cnt[i][j]=0;
            return Integer.MIN_VALUE;}
        if(vis[i][j]==0){
        
        if(i==n-1&&j==n-1){
           
            return a[i][j];}
        if(a[i][j]==1){
            vis[i][j] =1+f(a,i,j+1,n,vis,cnt);
            cnt[i][j]=cnt[i][j+1];
        }
        else if(a[i][j]==2){
            vis[i][j]= 2+f(a,i+1,j,n,vis,cnt);
            cnt[i][j]=cnt[i+1][j];
        }
        else{
        vis[i][j]= 3+Math.max(f(a,i+1,j,n,vis,cnt),f(a,i,j+1,n,vis,cnt));
        cnt[i][j]=(cnt[i][j+1]+cnt[i+1][j])%1000000007;
        
        }
        }
        
        return vis[i][j];
        
        
    }
    public int[] FindWays(int[][] matrix)
    {
        
        int n=matrix.length;
        int[][] vis=new int[n][n];
        int[][] cnt=new int[n+1][n+1];
        cnt[n-1][n-1]=1;
        count=0;
        int i=0;
        int j=0;
        int[] a = new int[2];
        
        a[1]= Math.max(0,f(matrix,0,0,n,vis,cnt));
        a[0]=cnt[0][0];
    
        return a;
        // Code here
    }
}