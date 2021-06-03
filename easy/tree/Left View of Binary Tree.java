class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        LinkedList<Node> q=new LinkedList<>();
        Node temp;
        int size;
        q.add(root);
        while(!q.isEmpty())
        {
            size=q.size();
            temp=q.peekFirst();
            list.add(temp.data);
            while(size>0)
            {
                temp=q.pollFirst();
                size--;
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
        return list;
    }
}