class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>>revAdj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            revAdj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int a:graph[i])
            {
                revAdj.get(a).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty())
        {
            int node=q.poll();
            ans.add(node);
            for(int i:revAdj.get(node))
            {
                indegree[i]--;
                if(indegree[i]==0) q.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}