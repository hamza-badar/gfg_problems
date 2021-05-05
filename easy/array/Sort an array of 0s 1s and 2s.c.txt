void sort012(int a[], int n)
{
    int sort[3]={0,0,0};int ind=0;
    for(int i=0;i<n;i++)
    {
        sort[a[i]]++;
    }
    for(int i=0;i<sort[0];i++)
    {
        a[ind++]=0;
    }
    for(int i=0;i<sort[1];i++)
    {
        a[ind++]=1;
    }
    for(int i=0;i<sort[2];i++)
    {
        a[ind++]=2;
    }
}