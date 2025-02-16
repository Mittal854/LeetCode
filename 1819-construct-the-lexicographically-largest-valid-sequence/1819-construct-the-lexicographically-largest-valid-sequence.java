class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] result=new int[2*n-1];
        Arrays.fill(result,-1);
        boolean[] used=new boolean[n+1];
        helper(result,used,n,0);
        return result;
    }
    public boolean helper(int[] result,boolean[] used,int n,int index)
    {
        if(index==result.length) return true;
        if(result[index]!=-1) return helper(result,used,n,index+1);
        for(int num=n;num>=1;num--)
        {
            if(used[num]) continue;
            int secondIndex=(num==1)?index:index+num;
            if(secondIndex<result.length && result[secondIndex]==-1)
            {
                result[index]=result[secondIndex]=num;
                used[num]=true;
                if(helper(result,used,n,index+1)) return true;
                result[index]=result[secondIndex]=-1;
                used[num]=false;
            }
        }
        return false;
    }
}