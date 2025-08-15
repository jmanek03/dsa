package com.jay.basics.Arrays;

import java.util.Scanner;

public class FindConsecutiveOnes {
    public static int findConsecutiveOnes(int[] arr, int size){
        int count = 0;
        int max = 0;
        for(int num:arr){
            if(num ==1){
                count++;
            }else{
                max = Math.max(max , count);
                count = 0;
            }
        }
        max = Math.max(max , count);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];

        for(int i =0; i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int ans = findConsecutiveOnes(arr,size);
        System.out.println(ans);
    }
}
