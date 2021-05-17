class Solution {
    int MissingNumber(int array[], int n) {
        int arr[]=new int[n+1];
        int ind=0;
        for(int i=0;i<n-1;i++)
        {
            arr[array[i]]=1;
        }
        for(int j=1;j<=n;j++)
        {
            if(arr[j]!=1)
            {
                ind=j;
                break;
            }
        }
        return ind;
    }
}