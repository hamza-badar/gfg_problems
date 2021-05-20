class Solution {
    Function to find the height of a binary tree.
    int height(Node node) 
    {
       int x,y;
       if(node!=null)
       {
           x=height(node.left);
           y=height(node.right);
           if(xy)
           {
               return x+1;
           }
           else
           {
               return y+1;
           }
       }
       return 0;
    }
}