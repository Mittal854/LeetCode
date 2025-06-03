class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBox) {
        List<Integer>initialBoxes=new ArrayList<>();
        boolean foundOpenable = true;
        int totalCandies = 0;
        for (int b : initialBox) initialBoxes.add(b);
        while (!initialBoxes.isEmpty() && foundOpenable) {
            foundOpenable = false;
            List<Integer> nextBoxes = new ArrayList<>();
            for (int boxId : initialBoxes) {
                if (status[boxId] == 1) {
                    foundOpenable = true;
                    for (int nb : containedBoxes[boxId]) nextBoxes.add(nb);
                    for (int keyId : keys[boxId]) status[keyId] = 1;
                    totalCandies += candies[boxId];
                } else {
                    nextBoxes.add(boxId);
                }
            }
            initialBoxes = nextBoxes;
        }
        return totalCandies;
    }
}