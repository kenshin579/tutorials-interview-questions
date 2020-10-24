package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 월간 코드 챌린지 시즌1 > 트리 트리오 중간값
 * Difficulty : Medium
 * Tags : Tree
 * <p>
 * https://prgms.tistory.com/32
 * https://nam-ki-bok.github.io/quiz/Quiz_TrioTree/
 * <p>
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
@Deprecated
public class MediumDiameterOfTree {
    /**
     * Time Complexity :
     * Algorithm :
     * 1. graph traverse
     * 2. distance
     */
    public int solution(int n, int[][] edges) {
        //todo : 이 코드를 최대한 이해해보는 걸로 함


        List<Integer>[] list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            list[e[0]].add(e[1]);
            list[e[1]].add(e[0]);
        }

        int[] result = bfs(list, 1, n);
        int s = 1, max = 0, cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (result[i] > result[s]) s = i;
        }
        result = bfs(list, s, n);
        print(list);
        log.info("result : {}", result);

        s = 1;
        for (int i = 1; i <= n; i++) {
            if (result[i] > result[s]) s = i;
        }
        for (int i : result) max = Math.max(max, i);
        for (int i : result) if (max == i) cnt++;
        if (cnt >= 2) return max;
        max = 0;
        cnt = 0;
        result = bfs(list, s, n);
        for (int i : result) max = Math.max(max, i);
        for (int i : result) if (max == i) cnt++;
        if (cnt >= 2) return max;
        return max - 1;
    }

    private static int[] bfs(List<Integer>[] list, int s, int n) {
        boolean[] visit = new boolean[n + 1];
        int[] dist = new int[n + 1];
        LinkedList<Integer> qu = new LinkedList<>();
        qu.add(s);
        visit[s] = true;

        while (!qu.isEmpty()) {
            int num = qu.poll();
            for (int i : list[num]) {
                if (i == num || visit[i]) continue;
                visit[i] = true;
                qu.add(i);
                dist[i] = dist[num] + 1;
            }
        }
        return dist;
    }

    private void print(List<Integer>[] list) {
        for (int i = 1; i < list.length; i++) {
            log.info("list : {}", list[i]);
        }
    }
}
