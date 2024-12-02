class Solution {
    public boolean check(int node,int[][] graph,int[] colors)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        colors[node]=0;
        while(!q.isEmpty())
        {
            int n=q.poll();
            for(int it:graph[n])
            {
                if(colors[it]==-1)
                {
                    colors[it]=1-colors[n];
                    q.add(it);
                }
                else if(colors[it]==colors[n]) return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] colors=new int[n];
        Arrays.fill(colors,-1);
        for(int i=0;i<n;i++)
        {
            if(colors[i]==-1)
            {
                if(check(i,graph,colors)==false) return false;
            }
        }
        return true;
    }
}