class Complete{
    // Function for finding maximum and value pair
    public static int[] greaterElement (int arr[], int n) {
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
            max = Math.max(max,arr[i]);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=arr[i]+1;j<=max;j++){
                if(set.contains(j)){
                    ans[i]=j;
                    flag = true;
                    break;
                }
            }
            if(!flag)
                ans[i]=-10000000;
        }
        return ans;
    }
}