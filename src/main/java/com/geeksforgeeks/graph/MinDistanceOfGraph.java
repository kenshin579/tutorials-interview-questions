package com.geeksforgeeks.graph;

import java.util.Arrays;
import java.util.Vector;

/**
 * Minimum value of distance of farthest node in a Graph
 * <p>
 * https://www.geeksforgeeks.org/minimum-value-of-distance-of-farthest-node-in-a-graph/
 */
public class MinDistanceOfGraph {
    // Distance vector to find the distance
    // of a node to it's farthest node
    private int[] dist;

    // To keep the track of visited array
    // while DFS Traversal
    private boolean[] vis;

    /**
     * Function to find the minimum of the farthest vertex for every vertex in the graph
     *
     * Time Complexity :
     * Algorithm :
     *
     */
    public int minFarthestDistance(int[][] arr, int n) {

        // Resize distance vector
        dist = new int[n + 1];
        Arrays.fill(dist, 0);

        // To create adjacency list for graph
        @SuppressWarnings("unchecked")
        Vector<Integer>[] Adj = new Vector[n + 1];

        for (int i = 0; i < n + 1; i++) {
            Adj[i] = new Vector<>();
        }

        // Create Adjacency list for every
        // edge given in arr[][]
        for (int i = 0; i < n - 1; i++) {
            Adj[arr[i][0]].add(arr[i][1]);
            Adj[arr[i][1]].add(arr[i][0]);
        }

        // DFS Traversal for every node in the
        // graph to update the distance vector
        for (int i = 1; i <= n; i++) {

            // Clear and resize vis[] before
            // DFS traversal for every vertex
            vis = new boolean[n + 1];
            Arrays.fill(vis, false);

            // DFS Traversal for vertex i
            dfs(i, Adj, 0);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] < min)
                min = dist[i];
        }
        return min;
    }

    // Function for DFS traversal to update
    // the distance vector
    private void dfs(int u, Vector<Integer>[] Adj, int s) {

        // Mark the visited array for vertex u
        vis[u] = true;

        // Traverse the adjacency list for u
        for (int it : Adj[u]) {

            // If the any node is not visited,
            // then recursively call for next
            // vertex with distance increment
            // by 1
            if (vis[it] == false) {
                dfs(it, Adj, s + 1);
            }
        }

        // Update the maximum distance for
        // the farthest vertex from node u
        dist[u] = Math.max(dist[u], s);
    }


}
