package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 월간 코드 챌린지 시즌1 > 트리 트리오 중간값
 * Difficulty : Medium
 * Tags : Graph
 * Score : 7.7/100.0
 *
 * <p>
 * https://programmers.co.kr/learn/courses/30/lessons/68937
 * https://prgms.tistory.com/32
 * https://nam-ki-bok.github.io/quiz/Quiz_TrioTree/
 * https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
 * https://www.geeksforgeeks.org/graph-and-its-representations/
 * https://stackoverflow.com/questions/3601180/calculate-distance-between-2-nodes-in-a-graph
 * https://stackoverflow.com/questions/17480022/java-find-shortest-path-between-2-points-in-a-distance-weighted-map
 * https://www.geeksforgeeks.org/minimum-number-of-edges-between-two-vertices-of-a-graph/
 * https://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
 * https://velog.io/@jkh2801/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%8A%B8%EB%A6%AC-%ED%8A%B8%EB%A6%AC%EC%98%A4-%EC%A4%91%EA%B0%84%EA%B0%92
 * Graph
 * https://www.leafcats.com/108
 * https://gmlwjd9405.github.io/2018/08/15/algorithm-bfs.html
 */
@Slf4j
public class MediumDiameterOfTree {
    /**
     * todo : 메모리 초과 및 입력값도 틀린 부분도 많음
     *
     * Time Complexity :
     * Algorithm :
     * 1. graph traverse하면서 distance을 계산한다
     * 2. distance 값을 기반으로
     */
    public int solution(int n, int[][] edges) {
        List<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        int[][] distance = new int[n + 1][n + 1];

//        print(adj);
        for (int i = 1; i <= n; i++) {
            bfs(adj, distance, i, n);
        }

        //todo : 전체 distance를 계산하지 않고 더 simple하게 하는 방법이 있다고 하는데 잘 이해가 안됨
        //https://nam-ki-bok.github.io/quiz/Quiz_TrioTree/
        return findMaxDistanceAmongMediumValues(distance);
    }

    private int findMaxDistanceAmongMediumValues(int[][] distance) {
        int max = 0;
        int medium;

        for (int i = 0; i < distance.length; i++) {
            medium = getMediumValue(distance[i]);
            if (medium > max) {
                max = medium;
            }
        }
        return max;
    }

    private int getMediumValue(int[] distance) {
        return Arrays.stream(distance).filter(it -> it != 0).sorted().skip(1).findFirst().orElse(0);
    }

    private static void bfs(List<Integer>[] adj, int[][] dist, int startNode, int n) {
        boolean[] visited = new boolean[n + 1];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int num = queue.poll();
            for (int node : adj[num]) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    dist[startNode][node] = dist[startNode][num] + 1;
                }
            }
        }
    }

    private void print(List<Integer>[] list) {
        for (int i = 1; i < list.length; i++) {
            log.info("list : {}", list[i]);
        }
    }
}
