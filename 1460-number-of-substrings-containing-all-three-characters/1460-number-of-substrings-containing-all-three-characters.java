class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int[] freq={-1,-1,-1};
    
        int ans=0;
        for(int right=0;right<n;right++)
        {
            freq[s.charAt(right)-'a']=right;
            if(freq[0]!=-1 && freq[1]!=-1 &&freq[2]!=-1)
            {
                ans+=1+Math.min(freq[0],Math.min(freq[1],freq[2]));
            }
        }
        return ans;
    }
}