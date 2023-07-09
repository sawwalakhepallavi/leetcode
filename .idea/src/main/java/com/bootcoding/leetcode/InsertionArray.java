package com.bootcoding.leetcode;

import java.util.ArrayList;

public class InsertionArray {
    public ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=i+i;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k: nums){
                        nums.set(k, nums1[i]);
                        nums.add(k);
                    }
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        InsertionArray inarr=new InsertionArray();
        System.out.println(inarr.intersection(nums1,nums2));
    }
}
