class Solution {
    private Map<String,Boolean>map;
    public boolean helper(String s,int target,int index,int curr)
    {
        if(index==s.length())
        {
            return target==curr;
        }
        String key=index+"-"+curr;
        if(map.containsKey(key)) return map.get(key);
        int num=0;
        for(int i=index;i<s.length();i++)
        {
            num=num*10+(s.charAt(i)-'0');
            if(curr+num>target) break;
            if(helper(s,target,i+1,curr+num))
            {
                map.put(key,true);
                return true;
            }
        }
        map.put(key,false);
        return false;
    }
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            map=new HashMap<>();
            int sq=i*i;
            String s=Integer.toString(sq);
            if(helper(s,i,0,0)) sum+=sq;
        }
        return sum;
    }
}