package com.geeksforgeeks.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Graph (인접 리스트로 구현)
 * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 * https://www.geeksforgeeks.org/graph-and-its-representations/
 */
public class Graph {
    private int maxVertices;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    Graph(int maxVertices) {
        this.maxVertices = maxVertices;
        adj = new LinkedList[maxVertices];
        for (int i = 0; i < maxVertices; ++i)
            adj[i] = new LinkedList();
    }

    /**
     * Function to add an edge into the graph
     * directed graph 여서 edge는 하나만 추가하거임
     * @param v
     * @param w
     */
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source node
    public List<Integer> BFS(int node) {
        List<Integer> result = new ArrayList<>();
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[maxVertices];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[node] = true;
        queue.add(node);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            node = queue.poll();
//            System.out.print(node + " ");
            result.add(node);

            // Get all adjacent vertices of the dequeued vertex node
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (int n : adj[node]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return result;
    }
}
