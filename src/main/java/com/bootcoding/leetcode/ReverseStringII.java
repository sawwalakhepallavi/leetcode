package com.bootcoding.leetcode;

public class ReverseStringII {
    public void reverse(char[] str,int i,int j){
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char str[]=s.toCharArray();
        int i=0,n=str.length;
        while(i<n){
            int j=Math.min(i+k-1,n-1);
            reverse(str,i,j);
            i=i+2*k;
        }
        String ans=new String(str);
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        ReverseStringII reverseStringII=new ReverseStringII();
        System.out.println(reverseStringII.reverseStr(s,k));

    }
}
