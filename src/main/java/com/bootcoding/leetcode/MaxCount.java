package com.bootcoding.leetcode;

public class MaxCount {
    public int maximumCount(int[] nums) {
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++;
            }
            if(nums[i]<0) {
                max++;
            }
        }
        if(count>max){
            return count;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxCount maxCount=new MaxCount();
        int nums[]={-2,-1,-1,1,2,3};
        System.out.println(maxCount.maximumCount(nums));
    }
}
