class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        
        Node p=head;
        Node q=head;
        
        while(p!=null && q!=null)
        {
            try
            {
            q=q.next.next;
            }
            catch(NullPointerException e)
            {
                return false;
            }
            if(p==q)
            {
                return true;
            }
            p=p.next;
        }
        return false;
    }
}