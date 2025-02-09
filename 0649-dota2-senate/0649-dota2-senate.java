class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        PriorityQueue<Integer>r=new PriorityQueue<>();
        PriorityQueue<Integer>d=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            if(senate.charAt(i)=='R') r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty()&&!d.isEmpty())
        {
            int ri=r.poll();
            int di=d.poll();
            if(ri<di)
            {
                r.add(ri+n);
            }
            else
            {
                d.add(di+n);
            }
        }
        return r.isEmpty()?"Dire":"Radiant";
    }
}