class Pair{
    int row;
    int col;
    Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        HashMap<Integer,Pair>map=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                map.put(mat[i][j],new Pair(i,j));
            }
        }
        int[] rowF=new int[m];
        int[] colF=new int[n];
        for(int i=0;i<m*n;i++)
        {
            Pair p=map.get(arr[i]);
            rowF[p.row]++;
            colF[p.col]++;
            if(rowF[p.row]==n || colF[p.col]==m) return i;
        }
        return m*n-1;
    }
}