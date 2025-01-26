class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] indegree = new int[n];
        for (int f : favorite) {
            indegree[f]++;
        }

        // Step 1: Find longest chains leading into mutual pairs
        Queue<Integer> queue = new LinkedList<>();
        int[] depth = new int[n];
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            int next = favorite[curr];
            depth[next] = Math.max(depth[next], depth[curr] + 1);
            if (--indegree[next] == 0) {
                queue.offer(next);
            }
        }

        // Step 2: Find all cycles and their sizes
        boolean[] visited = new boolean[n];
        boolean[] inCycle = new boolean[n];
        int maxCycleSize = 0;
        int totalMutualPairChains = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int curr = i;
                List<Integer> path = new ArrayList<>();
                while (!visited[curr]) {
                    visited[curr] = true;
                    path.add(curr);
                    curr = favorite[curr];
                }

                // Check if the cycle is valid
                if (!inCycle[curr]) {
                    int cycleStart = path.indexOf(curr);
                    if (cycleStart == -1) {
                        continue; // Skip if the cycle start is not found
                    }
                    int cycleSize = path.size() - cycleStart;
                    maxCycleSize = Math.max(maxCycleSize, cycleSize);
                    for (int j = cycleStart; j < path.size(); j++) {
                        inCycle[path.get(j)] = true;
                    }

                    // Handle mutual pairs (cycle size = 2)
                    if (cycleSize == 2) {
                        int a = path.get(cycleStart);
                        int b = path.get(cycleStart + 1);
                        totalMutualPairChains += (2 + depth[a] + depth[b]);
                    }
                }
            }
        }

        return Math.max(maxCycleSize, totalMutualPairChains);
    }
}