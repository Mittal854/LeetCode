class Solution {
    public String removeStars(String s) {
        Stack<Character>ch=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='*' && !ch.isEmpty())
            {
                ch.pop();
            }
            else
            {
                ch.add(c);
            }
        }
        String ans="";
        while(!ch.isEmpty())
        {
            ans=ch.pop()+ans;
        }
        return ans;
    }
}