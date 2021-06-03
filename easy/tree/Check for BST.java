public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    ArrayList<Integer> sortedList=new ArrayList<>();
    public void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            sortedList.add(root.data);
            inOrder(root.right);
        }
    }
    
    boolean isBST(Node root)
    {
        inOrder(root);
        for(int i=0;i<sortedList.size()-1;i++)
        {
            if(sortedList.get(i)>=sortedList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}