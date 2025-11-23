class Solution {
    public int minOperations(String s) {
        int op1=0;
        int op2=0;
        for(int i=0;i<s.length();i++)
        {
            char ep1=(i%2==0)?'0':'1';
            char ep2=(i%2==0)?'1':'0';
            if(s.charAt(i)!=ep1) op1++;
            if(s.charAt(i)!=ep2) op2++;
        }
        return Math.min(op1,op2);
    }
}