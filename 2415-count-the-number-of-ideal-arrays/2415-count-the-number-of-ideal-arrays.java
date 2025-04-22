class Solution {
    static final int MOD = 1_000_000_007;
    int[][] comb;
    int maxN = 20010;

    public int idealArrays(int n, int maxValue) {
        // Precompute combinations: comb[n][k] = C(n, k)
        comb = new int[maxN][20]; // we won't need more than 20 primes per number

        for (int i = 0; i < maxN; i++) {
            comb[i][0] = 1;
            for (int j = 1; j < 20 && j <= i; j++) {
                comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % MOD;
            }
        }

        int result = 0;

        // Loop through all numbers from 1 to maxValue
        for (int i = 1; i <= maxValue; i++) {
            Map<Integer, Integer> primeCount = getPrimeFactors(i);
            long ways = 1;

            for (int val : primeCount.values()) {
                // Using Stars and Bars: C(n-1 + val, val)
                ways = (ways * comb[n - 1 + val][val]) % MOD;
            }

            result = (int)((result + ways) % MOD);
        }

        return result;
    }

    // Prime factorization function
    private Map<Integer, Integer> getPrimeFactors(int num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                num /= i;
            }
        }
        if (num > 1) map.put(num, 1);
        return map;
    }
}
