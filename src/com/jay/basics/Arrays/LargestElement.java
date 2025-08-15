package com.jay.basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void findLargestElement(int[]arr, int size){
//        Brute Force Approach
//        Arrays.sort(arr);
//        System.out.print("Largest Element " + arr[size-1]);

        int max = arr[0];
        for(int i = 0;i<=size-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element: " + max);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        findLargestElement(arr,size);
    }
}
