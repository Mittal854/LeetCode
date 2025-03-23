class Pair{
  int node;
  long time;
  Pair(int node,long time)
  {
    this.node=node;
    this.time=time;
  }  
}

class Solution {
    public int countPaths(int n, int[][] roads) {
        int mod=1_000_000_007;
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[]road:roads)
        {
            adj.get(road[0]).add(new Pair(road[1],road[2]));
            adj.get(road[1]).add(new Pair(road[0],road[2]));
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->(a.time==b.time?Integer.compare(a.node,b.node):Long.compare(a.time,b.time)));
        pq.add(new Pair(0,0));
        boolean[] processed=new boolean[n];
        long[]count_ways=new long[n];
        count_ways[0]=1;
        long[]min_cost=new long[n];
        Arrays.fill(min_cost,Long.MAX_VALUE);
        min_cost[0]=0;
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int node=p.node;
            long time=p.time;
            if(processed[node]) continue;
            processed[node]=true;
            for(Pair a:adj.get(node))
            {
                int neigh=a.node;
                long neight=a.time;
                if(processed[neigh]) continue;
                if(time+neight==min_cost[neigh])
                {
                    count_ways[neigh]=(count_ways[neigh]+count_ways[node])%mod;
                }
                else if(time+neight<min_cost[neigh])
                {
                    min_cost[neigh]=time+neight;
                    count_ways[neigh]=count_ways[node];
                    pq.add(new Pair(neigh,time+neight));
                }
            }
        }
        return (int)(count_ways[n-1]%mod);
    }
}