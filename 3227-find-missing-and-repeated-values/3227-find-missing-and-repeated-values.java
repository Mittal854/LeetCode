class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        HashSet<Integer>val=new HashSet<>();
        int rep=-1;
        int mis=-1;
        for(int[] row:grid)
        {
            for(int v:row)
            {
                if(!val.add(v))
                {
                    rep=v;
                }
            }
        }
        for(int i=1;i<=size;i++)
        {
            if(!val.contains(i))
            {
                mis=i;
                break;
            }
        }
        return new int[]{rep,mis};
    }
}