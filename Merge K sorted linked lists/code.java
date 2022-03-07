class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        Node ans = null;
        Node ansHead = null;
        while(true){
            int min = Integer.MAX_VALUE,index=-1;
            for(int i=0;i<K;i++){
                if(arr[i]!=null && arr[i].data<min){
                    min = arr[i].data;
                    index = i;
                }
            }
            
            if(min==Integer.MAX_VALUE) break;
            
            if(ansHead==null){
                ansHead=new Node(min);
                ans = ansHead;
            }else{
                ans.next = new Node(min);
                ans = ans.next;
            }
            arr[index] = arr[index].next;
        }
        return ansHead;
    }
}