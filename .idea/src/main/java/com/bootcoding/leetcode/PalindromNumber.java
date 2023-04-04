package com.bootcoding.leetcode;

public class PalindromNumber {
    public boolean isPalindrome(int x) {

        int rev = 0;
        int num=x;
        int temp = x;
        while (x != 0) {
            int div = x/10;

            rev=rev*10+ x%10;
            temp=div;
        }
        if (rev==temp){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int x=121;
        PalindromNumber palindromNumber=new PalindromNumber();
        System.out.println("number is palindrom"+palindromNumber.isPalindrome(x));
    }
}
