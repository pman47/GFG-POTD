class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        
        int direction = 0;
        int i=0,j=0;
        while(i<m && j<n && i>=0 && j>=0){
            if(arr[i][j]==1){
                arr[i][j]=0;
                direction++;
            }
            
            if(direction%4==0){
                if(j+1>=n) return new int[]{i,j};
                j++;
            }else if(direction%4==1){
                if(i+1>=m) return new int[]{i,j};
                i++;
            }else if(direction%4==2){
                if(j-1<0) return new int[]{i,j};
                j--;
            }else{
                if(i-1<0) return new int[]{i,j};
                i--;
            }
        }
        return new int[]{i,j};
    }
}