package com.bootcoding.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

import static java.math.BigInteger.*;

public class FindTheKthLargestInteger {
    public String  kthLargestNumber(String[] nums, int k) {
        BigInteger[]arr=new BigInteger [nums.length];
       for(int i=0;i< nums.length;i++) {
           arr[i] = new BigInteger(nums[i]);

       }
       Arrays.sort(arr);
      return String.valueOf(arr[arr.length-k]);

    }
    public static void main(String[] args) {
        FindTheKthLargestInteger findTheKthLargestInteger=new FindTheKthLargestInteger();
        String []nums = {"3","6","7","10"};
        int k = 4;
        System.out.println(findTheKthLargestInteger.kthLargestNumber(nums,k));
    }
}
