package LeetCode.easy;

// 344. Reverse String
// https://leetcode.com/problems/reverse-string/description/
public class day05_1 {
    public static void main(String[] args) {
        /*
            GPT는 변수를 하나로 줄이는 걸 춴했다
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
         */

        class Solution {
            public void reverseString(char[] s) {
                int left = 0;
                int right = s.length - 1;

                char temp1;
                char temp2;
                while (left < right) {
                    temp1 = s[left];
                    temp2 = s[right];

                    s[left] = temp2;
                    s[right] = temp1;

                    left++;
                    right--;
                }
            }
        }
    }
}





