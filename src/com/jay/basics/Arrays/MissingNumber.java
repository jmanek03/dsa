package com.jay.basics.Arrays;

import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] arr , int size){

//        Linear Search
//        for(int i = 1;i<=size;i++){
//            int flag = 0;
//            for(int j =0;j<size-1;j++){
//                if(arr[j] == i){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag == 0) return i;
//        }
//        return -1;

//        Using Hashing
//        int[] hash = new int[size+1];
//        for(int i =0;i<=size-1;i++){
//            hash[arr[i]]++;
//        }
//        for(int i =0;i<=size;i++){
//            if(hash[i]==0)
//                return i;
//        }
//        return -1;

//        Summation Approach
//        int s1 = size*(size+1)/2;
//        int s2= 0 ;
//        for(int i = 0;i<=size-1;i++){
//            s2+=arr[i];
//        }
//        return s1-s2;

//        XOR Approach
        int xor1 =0;
        int xor2 = 0;
        for(int i =0;i<=size-1;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ i;
        }
        xor1 = xor1 ^ (size);

        return (xor1^xor2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int result = missingNumber(arr, size);
        System.out.println("Missing Number: " + result);
    }
}
