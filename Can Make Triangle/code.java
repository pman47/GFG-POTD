class Solution 
{ 
    int[] canMakeTriangle(int A[], int N) 
    { 
        int[] ans = new int[N-2];
        for(int i=0;i<N-2;i++){
            if(A[i]+A[i+1]>A[i+2] && A[i+1]+A[i+2]>A[i] && A[i]+A[i+2]>A[i+1]) ans[i]=1;
            else ans[i]=0;
        }
        return ans;
    }
}