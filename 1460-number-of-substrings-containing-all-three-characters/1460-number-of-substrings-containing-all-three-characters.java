class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<n;right++)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
           
            while(map.size()==3)
            {
                ans+=n-right;
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
                
                left++;
                
            }
        }
        return ans;
    }
}