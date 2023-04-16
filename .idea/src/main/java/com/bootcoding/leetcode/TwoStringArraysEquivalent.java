package com.bootcoding.leetcode;

import java.util.StringJoiner;

public class TwoStringArraysEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringJoiner joiner1=new StringJoiner("");
        StringJoiner joiner2=new StringJoiner("");
        for(int i=0;i<word1.length;i++){
            joiner1.add(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            joiner2.add(word2[i]);
        }
        String str1=joiner1.toString();
        System.out.println(str1);
        String str2=joiner2.toString();
        System.out.println(str2);
        if(str1.equals(str2)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String []word1 = {"ab", "c"};
        String []word2 = {"a", "bc"};
        TwoStringArraysEquivalent twoStringArraysEquivalent=new TwoStringArraysEquivalent();
        System.out.println(twoStringArraysEquivalent.arrayStringsAreEqual(word1,word2));

    }
}
