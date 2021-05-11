class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int noOfZeros=0;
        int ind=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                noOfZeros+=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                a[ind++]=arr[i];
            }
        }
        for(int i=0;i<noOfZeros;i++)
        {
                a[ind++]=0;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=a[i];
        }
        
    }
}