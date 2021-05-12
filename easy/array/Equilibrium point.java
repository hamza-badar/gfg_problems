class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        
        int j=n-1,i=0;
        long sum1=arr[i],sum2=arr[j];
        
        if(arr.length==2)
        {
            return -1;
        }
        while(i<j)
        {
            if(sum1>sum2)
            {
                j--;
                sum2=sum2+arr[j];
            }
            else if(sum1==sum2)
            {
                i++;
                j--;
                sum1=sum1+arr[i];
                sum2=sum2+arr[j];
            }
            else
            {
                i++;
                sum1=sum1+arr[i];
            }
        }
        if(sum1==sum2)
        {
            return (i+1);
        }
        else
        {
            return -1;
        }
        
    }
}