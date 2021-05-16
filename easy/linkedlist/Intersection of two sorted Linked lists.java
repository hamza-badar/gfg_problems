class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node temp=null;
        Node inter=temp;
        Node p=head1;
        Node q=head2;
        while(p!=null && q!=null)
        {
            if(p.data<q.data)
            {
                p=p.next;
            }
            else if(p.data==q.data)
            {
                if(temp==null)
                {
                    temp=p;
                    inter=temp;
                    //temp=temp.next;
                }
                else
                {
                    temp.next=p;
                    temp=temp.next;
                }
                p=p.next;
                q=q.next;
            }
            else
            {
                q=q.next;
            }
        }
        temp.next=null;
        
        return inter;
    }
}