class Solution{
  public:
    int findExtra(int a[], int b[], int n) {
        int start=0,end=n-1,mid=0;
       while(start<=end)
       {
           mid=(start+end)/2;
           if(a[mid]==b[mid])
           {
               start=mid+1;
           }
           else
           {
               end=mid-1;
           }
       }
       return start;
    }
};