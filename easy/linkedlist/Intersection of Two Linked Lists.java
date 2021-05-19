class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        Node newHead=null,last=null;
        while(head1!=null)
        {
            if(!map.containsKey(head1.data))
            {
                map.put(head1.data,0);
            }
            map.put(head1.data,map.get(head1.data)+1);
            head1=head1.next;
        }
        while(head2!=null)
        {
            if(!map.containsKey(head2.data))
            {
                map.put(head2.data,0);
            }
            map.put(head2.data,map.get(head2.data)+1);
            head2=head2.next;
        }
        Set<Integer> keys = map.keySet();
        for (Integer x : keys)
        {
            if(map.get(x)>1)
            {
                if(newHead==null)
                {
                    newHead=new Node(x);
                    last=newHead;
                }
                else
                {
                    Node temp=new Node(x);
                    last.next=temp;
                    last=temp;
                }
            }
        }
        return newHead;
    }
}