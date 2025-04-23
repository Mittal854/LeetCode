class Solution {
    public int sum(int num)
    {
        int s=0;
        while(num>0)
        {
            s+=num%10;
            num=num/10;
        }
        return s;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int s=sum(i);
            map.put(s,map.getOrDefault(s,0)+1);
            max=Math.max(max,map.get(s));
        }
        int ans=0;
        for(int c:map.values())
        {
            if(c==max) ans++;
        }
        return ans;
    }
}