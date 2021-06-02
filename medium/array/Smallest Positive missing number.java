class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        int cop[]=new int[size];
        int ind=0;
        int max=0;
        int j=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>=0)
            {
                cop[ind++]=arr[i];
            }
        }
        for(int i=0;i<size;i++)
        {
            if(cop[i]>max)
            {
                max=cop[i];
            }
        }
        int a[]=new int[max+1];
        for(int i=0;i<size;i++)
        {
            a[cop[i]]=1;
        }
        for(;j<=max;j++)
        {
            if(a[j]==0)
            {
                break;
            }
        }
        if(j==0)
        {
            return 1;
        }
        else
        {
            return j;
        }
    }
}