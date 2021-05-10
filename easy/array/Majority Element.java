class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maj=-1;
        for(int i=0;i<size;i++)
        {
            if(!mp.containsKey(a[i]))
            {
                mp.put(a[i] , 0);
            }
            mp.put(a[i] , mp.get(a[i]) + 1);
        }
        for(int i=0;i<size;i++)
        {
            if(mp.get(a[i])>(size/2))
            {
                maj=a[i];
            }
        }
        return maj;
    }
}