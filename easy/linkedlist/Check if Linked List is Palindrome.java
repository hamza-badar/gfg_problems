class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Node cop=head;
        int i,j;
        while(cop!=null)
        {
            arr.add(cop.data);
            cop=cop.next;
        }
        i=0;
        j=arr.size()-1;
        while(i<=j)
        {
            if(arr.get(i)!=arr.get(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }    
}