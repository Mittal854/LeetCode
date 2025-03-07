class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] prime=allprimes(right);
        List<Integer>allprime=new ArrayList<>();
        for(int i=Math.max(left,2);i<=right;i++)
        {
            if(prime[i]) allprime.add(i);
        }
        if(allprime.size()<2) return new int[]{-1,-1};
        int minDiff=Integer.MAX_VALUE;
        int p1=-1;
        int p2=-1;
        for(int i=1;i<allprime.size();i++)
        {
            int diff=allprime.get(i)-allprime.get(i-1);
            if(diff<minDiff)
            {
                minDiff=diff;
                p1=allprime.get(i-1);
                p2=allprime.get(i);
            }
        }
        return new int[]{p1,p2};
    }
    public boolean[] allprimes(int n)
    {
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
        return prime;
    }
}