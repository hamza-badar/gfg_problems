class Solution{
    // Function for finding maximum and value pair
    public static boolean areElementsContiguous (int arr[], int n) {
        int max=0,firstZero=0,lastZero=0;
        boolean result=true;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int a[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            a[arr[i]]++;
        }
        for(int i=0;i<=max;i++)
        {
            if(a[i]!=0)
            {
                firstZero=i;
                break;
            }
        }
        for(int i=max;i>=0;i--)
        {
            if(a[i]!=0)
            {
                lastZero=i;
                break;
            }
        }
        for(int i=firstZero;i<=lastZero;i++)
        {
            if(a[i]==0)
            {
                result=false;
                break;
            }
        }
        return result;
    }
}