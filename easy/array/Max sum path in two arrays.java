class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        int sum1=0,sum2=0,result=0;
        int i=0,j=0;
        int l1=ar1.length;
        int l2=ar2.length;
        while(i<l1 && j<l2)
        {
            if(ar1[i]<ar2[j])
            {
                sum1=sum1+ar1[i++];
            }
            else if(ar1[i]>ar2[j])
            {
                sum2=sum2+ar2[j++];
            }
            else
            {
                sum1=sum1+ar1[i];
                sum2=sum2+ar2[j];
                result=result+Math.max(sum1,sum2);
                sum1=0;
                i++;
                j++;
                sum2=0;
            }
        }
        while(i<l1)
        {
            sum1=sum1+ar1[i++];
        }
        while(j<l2)
        {
            sum2=sum2+ar2[j++];
        }
        result=result+Math.max(sum1,sum2);
        return result;
    }
}