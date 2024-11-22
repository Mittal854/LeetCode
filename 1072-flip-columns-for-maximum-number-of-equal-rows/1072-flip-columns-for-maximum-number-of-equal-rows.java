class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String,Integer> mpp=new HashMap<>();
        for(int[] row:matrix)
        {
            String pattern="";
            String complement="";
            for(int val:row)
            {
                pattern+=val;
                complement+=(1-val);
            }
            mpp.put(pattern,mpp.getOrDefault(pattern,0)+1);
            mpp.put(complement,mpp.getOrDefault(complement,0)+1);

        }
        int maxC=0;
        for(int count:mpp.values())
        {
            maxC=Math.max(count,maxC);
        }
        return maxC;
    }
}