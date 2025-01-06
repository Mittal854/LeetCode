class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer>laser=new ArrayList<>();
        for(String row:bank)
        {
            int count=0;
            for(char c:row.toCharArray())
            {
                if(c=='1') count++;
            }
            if(count>0) laser.add(count);
        }
        if(laser.size()<=1) return 0;
        int beam=0;
        for(int i=1;i<laser.size();i++)
        {
            beam+=laser.get(i)*laser.get(i-1);
        }
        return beam;
    }
}