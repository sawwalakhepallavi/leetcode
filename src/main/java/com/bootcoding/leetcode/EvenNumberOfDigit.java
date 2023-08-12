package com.bootcoding.leetcode;

public class EvenNumberOfDigit {
//    public int findNumbers(int[] nums) {
//        int max=0;
//        for(int i=0;i<nums.length;i++){
//            int count=0;
//            while(nums[i]!=0){
//                nums[i]=nums[i]/10;
//                count++;
//            }
//            if(count%2==0){
//                max++;
//            }
//        }
//        return max;
//    }
    public int findNumbers(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length;i++){
        if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000 || nums[i]==100000)){
            count++;
        }
    }
    return count;
}

    public static void main(String[] args) {
        EvenNumberOfDigit evenNumberOfDigit=new EvenNumberOfDigit();
        int nums[]={12,345,2,6,7896};
        System.out.println(evenNumberOfDigit.findNumbers(nums));
    }
}
