class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character>vowels=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        Stack<Character>vowel=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(vowels.contains(c)) vowel.add(c);
        }
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(vowels.contains(c)) {
                ans.append(vowel.pop());
            }
            else
            {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}