class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(b[1]==a[1]?Integer.compare(b[0],a[0]):Integer.compare(b[1],a[1])));
        for(int[] res:restaurants)
        {
            if(res[3]<=maxPrice && res[4]<=maxDistance)
            {
                if(veganFriendly==1 && res[2]==1) pq.add(res);
                else if(veganFriendly==0) pq.add(res);
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(!pq.isEmpty())
        {
            int[]a=pq.poll();
            ans.add(a[0]);
        }
        return ans;
    }
}