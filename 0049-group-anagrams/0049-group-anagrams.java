class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<TreeMap<Character,Integer>,List<String>>map=new HashMap<>();
        for(String word:strs)
        {
            TreeMap<Character,Integer>freq=new TreeMap<>();
            for(char c:word.toCharArray())
            {
                freq.put(c,freq.getOrDefault(c,0)+1);
            }
            map.putIfAbsent(freq,new ArrayList<>());
            map.get(freq).add(word);
        }
        for(Map.Entry<TreeMap<Character,Integer>,List<String>>entry:map.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;
    }
}