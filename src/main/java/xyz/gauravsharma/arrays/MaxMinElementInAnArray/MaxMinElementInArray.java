package xyz.gauravsharma.arrays.MaxMinElementInAnArray;

public class MaxMinElementInArray {

    // Problem Statement : https://practice.geeksforgeeks.org/problems/max-min/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab


    public static int findSum(int A[], int N) {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : A) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        return min + max;
    }

    public static void main(String[] args) {
        System.out.println(findSum(new int[]{5, 6, 1, 9, 10}, 5));
    }

}

