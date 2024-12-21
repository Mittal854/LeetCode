class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int a=edges[i][0];
            int b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        int[] result=new int[1];
        dfs(0,-1,values,k,adj,result);
        return result[0];
    }
    public int dfs(int node, int parent,int[] values,int k,ArrayList<ArrayList<Integer>> adj,int[] result )
    {
        int sum=values[node]%k;
        for(int i:adj.get(node))
        {
            if(i==parent) continue;
            sum+=dfs(i,node,values,k,adj,result);
            sum%=k;
        }
        if(sum==0)
        {
            result[0]++;
            return 0;
        }
        return sum;
    }
}