class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] arr=new int[n];
        for(int i=0;i<edges.length;i++)
        {
            int a=edges[i][0];
            int b=edges[i][1];
            arr[b]++;
        }
        int count=0;
        int value=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                count++;
                value=i;
            }
        }
        return count==1?value:-1;
    }
}