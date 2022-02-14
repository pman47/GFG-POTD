class Solve {
    int[] findTwoElement(int arr[], int n) {
        Arrays.sort(arr);
        int[] ans = new int[2];
        for(int i=0;i<n-1;i++){
            if(arr[i+1] == arr[i]){
                ans[0]=arr[i];
                arr[i]=-1;
            }
        }
        Arrays.sort(arr);
        for(int i=1;i<=n;i++){
            if(arr[i-1] != i) ans[1]=i;
        }
        return ans;
    }
}