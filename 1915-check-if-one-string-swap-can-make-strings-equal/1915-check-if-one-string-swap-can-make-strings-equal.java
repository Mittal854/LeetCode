class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int count=0;
        int n=s1.length();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))  count++;
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        
        if(Arrays.equals(freq1,freq2) &&(  count==0 || count==2)) return true;
        return false;
    }
}