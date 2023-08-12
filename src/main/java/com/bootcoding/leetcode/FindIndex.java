package com.bootcoding.leetcode;

public class FindIndex {
    public int search(int[] nums, int target) {
        for(int i=0;i<=nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        FindIndex findIndex=new FindIndex();
        System.out.println(findIndex.search(nums,target));
    }
}
