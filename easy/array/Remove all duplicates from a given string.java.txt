class Solution {
    String removeDuplicates(String str) {
        String s="";
	    for(int i=0;i<str.length();i++)
	    {
	        if(str.charAt(i)!='*')
	        {
	            s=s+str.charAt(i);
	            str=str.replace(str.charAt(i),'*');
	        }
	    }
	    return s;
        
    }
}
