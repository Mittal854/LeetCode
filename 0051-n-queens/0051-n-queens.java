class Solution {
    public boolean isSafe(int row,int col,int n,List<String>board)
    {
        for(int i=0;i<col;i++)
        {
            if(board.get(row).charAt(i)=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board.get(i).charAt(j)=='Q') return false;
        }
        for(int i=row,j=col;i<n && j>=0 ;i++,j--)
        {
            if(board.get(i).charAt(j)=='Q') return false;
        }
        return true;
    }
    public void solve(int col,int n,List<String>board,List<List<String>>ans)
    {
        if(col==n)
        {
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(i,col,n,board))
            {
                String rowV=board.get(i);
                String newR=rowV.substring(0,col)+'Q'+rowV.substring(col+1);
                board.set(i,newR);
                solve(col+1,n,board,ans);
                newR=rowV.substring(0,col)+'.'+rowV.substring(col+1);
                board.set(i,newR);
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String>board=new ArrayList<>();
        String row=".".repeat(n);
        for(int i=0;i<n;i++)
        {
            board.add(row);
        }
        solve(0,n,board,ans);
        return ans;
        

    }
}