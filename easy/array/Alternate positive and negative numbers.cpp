class Solution{
public:

	void rearrange(int arr[], int n) {
	    int arr1[n],arr2[n];
	    int i=0,j=0;
	    for(int k=0;k<n;k++)
	    {
	        if(arr[k]>=0)
	        {
	            arr1[i++]=arr[k];
	        }
	        else
	        {
	            arr2[j++]=arr[k];
	        }
	    }
	    int m=0;
	    int n1=0;
	    int k=0;
	    while(k<n)
	    {
	        if(m<i)
	        {
	            arr[k++]=arr1[m++];
	        }
	        if(n1<j)
	        {
	            arr[k++]=arr2[n1++];
	        }
	    }
	}
};