package com.jay.basics;
import java.util.Scanner;

public class ReverseArray {
//    New Output Array for Reversing
//    public static void reverseArray(int[]arr, int n ){
//        int[] ans = new int[n];
//        for(int i=n-1;i>=0;i--){
//            ans[n-i-1]=arr[i];
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(ans[i]+" ");
//        }
//    }

//     Same array Reversal + Recursive
    public static void reverseArray(int[] arr,int start,int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr,start+1,end-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i <size; i++) {
            input[i] = sc.nextInt();
        }
//        reverseArray(input,size);
        reverseArray(input,0,size-1);

        for(int i=0;i<=size-1;i++){
            System.out.print(input[i]+" ");
        }
    }
}
