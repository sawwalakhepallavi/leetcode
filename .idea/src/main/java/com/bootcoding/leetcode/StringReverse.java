package com.bootcoding.leetcode;

public class StringReverse {
    public static void main(String[] args) {
        String  str[]={"p","a","l"};
        String temp;
        for (int i = 0; i < str.length/2; i++)
        {

            temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length- i - 1] = temp;
        }
        System.out.println(str);
    }

}
