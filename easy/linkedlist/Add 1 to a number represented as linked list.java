class Solution
{
    public static Node addOne(Node head) 
    { 
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        Node newList;
        int j=0;
        

        Node cop=head;
        Node h=head;
        while(cop!=null)
        {
            num.add(cop.data);
            cop=cop.next;
        }
        num.set(num.size()-1,num.get(num.size()-1)+1);
        j=num.size()-1;
        int rem=0;
        int quo=0;
        while(num.get(j)>9)
        {
            if(j==0)
            {
               // int rem=
                num.add(0,num.get(0)/10);
                num.set(1,num.get(1)%10);
                break;
            }
            rem=num.get(j)%10;
            quo=num.get(j)/10;
            num.set(j,rem);
            num.set(j-1,num.get(j-1)+quo);
            j--;
            
        }
        
        
        newList=new Node(num.get(0));
       // newList.next=prev;
        Node prev;
        
        prev=newList;
        //newList.next=prev;
        for(int i=1;i<num.size();i++)
        {
            Node temp=new Node(num.get(i));
            prev.next=temp;
            prev=temp;
        }
        return newList;
    }
}
