package com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DisappearedArray {
    public static void main(String[] args) {
        int []nums = {4,3,2,7,8,2,3,1};
        DisappearedArray disappearedArray=new DisappearedArray();
        System.out.println( disappearedArray.findDisappearedNumbers(nums));

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                continue;
            }
           nums[index]=nums[index]*(-1);
        }
        for(int i=0;i< nums.length;i++){
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }

}
