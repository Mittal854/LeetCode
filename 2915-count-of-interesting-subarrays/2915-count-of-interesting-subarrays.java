import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int mod, int k) {
        Map<Integer, Long> freqMap = new HashMap<>();
        freqMap.put(0, 1L); // base case: empty prefix

        long count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            // Convert to 0 or 1 depending on mod condition
            if (num % mod == k) {
                prefixSum++;
            }

            // We want: (prefixSum - prev) % mod == k => prev = (prefixSum - k + mod) % mod
            int need = (prefixSum - k + mod) % mod;
            count += freqMap.getOrDefault(need, 0L);

            // Update freq map for current prefixSum % mod
            int key = prefixSum % mod;
            freqMap.put(key, freqMap.getOrDefault(key, 0L) + 1);
        }

        return count;
    }
}
