package com.jay.basics.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LLSZero {
    private static int lLSZero(int[] arr, int size){
//        Brute Force Approach
//        int maxLength = 0;
//        for(int i =0;i<=size-1;i++){
//            int sum = 0;
//            for(int j =i;j<=size-1;j++){
//                sum+=arr[j];
//                if(sum == 0){
//                    maxLength = Math.max(maxLength, j-i+1);
//                }
//            }
//        }
//        return maxLength;

//        Optimal Approach(Using HashMap)
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLength= 0 ;
        int sum = 0;
        for(int i =0;i<=size-1;i++){
            sum+=arr[i];
            if(sum == 0){
                maxLength = i+1;
            }else{
                if(map.get(sum) != null){
                    maxLength = Math.max(maxLength , i-map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(lLSZero(arr, size));
    }
}
