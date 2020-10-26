package com.programmers.master;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 찾아라 프로그래밍 마에스터 > 게임 맵 최단거리
 * Difficulty : Level 4
 * Tags : Graph
 * Score : 100.0 / 100.0
 *
 * <p>
 * https://programmers.co.kr/learn/courses/30/lessons/1844
 * https://jaejin0me.github.io/post/posts52/
 * https://willbfine.tistory.com/421
 * https://sangwon-story.tistory.com/m/entry/%EA%B2%8C%EC%9E%84-%EB%A7%B5-%EC%B5%9C%EB%8B%A8%EA%B1%B0%EB%A6%AC?category=894801
 */
@Slf4j
public class GameMapShortestPath {
    /**
     *
     * Time Complexity : O(N^2)
     *
     * Algorithm : BFS 방식으로 traverse를 함
     * 1.시작 노드는 (0,0)에서 시작하고 이동할 수 있는 위치로 이동함
     * - 벽, 경계 벗어난 경우등은 이동할 수 없음
     * 2.이동할 때마다 거리 +1하고 최종 위치에 도달하면 현재 위치의 거리를 반환하면 됨
     */
    public int solution(int[][] maps) {
        int answer = -1;

        int[] dx = {-1, 0, 1, 0}; // 이동할 x좌표
        int[] dy = {0, 1, 0, -1}; // 이동할 y좌표
        int xSize = maps.length;
        int ySize = maps[0].length;
        boolean[][] visited = new boolean[xSize][ySize];

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0)); // (0,0)에서 시작

        visited[0][0] = true;
        Coordinate coordinate;

        while (!queue.isEmpty()) {
            coordinate = queue.poll();

            //대각선만 빼고 이동함
            for (int i = 0; i < 4; i++) {
                int nextX = coordinate.x + dx[i]; // 다음 이동할 x좌표
                int nextY = coordinate.y + dy[i]; // 다음 이동할 y좌표
//                log.info("nextX: {} = x:{} + dx:{} | nextY: {} = x:{} + dy:{}", nextX, coordinate.x, dx[i], nextY, coordinate.y, dy[i]);

                if (nextX >= xSize || nextY >= ySize //boundary를 벗어난 경우
                        || nextX < 0 || nextY < 0 //boundary를 벗어난 경우
                        || visited[nextX][nextY] //이미 지나간 경우
                        || maps[nextX][nextY] == 0) //벽인 경우
                    continue;

                queue.add(new Coordinate(nextX, nextY)); // 다음 이동할 좌표를 넣음
                maps[nextX][nextY] = maps[coordinate.x][coordinate.y] + 1; // 기본 maps에 거리 정보를 넣음
                visited[nextX][nextY] = true; // 방문한 위치이므로 1로 변경
            }
//            System.out.println();
        }

        if (maps[xSize - 1][ySize - 1] > 1) {
            answer = maps[xSize - 1][ySize - 1]; //마지막 위치에 거리 정보가 있음
        }

        return answer;
    }

    class Coordinate {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
