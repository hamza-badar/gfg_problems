class Solution{
    public:
    // arr: input array
    // n: size of array
    //Function to sort the array into a wave-like array.
    void convertToWave(int *arr, int n){
        
        // Your code here
        int temp=0,i=0,j=0;
        while(j<n/2)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;
            j++;
        }
        
    }
};