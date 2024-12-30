class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int sum=1;
        int i=1;
        while(i<n)
        {
            if(ratings[i]==ratings[i-1])
            {
                sum+=1;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1])
            {
                peak++;
                i++;
                sum+=peak;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1])
            {
                sum+=down;
                down++;
                i++;
            }
            if(peak<down)
            {
                sum+=down-peak;
            }
        
        }
        return sum;
    }
}