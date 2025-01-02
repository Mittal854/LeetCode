class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character>vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int total=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            String a=words[i];
            if(vowels.contains(a.charAt(0))&&vowels.contains(a.charAt(a.length()-1)))
            {
                total++;
            }
            map.put(i,total);
        }
        int n=queries.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            int left=queries[i][0];
            int right=queries[i][1];
            int leftS=left==0?0:map.get(left-1);
            int rightS=map.get(right);
            ans[i]=rightS-leftS;
        }
        return ans;
    }
}