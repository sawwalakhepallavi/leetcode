package com.bootcoding.leetcode;

import java.util.Arrays;

public class MaxElementInArray {
    public static int mostWordsFound(String[] str) {
        int max=0;
        for(int i=0;i< str.length;i++){
            String text=str[i];
            int count=text.split(" ").length;
            if(count>max){
                max=count;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        String []str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(str));
    }
}
