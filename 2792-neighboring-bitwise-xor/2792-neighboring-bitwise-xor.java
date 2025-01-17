class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor=0;
        for(int val:derived)
        {
            xor^=val;
        }
        return xor==0;
    }
}