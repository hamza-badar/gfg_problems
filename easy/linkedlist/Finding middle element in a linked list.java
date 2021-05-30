class Solution
{
    int getMiddle(Node head)
    {
         Node p=head;
         Node q=head;
         while(p!=null && q!=null)
         {
             try
             {
                 q=q.next.next;
             }
             catch(Exception e)
             {
                 break;
             }
             p=p.next;
         }
         return p.data;
    }
}