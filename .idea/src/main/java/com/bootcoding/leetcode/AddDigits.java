package com.bootcoding.leetcode;

public class AddDigits {
    public static void main(String[] args) {
        int num=38;
        int i = addDigits(num);
        System.out.println(i);
    }

    private static int addDigits(int num) {
        if (num==0){
            return 0;
        }
       if (num%9==0){
            return 9;
       } else {
           return num=num%9;
       }

    }
}
