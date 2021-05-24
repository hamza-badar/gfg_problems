class Solution {
    int isPlaindrome(String S) {
        String rev;
        rev="";
        for(int i=S.length()-1;i>=0;i--)
        {
            rev=rev+S.charAt(i);
        }
        if(rev.equals(S))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
};