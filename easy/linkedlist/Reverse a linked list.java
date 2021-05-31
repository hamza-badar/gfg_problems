class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Node test=head;
        Node test2=head;
        while(test!=null)
        {
            list.add(test.data);
            test=test.next;
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            head.data=list.get(i);
            head=head.next;
        }
        head=test2;
        return head;
    }
}