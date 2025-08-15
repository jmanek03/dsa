package com.jay.basics.Arrays;

import java.util.Scanner;

public class isSortedArray {
//    Brute Force Approach
//    public static boolean isSorted(int[] arr, int size){
//        for(int i=0;i<=size-1;i++){
//            for(int j= i+1;j<=size-1;j++){
//                if(arr[j]<arr[i]){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    //Optimal Approach
    public static boolean isSorted(int[] arr, int size){
        for(int i = 1;i<=size-1;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,size));
    }
}
