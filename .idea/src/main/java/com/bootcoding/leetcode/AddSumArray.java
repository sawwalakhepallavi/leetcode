package com.bootcoding.leetcode;

public class AddSumArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        AddSumArray addSumArray=new AddSumArray();
        addSumArray.calArraySum(nums);
    }

    public int[] calArraySum(int []nums){
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum=sum+nums[i];
        }

        return nums;
    }

}
