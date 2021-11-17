package com.funnycode;

import java.util.Arrays;

/**
 * {@link TwoSum}
 *
 * Instructions:
 *      Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *      You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *      You can return the answer in any order.
 * <p>
 *      Example 1:
 *          Input: nums = [2,7,11,15], target = 9
 *          Output: [0,1]
 *          Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * </p>
 * <p>
 *      Example 2:
 *          Input: nums = [3,2,4], target = 6
 *          Output: [1,2]
 * </p>
 * <p>
 *      Example 3:
 *          Input: nums = [3,3], target = 6
 *          Output: [0,1]
 * </p>
 * <p>
 *      Constraints:
 *          2 <= nums.length <= 104
 *          -109 <= nums[i] <= 109
 *          -109 <= target <= 109
 *          Only one valid answer exists.
 * </p>
 *
 * URL: https://leetcode.com/problems/two-sum/
 * <p>
 * RESULT -> ACCEPTED
 *      Submission Detail
 *      57 / 57 test cases passed.
 *      Status: Accepted
 *      Runtime: 85 ms
 *      Memory Usage: 39.1 MB
 *<p>
 *      Runtime: 85 ms, faster than 13.47% of Java online submissions for Two Sum.
 *      Memory Usage: 39.1 MB, less than 73.56% of Java online submissions for Two Sum.
 *
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // First loop to take the first number to compare
        for (int i = 0; i < nums.length; i++) {
            int firstNumber = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int secondNumber = nums[j];
                if (i != j) {
                    if (firstNumber + secondNumber == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return null;
    }
}

class TwoSumMain {

    public static void main(String args[]) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 3, 4, 2, 1, 5, 7, 9}, 4);
        System.out.println("Result: " + Arrays.toString(result));
    }

}
