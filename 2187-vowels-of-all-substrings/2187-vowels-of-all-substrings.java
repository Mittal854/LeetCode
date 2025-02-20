class Solution {
    public long countVowels(String word) {
        HashSet<Character>vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        long count=0;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            if(vowels.contains(word.charAt(i)))
            {
                count+=(long)(n-i)*(i+1);
            }
        }
        return count;
    }
}