class Solution
{
    public int countWords(String list[], int n)
    {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<list.length;i++)
        {
            if(!map.containsKey(list[i]))
            {
                map.put(list[i],0);
            }
            map.put(list[i],map.get(list[i])+1);
        }
        for(int i=0;i<list.length;i++)
        {
            if(map.get(list[i])==2)
            {
                map.put(list[i],0);
                count=count+1;;
            }
        }
        return count;
    }
}