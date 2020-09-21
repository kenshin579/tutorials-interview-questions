package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;

/**
 * 450. Delete Node in a BST
 * Difficulty : Medium
 * Tags : Tree
 *
 * https://leetcode.com/problems/delete-node-in-a-bst/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
@Deprecated
public class DeleteNode {
    /**
     * Time Complexity :
     * Algorithm : 3가지 cases
     * Case 1: leaf 노드
     * - 그냥 삭제하면 됨
     *
     * Case 2: child 노드가 하나 있는 경우
     * - child 노드를 삭제한 곳에 넣으면 됨
     *
     * Case 3: child 노드가 2개인 경우
     * - 삭제되는 노드의 inorder successor를 찾아서 삭제된 노드에 넣으면 됨
     *
     * https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
     * https://www.techiedelight.com/deletion-from-bst/
     */
    public TreeNode deleteNode(TreeNode root, int key) {

        return root;
    }
}
