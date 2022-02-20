class Compute {
    
    public long kthDiff(long arr[], long n, long k)
    {
        Arrays.sort(arr);
        long low = 0;
        long  high = arr[arr.length - 1]-arr[0];
        while (low < high) {
            long mid = (low + high) / 2;
            int  count = 0, left = 0;
            for (int right = 0; right < arr.length; ++right) {
                while (arr[right] - arr[left] > mid) left++;
                count += right - left;
            }
            if (count >= k) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}