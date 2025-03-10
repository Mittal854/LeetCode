class Solution {
    public long helper(String word,int k)
    {
        int n=word.length();
        int count=0;
        long ans=0;
        HashMap<Character,Integer>vowelsC=new HashMap<>();
        HashSet<Character>vowel=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int left=0;
        for(int right=0;right<word.length();right++)
        {
            if(vowel.contains(word.charAt(right)))
            {
                vowelsC.put(word.charAt(right),vowelsC.getOrDefault(word.charAt(right),0)+1);
            }
            else
            {
                count++;
            }
            while(vowelsC.size()==5 && count>=k)
            {
                ans+=n-right;
                if(vowel.contains(word.charAt(left)))
                {
                    vowelsC.put(word.charAt(left),vowelsC.get(word.charAt(left))-1);
                    if(vowelsC.get(word.charAt(left))==0)
                    {
                        vowelsC.remove(word.charAt(left));
                    }
                }
                else
                {
                    count--;
                }
                left++;
            }
            
        }
        return ans;
    }
    public long countOfSubstrings(String word, int k) {
        return helper(word,k)-helper(word,k+1);
    }
}