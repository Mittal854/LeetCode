class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String,Integer> mpp=new HashMap<>();
        for (int[] row : matrix) {
            StringBuilder pattern = new StringBuilder();
            StringBuilder complement = new StringBuilder();
            
            // Generate the pattern and its complement
            for (int val : row) {
                pattern.append(val);
                complement.append(1 - val);
            }
            
            String patternStr = pattern.toString();
            String complementStr = complement.toString();
            
            // Update counts in the map for both pattern and complement
            mpp.put(patternStr, mpp.getOrDefault(patternStr, 0) + 1);
            mpp.put(complementStr, mpp.getOrDefault(complementStr, 0) + 1);

        }
        int maxC=0;
        for(int count:mpp.values())
        {
            maxC=Math.max(count,maxC);
        }
        return maxC;
    }
}