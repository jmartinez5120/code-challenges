package com.funnycode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 *
 *
 * RESULT -> ACCEPTED
 *
 * Runtime: 51 ms, faster than 5.49% of Java online submissions for Longest Common Prefix.
 * Memory Usage: 51.7 MB, less than 5.25% of Java online submissions for Longest Common Prefix.
 */
public class LongestCommonPrefixClass {

    public String longestCommonPrefix(String[] strs) {

        String currentPrefix = "";

        for (int j = 0; strs.length > j; j++) {
            if (currentPrefix.equals("") && j == 0) {
                currentPrefix = strs[j];
            } else {
                String[] splitString = strs[j].split("");
                String[] splitCurrentPrefix = currentPrefix.split("");
                String prefix = "";
                // a,b,c
                int i;
                for (i = 0; splitCurrentPrefix.length > i; i++) {
                    if (splitString.length == i) {
                        break;
                    }

                    if (splitCurrentPrefix[i].equals(splitString[i])) {
                        prefix = prefix + splitCurrentPrefix[i];
                    } else {
                        break;
                    }
                    currentPrefix = prefix;
                }
                if (i == 0){
                    currentPrefix = "";
                }
            }
        }
        return currentPrefix;
    }
}


class LongestCommonPrefixMain {

    public static void main(String[] args) {
        LongestCommonPrefixClass longestCommonPrefixClass = new LongestCommonPrefixClass();
        String[] strings = {"abcd","abc","ab"};

        System.out.println(longestCommonPrefixClass.longestCommonPrefix(strings));


        String[] strings2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefixClass.longestCommonPrefix(strings2));

    }

}