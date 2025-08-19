package com.jay.basics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] arr, int size){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i =0;i<=size-1;i++){
            if(arr[i]>0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }

        for(int i =0;i<size/2;i++){
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = rearrangeArray(arr,size);
        System.out.println(Arrays.toString(ans));
    }
}
