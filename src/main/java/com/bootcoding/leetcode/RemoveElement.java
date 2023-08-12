package com.bootcoding.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[]={1,2,4,2,3,2};
        int val=2;
        RemoveElement removeElement=new RemoveElement();
        removeElement.elementRemoved(nums,2);
    }

    public int[] elementRemoved(int []nums, int val){

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                System.out.print(nums[i]);
            }
        }
        return nums;
    }
}
