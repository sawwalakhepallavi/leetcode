package com.bootcoding.leetcode;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String []s1=s.split(" ");
        StringBuffer str=new StringBuffer();
        for (int i=0;i<k;i++){
            str.append(s1[i]);
            if(i!=k-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        TruncateSentence truncate=new TruncateSentence();
        System.out.println(truncate.truncateSentence(s,k));
    }
}
