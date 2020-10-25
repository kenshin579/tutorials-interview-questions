package com.programmers.master;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 찾아라 프로그래밍 마에스터 > 게임 맵 최단거리
 * Difficulty : Level 4
 * Tags : Graph
 * <p>
 * https://programmers.co.kr/learn/courses/30/lessons/1844
 * https://jaejin0me.github.io/post/posts52/
 * https://willbfine.tistory.com/421
 * https://sangwon-story.tistory.com/m/entry/%EA%B2%8C%EC%9E%84-%EB%A7%B5-%EC%B5%9C%EB%8B%A8%EA%B1%B0%EB%A6%AC?category=894801
 */
public class GameMapShortestPath {
    /**
     * Time Complexity :
     * Algorithm :
     */
    public int solution(int[][] maps) {
        int answer = -1;

        int[] dx = {-1, 0, 1, 0}; // 이동할 x좌표
        int[] dy = {0, 1, 0, -1}; // 이동할 y좌표
        int xSize = maps.length;
        int ySize = maps[0].length;
        int[][] check_maps = new int[xSize][ySize];

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0)); // (0,0)에서 시작

        check_maps[0][0] = 1;
        Coordinate coordinate;

        while (!queue.isEmpty()) {
            coordinate = queue.poll();

            for (int i = 0; i < 4; i++) {
                int next_x = coordinate.x + dx[i]; // 다음 이동할 x좌표
                int next_y = coordinate.y + dy[i]; // 다음 이동할 y좌표

                if (next_x >= xSize || next_y >= ySize || next_x < 0 || next_y < 0 || check_maps[next_x][next_y] == 1
                        || maps[next_x][next_y] == 0)
                    continue;

                queue.add(new Coordinate(next_x, next_y)); // 다음 이동할 좌표를 넣음

                maps[next_x][next_y] = maps[coordinate.x][coordinate.y] + 1; // 칸이 1개씩 이동하므로 +1
                check_maps[next_x][next_y] = 1; // 방문한 위치이므로 1로 변경
            }
        }

        if (maps[xSize - 1][ySize - 1] > 1) {
            answer = maps[xSize - 1][ySize - 1];
        }

        return answer;
    }

    class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
