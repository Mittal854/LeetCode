class Solution {
    private HashSet<String> set;
    public void helper(char[] tiles,StringBuilder ans,boolean[]used)
    {
        
        if(ans.length()>0) set.add(ans.toString());
        for(int i=0;i<tiles.length;i++)
        {
            if(used[i] || (i>0) && tiles[i]==tiles[i-1] && !used[i-1]) continue;
            ans.append(tiles[i]);
            used[i]=true;
            helper(tiles,ans,used);
            ans.deleteCharAt(ans.length()-1);
            used[i]=false;
        }

    }
    public int numTilePossibilities(String tiles) {
        StringBuilder ans=new StringBuilder();
        char[] array=tiles.toCharArray();
        Arrays.sort(array);
        set=new HashSet<>();
        helper(array,ans,new boolean[array.length]);
        return set.size();
    }
}