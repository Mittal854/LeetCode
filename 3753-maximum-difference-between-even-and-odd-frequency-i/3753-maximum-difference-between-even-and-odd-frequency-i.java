class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        int minEven=Integer.MAX_VALUE;
        int maxOdd=Integer.MIN_VALUE;
        for(int i:freq)
        {
            if(i==0) continue;
            if(i%2==0)
            {
                minEven=Math.min(minEven,i);
            }
            else
            {
                maxOdd=Math.max(maxOdd,i);
            }
        }
        return maxOdd-minEven;
    }
}