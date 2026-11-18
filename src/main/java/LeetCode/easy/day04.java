package LeetCode.easy;

// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/
public class day04 {
    public static void main(String[] args) {
        class Solution {
            public boolean isPalindrome(String s) {
                s = s.toLowerCase();
                int left = 0;
                int right = s.length() - 1;

                while (left < right) {
                    char l = s.charAt(left);
                    char r = s.charAt(right);

                    // 1. 왼쪽 문자가 영문자/숫자가 아니면?
                    if (!Character.isLetterOrDigit(l)) {
                        left++;
                        continue;
                    }
                    // 2. 오른쪽 문자가 영문자/숫자가 아니면?
                    if (!Character.isLetterOrDigit(r)) {
                        right--;
                        continue;
                    }
                    // 3. 두 문자가 모두 유효하면?
                    if (l == r) {
                        left++;
                        right--;
                        continue;
                    } else {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}

