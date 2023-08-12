package com.bootcoding.leetcode;

public class FirstPalindromicStringArray {
    public String firstPalindrome(String[] words) {
        String s=null;
        for(int i=0;i<words.length;i++){
            StringBuffer sb=new StringBuffer(words[i]);
            s= String.valueOf(sb.reverse());
            if(words[i].equals(s)){
                break;
            }
            else{
                s="";
            }

        }

        return s;
    }
    public static void main(String[] args) {
        String []words = {"abc","car","ada","racecar","cool"};
        FirstPalindromicStringArray firstPalindromicStringArray=new FirstPalindromicStringArray();
        System.out.println(firstPalindromicStringArray.firstPalindrome(words));
    }
}
