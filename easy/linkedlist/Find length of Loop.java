class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node p=head;
        Node q=head;
        int size=0;
        while(p!=null && q!=null)
        {
            try
            {
            q=q.next.next;
            }
            catch(NullPointerException e)
            {
                break;
            }
            if(p==q)
            {
                break;
            }
            p=p.next;
        }
        if(p==q)
        {
            do
            {
                p=p.next;
                size++;
            }while(p!=q);
        }
        
        return size;
    }
}