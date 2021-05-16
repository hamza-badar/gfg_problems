class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        char ch='$';
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            if(!map.containsKey(S.charAt(i)))
            {
                map.put(S.charAt(i),0);
            }
            map.put(S.charAt(i),map.get(S.charAt(i))+1);
        }
        for(int i=0;i<S.length();i++)
        {
            if(map.get(S.charAt(i))==1)
            {
                ch=S.charAt(i);
                break;
            }
        }
        return ch;
    }
}