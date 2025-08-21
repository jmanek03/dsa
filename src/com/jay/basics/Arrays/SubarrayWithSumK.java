package com.jay.basics.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarrayWithSumK {
    public static int subarrayWithSumK(int[] arr, int size, int K){

        int preSum=0,count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<=size-1;i++){
            preSum+=arr[i];
            count+= map.getOrDefault(preSum-K,0);
            map.put(preSum, map.getOrDefault(preSum,0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int ans = subarrayWithSumK(arr,size, K);
        System.out.println(ans);
    }
}
