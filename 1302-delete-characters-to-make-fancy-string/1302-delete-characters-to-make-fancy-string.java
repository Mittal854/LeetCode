class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        char prev=s.charAt(0);
        sb.append(prev);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==prev)
            {
                count++;
            }
            else
            {
                count=1;
                prev=s.charAt(i);
            }
            if(count<3) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}