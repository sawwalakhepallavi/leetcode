package com.bootcoding.leetcode;

public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int temp1;
        String temp2;
        for(int i=0;i<heights.length && i < names.length;i++){
            for(int j=i+1;j<heights.length && j< names.length;j++){
                if(heights[i]<heights[j]){
                    temp1=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp1;

                    temp2=names[i];
                    names[i]=names[j];
                    names[j]=temp2;
                }
            }
        }
        return names;
    }
    public static void main(String[] args) {
        String []names = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        SortPeople sp=new SortPeople();
        System.out.println(sp.sortPeople(names,heights));
    }
}
