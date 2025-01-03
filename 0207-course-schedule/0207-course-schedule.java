class Solution {
    public boolean cycle(int node,boolean[] visited,boolean[] recStack,ArrayList<ArrayList<Integer>>adj)
    {
        visited[node]=true;
        recStack[node]=true;
        for(int i:adj.get(node))
        {
            if(!visited[i])
            {
                if(cycle(i,visited,recStack,adj)) return true;
            }
            else if(recStack[i]==true) return true;
        }
        recStack[node]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[]arr:prerequisites)
        {
            adj.get(arr[1]).add(arr[0]);
        }
        boolean[] visited=new boolean[numCourses];
        boolean[] recStack=new boolean[numCourses];
        boolean isCycle=false;
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
                if(cycle(i,visited,recStack,adj))
                {
                    isCycle=true;
                    break;
                }
            }
        }
        return !isCycle;

    }
}