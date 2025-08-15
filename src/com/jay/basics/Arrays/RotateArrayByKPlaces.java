package com.jay.basics.Arrays;

import java.util.Scanner;

public class RotateArrayByKPlaces {
    public static void Reverse(int[] arr, int start, int end ){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArrayByKPlaces(int[] arr, int k){
        Reverse(arr, 0 ,arr.length-k-1);
        Reverse(arr,arr.length-k,arr.length-1);
        Reverse(arr, 0 ,arr.length-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        rotateArrayByKPlaces(arr,k);

        for(int i =0;i<=size-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
