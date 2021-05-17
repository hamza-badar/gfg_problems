class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> Union=new ArrayList<>(m+n);
        Set<Integer> set = new LinkedHashSet<>();
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                Union.add(arr1[i++]);
            }
            else if(arr1[i]==arr2[j])
            {
                Union.add(arr1[i++]);
                j++;
            }
            else
            {
                Union.add(arr2[j++]);
            }
        }
        while(i<n)
        {
            Union.add(arr1[i++]);
        }
        while(j<m)
        {
            Union.add(arr2[j++]);
        }
        set.addAll(Union);
        Union.clear();
        Union.addAll(set);
        return Union;
        // add your code here
    }
}