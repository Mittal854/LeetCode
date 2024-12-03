class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder(s);
        int j=0;
        for(int i=0;i<spaces.length;i++)
        {
            str.insert(spaces[i]+(j++)," ");
        }
        return str.toString();
    }
}