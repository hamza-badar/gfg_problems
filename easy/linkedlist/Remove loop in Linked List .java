class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        HashMap<Node,Integer> map=new HashMap<>();
        Node prev=null;
        while(head!=null)
        {
            if(!map.containsKey(head))
            {
                map.put(head,1);
                prev=head;
                head=head.next;
            }
            else
            {
                prev.next=null;
                break;
            }
        }
    }
}