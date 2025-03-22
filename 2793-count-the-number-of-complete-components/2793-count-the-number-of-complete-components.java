class Solution {
    public void dfs(int node,List<List<Integer>>adj,boolean[]visited,List<Integer>comp)
    {
        visited[node]=true;
        comp.add(node);
        for(int neigh:adj.get(node))
        {
            if(!visited[neigh])
            {
                dfs(neigh,adj,visited,comp);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edge:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int ans=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                List<Integer>comp=new ArrayList<>();
                dfs(i,adj,visited,comp);
                int size=comp.size();
                int expected=(size*(size-1))/2;
                int actual=0;
                for(int node:comp)
                {
                    actual+=adj.get(node).size();
                }
                actual/=2;
                if(expected==actual) ans++;
                
            }
        }
        return ans;
    }
}