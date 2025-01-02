class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] memo = new Boolean[s.length()];
        if (help(0, s, wordDict, memo))
            return true;
        return false;
    }

    public boolean help(int index, String s, List<String> wordDict, Boolean[] memo) {
        if (index == s.length())
            return true;
        if (memo[index] != null)
            return memo[index];
        for (int i = index; i < s.length(); i++) {
            if (wordDict.contains(s.substring(index, i + 1))) {
                if (help(i + 1, s, wordDict,memo)) {
                    memo[index] = true;
                    return true;
                }
            }

        }
        return memo[index] = false;
    }
}