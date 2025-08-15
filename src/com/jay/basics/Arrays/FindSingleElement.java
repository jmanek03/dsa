package com.jay.basics.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindSingleElement {
    public static int findSingleElement(int[] arr, int size){
//        Brutal Force Approach
//        for(int i =0; i<=size-1;i++){
//            int num = arr[i];
//            int count=0;
//            for(int j =0;j<=size-1;j++){
//                if(arr[j] == num){
//                    count++;
//                }
//            }
//            if(count == 1) return num;
//        }
//        return -1;

//        Using Hashing
//        int maxi = arr[0];
//        for(int i =0;i<=size-1;i++){
//            maxi = Math.max(maxi , arr[i]);
//        }
//        int[] hash = new int[60001];
//        for(int num : arr){
//            hash[num +30000]++;
//        }
//        for(int num : arr){
//            if(hash[num + 30000] == 1)
//                return num;
//        }
//        return -1;

//        HashMap
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num:arr){
//            int value = map.getOrDefault(num, 0);
//            map.put(num, value+1);
//        }
//
//        for(Map.Entry<Integer, Integer> it : map.entrySet()){
//            if(it.getValue() == 1){
//                return it.getKey();
//            }
//        }
//        return -1;

//        XOR Approach
        int xor = 0;
        for(int num:arr){
            xor^=num;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSingleElement(arr,size));
    }
}
