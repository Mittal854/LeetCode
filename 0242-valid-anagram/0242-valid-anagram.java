class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] hash1=s.toCharArray();
        char[] hash2=t.toCharArray();
        Arrays.sort(hash1);
        Arrays.sort(hash2);
        return Arrays.equals(hash1,hash2);
    }
}