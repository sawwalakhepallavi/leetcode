package com.bootcoding.leetcode;

public class PowerOfTwo {
    public void isPowerOfTwo(int num){

        if(num==1){
            System.out.println("true");
        }

        if(num%2!=0){
            System.out.println("false");
        }




    }
    public static void main(String[] args) {
        int num=16;
        PowerOfTwo powerOfTwo=new PowerOfTwo();
        powerOfTwo.isPowerOfTwo(num);
    }
}
