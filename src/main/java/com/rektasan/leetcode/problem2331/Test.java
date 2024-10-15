package com.rektasan.leetcode.problem2331;

public class Test {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3, new TreeNode(0), new TreeNode(1));

    Solution solution = new Solution();
    System.out.println(solution.evaluateTree(root));
  }
}
