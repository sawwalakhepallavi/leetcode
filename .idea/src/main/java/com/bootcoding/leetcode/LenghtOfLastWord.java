package com.bootcoding.leetcode;

public class LenghtOfLastWord {
    public static int lengthOfLastWord(String s) {
        String sArr[]=null;
        String lastWord = null;
        sArr=s.split(" ");
        for(int i=0;i<sArr.length;i++){
            lastWord=sArr[sArr.length-1];
        }
        int res=lastWord.length();
        return res;
    }
    public static void main(String[] args) {
        String s= "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
