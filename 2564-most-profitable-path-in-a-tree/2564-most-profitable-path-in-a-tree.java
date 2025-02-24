class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n=amount.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[]edge:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int[] bobTime=new int[n];
        Arrays.fill(bobTime,Integer.MAX_VALUE);
        bobPath(adj,bob,0,0,bobTime,new boolean[n]);
        return alicePath(adj,0,0,0,bobTime,amount,new boolean[n]);
    }
    public boolean bobPath(List<List<Integer>>adj,int node,int target,int time,int[]bobTime,boolean[]visited)
    {
        if(node==target)
        {
            bobTime[node]=time;
            return true;
        }
        visited[node]=true;
        for(int neigh:adj.get(node))
        {
            if(!visited[neigh] && bobPath(adj,neigh,target,time+1,bobTime,visited))
            {
                bobTime[node]=time;
                return true;
            }
        }
        return false;
    }
    public int alicePath(List<List<Integer>>adj,int node,int time,int curr,int[]bobTime,int[]amount,boolean[]visited)
    {
        visited[node]=true;
        if(time<bobTime[node])
        {
            curr+=amount[node];
        }
        else if(time==bobTime[node])
        {
            curr+=amount[node]/2;
        }
        int maxP=Integer.MIN_VALUE;
        boolean isLeaf=true;
        for(int neigh:adj.get(node))
        {
            if(!visited[neigh])
            {
                isLeaf=false;
                maxP=Math.max(maxP,alicePath(adj,neigh,time+1,curr,bobTime,amount,visited));
            }
        }
        return isLeaf?curr:maxP;
    }
}