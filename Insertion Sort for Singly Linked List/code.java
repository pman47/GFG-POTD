class Solution
{
    public static Node insertionSort(Node head_ref)
    {
        Node start=head_ref;
        while(start!=null){
            Node Temp=start.next;
            while(Temp!=null){
                if(Temp.data<=start.data){
                    int temp=start.data;
                    start.data=Temp.data;
                    Temp.data=temp;
                }
                Temp=Temp.next;
            }
            start=start.next;
        }
        return head_ref;
    }
}