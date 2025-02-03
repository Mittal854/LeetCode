class Solution {
    public int maxVowels(String s, int k) {
        ArrayList<Character>vowels=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int n=s.length();
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(vowels.contains(s.charAt(i))) count++;
        }
        int maxC=count;
        for(int i=k;i<n;i++)
        {
            if(vowels.contains(s.charAt(i-k))) count--;
            if(vowels.contains(s.charAt(i))) count++;
            maxC=Math.max(maxC,count);
        }
        return maxC;
    }
}