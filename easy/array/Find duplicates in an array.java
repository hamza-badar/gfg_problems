class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],0);
            }
            map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])>1)
            {
                map.put(arr[i],0);
                list.add(arr[i]);
            }
        }
        if(list.size()==0)
        {
            list.add(-1);
        }
        return list;
    }
}