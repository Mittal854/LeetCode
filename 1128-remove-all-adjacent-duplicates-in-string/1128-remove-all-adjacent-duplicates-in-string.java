class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(st.isEmpty() ||c!=st.peek()) st.add(c);
            else st.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}