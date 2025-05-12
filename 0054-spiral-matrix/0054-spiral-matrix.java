class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int total=m*n;
        int sc=0;
        int sr=0;
        int ec=n-1;
        int er=m-1;
        int c=0;
        while(c<total)
        {
            for(int i=sc;i<=ec;i++)
            {
                ans.add(matrix[sr][i]);
                c++;
            }
            sr++;
            for(int j=sr;j<=er;j++)
            {
                ans.add(matrix[j][ec]);
                c++;
            }
            ec--;
            if(c<total)
            {
                for(int i=ec;i>=sc;i--)
                {
                    ans.add(matrix[er][i]);
                    c++;
                }
                er--;
            }
            if(c<total)
            {
                for(int j=er;j>=sr;j--)
                {
                    ans.add(matrix[j][sc]);
                    c++;
                }
                sc++;
            }
        }
        return ans;
    }
}