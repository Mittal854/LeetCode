class Solution {
    public int helper(int number,int[] tops,int[] bottoms)
    {
        int count=0;
        for(int i=0;i<tops.length;i++)
        {
            if(tops[i]==number) continue;
            else if(bottoms[i]==number) count++;
            else return Integer.MAX_VALUE;
        }
        return count;
    }
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=6;i++)
        {
            int count_top=helper(i,tops,bottoms);
            int count_bottom=Integer.MAX_VALUE;
            if(count_top!=Integer.MAX_VALUE)
            {
                count_bottom=helper(i,bottoms,tops);
            }
            min=Math.min(min,Math.min(count_bottom,count_top));
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}