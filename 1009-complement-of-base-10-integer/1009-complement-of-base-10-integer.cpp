class Solution
{
public:
    int bitwiseComplement(int n)
    {   if(n==0)
    {
        return 1;
    }
        vector<int> binary;
        int count = 0;
        while (n > 0)
        {
            int rem = n % 2;
            binary.push_back(1-rem);
            n = n / 2;
            count++;
        }
        // for (int i : binary)
        // {
        //     if (i == 0)
        //     {
        //         i = 1;
        //     }
        //     else
        //     {
        //         i = 0;
        //     }
        // }
        reverse(binary.begin(),binary.end());
        int num = 0;
        for(int i:binary)
        {
            num=num*2+i;
        }
        return num;
    }
};