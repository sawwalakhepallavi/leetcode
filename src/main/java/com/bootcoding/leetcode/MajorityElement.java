package com.bootcoding.leetcode;



public class MajorityElement {
    public  int majorNumber(int []nums){
        int count=0;
        int max=0;
        for(int i=0;i< nums.length;i++){
            if(count==0){
                max=nums[i];
            }
            if(max==nums[i]){
                count++;
            }else {
                count--;
            }
        }

//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i: nums){
//            if(map.containsKey(i)){
//                map.put(i,map.get(i)+1);// 3 2   2 1
//
//            }else {
//                map.put(i,1);
//            }
//        }
        return max;
    }
    public static void main(String[] args) {
        MajorityElement majorityElement=new MajorityElement();
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement.majorNumber(nums));
    }
}
