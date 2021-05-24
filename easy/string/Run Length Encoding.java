class GfG
 {
	String encode(String str)
	{
          //HashMap<Character,Integer> map=new HashMap<>();
          str=str+'*';
          String newStr="";
          int count=1;
          for(int i=0;i<str.length()-1;i++)
          {
              if(str.charAt(i)==str.charAt(i+1))
              {
                  count++;
              }
              else
              {
                  newStr=newStr+str.charAt(i)+count;
                  count=1;
              }
          }
          return newStr;
	}
	
 }