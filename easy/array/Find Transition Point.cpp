int transitionPoint(int arr[], int n) {
    // code here
    int start=0,end=n-1,mid=0;
    while(start<=end)
    {
        mid=(start+end)/2;
        if(arr[mid]==1)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
            
        }
    }
    if(arr[start]==1)
    {
        return start;
    }
    else
    {
        return -1;
    }
}