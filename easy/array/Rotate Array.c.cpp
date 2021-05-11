class Solution{
    public:
    
    //Function to rotate an array by d elements in counter-clockwise direction. 
    void rotateArr(int arr[], int d, int n){
        // code here
        int a[n],ind=0;
        for(int i=d;i<n;i++)
        {
            a[ind]=arr[i];
            ind++;
        }
        for(int i=0;i<d;i++)
        {
            a[ind]=arr[i];
            ind++;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=a[i];
        }
    }
};