class Solution {
    int countBuildings(int h[], int n) {
        // code here
        int j=0;
        int sunFacing=1;
        
        for(int i=0;i<n;i++)
        {
            if(h[j]<h[i])
            {
                j=i;
                sunFacing++;
            }
        }
    
        return sunFacing;
    }
}