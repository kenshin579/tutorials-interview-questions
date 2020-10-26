package com.leetcode.algorithm.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * 489. Robot Room Cleaner
 * Difficulty : Hard
 * Tags : Graph
 * <p>
 * https://leetcode.com/problems/robot-room-cleaner/
 * https://linlaw0229.github.io/2019/03/02/489-Robot-Room-Cleaner/
 * https://www.programmersought.com/article/3123180170/
 * https://github.com/Cee/Leetcode/blob/master/489%20-%20Robot%20Room%20Cleaner.java
 * https://github.com/awangdev/LintCode/blob/master/Java/Robot%20Room%20Cleaner.java
 * http://all-about-java-and-weblogic-server.blogspot.com/2019/01/robot-room-cleaner.html
 */
@Deprecated
public class CleanRoom {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    /**
     * Time Complexity :
     * Algorithm :
     */
    public void cleanRoom(Robot robot) {
        // use 'x@y' mark visited nodes, where x,y are integers tracking the coordinates
        dfs(robot, new HashSet<>(), 0, 0, 0); // 0: up, 90: right, 180: down, 270: left
    }

    public void dfs(Robot robot, Set<String> visited, int x, int y, int curDir) {
        String key = x + "@" + y;
        if (visited.contains(key)) return;
        visited.add(key);
        robot.clean();

        for (int i = 0; i < 4; i++) { // 4 directions
            if (robot.move()) { // can go directly. Find the (x, y) for the next cell based on current direction
                dfs(robot, visited, x + dx[curDir], y + dy[curDir], curDir);
                backtrack(robot);
            }

            // turn to next direction
            robot.turnRight();
            curDir += 1;
            curDir %= 4;
        }
    }

    // go back to the starting position
    private void backtrack(Robot robot) {
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }
}
