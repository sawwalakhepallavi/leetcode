package com.bootcoding.leetcode;

import java.util.StringJoiner;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringJoiner joiner=new StringJoiner(" ");
//        System.out.println(joiner.add(s));
        StringBuffer sb=new StringBuffer(s);
//        System.out.println(s);
        return true;

    }
    public static void main(String[] args) {
        ValidPalindrome validPalindrome=new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(s));
    }
}
