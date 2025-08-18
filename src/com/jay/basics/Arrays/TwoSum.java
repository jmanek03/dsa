package com.jay.basics.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    private static int[] twoSum(int[] arr, int size, int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0;i<=size-1;i++){
            if(map.containsKey(target-arr[i])){
                return new int[] {map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(arr, size, target);
        System.out.println(Arrays.toString(ans));
    }
}
