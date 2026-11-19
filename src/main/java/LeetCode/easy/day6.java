package LeetCode.easy;

// LeetCode: 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
public class day6 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 1;
            for (int i = 0; i < nums.length - 1; i++){
                if (nums[i] == nums[i+1]){
                    continue;
                }
                nums[k] = nums[i+1];
                k++;
            }
            return k;
        }
    }
}
