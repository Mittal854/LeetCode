class Solution {
    public int mini(int a,int b,int c)
    {
        return Math.min(a,Math.min(b,c));
    }
    public int maximumLength(String s) {
        int[][] arr=new int[26][3];
        for(int i=0;i<26;i++)
        {
            Arrays.fill(arr[i],-1);
        }
        char last='*';
        int win=0;
        for(char a:s.toCharArray())
        {
            int index=a-'a';
            win=(last==a) ?win+1:1;
            last=a;
            int miniI=0;
            for(int i=1;i<3;i++)
            {
                if(arr[index][i]<arr[index][miniI])
                {
                    miniI=i;
                }
            }
            if(win>arr[index][miniI])
            {
                arr[index][miniI]=win;
            }
        }
        int maxL=-1;
        for(int i=0;i<26;i++)
        {
            maxL=Math.max(mini(arr[i][0],arr[i][1],arr[i][2]),maxL);
        }
        return maxL;
    }
}