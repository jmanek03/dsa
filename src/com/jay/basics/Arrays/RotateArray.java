package com.jay.basics.Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void rotateArray(int[] arr,int size){
//        Brute Force Approach
//        int[] temp = new int[size];
//        for(int i=1;i<=size-1;i++){
//            temp[i-1] = arr[i];
//        }
//        temp[size-1] = arr[0];
//        for(int i =0;i<=size-1;i++){
//            System.out.print(temp[i] + " ");
//        }

        // Optimal Approach
        int temp = arr[0];
        for(int i =0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = temp;
        for(int i =0;i<=size-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<=size-1;i++){
            arr[i]=sc.nextInt();
        }
        rotateArray(arr,size);
    }
}
