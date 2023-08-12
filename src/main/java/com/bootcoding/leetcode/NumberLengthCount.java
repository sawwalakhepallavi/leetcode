package com.bootcoding.leetcode;

public class NumberLengthCount {
    public static void main(String[] args) {
        int num=12357469;
        int count=0;
        while (num!=0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
