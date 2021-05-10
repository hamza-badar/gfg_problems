class Solution{
public:	
	int findKRotation(int arr[], int n) {
	    // code here
	    int i=0,k=0;
	    while(i<n)
	    {
	        if(arr[i]>arr[n-1])
	        {
	            i++;
	            k++;
	        }
	        else
	        {
	            break;
	        }
	    }
	    return k++;
	}

};