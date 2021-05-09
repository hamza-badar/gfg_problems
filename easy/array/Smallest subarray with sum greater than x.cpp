class Solution{
  public:

    int sb(int arr[], int n, int x)
    {
        int sum=0;
        int count=0;
        int maxCount=n;
        for(int i=0;i<n;i++)
        {
            count=0;
            sum=0;
            for(int j=i;j<n;j++)
            {
                count++;
                sum=sum+arr[j];
                if(sum>x)
                {
                    if(maxCount>count)
                    {
                        maxCount=count;
                    }
                    break;
                }
            }
        }
        return maxCount;
    }
};