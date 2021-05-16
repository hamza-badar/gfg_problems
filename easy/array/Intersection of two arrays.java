class Solution{
    //Function to return the count of the number of elements in
    //the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        int count=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(!mp.containsKey(a[i]))
            {
                mp.put(a[i] , 0);
            }
            mp.put(a[i] , 1);
        }
        for(int i=0; i<m; i++)
        {
            if(!mp.containsKey(b[i]))
            {
                mp.put(b[i] , 0);
            }
            if(mp.get(b[i])==1)
                mp.put(b[i] , 2);
        }
        for(Map.Entry l : mp.entrySet())
        {
            if((Integer)l.getValue()>1)
            {
                count++;
            }
        }
        return count;
    }
};