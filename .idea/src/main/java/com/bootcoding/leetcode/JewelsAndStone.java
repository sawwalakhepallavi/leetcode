package com.bootcoding.leetcode;

public class JewelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
       char[] jewels1=jewels.toCharArray();
       char[] stones1=stones.toCharArray();
       int count=0;
       for(char i: jewels1){
           for(char j: stones1){
               if(i==j){
                   count++;
               }
           }
       }
       return count;
    }
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        JewelsAndStone jewelsAndStone=new JewelsAndStone();
        System.out.println(jewelsAndStone.numJewelsInStones(jewels,stones));
    }
}
