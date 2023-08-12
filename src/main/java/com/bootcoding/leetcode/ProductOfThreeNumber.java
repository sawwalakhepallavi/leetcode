package com.bootcoding.leetcode;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ProductOfThreeNumber {
    public static int maximumProduct(int[] nums) {
        int mul1,mul2;
        Arrays.sort(nums);

             mul1=nums[0]*nums[1]*nums[nums.length-1];
             mul2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
             if(mul2>mul1){
                 return mul2;
             }

        return mul1;
    }
    public static void main(String[] args) {
        int nums[] = {55,-100,-98,-1,2,3,4,103,-30};
        System.out.println(maximumProduct(nums));

    }
}
