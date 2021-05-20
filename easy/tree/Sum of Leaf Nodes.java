class GfG
{
    public int SumofLeafNodes(Node root)
    {
        LinkedList<Node> q=new LinkedList<>();
        Node temp;
        int sum=0;
        q.add(root);
        while(!q.isEmpty())
        {
            temp=q.pollFirst();
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            if(temp.left==null && temp.right==null)
            {
                sum=sum+temp.data;
            }
        }
        return sum;
    }
}