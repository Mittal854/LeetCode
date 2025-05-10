class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0;
        int maxMilestone = 0;
        
        for (int milestone : milestones) {
            sum += milestone;
            maxMilestone = Math.max(maxMilestone, milestone);
        }
        
        long remaining = sum - maxMilestone;
        
        if (remaining >= maxMilestone) {
            return sum;
        } else {
            return 2 * remaining + 1;
        }
    }
}
