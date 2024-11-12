class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inC=image[sr][sc];
        int[][] ans=image;
        int[] delRow={1,0,-1,0};
        int[] delCol={0,1,0,-1};
        dfs(ans,sr,sc,delRow,delCol,inC,color);
        return ans;
        
    }
    public void dfs(int[][] ans,int row,int col,int[] delRow,int[] delCol,int inC,int color){
        int m=ans.length;
        int n=ans[0].length;
        ans[row][col]=color;
        for(int i=0;i<4;i++)
        {
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<m && ncol>=0&&ncol<n &&ans[nrow][ncol]==inC &&ans[nrow][ncol]!=color)
            {
                dfs(ans,nrow,ncol,delRow,delCol,inC,color);
            }
            
        }
    }
}