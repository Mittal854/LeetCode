class Solution {
    public String decodeString(String s) {
        Stack<Integer>nums=new Stack<>();
        Stack<StringBuilder>strings=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int num=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');
            }
            else if(c=='[')
            {
                nums.add(num);
                strings.add(sb);
                sb=new StringBuilder();
                num=0;
            }
            else if(c==']')
            {
                StringBuilder dec=strings.pop();
                int no=nums.pop();
                while(no-->0)
                {
                    dec.append(sb);
                }
                sb=dec;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}