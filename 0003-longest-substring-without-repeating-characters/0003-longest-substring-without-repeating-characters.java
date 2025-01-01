class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int l=0;
        int r=0;
        int n=s.length();
        int maxL=0;
        while(r<n)
        {
            if(hash[s.charAt(r)]!=-1)
            {
                if(hash[s.charAt(r)]>=l)
                {
                    l=hash[s.charAt(r)]+1;
                }                
            }
            maxL=Math.max(maxL,r-l+1);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxL;
    }
}