package com.jay.basics.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int[] arr , int size, long k){
//        Brute Force (Can be reduced to two loops)
//        int len = 0;
//        for(int i=0;i<=size-1;i++){
//            for(int j =i;j<size-1;j++){
//                long sum = 0;
//                for(int K=i;K<=j;K++){
//                    sum+= arr[K];
//                }
//                if(sum == k){
//                    len = Math.max(len,j-i+1);
//                }
//            }
//        }
//        return len;

//        Hashing
        Map<Long, Integer> preSumMap= new HashMap<>();
        long sum = 0;
        int maxLen =0;

        for(int i =0;i<=size-1;i++){
            sum+=arr[i];

            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }

            long rem = sum-k;
            if(preSumMap.containsKey(rem)){
                int len = i-preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(rem)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        long k = sc.nextInt();
        int len = longestSubarrayWithSumK(arr, size, k);
        System.out.println(len);
    }

}
