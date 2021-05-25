class Solution
{
    static ArrayList<String> list=new ArrayList<>();
    public static void createPerm(String str,String ans)
    {
        if (str.length() == 0) {
            list.add(ans);
            return ;
        }
  
        for (int i = 0; i < str.length(); i++) {
  
            // ith character of str
            char ch = str.charAt(i);
  
            // Rest of the string after excluding 
            // the ith character
            String ros = str.substring(0, i) + 
                         str.substring(i + 1);
  
            // Recurvise call
            createPerm(ros, ans + ch);
        }
    }
    
    public ArrayList<String> permutation(String S)
    {
        list.clear();
        char[] chars = S.toCharArray();
        Arrays.sort(chars);
        S=new String(chars);
        createPerm(S,"");
        return list;
    }
	   
}