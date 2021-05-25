class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
public static int[] count(String str)
{
    LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
    int arr[],ind=0;
    for(int i=0;i<str.length();i++)
    {
        if(!map.containsKey(str.charAt(i)))
        {
            map.put(str.charAt(i),0);
        }
        map.put(str.charAt(i),map.get(str.charAt(i))+1);
    }
    arr=new int[map.size()];
    for(Map.Entry x : map.entrySet())
    {
        arr[ind++]=(int)x.getValue();
    }
    return arr;
}
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    ArrayList<String> list=new ArrayList<>();
	    int patArr[]=count(pattern);
	    int strArr[];
	    boolean flag=true;
	    String str;
	    for(int i=0;i<dict.size();i++)
	    {
	        str=(String)dict.get(i);
	        if(str.length()==pattern.length())
	        {
	            strArr=count(str);
	            if(strArr.length==patArr.length)
	            {
	                flag=true;
	                for(int j=0;j<strArr.length;j++)
	                {
	                    if(strArr[j]!=patArr[j])
	                    {
	                        flag=false;
	                        break;
	                    }
	                }
	                if(flag)
	                {
	                    list.add(str);
	                }
	            }
	        }
	    }
	    return list;
	}
}