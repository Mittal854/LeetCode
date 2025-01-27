class Solution {

    public void bfs(int node,ArrayList<ArrayList<Integer>>adj,boolean[] visited,boolean[][] isReachable)
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        visited[node]=true;
        while(!q.isEmpty())
        {
            int p=q.poll();
            for(int i:adj.get(p))
            {
                if(!visited[i])
                {
                    isReachable[node][i]=true;
                    q.add(i);
                    visited[i]=true;
                }
            }

        }
    }

    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];
            adj.get(a).add(b);
        }

        boolean[][] isReachable=new boolean[numCourses][numCourses];
        for(int i=0;i<numCourses;i++)
        {
            boolean[] visited=new boolean[numCourses];
            bfs(i,adj,visited,isReachable);
        }

        List<Boolean>ans=new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {
            int a=queries[i][0];
            int b=queries[i][1];
            ans.add(isReachable[a][b]);
        }
        return ans;

    }
}