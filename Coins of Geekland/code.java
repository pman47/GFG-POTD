class Solution
{
    public int Maximum_Sum(int a[][],int n,int k){
        int ans = 0;
        for(int i=0;i<n-k+1;i++){
            for(int j=0;j<n-k+1;j++){
                
                int temp = 0;
                for(int x=i;x<i+k;x++){
                    for(int y=j;y<j+k;y++){
                        temp+=a[x][y];
                    }
                }
                // System.out.print(temp + " ");
                ans = Math.max(ans,temp);
                
            }
            // System.out.println();
        }
        
        return ans;
    }
}