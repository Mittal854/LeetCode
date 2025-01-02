class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(solve(i,j,0,board,visited,word)) return true;
            }
        }
        return false;
    }
    public boolean solve(int sr,int sc,int index, char[][] board,boolean[][] visited,String word)
    {
        if(index==word.length()) return true;
        if(sr<0 ||sr>=board.length || sc<0 || sc>=board[0].length || board[sr][sc]!=word.charAt(index)||visited[sr][sc]) return false;

        visited[sr][sc]=true;
        boolean ans=solve(sr,sc+1,index+1,board,visited,word) || solve(sr,sc-1,index+1,board,visited,word) ||solve(sr+1,sc,index+1,board,visited,word) ||solve(sr-1,sc,index+1,board,visited,word);
        visited[sr][sc]=false;
        return ans;
    }
}