class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        HashSet<Character>vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        boolean vowel=false;
        boolean constant=false;
        for(char c:word.toCharArray())
        {
            if(!(c>='a' && c<='z') &&!(c>='A' && c<='Z') &&!(c>='0' && c<='9')) return false;
            if(vowels.contains(c)) vowel=true;
            else if((c>='a' && c<='z') || (c>='A' && c<='Z')) constant=true;
        }
        return vowel&&constant;

    }
}