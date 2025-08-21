package com.jay.basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {
    public static void rotateImage(int[][] arr){
//        Brute Force using another array
//        int n = arr.length;
//        int[][] rotated = new int[n][n];
//        for(int i=0;i<=n-1;i++){
//            for(int j =0;j<=n-1;j++){
//                rotated[j][n-i-1] = arr[i][j];
//            }
//        }
//        return rotated;

//        Optimal Approach
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0;i<=n-1;i++){
            for(int j =0;j<=n-1;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotateImage(arr);
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
     }
}
