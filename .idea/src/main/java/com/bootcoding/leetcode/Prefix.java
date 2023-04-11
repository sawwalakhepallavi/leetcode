package com.bootcoding.leetcode;

public class Prefix {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++")){
                X=X+1;
            }
            if(operations[i].equals("++X")){
                X=X+1;
            }
            if(operations[i].equals("--X")){
                X=X-1;
            }
            if(operations[i].equals("X--")){
                X=X-1;
            }
        }
        return X;
    }
    public static void main(String[] args) {
        Prefix prefix=new Prefix();
        String operations[]={"--X","X++","X++"};
        System.out.println(operations);
    }
}
