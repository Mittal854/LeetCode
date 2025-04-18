class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                if(!st.isEmpty()) st.pop();
            }
            else
            {
                st.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            char c=st.pop();
            sb.insert(0,c);
        }
        return sb.toString();
    }
}