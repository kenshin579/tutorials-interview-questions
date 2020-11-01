package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 200. Number of Islands
 * Difficulty : Medium
 * Tags : Graph
 * <p>
 * https://leetcode.com/problems/number-of-islands/
 */
@Slf4j
public class NumIslands {
    private static final char ISLAND_CHAR = '1';

    /**
     * Time Complexity : todo: ??
     *
     * Algorithm : BFS 방식으로 graph를 traverse함
     * 1.모든 포인트를 traverse
     * 2.'1'인 경우에 count를 함
     *
     */
    public int numIslands(char[][] grid) {
        int xSize = grid.length;
        int ySize = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[xSize][ySize];

        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                if (grid[i][j] == ISLAND_CHAR && !visited[i][j]) {
                    count++;
                    bfs(i, j, grid, visited);
                }
//                log.info("count : {}", count);
            }
            System.out.println();
        }
        return count;
    }

    private void bfs(int x, int y, char[][] grid, boolean[][] visited) {
        int[][] dirs = {
                {-1, 0}, //왼쪽
                {1, 0},  //오른쪽
                {0, -1}, //아래쪽
                {0, 1}   //위쪽
        };

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        visited[x][y] = true;
        Point currPoint;

        while (!queue.isEmpty()) {
            currPoint = queue.poll();
            log.info("currPoint : {}", currPoint);

            for (int[] d : dirs) {
                if (!isOutOfBoundary(currPoint.x + d[0], currPoint.y + d[1], grid)
                        && !visited[currPoint.x + d[0]][currPoint.y + d[1]]
                        && grid[currPoint.x + d[0]][currPoint.y + d[1]] == ISLAND_CHAR) {
                    log.info("x:{} y:{}", currPoint.x + d[0], currPoint.y + d[1]);

                    queue.add(new Point(currPoint.x + d[0], currPoint.y + d[1]));
                    visited[currPoint.x + d[0]][currPoint.y + d[1]] = true;
                }
            }
        }
    }

    private boolean isOutOfBoundary(int x, int y, char[][] grid) {
        return (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length);
    }

    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
