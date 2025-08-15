package com.jay.basics.Arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int size, int number){
        int i;
        for(i =0;i<=size-1;i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];
        for(int i =0; i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        System.out.println(linearSearch(arr, size,number));

    }
}
