class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int w=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W') w++;
        }
        min=w;
        for(int i=k;i<blocks.length();i++)
        {
            if(blocks.charAt(i-k)=='W') w--;
            if(blocks.charAt(i)=='W') w++;
            min=Math.min(min,w);
        }
        return min;
    }
}