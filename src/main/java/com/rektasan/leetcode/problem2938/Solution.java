package com.rektasan.leetcode.problem2938;

public class Solution {

  public long minimumSteps(String s) {
    int l = 0;
    long swaps = 0;
    for (int r = 0; r < s.length(); r++) {
      if (s.charAt(r) == '0') {
        swaps += r - l;
        l++;
      }
    }
    return swaps;
  }

}
