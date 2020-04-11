package com.algorithm._066PlusOne;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(new Solution().plusOne(nums)));
    }

    public int[] plusOne(int[] nums) {
        int i = nums.length - 1;
        for (; i >= 0; i--) {
            nums[i]++;
            if (nums[i] == 10) {
                nums[i] %= 10;
            } else {

                return nums;
            }
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }
}