class Solution {
    public int digitsSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int n=nums.length;
        HashMap<Integer,PriorityQueue<Integer>>map=new HashMap<>();
        for(int num:nums)
        {
            int sum=digitsSum(num);
            map.putIfAbsent(sum,new PriorityQueue<>((a,b)->Integer.compare(b,a)));
            map.get(sum).add(num);
        }
        int maxS=-1;
        for(var list:map.values())
        {
            if(list.size()<2) continue;
            int a=list.poll();
            int b=list.poll();
            int sum=a+b;
            maxS=Math.max(maxS,sum);
        }
        return maxS;
    }
}