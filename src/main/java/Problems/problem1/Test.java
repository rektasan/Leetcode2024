package Problems.problem1;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    Solution solution = new Solution();

    // Test case 1
    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    int[] result1 = solution.twoSum(nums1, target1);
    System.out.println("Test case 1: " + Arrays.toString(result1));

    // Test case 2
    int[] nums2 = {3, 2, 4};
    int target2 = 6;
    int[] result2 = solution.twoSum(nums2, target2);
    System.out.println("Test case 2: " + Arrays.toString(result2));

    // Test case 3
    int[] nums3 = {3, 3};
    int target3 = 6;
    int[] result3 = solution.twoSum(nums3, target3);
    System.out.println("Test case 3: " + Arrays.toString(result3));

    // Test case 4
    int[] nums4 = {1, 2, 3, 4, 5};
    int target4 = 9;
    int[] result4 = solution.twoSum(nums4, target4);
    System.out.println("Test case 4: " + Arrays.toString(result4));


  }
}
