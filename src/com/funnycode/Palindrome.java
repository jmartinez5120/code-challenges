package com.funnycode;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 * <p>
 * Example 1:
 * Input: x = 121
 * Output: true
 * <p>
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Example 4:
 * Input: x = -101
 * Output: false
 *
 * Constraints:
 * -231 <= x <= 231 - 1
 * <p>
 * Result -> Success
 * <p>
 * Runtime: 7 ms, faster than 75.35% of Java online submissions for Palindrome Number.
 * Memory Usage: 38.2 MB, less than 92.37% of Java online submissions for Palindrome Number.
 *
 * <p>
 *     URL: https://leetcode.com/problems/palindrome-number/
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        // Convert the integer to String to get each number and compare it.
        String inputNumber = Integer.toString(x);
        for (int i = 0; i < inputNumber.length(); i++){
                int j = inputNumber.length() - i - 1;
                if (inputNumber.charAt(i) != inputNumber.charAt(j)) {
                    return false;
                }
        }

        return true;
    }
}

class PalindromeMain {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(123454321);
        System.out.println("Result: " + result);
    }
}
