package com.rektasan.leetcode.problem2331;

public class Solution {

  public boolean evaluateTree(TreeNode root) {
    if (root.left == null && root.right == null) {
      return root.val == 1;
    }
    if (root.val == 2) {
      assert root.left != null;
      return evaluateTree(root.left) || evaluateTree(root.right);
    } else if (root.val == 3) {
      assert root.left != null;
      return evaluateTree(root.left) && evaluateTree(root.right);
    }
    throw new IllegalArgumentException("Invalid node value: " + root.val);
  }

}
