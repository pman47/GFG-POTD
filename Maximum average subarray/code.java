class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        double maxAverage = sum/k;
        int curr = 0;
        for(int i = k; i < n; i++){
            sum -= arr[i - k];
            sum += arr[i];
            if(sum/k > maxAverage){
                curr = i - k + 1;
                maxAverage = sum/k;
            } 
        }
        return curr;
    }
}