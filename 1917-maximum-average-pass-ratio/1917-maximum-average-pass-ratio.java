class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]>maxHeap=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        for(int[] c:classes)
        {
            int pass=c[0];
            int total=c[1];
            double gain=gain(pass,total);
            maxHeap.add(new double[]{gain,pass,total});
        }
        while(extraStudents>0)
        {
            double[] curr=maxHeap.poll();
            double gain=curr[0];
            int pass=(int)curr[1];
            int total=(int)curr[2];
            pass++;
            total++;
            extraStudents--;
            maxHeap.add(new double[]{gain(pass,total),pass,total});
        }
        double ratio=0.0;
        for(double[]entry:maxHeap)
        {
            int pass=(int) entry[1];
            int total=(int) entry[2];
            ratio+=(double) pass/total;
        }
        return (double)ratio/classes.length;
    }
    private double gain(int pass,int total)
    {
        return ((double)(pass+1)/(total+1))-((double)pass/total);
    }
}