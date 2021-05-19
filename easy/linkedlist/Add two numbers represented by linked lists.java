class Solution{
    //static function doing reverese of Linked List
    public static Node reverse(Node head)
    {
        Node cop=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(cop!=null)
        {
            arr.add(cop.data);
            cop=cop.next;
        }
        cop=head;
        for(int i=arr.size()-1;i>=0;i--)
        {
            cop.data=arr.get(i);
            cop=cop.next;
        }
        return head;
    }
    
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        Node firstRev=reverse(first);
        Node secondRev=reverse(second);
        Node newHead=null,last=null;
        int sum=0,rem=0,quo=0;
        while(firstRev!=null && secondRev!=null)
        {
            sum=firstRev.data+secondRev.data+quo;
            rem=sum%10;
            quo=sum/10;
            if(newHead==null)
            {
                newHead=new Node(rem);
                last=newHead;
            }
            else
            {
                Node temp=new Node(rem);
                last.next=temp;
                last=temp;
            }
            firstRev=firstRev.next;
            secondRev=secondRev.next;
        }
        
        if(firstRev!=null)
        {
            while(firstRev!=null)
            {
                sum=firstRev.data+quo;
                rem=sum%10;
                quo=sum/10;
                Node temp=new Node(rem);
                last.next=temp;
                last=temp;
                firstRev=firstRev.next;
            }
        }
        
        if(secondRev!=null)
        {
            while(secondRev!=null)
            {
                sum=secondRev.data+quo;
                rem=sum%10;
                quo=sum/10;
                Node temp=new Node(rem);
                last.next=temp;
                last=temp;
                secondRev=secondRev.next;
            }
        }
        
        if(sum>9)
        {
            Node temp=new Node(sum/10);
            last.next=temp;
            last=temp;
        }
        
        newHead=reverse(newHead);
        
        return newHead;
        // return head of sum list
    }
}