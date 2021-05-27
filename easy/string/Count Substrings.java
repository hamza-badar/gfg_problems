class Solution
{
    int countSubstr (String str)
    {
        int j=0,sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                sum=sum+j;
                j++;
            }
        }
        return sum;
    }
}