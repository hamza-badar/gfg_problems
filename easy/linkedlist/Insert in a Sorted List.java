class Solution {
    Node sortedInsert(Node head1, int key) {
        Node p=null,q;
        q=head1;
        
        if(head1.data>key)
        {
            Node newHead=new Node(key);
            newHead.next=head1;
            return newHead;
        }
        p=q;
        q=q.next;
        while(q!=null)
        {
            if(q.data>key)
            {
                Node temp=new Node(key);
                temp.next=q;
                p.next=temp;
                return head1;
            }
                p=q;
                q=q.next;
        }
        p.next=new Node(key);
        return head1;
    }
}