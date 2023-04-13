package com.bootcoding.leetcode;

import com.sun.media.sound.SF2InstrumentRegion;

public class DigitSumAndElementSum {
    public static int differenceOfSum(int[] nums) {
        int sum=0;
        int num=0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];


            while (nums[i] > 0) {

                num = num + nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
        }

        return Math.abs(sum-num);
    }
    public static void main(String[] args) {
        int nums[] = {1,15,6,3};

        System.out.println(differenceOfSum(nums));
    }
}
