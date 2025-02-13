class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        int[] freq2=new int[26];
        String checker="balloon";
        for(char c:text.toCharArray())
        {
            freq[c-'a']++;
        }
        for(char c:checker.toCharArray())
        {
            freq2[c-'a']++;
        }
        int count=Integer.MAX_VALUE;
        for(char c:checker.toCharArray())
        {
            if(freq[c-'a']>=freq2[c-'a'])
            {
                count=freq2[c-'a']==2?Math.min(count,freq[c-'a']/2):Math.min(count,freq[c-'a']);
            }
            else
            {
                count=0;
            } 
        }
        return count;
    }
}