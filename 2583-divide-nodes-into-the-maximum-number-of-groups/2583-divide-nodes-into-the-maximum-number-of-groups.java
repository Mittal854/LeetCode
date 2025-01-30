import java.util.*;

class Solution {
    
    // Function to check if a component is bipartite using BFS
    private boolean isComponentBipartite(List<List<Integer>> adj, int[] state, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        state[start] = 1;

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int neighbor : adj.get(curr)) {
                if (state[neighbor] == 0) {
                    state[neighbor] = -state[curr];
                    q.add(neighbor);
                } else if (state[neighbor] == state[curr]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to check if the entire graph is bipartite
    private boolean checkBipartiteGraph(List<List<Integer>> adj, int n) {
        int[] state = new int[n + 1]; // 0: unvisited, 1 and -1: two different colors

        for (int i = 1; i <= n; i++) {
            if (state[i] == 0 && !isComponentBipartite(adj, state, i)) {
                return false;
            }
        }
        return true;
    }

    // BFS function to count levels from a source node
    private int countLevels(List<List<Integer>> adj, int n, int source) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;

        int levels = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();

                for (int neighbor : adj.get(curr)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        q.add(neighbor);
                    }
                }
            }
            levels++;
        }
        return levels;
    }

    // BFS to find the max level count per connected component
    private int findMaxLevelsBFS(int[] maxDistance, List<List<Integer>> adj, boolean[] visited, int source) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;

        int maxLevels = -1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            maxLevels = Math.max(maxLevels, maxDistance[curr]);

            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return maxLevels;
    }

    public int magnificentSets(int n, int[][] edges) {
        // Step 1: Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Step 2: Check if the graph is bipartite
        if (!checkBipartiteGraph(adj, n)) {
            return -1;
        }

        // Step 3: Calculate max distance from each node (using BFS)
        int[] maxDistance = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            maxDistance[i] = countLevels(adj, n, i);
        }

        // Step 4: Find the max distance count per component
        boolean[] visited = new boolean[n + 1];
        int totalLevels = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                totalLevels += findMaxLevelsBFS(maxDistance, adj, visited, i);
            }
        }
        return totalLevels;
    }
}
