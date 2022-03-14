class Solution {
    static int biGraph(int[] arr, int n, int e) {
        if(n<=2)
          return 1;
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i=0;i<n;i++){
           adj.add(new ArrayList<>());
       }
       for(int i=0;i<arr.length-1;i=i+2){
           adj.get(arr[i]).add(arr[i+1]);
           adj.get(arr[i+1]).add(arr[i]);
       }
       for(ArrayList<Integer> i : adj){
           if(i.size()<=1)
               return 0;
       }
       return 1;
    }
};