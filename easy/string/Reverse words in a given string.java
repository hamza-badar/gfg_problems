class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String str[]=S.split("[.]",0);
        String newStr="";
        for(int i=str.length-1;i>=0;i--)
        {
            newStr=newStr+str[i];
            if(i!=0)
            {
                newStr=newStr+".";
            }
        }
        return newStr;
    }
}