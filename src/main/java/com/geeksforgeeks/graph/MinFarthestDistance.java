package com.geeksforgeeks.graph;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Minimum value of distance of farthest node in a Graph
 *
 * <p>
 * https://www.geeksforgeeks.org/minimum-value-of-distance-of-farthest-node-in-a-graph/
 * https://courses.cs.washington.edu/courses/cse373/20sp/lectures/14-bfs-dfs/14-bfs-dfs.pdf
 * https://stackabuse.com/graphs-in-java-dijkstras-algorithm/
 */
@Slf4j
public class MinFarthestDistance {
    // Distance vector to find the distance
    // of a node to it's farthest node
    private int[] farthestDistance;

    // To keep the track of visited array
    // while DFS Traversal
    private boolean[] visited;

    /**
     * Function to find the minimum of the farthest vertex for every vertex in the graph
     *
     * Time Complexity :
     * Algorithm :
     * - DFS 방식 traverse함
     * - Graph는 인접 리스트를 사용함
     * 1. 각 노드에서 가장 멀리 있는 노드의 거리를 계산
     * 2. 거리중에서 가장 작은 값을 반환함
     */
    public int minFarthestDistance(int[][] edges, int n) {
        Graph undirectedGraph = new Graph(n + 1);

        // Resize distance vector
        farthestDistance = new int[n + 1];
        Arrays.fill(farthestDistance, 0);


        for (int i = 0; i < edges.length; i++) {
            undirectedGraph.addEdge(edges[i][0], edges[i][1]); //Adj[1] = 4
            undirectedGraph.addEdge(edges[i][1], edges[i][0]); //Adj[4] = 1
        }

        // DFS Traversal for every node in the
        // graph to update the distance vector
        for (int node = 1; node <= n; node++) {
            // Clear and resize vis[] before
            // DFS traversal for every vertex
            visited = new boolean[n + 1];
            Arrays.fill(visited, false);

            // DFS Traversal for vertex i
            dfs(node, undirectedGraph, 0);
        }

        log.info("farthestDistance : {}", farthestDistance);
        return findMinDistance(farthestDistance);
    }

    private int findMinDistance(int[] farthestDistance) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < farthestDistance.length; i++) {
            if (farthestDistance[i] < min)
                min = farthestDistance[i];
        }
        return min;
    }

    // Function for DFS traversal to update
    // the distance vector
    private void dfs(int node, Graph graph, int distance) {
        // Mark the visited array for vertex u
        visited[node] = true;

        // Traverse the adjacency list for u
        for (int it : graph.getAdj(node)) {
            // If the any node is not visited,
            // then recursively call for next
            // vertex with distance increment
            // by 1
            if (!visited[it]) {
                dfs(it, graph, distance + 1);
            }
        }

        // Update the maximum distance for
        // the farthest vertex from node u
        farthestDistance[node] = Math.max(farthestDistance[node], distance);
    }

    class Graph {
        private int maxVertices;   // No. of vertices
        private LinkedList<Integer> adj[]; //Adjacency Lists

        Graph(int maxVertices) {
            this.maxVertices = maxVertices;
            adj = new LinkedList[maxVertices];

            for (int i = 0; i < maxVertices; ++i)
                adj[i] = new LinkedList();
        }

        public void addEdge(int v, int w) {
            adj[v].add(w);
        }

        public LinkedList<Integer> getAdj(int node) {
            return this.adj[node];
        }
    }
}
