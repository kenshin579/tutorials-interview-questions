package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 * Preorder : root, left, right
 * <p>
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/649062/Simple-Java-Recursive-and-Iterative-Solution-100-faster-and-0-ms-runtime
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/589801/JAVA-3-WAYS-TO-DO-THE-PROBLEM!-O(N)-APPROACH
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/703438/Java-Easy-Solution-0ms-reccursion-or-stack-1ms
 */
@Slf4j
public class BstFromPreorder {
    /**
     * Time Complexity : todo : 복잡도 넣기
     * Algorithm :
     * 1. array를 iterative하면서 현재 val값을 tree left, right 어느 곳에 위치시킬지 찾음
     * - temp가 null일때가 하되 그전 node를 기억하기 위해서 prev 변수를 둠
     * 2. prev 기억한 노드에 left, right에 위치시킴
     */
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode current = new TreeNode(preorder[0]);
        TreeNode temp;
        TreeNode prev = null;
        int currentVal;
        for (int i = 1; i < preorder.length; i++) {
            currentVal = preorder[i];
            temp = current;
            //val값에 따라서 삽입해야 하는 위치를 찾음
            while (temp != null) {
                prev = temp;
                log.info("temp : {}", temp);
                if (currentVal < temp.val) {
                    //left
                    temp = temp.left;
                    log.info(" left");
                } else {
                    //right
                    temp = temp.right;
                    log.info(" right");
                }
            }

            if (currentVal < prev.val) {
                prev.left = new TreeNode(currentVal);
            } else {
                prev.right = new TreeNode(currentVal);
            }
        }
        return current;
    }

    /**
     * Time Complexity : todo : recursive time complexity 구하는 방법 리뷰 필요함
     * <p>
     * Algorithm : Recursive
     * 1.기본 케이스는 startIndex < endIndex인 경우에만 로직 처리함
     * 2.preorder traversal는 root, left, right 순서로 되어 있어서 첫번째 root으로 node 생성함
     * 3.left, right의 (start ~ end) index를 계산을 해서 recursive하게 메서드를 호출함
     * <p>
     * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/589059/JAVA-EASIEST-SOLUTION-WITH-CLEAR-EXPLANATION-OF-LOGIC!
     */
    public TreeNode bstFromPreorderRecursive(int[] preorder) {
        return insertRecursive(preorder, 0, preorder.length - 1);
    }

    private TreeNode insertRecursive(int[] preorder, int startIndex, int endIndex) {
        log.info("start:{} end:{}", startIndex, endIndex);
        //base case
        if (startIndex > endIndex) {
            return null;
        }

        //root node
        TreeNode current = new TreeNode(preorder[startIndex]);

        int i = getIndexThatIsGreaterThanCurrentNodeValue(preorder, startIndex, endIndex, current);

        log.info("i: {}", i);

        current.left = insertRecursive(preorder, startIndex + 1, i - 1);
        current.right = insertRecursive(preorder, i, endIndex);
        return current;
    }

    /**
     * current 값보다 큰 값의 index를 반환한다
     */
    private int getIndexThatIsGreaterThanCurrentNodeValue(int[] preorder, int startIndex, int endIndex, TreeNode current) {
        int i;
        for (i = startIndex; i <= endIndex; i++) {
            log.info("val:{} preorder[{}]={}", current.val, i, preorder[i]);
            if (preorder[i] > current.val) {
                break;
            }
        }
        return i;
    }
}
