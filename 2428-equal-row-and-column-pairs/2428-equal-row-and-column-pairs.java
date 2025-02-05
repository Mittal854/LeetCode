class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        HashMap<String,Integer>val=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            StringBuilder row=new StringBuilder();
            
            for(int j=0;j<n;j++)
            {
                row.append(grid[i][j]).append(',');
                
            }
            val.put(row.toString(),val.getOrDefault(row.toString(),0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            StringBuilder col=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                col.append(grid[j][i]).append(',');
            }
            // if(val.containsKey(col.toString()))
            // {
            //     count++;
            //     val.put(col.toString(),val.get(col.toString())-1);
            //     if(val.get(col.toString())==0)
            //     {
            //         val.remove(col.toString());
            //     }
            // }
            count+=val.getOrDefault(col.toString(),0);
        }
        return count;
    }
}