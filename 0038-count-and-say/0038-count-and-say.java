class Solution {
    public String countAndSay(int n) {
        if(n<=0) return "";
        String result="1";
        for(int i=2;i<=n;i++)
        {
            result=getString(result);
        }
        return result;
        
    }
    public String getString(String result)
    {
        if(result.length()<=0) return "";
        StringBuilder sb=new StringBuilder();
        char c=result.charAt(0);
        int count=1;
        for(int i=1;i<result.length();i++)
        {
            if(c==result.charAt(i)) count++;
            else
            {
                sb.append(count);
                sb.append(c);
                c=result.charAt(i);
                count=1;
            }
            
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}