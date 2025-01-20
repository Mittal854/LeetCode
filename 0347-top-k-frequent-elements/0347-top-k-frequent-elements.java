class Pair{
    int num;
    int freq;
    Pair(int num,int freq)
    {
        this.num=num;
        this.freq=freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int val:nums)
       {
        map.put(val,map.getOrDefault(val,0)+1);
       }
       int[] ans=new int[k];
       PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
       for(var entry:map.entrySet())
       {
        pq.add(new Pair(entry.getKey(),entry.getValue()));
       }
       int i=0;
       while(i<k)
       {
            ans[i]=pq.poll().num;
            i++;
       }
       return ans;
        
    }
}