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
        StringBuilder ans=new StringBuilder();
        while(!ch.isEmpty())
        {
            ans.append(ch.pop());
        }
        return ans.reverse().toString();
    }
}