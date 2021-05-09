class Solution {
  public:
    int makeProductOne(int arr[], int N) {
        int step=0;
        int negNo=0;
        int noZero=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]<0)
            {
                step=step+(-1-arr[i]);
                negNo++;
            }
            else if(arr[i]==0)
            {
                noZero++;
            }
            else
            {
                step=step+(-1+arr[i]);
            }
        }
        if(negNo%2==0)
        {
            return step+noZero;
        }
        else 
        {
            if(noZero>0)
            {
                return step+noZero;
            }
            else
            {
                return step+2;
            }
        }
    }
};