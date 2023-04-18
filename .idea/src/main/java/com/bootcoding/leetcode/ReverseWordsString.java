package com.bootcoding.leetcode;

public class ReverseWordsString {
    public String reverseWords(String s) {
        String []str=s.split(" ");
       String str1 = " ";
        for(int i=0;i<str.length;i++){
            StringBuffer sb=new StringBuffer(str[i]);
            str1= str1+ String.valueOf(sb.reverse())+" ";
        }
        return str1.trim();
    }

    public static void main(String[] args) {
        ReverseWordsString reverseWordsString=new ReverseWordsString();
        String  s = "Let's take LeetCode contest";
        System.out.println(reverseWordsString.reverseWords(s));
    }
}
