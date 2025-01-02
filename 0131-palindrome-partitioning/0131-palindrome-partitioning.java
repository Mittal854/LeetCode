class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>path=new ArrayList<>();
        help(0,s,path,res);
        return res;
    }
    public void help(int index,String s,List<String>path,List<List<String>>res)
    {
        if(index==s.length())
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(index,i,s))
            {
                path.add(s.substring(index,i+1));
                help(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(int start,int end,String s)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}