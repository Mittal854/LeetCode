class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(var entry:map.entrySet())
        {
            set.add(entry.getValue());
        }
        return map.size()==set.size();
    }
}