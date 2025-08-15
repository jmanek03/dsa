package com.jay.basics.Arrays;

import java.util.Scanner;

public class MoveZeroesToEnd {
    public static int[] moveZeroesToEnd(int[] arr, int size){
//        Brute Force APproach
//        ArrayList<Integer> temp = new ArrayList<>();
//        for(int i =0;i<=size-1;i++){
//            if(arr[i]!=0){
//                temp.add(arr[i]);
//            }
//        }
//        int nz = temp.size();
//        for(int  i = 0;i<nz;i++){
//            arr[i] = temp.get(i);
//        }
//
//        for(int i =nz;i<=size-1;i++){
//            arr[i] = 0;
//        }

        //Optimal Approach
        int j =-1;
        for(int i =0; i<=size-1;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j == -1) return arr;

        for(int i =j+1;i<=size-1;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int  i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int[]ans = moveZeroesToEnd(arr,size);
        for(int i =0 ; i<=size-1;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
