package com.geeksforgeeks.graph;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class GraphTest {

    @Test
    public void BFS() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        List<Integer> bfsTraversal = g.BFS(2);
        assertThat(bfsTraversal).isEqualTo(Arrays.asList(2, 0, 3, 1));
    }

    @Test
    public void array_LinkedList() {
        LinkedList<Integer> adj[] = new LinkedList[4];

        adj[0] = new LinkedList<>();
        adj[0].add(1);
        adj[0].add(2);
        adj[1] = new LinkedList<>();
        adj[1].add(2);
        adj[1].add(4);
        for (int i = 0; i < 4; i++) {
            log.info("adj : {}", adj[i]);
        }
    }
}