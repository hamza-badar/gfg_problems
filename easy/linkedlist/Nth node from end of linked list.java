class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	Node cop;
    	Node find;
        cop=head;
        int size=0;
        while(cop!=null)
        {
            size++;
            cop=cop.next;
        }
        //System.out.println(size);
        cop=head;
        for(int i=0;i<size-n;i++)
        {
            cop=cop.next;
        }
        if(n>size)
        {
            return -1;
        }
        return cop.data;
    }
}
