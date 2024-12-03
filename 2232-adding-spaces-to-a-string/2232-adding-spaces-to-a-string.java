class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int j=0;
        int n=spaces.length;
        for(int i=0;i<s.length();i++)
        {
            if(j<n && i==spaces[j])
            {
                str.append(" ");
                j++;
            }
            str.append(s.charAt(i));
        }
        
        return str.toString();
    }
}