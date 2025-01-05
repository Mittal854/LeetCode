class Solution {

    public boolean cyclef(int node,boolean[] visited,boolean[]recS,ArrayList<ArrayList<Integer>>adj)
    {
        visited[node]=true;
        recS[node]=true;
        for(int i:adj.get(node))
        {
            if(!visited[i])
            {
                if(cyclef(i,visited,recS,adj)) return true;
            }
            else if(recS[i]) return true;
        }
        recS[node]=false;
        return false;
    }
    public void topo(int node,boolean[] visited,Stack<Integer>st,ArrayList<ArrayList<Integer>>adj)
    {
        visited[node]=true;
        for(int i:adj.get(node))
        {
            if(!visited[i])
            {
                topo(i,visited,st,adj);
            }
        }
        st.add(node);
        return;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] arr:prerequisites)
        {
            adj.get(arr[1]).add(arr[0]);
        }
        boolean[] visited=new boolean[numCourses];
        boolean[] recS=new boolean[numCourses];
        boolean cycle=false;
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
                if(cyclef(i,visited,recS,adj))
                {
                    cycle=true;
                    break;
                }
            }
        }
        if(cycle) return new int[]{};

        int[] ans=new int[numCourses];
        Stack<Integer>st=new Stack<>();
        boolean[] visited2=new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!visited2[i])
            {
                topo(i,visited2,st,adj);
            }
        }
        for(int i=0;i<numCourses;i++)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}