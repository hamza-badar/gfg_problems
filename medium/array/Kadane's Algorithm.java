class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int i=0;
        while(i<n)
        {
            sum=sum+arr[i++];
            if(sum<0)
            {
                sum=0;
            }
            if(sum>maxSum)
            {
                maxSum=sum;
            }
        }
        return maxSum;
    }
    
}