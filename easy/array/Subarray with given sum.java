class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> index=new ArrayList<>();
        int i=0,j=0;
        int sum=0;
        while(i<n || j<n)
        {
            if(sum<s && i<n)
            {
                sum=sum+arr[i++];
            }
            else if(sum==s)
            {
                index.add(j+1);
                index.add(i);
                return index;
            }
            else if(j<n)
            {
                sum=sum-arr[j++];
            }
        }
        index.add(-1);
        return index;
    }
}