package com.jay.basics.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesArray {
    public static int removeDuplicates(int[] arr, int size){
//        Brute Force Approach
//        HashSet <Integer> set = new HashSet<>();
//        for(int i=0;i<=size-1;i++){
//            set.add(arr[i]);
//        }
//        int k = set.size();
//        int j=0;
//        for(int x:set){
//            arr[j++] = x;
//        }
//        return k;
        //Optimal Approach (Two Pointer Method)
        int i = 0;
        for(int j = 1;j<=size-1;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i= 0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr,size);
        System.out.println("Array after removing duplicates:");
        for(int i= 0;i<k;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
