package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * 874. Walking Robot Simulation
 * Difficulty : Easy
 * Tags : Graph
 * <p>
 * https://leetcode.com/problems/walking-robot-simulation/
 * https://leetcode.com/problems/walking-robot-simulation/discuss/474276/JAVA-31-ms-straight-forward-with-comments
 * https://massivealgorithms.blogspot.com/2018/11/leetcode-874-walking-robot-simulation.html
 */
@Slf4j
public class RobotSim {
    /**
     * Time Complexity: O(N+K), N: commands의 수, K: obstacles의 수
     * <p>
     * Algorithm :
     * - 방향에 따라서 좌표 이동을 어떻게 할지 mechanism이 필요함 (여기서는 directions[][]안에 좌표를 정의함)
     * - command가 direction이면 현재 direction에서 left, right 적용이후 어떤 좌표를 사용해야 하는지 결정
     * - 이후에는 obstacle이 없는 경우이면 command unit 만큼 이동하면 됨
     * <p>
     * Notes :
     * 1. North는 right edge 임
     * W
     * S -|- N
     * E
     */
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] directions = {
                {0, 1}, //North, direction = 0
                {1, 0}, //East, direction = 1
                {0, -1}, //South, direction = 2
                {-1, 0}  //West, direction = 3
        };

        //obstacles를 빠르게 검색하기 위해서 set으로 x:y를 구성함
        Set<String> obstaclesSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstaclesSet.add(obstacle[0] + ":" + obstacle[1]);
        }

        int x = 0, y = 0; //시작점 (0, 0)
        int direction = 0; //방향은 North쪽으로 시작
        int maxDistSquare = 0; //결과

        for (int command : commands) {
//            log.info("==> command : {}", command);
            if (command == -2) { // Turns left
                direction = (direction + 3) % 4;
//                log.info("direction(left) : {}", direction);
            } else if (command == -1) { // Turns right
                direction = (direction + 1) % 4;
//                log.info("direction(right) : {}", direction);
            } else { // Moves forward commands[i] steps
                int step = 0;
                while (step < command
                        && !obstaclesSet.contains((x + directions[direction][0]) + ":" + (y + directions[direction][1]))) {
                    x += directions[direction][0];
                    y += directions[direction][1];
                    step++;
//                    log.info("  step:{} x:{} y:{}", step, x, y);
//                    log.info("  obstacle : {}", (x + directions[direction][0]) + ":" + (y + directions[direction][1]));
                }
            }
            maxDistSquare = Math.max(maxDistSquare, x * x + y * y);
//            log.info("maxDistSquare : {}", maxDistSquare);
//            System.out.println();
        }
        return maxDistSquare;
    }
}
