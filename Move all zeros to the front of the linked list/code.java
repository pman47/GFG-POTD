class GfG{
    public Node moveZeroes(Node head){
        Node curr=head;
        while(curr!=null){
            while(curr.next!=null&&curr.next.data==0){
                Node temp=curr.next.next,temp1=curr.next;
                temp1.next=head;
                curr.next=temp;
                head=temp1;
            }
            curr=curr.next;
        }
        return head;
    }
}