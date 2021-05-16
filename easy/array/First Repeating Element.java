class Solution{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []arr, int n) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int ind=-1;
        
        for(int i=0; i<n; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i] , 0);
            }
            map.put(arr[i] , map.get(arr[i]) + 1);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(map.get(arr[i])>1)
            {
                ind=i+1;
            }
        }
        return ind;
    }
}