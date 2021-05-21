class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       Arrays.sort(arr2);
       ArrayList<Integer> list=new ArrayList<>();
       
       
       int ele=0;
       int count=0;
       int start,end,mid;
       for(int i=0;i<m;i++)
       {
            ele=arr1[i];
            start=0; end=n-1; mid=0;
            while(start<=end)
            {
                mid=(start+end)/2;
                if(arr2[mid]<=ele)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            list.add(start);
       }
       return list;
    }
}