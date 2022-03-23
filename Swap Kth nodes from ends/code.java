class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int n, int K)
    {
        if(K>n) return head;
       Node first=head,prev1=null,second=head,prev2=null;
       for(int i=1;i<K;i++)
       {
           prev1=first;
           first=first.next;
       }
       for(int i=1;i<n-K+1;i++)
       {
           prev2=second;
           second=second.next;
       }
       if(prev1!=null) prev1.next=second;
       if(prev2!=null) prev2.next=first;
       Node temp=first.next;
       first.next=second.next;
       second.next=temp;
       if(K==1) head= second;
       if(K==n) head=first;
       return head;
    }
}